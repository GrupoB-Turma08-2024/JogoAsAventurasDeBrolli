package SistemaPontos;

import Connection.ConnectionFactory;
import Ranking.Ranking;
import Ranking.RankingService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public final class Pontuacao {
    private static boolean cadastrado = false; //ops talvez esqueci de checar se é adm(n deve aparecer no ranking)
    private static int idJogador;
    private static String nomeJogador;
    private static int pontos;
    private static long tempoInicioQuiz;
    private static long tempoFimQuiz;
    
    public static void adicionarPontos(String dificuldade, boolean faseBonus){
        switch(dificuldade){
            case "Difícil":
                pontos += faseBonus ? 30 * 2 : 30 * 1;
                break;
            case "Médio":
                pontos += faseBonus ? 20 * 2 : 20 * 1;
                break;
            case "Fácil":
                pontos += faseBonus ? 10 * 2 : 10 * 1;
                break;
        }
    }
    
    public static void removerPontos(boolean faseBonus){
        if(!faseBonus && pontos >= 15){
            pontos -= 15;
        }
    }
    
    public static boolean estaCadastrado(){
        return cadastrado;
    }
    
    public static void setCadastrado(boolean b){
        cadastrado = b;
    }
    
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    
    public int getPontos(){
        return pontos;
    }

    public static String getNomeJogador() {
        return nomeJogador;
    }
    
    public static void setNomeJogador(String nome) {
        nomeJogador = nome;
    }
    
    public static void setIdJogador(int id){
        idJogador = id;
    }
    
    public static void setTempoInicio(long milisegundos){
        tempoInicioQuiz = milisegundos;
    }
    
    public static void setTempoFim(long milisegundos){
        tempoFimQuiz = milisegundos;
    }
    
    public static String getTempoEmString(){
        long segundosTotais = (tempoFimQuiz - tempoInicioQuiz)/1000;
        long segundosRestantes = segundosTotais%60;
        long minutos = (segundosTotais - segundosRestantes)/60;
        return String.format("%d minuto(s) e %d segundo(s)", minutos, segundosRestantes);
    }
    
    public static void exibirMensagemParabens(){
        JOptionPane.showMessageDialog(null, String.format("Parabéns!\nSUA PONTUAÇÃO FOI: %d pts\nSEU TEMPO FOI: %s", pontos, getTempoEmString()));
        salvarPontuacao();
    }
    
    public static void setarJogador(int id, String nome){
        setIdJogador(id);
        setNomeJogador(nome);
        setCadastrado(true);
        System.out.println(id + "id");
    }
    
    public static int getIdJogador(){
        if(cadastrado){
            return idJogador;
        }else{
            System.err.println("ERRO, TENTOU PEGAR ID DE UM JOGADOR QUE CLICOU \"Jogar sem cadastro\".");
            return -1;
        }
    }
    
    public static void salvarPontuacao() {
        if (cadastrado) {
            Ranking ranking = new Ranking(nomeJogador, (int) ((tempoFimQuiz - tempoInicioQuiz) / 1000), pontos);
            try {
                 if (RankingService.jogadorExiste(nomeJogador)) {
                RankingService.update(ranking);
                 } else {
                RankingService.insert(ranking);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Ranking ranking = new Ranking("Anônimo", (int) ((tempoFimQuiz - tempoInicioQuiz) / 1000), pontos);
            try {
                RankingService.insert(ranking);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static String getNome(int idJogador) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obter conexão com o banco de dados
            connection = ConnectionFactory.obterConexao();

            // Criar um PreparedStatement para executar a consulta SQL
            String query = "SELECT nomeJogador FROM Jogador WHERE idJogador = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idJogador);

            // Executar a consulta SQL
            resultSet = preparedStatement.executeQuery();

            // Percorrer os resultados e adicionar ao JComboBox
            while (resultSet.next()) {
                nomeJogador = resultSet.getString("nomeJogador");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
        
}
