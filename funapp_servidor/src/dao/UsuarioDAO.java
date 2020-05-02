package dao;

import model.Credenciales;
import model.UsuarioEstandar;
import model.UsuarioResponsable;

/**
 *
 * @author melkart
 */
public interface UsuarioDAO {

    public boolean existeUsuario(Credenciales credenciales);
    
    public UsuarioEstandar consultarUsEstandar(Credenciales credenciales);

    public UsuarioResponsable consultarUsResponsable(Credenciales credenciales);

    public boolean altaUsEstandar(UsuarioEstandar usuario);

    public boolean altaUsResponsable(UsuarioResponsable usuario);
    
    public boolean actualizarUsEstandar(UsuarioEstandar usuario);

    public boolean actualizarUsResponsable(UsuarioResponsable usuario);    

    public boolean bajaUsEstandar(UsuarioEstandar usuario);

    public boolean bajaUsResponsable(UsuarioResponsable usuario);     
}