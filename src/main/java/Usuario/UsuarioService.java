/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class UsuarioService {
    public static ArrayList<Usuario> get() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "SELECT idJogador, nomeJogador, emailAdmin, emailAluno, senhaJogador FROM Jogador;";
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String emailAdmin = rs.getString(3);
                String emailAluno = rs.getString(4);
                String senha = rs.getString(5);

                Usuario u = new Usuario(id, nome, emailAdmin, emailAluno, senha);
                usuarios.add(u);
            }

            return usuarios;
        }
        finally
        {
            if (rs != null)
                rs.close();

            if (stmt != null)
                stmt.close();

            if (conn != null)
                conn.close();
        }
    }

    public static void insert(Usuario u) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "INSERT INTO Jogador (nomeJogador, emailAluno, senhaJogador) VALUES (?, ?, ?);";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());

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

    public static void update(Usuario u) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "UPDATE Jogador SET nomeJogador=?, emailAluno=?, senhaJogador=? WHERE idJogador=?;";
            stmt = conn.prepareStatement(query);

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setInt(4, u.getIdUsuario());

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

    public static void delete(Usuario u) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = ConnectionFactory.obterConexao();

            String query = "DELETE FROM Jogador WHERE idJogador=?;";
            stmt = conn.prepareStatement(query);

            stmt.setInt(1, u.getIdUsuario());
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
    
    
}
