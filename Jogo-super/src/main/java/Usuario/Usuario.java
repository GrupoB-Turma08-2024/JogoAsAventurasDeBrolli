/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author felip
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private int Serie;
<<<<<<< HEAD

    public Usuario(String nome, String senha) throws Exception {
=======
    
    public Usuario(String nome, String senha) throws Exception{
>>>>>>> 6e3fce4a15af4f01e941c8fa6950bb271fc0830b
        this.setNome(nome);
        this.setSenha(senha);
    }

    public Usuario(String nome, String email, String senha, int Serie) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setSerie(serie);
    }
<<<<<<< HEAD

    public int getSerie() {
        return serie;
=======
    public Usuario(String nome, String email, String senha, int serie) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setSerie(serie);
    }

    public int getSerie() {
        return Serie;
>>>>>>> 6e3fce4a15af4f01e941c8fa6950bb271fc0830b
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }
<<<<<<< HEAD

=======
>>>>>>> 6e3fce4a15af4f01e941c8fa6950bb271fc0830b
    public Usuario(String nome, String email, String email2, String senha) throws Exception {
        this.setNome(nome);
        this.setEmail(email);
        this.setEmail(email2);
        this.setSenha(senha);
    }

    public Usuario(int idUsuario, String nome, String email, String email2, String senha) throws Exception {
        this.setIdUsuario(idUsuario);
        this.setNome(nome);
        this.setEmail(email);
        this.setEmail(email2);
        this.setSenha(senha);
    }

    public Usuario(int idUsuario, String nome, String email, String senha) throws Exception {
        this(nome, email, senha);
        this.setIdUsuario(idUsuario);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
