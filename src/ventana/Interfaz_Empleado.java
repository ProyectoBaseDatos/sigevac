/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author cindybohorquezsantana
 */
public class Interfaz_Empleado extends javax.swing.JFrame {

    /**
     * Creates new form EMPLEADO
     */
    public Interfaz_Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistraralquiler = new javax.swing.JButton();
        jButtonRegistrarCompra = new javax.swing.JButton();
        jLabelImagenComprar = new javax.swing.JLabel();
        jLabelImagenAlquilar = new javax.swing.JLabel();
        jButtonAtrasAadministrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondoEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistraralquiler.setText("Registrar Alquiler");
        jButtonRegistraralquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistraralquilerMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonRegistraralquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jButtonRegistrarCompra.setText("Registrar Compra");
        jButtonRegistrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarCompraMouseClicked(evt);
            }
        });
        jButtonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabelImagenComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprar.png"))); // NOI18N
        jLabelImagenComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagenComprarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelImagenComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabelImagenAlquilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alquilar.png"))); // NOI18N
        getContentPane().add(jLabelImagenAlquilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jButtonAtrasAadministrador.setText("ATRÁS");
        jButtonAtrasAadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAtrasAadministradorMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonAtrasAadministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yuppy SC", 0, 30)); // NOI18N
        jLabel1.setText("Menú del Empleado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabelFondoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall.png"))); // NOI18N
        getContentPane().add(jLabelFondoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarCompraActionPerformed

    private void jButtonAtrasAadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtrasAadministradorMouseClicked
        // TODO add your handling code here:
            InterfazPrincipal iP = new InterfazPrincipal();
            iP.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButtonAtrasAadministradorMouseClicked

    private void jLabelImagenComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenComprarMouseClicked
        // TODO add your handling code here:
            Interfaz_Empleado iE = new Interfaz_Empleado();
            iE.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabelImagenComprarMouseClicked

    private void jButtonRegistrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarCompraMouseClicked
        // TODO add your handling code here:
        Interfaz_MenuCliente iRC = new Interfaz_MenuCliente();
            iRC.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButtonRegistrarCompraMouseClicked

    private void jButtonRegistraralquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistraralquilerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonRegistraralquilerMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtrasAadministrador;
    private javax.swing.JButton jButtonRegistrarCompra;
    private javax.swing.JButton jButtonRegistraralquiler;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondoEmpleado;
    private javax.swing.JLabel jLabelImagenAlquilar;
    private javax.swing.JLabel jLabelImagenComprar;
    // End of variables declaration//GEN-END:variables
}
