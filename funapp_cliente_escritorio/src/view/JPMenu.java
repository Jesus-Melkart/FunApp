/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author melkart
 */
public class JPMenu extends javax.swing.JPanel {

    private JPSesionAbierta parent;
    private JPCrearEvento vistaCrearEvento;

    public JPMenu() {
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

        jPSecciones = new javax.swing.JPanel();
        jBInicio = new javax.swing.JButton();
        jBMisEventos = new javax.swing.JButton();
        jBCrearEvento = new javax.swing.JButton();
        jBSeguidores = new javax.swing.JButton();
        jBHistorial = new javax.swing.JButton();
        jPEstadisticas = new javax.swing.JPanel();
        jLEstadisticas = new javax.swing.JLabel();
        jSeparatorUp = new javax.swing.JSeparator();
        jLValoracion = new javax.swing.JLabel();
        jSeparatorDown = new javax.swing.JSeparator();
        jPCuenta = new javax.swing.JPanel();
        jBCuenta = new javax.swing.JButton();
        jLUsuario = new javax.swing.JLabel();

        jBInicio.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jBInicio.setText("   Inicio");
        jBInicio.setBorder(null);
        jBInicio.setFocusPainted(false);
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBMisEventos.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jBMisEventos.setText("   Mis eventos");
        jBMisEventos.setBorder(null);
        jBMisEventos.setFocusPainted(false);
        jBMisEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMisEventosActionPerformed(evt);
            }
        });

        jBCrearEvento.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jBCrearEvento.setText("   Crear evento");
        jBCrearEvento.setBorder(null);
        jBCrearEvento.setFocusPainted(false);
        jBCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearEventoActionPerformed(evt);
            }
        });

        jBSeguidores.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jBSeguidores.setText("   Seguidores");
        jBSeguidores.setBorder(null);
        jBSeguidores.setFocusPainted(false);
        jBSeguidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeguidoresActionPerformed(evt);
            }
        });

        jBHistorial.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jBHistorial.setText("   Historial");
        jBHistorial.setBorder(null);
        jBHistorial.setFocusPainted(false);
        jBHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSeccionesLayout = new javax.swing.GroupLayout(jPSecciones);
        jPSecciones.setLayout(jPSeccionesLayout);
        jPSeccionesLayout.setHorizontalGroup(
            jPSeccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSeccionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPSeccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSeguidores)
                    .addComponent(jBCrearEvento)
                    .addComponent(jBMisEventos)
                    .addComponent(jBInicio)
                    .addComponent(jBHistorial))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPSeccionesLayout.setVerticalGroup(
            jPSeccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSeccionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jBInicio)
                .addGap(6, 6, 6)
                .addComponent(jBMisEventos)
                .addGap(6, 6, 6)
                .addComponent(jBCrearEvento)
                .addGap(6, 6, 6)
                .addComponent(jBSeguidores)
                .addGap(6, 6, 6)
                .addComponent(jBHistorial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLEstadisticas.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEstadisticas.setText("Estadísticas");

        jLValoracion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLValoracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValoracion.setText("Valoración media");

        javax.swing.GroupLayout jPEstadisticasLayout = new javax.swing.GroupLayout(jPEstadisticas);
        jPEstadisticas.setLayout(jPEstadisticasLayout);
        jPEstadisticasLayout.setHorizontalGroup(
            jPEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLValoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEstadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorUp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparatorDown, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPEstadisticasLayout.setVerticalGroup(
            jPEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEstadisticasLayout.createSequentialGroup()
                .addComponent(jSeparatorUp, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLValoracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorDown, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jBCuenta.setFocusPainted(false);

        jLUsuario.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLUsuario.setText("Usuario");

        javax.swing.GroupLayout jPCuentaLayout = new javax.swing.GroupLayout(jPCuenta);
        jPCuenta.setLayout(jPCuentaLayout);
        jPCuentaLayout.setHorizontalGroup(
            jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCuentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPCuentaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCuentaLayout.setVerticalGroup(
            jPCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCuentaLayout.createSequentialGroup()
                .addComponent(jLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPSecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearEventoActionPerformed
        this.parent.vistaCrearEvento();
        
    }//GEN-LAST:event_jBCrearEventoActionPerformed

    private void jBMisEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMisEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMisEventosActionPerformed

    private void jBHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBHistorialActionPerformed

    private void jBSeguidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeguidoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSeguidoresActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        this.parent.vistaInicio();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void iniciarLayout() {

        this.setBackground(Color.decode("#012e33"));

        //Sección Menú
        this.jPSecciones.setBackground(Color.decode("#012e33"));

        Image imgInicio = new ImageIcon(getClass().getResource("/imagenes/inicio.png")).getImage();
        Image imgInicioResc = imgInicio.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        this.jBInicio.setIcon(new ImageIcon(imgInicioResc));
        this.jBInicio.setBackground(Color.decode("#012e33"));
        this.jBInicio.setForeground(Color.decode("#ffffff"));
        this.jBInicio.setContentAreaFilled(false);
        this.jBInicio.setOpaque(true);
        this.jBInicio.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.jBInicio.setVerticalTextPosition(SwingConstants.CENTER);
        this.jBInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Image imgMisEventos = new ImageIcon(getClass().getResource("/imagenes/mis_eventos.png")).getImage();
        Image imgMisEventosResc = imgMisEventos.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        this.jBMisEventos.setIcon(new ImageIcon(imgMisEventosResc));
        this.jBMisEventos.setBackground(Color.decode("#012e33"));
        this.jBMisEventos.setForeground(Color.decode("#ffffff"));
        this.jBMisEventos.setContentAreaFilled(false);
        this.jBMisEventos.setOpaque(true);
        this.jBMisEventos.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.jBMisEventos.setVerticalTextPosition(SwingConstants.CENTER);
        this.jBMisEventos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Image imgCrearEvento = new ImageIcon(getClass().getResource("/imagenes/crear_evento.png")).getImage();
        Image imgCrearEventoResc = imgCrearEvento.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        this.jBCrearEvento.setIcon(new ImageIcon(imgCrearEventoResc));
        this.jBCrearEvento.setBackground(Color.decode("#012e33"));
        this.jBCrearEvento.setForeground(Color.decode("#ffffff"));
        this.jBCrearEvento.setContentAreaFilled(false);
        this.jBCrearEvento.setOpaque(true);
        this.jBCrearEvento.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.jBCrearEvento.setVerticalTextPosition(SwingConstants.CENTER);
        this.jBCrearEvento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Image imgSeguidores = new ImageIcon(getClass().getResource("/imagenes/seguidores.png")).getImage();
        Image imgSeguidoresResc = imgSeguidores.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        this.jBSeguidores.setIcon(new ImageIcon(imgSeguidoresResc));
        this.jBSeguidores.setBackground(Color.decode("#012e33"));
        this.jBSeguidores.setForeground(Color.decode("#ffffff"));
        this.jBSeguidores.setContentAreaFilled(false);
        this.jBSeguidores.setOpaque(true);
        this.jBSeguidores.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.jBSeguidores.setVerticalTextPosition(SwingConstants.CENTER);
        this.jBSeguidores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Image imgHistorial = new ImageIcon(getClass().getResource("/imagenes/historial.png")).getImage();
        Image imgHistorialResc = imgHistorial.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        this.jBHistorial.setIcon(new ImageIcon(imgHistorialResc));
        this.jBHistorial.setBackground(Color.decode("#012e33"));
        this.jBHistorial.setForeground(Color.decode("#ffffff"));
        this.jBHistorial.setContentAreaFilled(false);
        this.jBHistorial.setOpaque(true);
        this.jBHistorial.setHorizontalTextPosition(SwingConstants.RIGHT);
        this.jBHistorial.setVerticalTextPosition(SwingConstants.CENTER);
        this.jBHistorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //Sección Estadisticas
        this.jPEstadisticas.setBackground(Color.decode("#012e33"));

        this.jSeparatorUp.setBackground(Color.decode("#d64d55"));
        this.jSeparatorUp.setForeground(Color.decode("#d64d55"));
        this.jLEstadisticas.setForeground(Color.decode("#94c8d6"));
        this.jLValoracion.setForeground(Color.decode("#ffffff"));
        this.jSeparatorDown.setBackground(Color.decode("#d64d55"));
        this.jSeparatorDown.setForeground(Color.decode("#d64d55"));

        //Sección Cuenta
        this.jPCuenta.setBackground(Color.decode("#012e33"));

        this.jLUsuario.setForeground(Color.decode("#ffffff"));

        Image imgCuenta = new ImageIcon(getClass().getResource("/imagenes/cuenta.png")).getImage();
        Image imgCuentaResc = imgCuenta.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        this.jBCuenta.setIcon(new ImageIcon(imgCuentaResc));
        this.jBCuenta.setBackground(Color.decode("#012e33"));
        this.jBCuenta.setOpaque(true);
        this.jBCuenta.setContentAreaFilled(false);
        this.jBCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        this.jBCuenta.setBorder(BorderFactory.createLineBorder(Color.decode("#012e33")));
    }

    public void setParent(JPSesionAbierta parent) {
        this.parent = parent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearEvento;
    private javax.swing.JButton jBCuenta;
    private javax.swing.JButton jBHistorial;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBMisEventos;
    private javax.swing.JButton jBSeguidores;
    private javax.swing.JLabel jLEstadisticas;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLValoracion;
    private javax.swing.JPanel jPCuenta;
    private javax.swing.JPanel jPEstadisticas;
    private javax.swing.JPanel jPSecciones;
    private javax.swing.JSeparator jSeparatorDown;
    private javax.swing.JSeparator jSeparatorUp;
    // End of variables declaration//GEN-END:variables
}
