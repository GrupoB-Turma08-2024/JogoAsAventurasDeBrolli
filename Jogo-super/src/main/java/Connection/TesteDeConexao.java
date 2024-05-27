/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;

/**
 *
 * @author felip
 */
public class TesteDeConexao {
    private Connection con;
    
    private void status(){
        try{
            con = ConnectionFactory.obterConexao();
            if(con == null){
                System.out.println("Erro de conexão");
            } else{
                System.out.println("Banco de dados conectado");
            }
            con.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}

