/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CrudQuestoes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felip
 */
public class QuestoesTableModel extends AbstractTableModel {

    private List<Questoes> dados = new ArrayList<>();
    private String[]colunas = {"ID","Fase","Dificuldade","Pergunta","Resposta",};
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
        
    }
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch(coluna){
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getFase();
            case 2:
                return dados.get(linha).getDificuldade();
            case 3:
                return dados.get(linha).getPergunta();
            case 4:
                return dados.get(linha).getRespostaCorreta();

        }
        return null;

    }
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            case 0:
                dados.get(linha).setId(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setFase((String) valor);
                break;
            case 2:
                dados.get(linha).setDificuldade((String) valor);
                break;
            case 3:
                dados.get(linha).setPergunta((String) valor);
                break;
            case 4:
                dados.get(linha).setRespostaCorreta((String) valor);
                break;  
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Questoes q){
        this.dados.add(q);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    public Questoes getDados (int linha){
        return dados.get(linha);
    }
    public void atualizar(Questoes q, int linha) throws Exception{
        Questoes q2 = dados.get(linha);
        
        q2.setFase(q.getFase());
        q2.setDificuldade(q.getDificuldade());
        q2.setPergunta(q.getPergunta());
        q2.setRespostaCorreta(q.getRespostaCorreta());
        
        fireTableRowsUpdated(linha, linha);
    }
    
}
