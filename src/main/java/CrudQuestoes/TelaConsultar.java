/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudQuestoes;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;

/**
 *
 * @author felip
 */
public class TelaConsultar extends javax.swing.JFrame {

    private int indexSelecionado = -1;
    private QuestoesTableModel QuestoesTabela = new QuestoesTableModel();
    /**
     * Creates new form TelaConsultar
     */
    public TelaConsultar() {
        initComponents();
        jTable2.setModel (QuestoesTabela);
        setLocationRelativeTo(null);
    }
    private void getQuestoes(String fase){
        try{
            while (this.QuestoesTabela.getRowCount() > 0){
                this.QuestoesTabela.removeRow(0);
            }
            
            for(Questoes questoes : QuestoesService.get(fase)){
                this.QuestoesTabela.addRow(questoes);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar questoes", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        procurarBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID da Questão:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        voltarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("< Voltar");
        voltarBotao.setBorder(null);
        voltarBotao.setContentAreaFilled(false);
        voltarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(voltarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jScrollPane2.setBackground(new java.awt.Color(0,0,0,1));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(102, 102, 102));
        jTable2.setInheritsPopupMenu(true);
        jTable2.setOpaque(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 781, 380));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca", "Faringe", "Esofago", "Estomago","Figado","Vesicula biliar","Pancreas","Intestino delgado","Intestino grosso","Reto" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 110, 30));

        procurarBotao.setBackground(new java.awt.Color(6, 16, 6));
        procurarBotao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        procurarBotao.setForeground(new java.awt.Color(255, 255, 255));
        procurarBotao.setText("Procurar");
        procurarBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        procurarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procurarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(procurarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/adm2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1000, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarBotaoActionPerformed
        EfeitoSonoro.Play("click.wav");
        var fase1 = jComboBox1.getSelectedItem();
        String fase2 = ((String )fase1);
        getQuestoes(fase2);
    }//GEN-LAST:event_procurarBotaoActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        EfeitoSonoro.Play("back.wav");
        MenuQuestions mq = new MenuQuestions();
        mq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton procurarBotao;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
