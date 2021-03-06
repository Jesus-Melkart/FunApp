
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Incidencia;
import model.Publicacion;
import util.ConfiguracionBD;

/**
 *
 * @author melkart
 */
public class IncidenciaDAOSQL implements IncidenciaDAO {

    private String url;
    private String puerto_sgbd;
    private String host_sgbd;
    private String db;
    private String usuario;
    private String contrasenia;
    private Connection conexion;

    public IncidenciaDAOSQL() {

        ConfiguracionBD c = new ConfiguracionBD();
        c.importar();
        this.puerto_sgbd = c.getPuerto_sgbd();
        this.host_sgbd = c.getHost_sgbd();
        this.db = c.getDb();
        this.usuario = c.getUsuario();
        this.contrasenia = c.getContrasenia();
        this.url = "jdbc:mariadb://" + this.host_sgbd + ":" + this.puerto_sgbd + "/" + this.db;
        this.conexion = null;
        pruebaConexion();
    }

    public void pruebaConexion() {
        try {
            this.conexion = DriverManager.getConnection(url, usuario, contrasenia);
            this.conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar con el servidor.");
            System.exit(0);
        }
        System.out.println("Conectado a la base de datos.");
    }

    public Connection abrirConexion() {
        try {
            this.conexion = DriverManager.getConnection(this.url, this.usuario, this.contrasenia);
        } catch (SQLException e) {
            System.out.println("Error al conectar con el servidor.");
            System.exit(0);
        }
        return this.conexion;
    }

    public void cerrarConexion() {
        try {
            this.conexion.close();
        } catch (SQLException e) {

            System.out.println("No se puede cerrar la conexión a la base de datos.");
        }
    }

    @Override
    public List<Incidencia> listaIncidencia(String codigoPostal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertarIncidencia(Incidencia incidencia) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean insertado = false;
        Date fechaPublicacion = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        incidencia.setFecha(fechaPublicacion);

        try {
            abrirConexion();
            sentencia = this.conexion.prepareStatement(
                    "INSERT INTO incidencia (descripcion, fecha, id_usuario) "
                    + "VALUES (?, ?, ?)");

            sentencia.setString(1, incidencia.getDescripcion());
            sentencia.setDate(2, java.sql.Date.valueOf(incidencia.getFecha_publicacion_LocalDate()));
            sentencia.setInt(3, incidencia.getId_usuario());

            int affectedRows = sentencia.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("No se puede insertar los datos");
            }else if (affectedRows == 1) {
                insertado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (resultado != null) {
                    resultado.close();
                }
                if (this.conexion != null) {
                    cerrarConexion();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return insertado;
    }

    @Override
    public List<Incidencia> listaIncidenciasAdmin() {
        List<Incidencia> listaIncidencias = new ArrayList<Incidencia>();
        PreparedStatement sentencia = null;
        ResultSet resultado = null;

        try {
            abrirConexion();
            this.conexion.setAutoCommit(false);
            sentencia = this.conexion.prepareStatement(
                    "SELECT i.id_incidencia, i.descripcion, i.fecha, i.id_usuario "
                    + "FROM incidencia i ");

            resultado = sentencia.executeQuery();
            int id_incidencia = 0;
            String descripcion = "";
            Date fecha;
            int id_usuario = 0;

            while (resultado.next()) {
                id_incidencia =resultado.getInt(1);
                descripcion = resultado.getString(2);
                fecha = resultado.getDate(3);
                id_usuario = resultado.getInt(4);
                listaIncidencias.add(new Incidencia(id_incidencia, descripcion, fecha, id_usuario));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (sentencia != null) {
                    sentencia.close();
                }
                if (this.conexion != null) {
                    cerrarConexion();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return listaIncidencias;
    }

    @Override
    public boolean adminEliminarIncidencia(int id_incidencia) {
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        boolean eliminado = false;

        try {
            abrirConexion();
            sentencia = this.conexion.prepareStatement(
                    "DELETE FROM incidencia "
                    + "WHERE id_incidencia = ? ");

            sentencia.setInt(1, id_incidencia);
            int affectedRows = sentencia.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("No se puede eliminar los datos");
            }
            eliminado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (resultado != null) {
                    resultado.close();
                }
                if (this.conexion != null) {
                    cerrarConexion();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return eliminado;
    }
}

