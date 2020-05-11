package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.UsuarioResponsable;
import util.Protocolo;
import util.TextPrompt;

/**
 *
 * @author melkart
 */
public class JPRegistrarse extends javax.swing.JPanel implements Protocolo {

    private VentanaPrincipal parent;
    private TextPrompt pHSeudonimo;
    private TextPrompt pHContrasenia;
    private TextPrompt pHRepetirContrasenia;
    private TextPrompt pHCorreo;
    private TextPrompt pHFechaNac;
    private TextPrompt pHDNI;
    private TextPrompt pHNombreUsuario;
    private TextPrompt pHApellidos;
    private TextPrompt pHTelefonoUsuario;
    private TextPrompt pHNombreEntidad;
    private TextPrompt pHNIF;
    private TextPrompt pHCalle;
    private TextPrompt pHProvincia;
    private TextPrompt pHLocalidad;
    private TextPrompt pHCodigoPostal;
    private TextPrompt pHTelefonoEntidad;
    private String mensaje;

    public JPRegistrarse() {
        initComponents();
        iniciarLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jPCuenta = new javax.swing.JPanel();
        jLCuenta = new javax.swing.JLabel();
        jTFSeudonimo = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFDNI = new javax.swing.JTextField();
        jTFNombreReal = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFTelefonoUsuario = new javax.swing.JTextField();
        jDCFechaNacimiento = new datechooser.beans.DateChooserCombo();
        jPFContrasenia = new javax.swing.JPasswordField();
        jPFConfirmarContrasenia = new javax.swing.JPasswordField();
        jLFechaNacimiento = new javax.swing.JLabel();
        jPEntidad = new javax.swing.JPanel();
        jLEntidad = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox<>();
        jTFNombreEntidad = new javax.swing.JTextField();
        jTFNIF = new javax.swing.JTextField();
        jTFProvincia = new javax.swing.JTextField();
        jTFCalle = new javax.swing.JTextField();
        jTFLocalidad = new javax.swing.JTextField();
        jTFCodigoPostal = new javax.swing.JTextField();
        jTFTelefonoEntidad = new javax.swing.JTextField();
        jCBConfirmar = new javax.swing.JCheckBox();
        jLConfirmar = new javax.swing.JLabel();
        jBRegistrarse = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        jBRetroceder = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 503));
        setMinimumSize(new java.awt.Dimension(700, 503));

        jPPrincipal.setMaximumSize(new java.awt.Dimension(700, 503));
        jPPrincipal.setMinimumSize(new java.awt.Dimension(700, 503));

        jLCuenta.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLCuenta.setText("Crea tu cuenta");

        jTFSeudonimo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jTFCorreo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jTFDNI.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jTFNombreReal.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jTFApellidos.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jTFTelefonoUsuario.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jDCFechaNacimiento.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(61, 61, 61),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(61, 61, 61),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(61, 61, 61),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Ubuntu", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(61, 61, 61),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jPFContrasenia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jPFConfirmarContrasenia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jLFechaNacimiento.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
    jLFechaNacimiento.setText("Fecha de nacimiento");

    javax.swing.GroupLayout jPCuentaLayout = new javax.swing.GroupLayout(jPCuenta);
    jPCuenta.setLayout(jPCuentaLayout);
    jPCuentaLayout.setHorizontalGroup(
        jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPCuentaLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPFContrasenia)
                .addComponent(jTFCorreo)
                .addComponent(jTFDNI)
                .addComponent(jTFNombreReal)
                .addComponent(jTFApellidos)
                .addComponent(jTFTelefonoUsuario)
                .addComponent(jTFSeudonimo)
                .addComponent(jPFConfirmarContrasenia)
                .addGroup(jPCuentaLayout.createSequentialGroup()
                    .addComponent(jLCuenta)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPCuentaLayout.createSequentialGroup()
                    .addComponent(jLFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPCuentaLayout.setVerticalGroup(
        jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPCuentaLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLCuenta)
            .addGap(18, 18, 18)
            .addComponent(jTFSeudonimo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jPFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jPFConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addGroup(jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jDCFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(3, 3, 3)
            .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFNombreReal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(106, Short.MAX_VALUE))
    );

    jPEntidad.setPreferredSize(new java.awt.Dimension(344, 366));

    jLEntidad.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
    jLEntidad.setText("Añade una entidad");

    jCBTipo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de entidad", "Sociedad", "Administración pública", "Asociación", "Fundación", " " }));

    jTFNombreEntidad.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFNIF.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFProvincia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFCalle.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFLocalidad.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFCodigoPostal.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jTFTelefonoEntidad.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

    jCBConfirmar.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
    jCBConfirmar.setText("Acepto ser el único responsable de las publicaciones ");

    jLConfirmar.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
    jLConfirmar.setText("de eventos en FunApp sin implicaciones de terceros");

    jBRegistrarse.setText("Registrarse");
    jBRegistrarse.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBRegistrarseActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPEntidadLayout = new javax.swing.GroupLayout(jPEntidad);
    jPEntidad.setLayout(jPEntidadLayout);
    jPEntidadLayout.setHorizontalGroup(
        jPEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPEntidadLayout.createSequentialGroup()
            .addGroup(jPEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPEntidadLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLEntidad)
                        .addGroup(jPEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE)
                            .addComponent(jTFTelefonoEntidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigoPostal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFLocalidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFProvincia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNIF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombreEntidad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jCBConfirmar)))
                .addGroup(jPEntidadLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLConfirmar))
                .addGroup(jPEntidadLayout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(jBRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(41, Short.MAX_VALUE))
    );
    jPEntidadLayout.setVerticalGroup(
        jPEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPEntidadLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLEntidad)
            .addGap(18, 18, 18)
            .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFNombreEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jTFTelefonoEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12)
            .addComponent(jCBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(3, 3, 3)
            .addComponent(jLConfirmar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jBRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(50, Short.MAX_VALUE))
    );

    jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jBRetroceder.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBRetrocederActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
    jPPrincipal.setLayout(jPPrincipalLayout);
    jPPrincipalLayout.setHorizontalGroup(
        jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPPrincipalLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPPrincipalLayout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addComponent(jBRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPPrincipalLayout.setVerticalGroup(
        jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPPrincipalLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jBRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarseActionPerformed

        LocalDate fechaNac = this.jDCFechaNacimiento.getSelectedDate().getTime().toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        Period edad = Period.between(fechaNac, LocalDate.now());
        if (textFieldsVacios()) {
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos del usuario.");
        } else if (!String.copyValueOf(this.jPFContrasenia.getPassword()).equals(
                String.copyValueOf(this.jPFConfirmarContrasenia.getPassword()))) {
            JOptionPane.showMessageDialog(null, "No coincide la confirmación de contraseña.");
        } else if (edad.getYears() < 18) {
            JOptionPane.showMessageDialog(null, "Hay que ser mayor de edad para este tipo de usuario.");
        } else if (!this.jCBConfirmar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debes aceptar las condiciones de responsabilidad.");
        } else {

            try {
                if (this.parent.getEstadoSesion() == SIN_SESION) {
                    this.parent.establecerSocket();
                    Integer protocolo = REGISTRARSE_RESPONSABLE;
                    this.mensaje = this.parent.getGson().toJson(protocolo);
                    this.parent.getSalida().writeUTF(this.mensaje);

                    UsuarioResponsable usuario = new UsuarioResponsable(
                            this.jTFDNI.getText(), this.jTFNombreReal.getText(), this.jTFApellidos.getText(),
                            Integer.parseInt(this.jTFTelefonoUsuario.getText()), 0, this.jTFSeudonimo.getText(),
                            this.jTFCorreo.getText(), this.jDCFechaNacimiento.getSelectedDate().getTime(),
                            null,
                            this.parent.encriptacion(String.copyValueOf(this.jPFContrasenia.getPassword())),
                            null
                    );

                    this.mensaje = this.parent.getGson().toJson(usuario);
                    this.parent.getSalida().writeUTF(this.mensaje);
                    this.mensaje = (String) this.parent.getEntrada().readUTF();
                    this.parent.setEstadoSesion((Integer) this.parent.getGson().fromJson(this.mensaje, Integer.class));
                    if (this.parent.getEstadoSesion() == SIN_SESION) {
                        JOptionPane.showMessageDialog(null, "Se ha registrado con éxito, ahora podrás iniciar sesión.");
                        this.parent.getCliente().close();
                        this.parent.vistaInicioSesion();
                    } else if (this.parent.getEstadoSesion() == REGISTRARSE_EXISTE_USUARIO) {
                        JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con ese correo electrónico.");
                        this.parent.getCliente().close();
                    } else if (this.parent.getEstadoSesion() == REGISTRARSE_EXISTE_SEUDONIMO) {
                        JOptionPane.showMessageDialog(null, "El nombre de usuario introducio no está disponible.");
                        this.parent.getCliente().close();
                    } else if (this.parent.getEstadoSesion() == REGISTRARSE_FALLIDO) {
                        JOptionPane.showMessageDialog(null, "Fallo al registrarse. Por favor, inténtelo más tarde.");
                        this.parent.getCliente().close();
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(JPInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBRegistrarseActionPerformed

    private void jBRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetrocederActionPerformed

        this.parent.vistaInicioSesion();
        this.setVisible(false);

    }//GEN-LAST:event_jBRetrocederActionPerformed
    private void iniciarLayout() {

        //Color de fondo
        this.jPPrincipal.setBackground(Color.decode("#012e33"));
        this.jPCuenta.setBackground(Color.decode("#012e33"));
        this.jPEntidad.setBackground(Color.decode("#012e33"));
        this.jLCuenta.setForeground(Color.decode("#94c8d6"));
        this.jLEntidad.setForeground(Color.decode("#94c8d6"));
        this.jLFechaNacimiento.setForeground(Color.decode("#94c8d6"));

        //Separador
        this.jSeparator.setBackground(Color.decode("#d64d55"));
        this.jSeparator.setForeground(Color.decode("#d64d55"));

        //Configuración checkbox
        this.jCBConfirmar.setForeground(Color.decode("#f2f2f2"));
        this.jLConfirmar.setForeground(Color.decode("#f2f2f2"));
        this.jCBConfirmar.setBackground(Color.decode("#012e33"));
        this.jCBConfirmar.setContentAreaFilled(false);
        this.jCBConfirmar.setFocusPainted(false);

        //Boton iniciar sesion
        this.jBRegistrarse.setBackground(Color.decode("#94c8d6"));
        this.jBRegistrarse.setOpaque(true);
        this.jBRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
        this.jBRegistrarse.setBorder(BorderFactory.createLineBorder(Color.decode("#94c8d6")));
        this.jBRegistrarse.setForeground(Color.decode("#f2f2f2"));
        this.jBRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.jBRegistrarse.setFocusPainted(false);

        //Boton retroceder
        Image imgNuevaTarea = new ImageIcon(getClass().getResource("/imagenes/retroceder.png")).getImage();
        Image imgNuevaTareaResc = imgNuevaTarea.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        this.jBRetroceder.setIcon(new ImageIcon(imgNuevaTareaResc));
        this.jBRetroceder.setBackground(Color.decode("#012e33"));
        this.jBRetroceder.setOpaque(true);
        this.jBRetroceder.setContentAreaFilled(false);
        this.jBRetroceder.setHorizontalAlignment(SwingConstants.CENTER);
        this.jBRetroceder.setBorder(BorderFactory.createLineBorder(Color.decode("#012e33")));
        this.jBRetroceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.jBRetroceder.setFocusPainted(false);

        //Configuración de los campos de textos y agregar placehorder
        this.jTFSeudonimo.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHSeudonimo = new TextPrompt("Nombre de usuario", this.jTFSeudonimo);
        this.pHSeudonimo.changeAlpha(0.75f);
        this.pHSeudonimo.changeStyle(Font.ITALIC);
        this.jPFContrasenia.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHContrasenia = new TextPrompt("Contraseña", this.jPFContrasenia);
        this.pHContrasenia.changeAlpha(0.75f);
        this.pHContrasenia.changeStyle(Font.ITALIC);
        this.jPFConfirmarContrasenia.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHRepetirContrasenia = new TextPrompt("Repita contraseña", this.jPFConfirmarContrasenia);
        this.pHRepetirContrasenia.changeAlpha(0.75f);
        this.pHRepetirContrasenia.changeStyle(Font.ITALIC);
        this.jTFCorreo.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHCorreo = new TextPrompt("Correo electrónico", this.jTFCorreo);
        this.pHCorreo.changeAlpha(0.75f);
        this.pHCorreo.changeStyle(Font.ITALIC);
        this.jTFDNI.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHDNI = new TextPrompt("DNI", this.jTFDNI);
        this.pHDNI.changeAlpha(0.75f);
        this.pHDNI.changeStyle(Font.ITALIC);
        this.jTFNombreReal.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHNombreUsuario = new TextPrompt("Nombre", this.jTFNombreReal);
        this.pHNombreUsuario.changeAlpha(0.75f);
        this.pHNombreUsuario.changeStyle(Font.ITALIC);
        this.jTFApellidos.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHApellidos = new TextPrompt("Apellidos", this.jTFApellidos);
        this.pHApellidos.changeAlpha(0.75f);
        this.pHApellidos.changeStyle(Font.ITALIC);
        this.jTFTelefonoUsuario.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHTelefonoUsuario = new TextPrompt("Teléfono", this.jTFTelefonoUsuario);
        this.pHTelefonoUsuario.changeAlpha(0.75f);
        this.pHTelefonoUsuario.changeStyle(Font.ITALIC);
        this.jCBTipo.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.jTFNombreEntidad.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHNombreEntidad = new TextPrompt("Nombre", this.jTFNombreEntidad);
        this.pHNombreEntidad.changeAlpha(0.75f);
        this.pHNombreEntidad.changeStyle(Font.ITALIC);
        this.jTFNIF.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHNIF = new TextPrompt("NIF", this.jTFNIF);
        this.pHNIF.changeAlpha(0.75f);
        this.pHNIF.changeStyle(Font.ITALIC);
        this.jTFCalle.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHCalle = new TextPrompt("Calle", this.jTFCalle);
        this.pHCalle.changeAlpha(0.75f);
        this.pHCalle.changeStyle(Font.ITALIC);
        this.jTFProvincia.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHProvincia = new TextPrompt("Provincia", this.jTFProvincia);
        this.pHProvincia.changeAlpha(0.75f);
        this.pHProvincia.changeStyle(Font.ITALIC);
        this.jTFLocalidad.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHLocalidad = new TextPrompt("Localidad", this.jTFLocalidad);
        this.pHLocalidad.changeAlpha(0.75f);
        this.pHLocalidad.changeStyle(Font.ITALIC);
        this.jTFCodigoPostal.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHCodigoPostal = new TextPrompt("Código postal", this.jTFCodigoPostal);
        this.pHCodigoPostal.changeAlpha(0.75f);
        this.pHCodigoPostal.changeStyle(Font.ITALIC);
        this.jTFTelefonoEntidad.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        this.pHTelefonoEntidad = new TextPrompt("Teléfono", this.jTFTelefonoEntidad);
        this.pHTelefonoEntidad.changeAlpha(0.75f);
        this.pHTelefonoEntidad.changeStyle(Font.ITALIC);
    }

    public void setParent(VentanaPrincipal parent) {
        this.parent = parent;
    }

    public boolean textFieldsVacios() {

        boolean[] fields = new boolean[8];
        boolean vacio = false;
        fields[0] = this.jTFSeudonimo.getText().isEmpty();
        fields[1] = (this.jPFContrasenia.getPassword().length != 0);
        fields[2] = (this.jPFConfirmarContrasenia.getPassword().length != 0);
        fields[3] = this.jTFCorreo.getText().isEmpty();
        fields[4] = this.jTFDNI.getText().isEmpty();
        fields[5] = this.jTFNombreReal.getText().isEmpty();
        fields[6] = this.jTFApellidos.getText().isEmpty();
        fields[7] = this.jTFTelefonoUsuario.getText().isEmpty();

        for (int i = 0; fields.length < i; i++) {
            if (fields[i]) {
                vacio = true;
            }
        }
        return vacio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistrarse;
    private javax.swing.JButton jBRetroceder;
    private javax.swing.JCheckBox jCBConfirmar;
    private javax.swing.JComboBox<String> jCBTipo;
    private datechooser.beans.DateChooserCombo jDCFechaNacimiento;
    private javax.swing.JLabel jLConfirmar;
    private javax.swing.JLabel jLCuenta;
    private javax.swing.JLabel jLEntidad;
    private javax.swing.JLabel jLFechaNacimiento;
    private javax.swing.JPanel jPCuenta;
    private javax.swing.JPanel jPEntidad;
    private javax.swing.JPasswordField jPFConfirmarContrasenia;
    private javax.swing.JPasswordField jPFContrasenia;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCalle;
    private javax.swing.JTextField jTFCodigoPostal;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFLocalidad;
    private javax.swing.JTextField jTFNIF;
    private javax.swing.JTextField jTFNombreEntidad;
    private javax.swing.JTextField jTFNombreReal;
    private javax.swing.JTextField jTFProvincia;
    private javax.swing.JTextField jTFSeudonimo;
    private javax.swing.JTextField jTFTelefonoEntidad;
    private javax.swing.JTextField jTFTelefonoUsuario;
    // End of variables declaration//GEN-END:variables
}
