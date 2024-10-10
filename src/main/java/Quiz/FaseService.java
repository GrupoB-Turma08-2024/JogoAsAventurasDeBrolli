package Quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

public class FaseService {
    private Fase[] fases = new Fase[10];
    private final String[] nomesFases = {"Boca","Faringe","Figado","Esofago","Estomago","Vesicula biliar","Intestino delgado","Intestino grosso","Pancreas","Reto"};
    
    public FaseService() throws Exception{ // METODO CONSTRUTOR, QUANDO EU CHAMAR FASESERVICE, É PRA ELE JÁ CONFIGURAR TODAS AS FASES PRA MIM
       
        for(int i = 0; i < fases.length; i++){
            fases[i] = new Fase(i);
            ArrayList<Questao> questoes = buscarQuestoesAleatorias(fases[i].getIdFase());
            fases[i].setQuestoes(questoes);
            switch(nomesFases[fases[i].getIdFase()]){
                case "Figado":
                    fases[i].setBonus(true);
                    break;
                case "Vesicula biliar":
                    fases[i].setBonus(true);
                    break;
                case "Pancreas":
                    fases[i].setBonus(true);
                    break;
                default:
                    fases[i].setBonus(false);
                    break;
            }
        }  
    }
    
    private ArrayList<Questao> buscarQuestoesAleatorias(int idFase) throws Exception {
        ArrayList<Questao> questoes = new ArrayList<>();
        Random random = new Random();
        Connection conexao = ConnectionFactory.obterConexao();
        try{
            String sql = "SELECT pergunta, dificuldade, resposta1, resposta2, resposta3, resposta4, respostaCorreta, explicacao from questoes WHERE fase = ? ORDER BY RAND() LIMIT 3";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomesFases[idFase]);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String pergunta = rs.getString("pergunta");
                String dificuldade = rs.getString("dificuldade");
                String resposta1 = rs.getString("resposta1");
                String resposta2 = rs.getString("resposta2");
                String resposta3 = rs.getString("resposta3");
                String resposta4 = rs.getString("resposta4");
                String respostaCorreta = rs.getString("respostaCorreta");
                String explicacao = rs.getString("explicacao");
                String[] respostasErradas = {resposta1, resposta2, resposta3, resposta4};

                Questao q = new Questao(pergunta, dificuldade, respostasErradas, respostaCorreta, explicacao);
                questoes.add(q);  
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return questoes;
    }
    
    
    public Fase[] getFases(){
        return fases;
    }
    
    public Fase getFase(int idFase) {
        if (idFase >= 0 && idFase < fases.length) {
            System.out.println(fases[idFase].toString());
            return fases[idFase];
        } else {
            JOptionPane.showMessageDialog(null, "FASE INEXISTENTE!", "ERRO", 2);
            return null;
    }
    }
}
