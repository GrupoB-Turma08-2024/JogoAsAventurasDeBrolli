package Quiz;

import java.util.HashMap;
import java.util.Random;

public class Questao{
    private int id;
    private String textoPergunta;
    private final HashMap<Character, String> alternativas;
    private char letraAlternativaCorreta;
    private String correcao;
    private String dificuldade;
    private char[] letras = {'A','B','C','D','E'};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getLetraAlternativaCorreta() {
        return letraAlternativaCorreta;
    }

    public void setLetraAlternativaCorreta(char letraAlternativaCorreta) {
        this.letraAlternativaCorreta = letraAlternativaCorreta;
    }

    public Questao( String textoPergunta, String[] textosIncorretas, String textoCorreta, String correcao){
        this.setTextoPergunta(textoPergunta);    
        this.alternativas = new HashMap<>();
        this.setAlternativas(textosIncorretas, textoCorreta);
        this.setCorrecao(correcao);
    }
    public Questao(int id, String textoPergunta, String[] textosIncorretas, String textoCorreta, String correcao){
        this.setId(id);
        this.setTextoPergunta(textoPergunta);    
        this.alternativas = new HashMap<>();
        this.setAlternativas(textosIncorretas, textoCorreta);
        this.setCorrecao(correcao);
    }
    public Questao(String textoPergunta, String dificuldade, String[] textosIncorretas, String textoCorreta, String correcao){
        this.setTextoPergunta(textoPergunta);    
        this.alternativas = new HashMap<>();
        this.setAlternativas(textosIncorretas, textoCorreta);
        this.setCorrecao(correcao);
        this.dificuldade = dificuldade;
    }
    

    public void setTextoPergunta(String textoPergunta){
        this.textoPergunta = textoPergunta;
    }

    public void setAlternativaCorreta(char alternativaCorreta){
        this.letraAlternativaCorreta = alternativaCorreta;
    }
    
    public void setCorrecao(String correcao){
        this.correcao = correcao;
    }

    public void setAlternativas(String[] textosIncorretas, String textoCorreta){
        var rand = new Random();
        letraAlternativaCorreta = letras[rand.nextInt(0, letras.length)];
        alternativas.put(letraAlternativaCorreta, textoCorreta);

        var alt = 1;
        for(int i = 0; i < letras.length; i++)
        {
            if(alternativas.containsKey(letras[i])){ continue; }
            alternativas.put(letras[i], textosIncorretas[alt - 1]);
            alt++;
        }
        
        
    }
    
    public String getDificuldade(){
        return dificuldade;
    }

    public String getTextoPergunta(){
        return textoPergunta;
    }

    public String getAlternativa(char letra){
        return alternativas.get(letra);
    }

    public char getAlternativaCorreta(){
        return letraAlternativaCorreta;
    }
    
    public String getCorrecao(){
    return correcao;
    }

}