/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudQuestoes;

import java.util.Set;

/**
 *
 * @author felip
 */
public class Questoes {
    private int id;
    private String fase;
    private String dificuldade;
    private String pergunta;
    private String resposta1;
    private String resposta2;
    private String resposta3;
    private String resposta4;
    private String respostaCorreta;
    private String explicacao;

    public Questoes(String fase, String dificuldade, String pergunta, String respostaCorreta) throws Exception{
        this.setFase(fase);
        this.setDificuldade(dificuldade);
        this.setPergunta(pergunta);
        this.setRespostaCorreta(respostaCorreta);        
    }
     public Questoes(int id,String fase, String dificuldade, String pergunta, String respostaCorreta) throws Exception{
        this.setId(id);
        this.setFase(fase);
        this.setDificuldade(dificuldade);
        this.setPergunta(pergunta);
        this.setRespostaCorreta(respostaCorreta);        
    }
    public Questoes(String fase, String dificuldade, String pergunta, String resposta1, String resposta2, String resposta3, String resposta4, String respostaCorreta, String explicacao) throws Exception {
        this(fase,dificuldade,pergunta,respostaCorreta);
        this.setResposta1(resposta1);
        this.setResposta2(resposta2);
        this.setResposta3(resposta3);
        this.setResposta4(resposta4);
        this.setExplicacao(explicacao);
    }
    public Questoes(int id, String fase, String dificuldade, String pergunta, String resposta1, String resposta2, String resposta3, String resposta4, String respostaCorreta, String explicacao) throws Exception {
        this(fase,dificuldade,pergunta,resposta1,resposta2,resposta3,resposta4,respostaCorreta,explicacao);
        this.setId(id);
    }
    public Questoes(int id){
        this.setId(id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public String getResposta2() {
        return resposta2;
    }

    public void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }

    public String getResposta3() {
        return resposta3;
    }

    public void setResposta3(String resposta3) {
        this.resposta3 = resposta3;
    }

    public String getResposta4() {
        return resposta4;
    }

    public void setResposta4(String resposta4) {
        this.resposta4 = resposta4;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    
}
