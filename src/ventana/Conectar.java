/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kleberth
 */
public class Conectar {
    
    private static java.sql.Connection conecta;
    private static final String DRIVER = "org.gjt.mm.mysql.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
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
                System.out.println("Error en la conexion..." + e);
 
        }
    }

    public java.sql.Connection getConnection() {
        return conecta;
    }

    public void desConectar() {
        conecta = null;
        if(conecta == null){
            System.out.println("Conexion terminada...");
        }
    }
    
}
