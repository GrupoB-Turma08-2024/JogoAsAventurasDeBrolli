package Quiz.Telas;

import Quiz.QuizManager;
import javax.swing.JButton;

public class TelaBonus extends javax.swing.JFrame{
    
    QuizManager q;
    private static final int[] botSize = {220, 120};
    
    public TelaBonus(QuizManager q) {
        this.q = q;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNao = new javax.swing.JButton();
        botaoSim = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 593));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/botao_não.png"))); // NOI18N
        botaoNao.setBorder(null);
        botaoNao.setBorderPainted(false);
        botaoNao.setContentAreaFilled(false);
        botaoNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoNaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoNaoMouseExited(evt);
            }
        });
        botaoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNao);
        botaoNao.setBounds(160, 430, 220, 120);

        botaoSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/botao_sim.png"))); // NOI18N
        botaoSim.setBorder(null);
        botaoSim.setBorderPainted(false);
        botaoSim.setContentAreaFilled(false);
        botaoSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoSimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoSimMouseExited(evt);
            }
        });
        botaoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSim);
        botaoSim.setBounds(650, 430, 220, 120);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/tela_bonus_1.jpeg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, -10, 1000, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoActionPerformed
        q.proximaFase();
        this.dispose();
    }//GEN-LAST:event_botaoNaoActionPerformed

    private void botaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimActionPerformed
        q.getTelaQuiz().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSimActionPerformed

    private void botaoNaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNaoMouseEntered
        ajustarBot(botaoNao, 5);
    }//GEN-LAST:event_botaoNaoMouseEntered

    private void botaoNaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNaoMouseExited
        ajustarBot(botaoNao, 0);
    }//GEN-LAST:event_botaoNaoMouseExited

    private void botaoSimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSimMouseEntered
        ajustarBot(botaoSim, 5);
    }//GEN-LAST:event_botaoSimMouseEntered

    private void botaoSimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSimMouseExited
        ajustarBot(botaoSim, 0);
    }//GEN-LAST:event_botaoSimMouseExited
    
    private void ajustarBot(JButton bot, int sizeToAdd){
        bot.setSize(botSize[0]+ sizeToAdd, botSize[1] + sizeToAdd);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoNao;
    private javax.swing.JButton botaoSim;
    // End of variables declaration//GEN-END:variables
}
