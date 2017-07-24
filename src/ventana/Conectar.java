/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kleberth
 */
public class Conectar {
    
    private static java.sql.Connection conecta;
    private static final String DRIVER = "org.gjt.mm.mysql.Driver";
    private static final String USER = JOptionPane.showInputDialog("Ingrese usuario Worbench");;
    private static final String PASSWORD = JOptionPane.showInputDialog("Ingrese contraseña");;
    private static final String URL = "jdbc:mysql://localhost:3306/sigevac";

    public Conectar() {
        
        conecta = null;
        try{
            Class.forName(DRIVER);
            conecta = DriverManager.getConnection(URL, USER, PASSWORD);
            if(conecta != null){
                System.out.println("Conexion establecida...");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la conexion...");
            System.exit(0);
 
        }
    }
   
    public java.sql.Connection getConnection() {
        return conecta;
    }

    public void desConectar() {
        conecta = null;
        if(conecta == null){
            JOptionPane.showMessageDialog(null,"Conexion terminada...");
        }
    }
}
