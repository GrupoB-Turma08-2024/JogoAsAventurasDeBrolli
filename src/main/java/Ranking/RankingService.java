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
            
            String query = "SELECT nomeJogador, qntdPontos, qntdTempo from Ranking ORDER BY qntdPontos DESC;";
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
    public static void insert(Ranking r) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "INSERT INTO Ranking (nomeJogador,qntdPontos, qntdTempo) VALUES (?, ?, ?);";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, r.getNome());
            stmt.setInt(2, r.getPontos());
            stmt.setInt(3, r.getTempo());

            stmt.execute();
        }
        finally
        {
            if (stmt != null)
                stmt.close();

            if (conn != null)
                conn.close();
        }
    }
    public static void update(Ranking r) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "UPDATE Ranking SET qntdPontos=?, qntdTempo=? WHERE nomeJogador=?;";
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, r.getPontos());
            stmt.setInt(2, r.getTempo());
            stmt.setString(3, r.getNome());

            stmt.executeUpdate();
        }
        finally
        {
            if (stmt != null)
                stmt.close();

            if (conn != null)
                conn.close();
        }
    }
    public static boolean jogadorExiste(String nomeJogador) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.obterConexao();

            String query = "SELECT COUNT(*) FROM Ranking WHERE nomeJogador = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nomeJogador);

            rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            } else {
                return false;
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }
}
