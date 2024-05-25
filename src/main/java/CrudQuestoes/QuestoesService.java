/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudQuestoes;

import Connection.ConnectionFactory;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author felip
 */
public class QuestoesService {
    public static ArrayList<Questoes> get(String fase) throws Exception{
        ArrayList<Questoes> questoes = new ArrayList<Questoes>();
        
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.obterConexao();
            
            String query = "SELECT idQuestoes, fase, dificuldade, pergunta, respostaCorreta from questoes WHERE fase = ?;";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, fase);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idQuestoes = rs.getInt("idQuestoes");
                String fase1 = rs.getString("fase");
                String dificuldade = rs.getString("dificuldade");
                String pergunta = rs.getString("pergunta");
                String respostaCorreta = rs.getString("respostaCorreta");
                
                Questoes q = new Questoes(idQuestoes,fase1,dificuldade,pergunta,respostaCorreta);
                questoes.add(q);   
            }
         
            return questoes;
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
    
    public static void insert(Questoes q) throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "INSERT INTO questoes (fase, dificuldade, pergunta, resposta1, resposta2, resposta3, resposta4, respostaCorreta, explicacao) VALUES (?, ?, ?,?,?,?,?,?,?);";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, q.getFase());
            stmt.setString(2, q.getDificuldade());
            stmt.setString(3, q.getPergunta());
            stmt.setString(4, q.getResposta1());
            stmt.setString(5, q.getResposta2());
            stmt.setString(6, q.getResposta3());
            stmt.setString(7, q.getResposta4());
            stmt.setString(8, q.getRespostaCorreta());
            stmt.setString(9, q.getExplicacao());

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
    public static void update(Questoes q) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "UPDATE questoes SET fase=?, dificuldade=?, pergunta=?, resposta1=?, resposta2=?, resposta3=?, resposta4=?, respostaCorreta=?, explicacao=? WHERE idQuestoes=?;";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, q.getFase());
            stmt.setString(2, q.getDificuldade());
            stmt.setString(3, q.getPergunta());
            stmt.setString(4, q.getResposta1());
            stmt.setString(5, q.getResposta2());
            stmt.setString(6, q.getResposta3());
            stmt.setString(7, q.getResposta4());
            stmt.setString(8, q.getRespostaCorreta());
            stmt.setString(9, q.getExplicacao());
            stmt.setInt(10, q.getId());

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
    public static void delete(Questoes q) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "UPDATE questoes SET fase='', dificuldade='', pergunta='', resposta1='', resposta2='', resposta3='', resposta4='', respostaCorreta='', explicacao='' WHERE idQuestoes=?;   ";
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, q.getId());
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
    
        public static ArrayList<Questoes> getPerguntas(String fase) throws Exception{
        ArrayList<Questoes> questoes = new ArrayList<Questoes>();
        
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionFactory.obterConexao();
            
            String query = "SELECT pergunta, resposta1, resposta2, resposta3, resposta4, repostaCorreta, explicacao from questoes WHERE fase = ?;";
            stmt.setString(2, fase);
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String pergunta = rs.getString(4);
                String resposta1 = rs.getString(5);
                String resposta2 = rs.getString(6);
                String resposta3 = rs.getString(7);
                String resposta4 = rs.getString(8);
                String respostaCorreta = rs.getString(9);
                String explicacao = rs.getString(10);
                
               
                //Questoes q = new Questoes();
                //questoes.add(q);   
            }
         
            return questoes;
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

