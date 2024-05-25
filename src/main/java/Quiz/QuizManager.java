package Quiz;

import Quiz.Telas.TelaLousa;
import Quiz.Telas.TelaErro;
import Quiz.Telas.TelaQuiz;
import javax.swing.JOptionPane;

public class QuizManager {
    
    private TelaQuiz telaQuiz;
    private int numeroPergunta = 0;
    private Fase faseAtual;
    private FaseService fs;
    
    
    public void proximaFase() {
        //checar se proxima fase existe
        if (faseAtual.getIdFase() < 9){
            numeroPergunta = 0;
            faseAtual = fs.getFase(faseAtual.getIdFase() + 1);
            telaQuiz.atualizarTela(faseAtual, numeroPergunta);
        }
        else{
            JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ TERMINOU O JOGO!");
        }
    }
    
    public void proximaPergunta() {
        if (numeroPergunta < faseAtual.getQuestoes().size() - 1){
            numeroPergunta++;
            faseAtual.proximaImagem();
            telaQuiz.atualizarTela(faseAtual, numeroPergunta);
        }
        else{
            System.out.println("IR PARA A PROXIMA FASE(Atual: " + faseAtual.getIdFase() + ")");
            proximaFase(); //CASO O NÚMERO DA PRÓXIMA PERGUNTA EXCEDA A QUANTIDADE DE PERGUNTAS NA FASE
        }
    }
    
    public void responder(char resposta){
        if(faseAtual.getQuestao(numeroPergunta).getAlternativaCorreta() == resposta){
            var telaLousa = new TelaLousa(this, faseAtual.getQuestao(numeroPergunta).getCorrecao());
            telaQuiz.setVisible(false);
        }
        else{
            var telaErro = new TelaErro(this, faseAtual, faseAtual.getQuestao(numeroPergunta).getCorrecao());
            telaQuiz.setVisible(false);         
        }
    }
    
    public QuizManager() throws Exception {   
        fs = new FaseService(); // QUANDO O QUIZ COMEÇA (OU SEJA QND QUIZMANAGER É CRIADO) JA INSTANCIO UM FASESERVICE QUE VAI GERAR AS FASES
        faseAtual = fs.getFase(0);
        this.telaQuiz = new TelaQuiz(this);
        telaQuiz.atualizarTela(faseAtual, numeroPergunta);
    }

    public int getNumeroPergunta() {
        return numeroPergunta;
    }

    public void setNumeroPergunta(int numeroPergunta) {
        this.numeroPergunta = numeroPergunta;
    }

    public Fase getFaseAtual() {
        return faseAtual;
    }
//    
    public void setFaseAtual(Fase faseAtual) {
        this.faseAtual = faseAtual;
    }
    
    public TelaQuiz getTelaQuiz(){
        return telaQuiz;
    }
}
