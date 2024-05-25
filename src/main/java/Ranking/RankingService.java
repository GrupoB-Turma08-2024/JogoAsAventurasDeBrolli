/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ranking;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class RankingService {
    public static ArrayList<Ranking> get() throws Exception{
        ArrayList<Ranking> ranking = new ArrayList<Ranking>();
        
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.obterConexao();
            
            String query = "SELECT nomeJogador, qntdPontos, qntdTempo from Ranking;";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString(1);
                int pontos = rs.getInt(2);
                int Tempo = rs.getInt(3);
                
                Ranking q = new Ranking(nome,Tempo,pontos);
                ranking.add(q);   
            }
         
            return ranking;
        }
        finally{
            if (rs != null)
                rs.close();

            if (stmt != null)
                stmt.close();

            if (conn != null)
                conn.close();
        }
    }
}
