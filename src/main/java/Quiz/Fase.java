package Quiz;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    
public class Fase {
    private int idFase;
    private ArrayList<Questao> questoes;
    private int numeroImagem;
    private ImageIcon imagemFundo;
    
    public Fase(int id){
        setIdFase(id);
        setImagemFundo();
        questoes = new ArrayList<>();
    }
    
    public void proximaImagem(){
        numeroImagem += 1;
        setImagemFundo();
    }
    
    public ImageIcon getImagemErro(){
        var pathString = String.format("src/main/resources/imagens_fases/%d_L.jpg", idFase);
        return new ImageIcon(pathString);
    }
    
    public void setImagemFundo(){
        var pathString = String.format("src/main/resources/imagens_fases/%d_%d.jpg", idFase, numeroImagem);
        this.imagemFundo = new ImageIcon(pathString);
    }
    
    public ImageIcon getImagemFundo(){
        return imagemFundo;
    }

    public Questao getQuestao(int numero) {
        if(questoes.size() > numero){
            return (Questao) questoes.get(numero);
        }
        else{
         JOptionPane.showMessageDialog(null, "ERRO: PROGRAMA TENTOU CARREGAR UMA QUESTÃO QUE NÃO EXSITE NO BANCO DE DADOS! \n( favor verificar se todas as fases possuem 3 questoes)", "ERRO", 2);
         return null;
        }
    }
    
    public ArrayList getQuestoes(){
        return questoes;
    }

    public void setQuestoes(ArrayList questoes) {
        this.questoes = questoes;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }
    
    @Override
    public String toString(){
        return String.format("Fase: %d", idFase);
    }
}
