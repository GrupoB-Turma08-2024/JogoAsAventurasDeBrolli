/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felip
 */
public class UsuarioTableModel extends AbstractTableModel{
    
    private List<Usuario> dados = new ArrayList<>();
    private String[] colunas ={"id","Nome","Email","Senha"};

    
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
                return dados.get(linha).getIdUsuario();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getEmail();
            case 3:
                return dados.get(linha).getSenha();
                
        }
        return null;
    }
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            case 0:
                dados.get(linha).setIdUsuario(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2:
                dados.get(linha).setEmail((String) valor);
                break;
            case 3:
                dados.get(linha).setSenha((String) valor);
                break;
                
        }
        this.fireTableRowsUpdated(linha,linha);
    }
    
    public void addRow(Usuario u){
        this.dados.add(u);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Usuario getUsuario(int row) {
        return dados.get(row);
    }
    public void atualizar(Usuario u, int index) throws Exception {
        Usuario u2 = dados.get(index);

        u2.setEmail(u.getNome());
        u2.setEmail(u.getEmail());
        u2.setSenha(u.getSenha());

        fireTableRowsUpdated(index, index);
    }
    
}
