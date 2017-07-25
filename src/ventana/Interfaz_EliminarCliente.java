/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author cindybohorquezsantana
 */
public class Interfaz_EliminarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_Modificar
     */
    public Interfaz_EliminarCliente() {
        initComponents();
        mostrardatos("");
        this.setLocationRelativeTo(null);
    }
       void mostrardatos(String valor){
        Conectar cc=new Conectar();
        Connection cn=cc.getConnection();
        DefaultTableModel modelo=new DefaultTableModel();
       
        modelo.addColumn("CedCliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("dirección");
        modelo.addColumn("Teléfono");
        
        jTable1.setModel(modelo);
        String sql="";
        if (valor.equals(""))
        {
            sql="SELECT * FROM SIGEVAC.CLIENTES";
        }
        else{
            sql="SELECT * FROM SIGEVAC.CLIENTES WHERE (cedCliente='"+valor+"' )";
            //sql="SELECT * FROM iSIGEVAC.CLIENTES WHERE (cedCliente='"+valor+"'  OR nombre='"+valor+"')";
        }  
        
        String []datos=new String [5];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
        }catch(SQLException ex){
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_CEDULA = new javax.swing.JTextField();
        jTextField2_NOMBRE = new javax.swing.JTextField();
        jTextField3_APELLIDOS = new javax.swing.JTextField();
        jTextField4_DIRECCIÓN = new javax.swing.JTextField();
        jTextField5_TELÉFONO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7ATRÁS = new javax.swing.JLabel();
        jLabelELIMINAR = new javax.swing.JLabel();
        Fondo_Modificar = new javax.swing.JLabel();

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 680, 310));

        jLabel1.setFont(new java.awt.Font("Yuppy SC", 0, 36)); // NOI18N
        jLabel1.setText("Eliminar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jTextField1_CEDULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_CEDULAActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_CEDULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, -1));
        getContentPane().add(jTextField2_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 120, -1));
        getContentPane().add(jTextField3_APELLIDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 120, -1));
        getContentPane().add(jTextField4_DIRECCIÓN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 120, -1));
        getContentPane().add(jTextField5_TELÉFONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 120, -1));

        jLabel2.setText("CedCliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        jLabel5.setText("Dirección");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jLabel6.setText("Teléfono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jLabel7ATRÁS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrás.png"))); // NOI18N
        jLabel7ATRÁS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7ATRÁSMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7ATRÁS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabelELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jLabelELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelELIMINARMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        Fondo_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall.png"))); // NOI18N
        getContentPane().add(Fondo_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

        pack();
    }// </editor-fold>                        

    private void jTextField1_CEDULAActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  
   
    private void jLabel7ATRÁSMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
         Interfaz_MenuCliente MC = new Interfaz_MenuCliente();
            MC.setVisible(true);
            this.dispose();
    }                                         

     String id="";
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int fila=jTable1.getSelectedRow();
    if(fila>=0){
         jTextField1_CEDULA.setText(jTable1.getValueAt(fila,0).toString());
         jTextField2_NOMBRE.setText(jTable1.getValueAt(fila,1).toString());
         jTextField3_APELLIDOS.setText(jTable1.getValueAt(fila,2).toString());
         jTextField4_DIRECCIÓN.setText(jTable1.getValueAt(fila,3).toString());
         jTextField5_TELÉFONO.setText(jTable1.getValueAt(fila,4).toString());
         id = jTable1.getValueAt(fila,0).toString();
           
    }
    else{
        JOptionPane.showMessageDialog(null,"No se encontro fila");
    }
    }                                          

    private void jLabelELIMINARMouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        Conectar cc=new Conectar();
        Connection cn = cc.getConnection();
        int fila = jTable1.getSelectedRow();
        String cod = "";
        cod = jTable1.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM CLIENTES WHERE cedCliente='" + cod + "'");
            pst.executeUpdate();
            mostrardatos("");// TODO add your handling code here:
        } catch (Exception e) {
        }
    }                                           

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
            java.util.logging.Logger.getLogger(Interfaz_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_EliminarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Fondo_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7ATRÁS;
    private javax.swing.JLabel jLabelELIMINAR;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_CEDULA;
    private javax.swing.JTextField jTextField2_NOMBRE;
    private javax.swing.JTextField jTextField3_APELLIDOS;
    private javax.swing.JTextField jTextField4_DIRECCIÓN;
    private javax.swing.JTextField jTextField5_TELÉFONO;
    // End of variables declaration                   
}
