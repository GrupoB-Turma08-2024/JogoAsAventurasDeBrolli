/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author felip
 */
public class ConnectionFactory {
    
    private static Connection con;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String host = "mysql-30fd5689-brollijogo-ff79.j.aivencloud.com";
    private static String porta = "19223";
    private static String db = "AventurasDoBroly";
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_CKI7rI1xBBZsCMBPrt8";
    
    public static Connection obterConexao() throws Exception{
        //jdbc: Java Database Connectivity
        try {
            Class.forName(driver);
            String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, db);
            con = DriverManager.getConnection(url, usuario, senha);
            return con;
        } catch(ClassNotFoundException | SQLException ex){
            throw new  RuntimeException(ex.getMessage());
        }
    }
}

