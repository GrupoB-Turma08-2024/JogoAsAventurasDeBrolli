/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author felip
 */
public class DAO {

    private Connection con;

    public boolean existe(Usuario u) throws Exception {
        //jdbc: Java Database Connectivity

        //1-Especificar o comando SQL
        String sql = "SELECT * FROM Jogador WHERE nomeJogador = ? AND senhaJogador = ?";
        //2-Estabelecer uma conexao com o banco de dados
        con = ConnectionFactory.obterConexao();
        //3-Preparar o comando
        PreparedStatement ps = con.prepareStatement(sql);
        //4-Substituir os eventuais placeholders
        ps.setString(1, u.getNome());
        ps.setString(2, u.getSenha());
        //5-Executar o comando
        ResultSet rs = ps.executeQuery();
        //6-Lidar com o resultado
        boolean achou = rs.next();
        //7-Fechar conexao
        rs.close();
        ps.close();
        con.close();
        //8-Responder se o usuario existe ou nao
        return achou;
    }
    
    public boolean existeAdm(Usuario u) throws Exception {
        //jdbc: Java Database Connectivity

        //1-Especificar o comando SQL
        String sql = "SELECT * FROM Jogador WHERE nomeJogador = ? AND senhaJogador = ? AND emailAdmin IS NOT NULL";
        //2-Estabelecer uma conexao com o banco de dados
        con = ConnectionFactory.obterConexao();
        //3-Preparar o comando
        PreparedStatement ps = con.prepareStatement(sql);
        //4-Substituir os eventuais placeholders
        ps.setString(1, u.getNome());
        ps.setString(2, u.getSenha());
        //5-Executar o comando
        ResultSet rs = ps.executeQuery();
        //6-Lidar com o resultado
        boolean achouAdmin = rs.next();
        //7-Fechar conexao
        rs.close();
        ps.close();
        con.close();
        //8-Responder se o usuario existe ou nao
        return achouAdmin;
    }
    
    public void cadastrarUsuario(Usuario Usuario) throws Exception {

        con = ConnectionFactory.obterConexao();

        String sql = "INSERT INTO Jogador (nomeJogador, emailAluno, senhaJogador, serie) VALUES (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setLong(1, 3);
        ps.setString(1, Usuario.getNome());
        ps.setString(2, Usuario.getEmail());
        ps.setString(3, Usuario.getSenha());
        ps.setInt(4, Usuario.getSerie());

        // ps.execute();

        // int resultado = 
        ps.executeUpdate();
        //if (resultado == 1) {
         //   System.out.println("Dados inseridos com sucesso!");
        //}
        ps.close();
        con.close();

    }
    public void cadastrarAdmin(Usuario Usuario) throws Exception {

        con = ConnectionFactory.obterConexao();

        String sql = "INSERT INTO Jogador (nomeJogador, emailAdmin, senhaJogador, serie) VALUES (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setLong(1, 3);
        ps.setString(1, Usuario.getNome());
        ps.setString(2, Usuario.getEmail());
        ps.setString(3, Usuario.getSenha());
        ps.setInt(4, Usuario.getSerie());

        // ps.execute();

        // int resultado = 
        ps.executeUpdate();
        //if (resultado == 1) {
         //   System.out.println("Dados inseridos com sucesso!");
        //}
        ps.close();
        con.close();

    }
    public String selecionarUsuario(Usuario u) throws Exception {
        String sql = "SELECT * FROM Jogador";
        Connection con = null;
        Statement stmt = null;

        try {
            con = ConnectionFactory.obterConexao();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Integer idUsuario = rs.getInt(1);
                String apelido = rs.getString(2);
                String email = rs.getString(3);
                String senha = rs.getString(4);
                System.out.println("Id: " + idUsuario);
                System.out.println("Apelido: " + idUsuario);
                System.out.println("email: " + idUsuario);
                System.out.println("senha: " + idUsuario);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
            }
        }
        
        return " ";
    }

    public int pegarIdJogador(String nome) throws Exception {
        //jdbc: Java Database Connectivity

        //1-Especificar o comando SQL
        String sql = "SELECT idJogador FROM Jogador WHERE nomeJogador = ?";
        //2-Estabelecer uma conexao com o banco de dados
        con = ConnectionFactory.obterConexao();
        //3-Preparar o comando
        PreparedStatement ps = con.prepareStatement(sql);
        //4-Substituir os eventuais placeholders
        ps.setString(1, nome);
        //5-Executar o comando
        ResultSet rs = ps.executeQuery();
        //6-Lidar com o resultado
        int id = -1;
        while(rs.next()){
            id = rs.getInt("idJogador");
        }
        System.out.println(id + ": " + nome);
        //7-Fechar conexao
        rs.close();
        ps.close();
        con.close();
        //8-Responder se o usuario existe ou nao
        return id;
    }
    
}
