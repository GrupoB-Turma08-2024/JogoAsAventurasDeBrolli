/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ranking;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author felip
 */
public class RankingTableModel extends AbstractTableModel {
    
    private List<Ranking> dados = new ArrayList<>();
    private String[]colunas = {"Nome","Tempo","Quantidade de pontos"};
    
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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getTempo();
            case 2:
                return dados.get(linha).getPontos();
        }
        return null;

    }
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            case 0:
                dados.get(linha).setNome((String) valor);
                break;
            case 1:
                dados.get(linha).setTempo(Integer.parseInt((String) valor));
                break;
            case 2:
                dados.get(linha).setPontos(Integer.parseInt((String) valor));
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
    
    public void addRow(Ranking r){
        this.dados.add(r);
        this.fireTableDataChanged();
    }
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    public Ranking getDados (int linha){
        return dados.get(linha);
    }
    public void atualizar(Ranking r, int linha) throws Exception{
        Ranking r2 = dados.get(linha);
        
        r2.setNome(r.getNome());
        r2.setTempo(r.getTempo());
        r2.setPontos(r.getPontos());
        
        fireTableRowsUpdated(linha, linha);
    }
}
