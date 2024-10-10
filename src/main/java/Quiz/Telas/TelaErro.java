package Quiz.Telas;

import Quiz.Fase;
import Quiz.QuizManager;
import java.awt.Color;
import javax.swing.JButton;

public class TelaErro extends javax.swing.JFrame {

    QuizManager quizManager;
    private final static int[] botSize = {190,40};
    
    public TelaErro(QuizManager qM,Fase fase, String explicacao) {
        initComponents();
        quizManager = qM;
        if(quizManager.getFaseAtual().isBonus()){
            botaoTentarNovamente.setText("PRÓXIMA PERGUNTA");
        }
        setLocationRelativeTo(null);
        backgroundLabel.setIcon(fase.getImagemErro());
        labelExplicacao.setOpaque(true);
        labelExplicacao.setBackground(new Color(0,0,0,100));
        labelExplicacao.setText(quebrarTexto(explicacao, 700));
        setVisible(true);
    }
    
    private String quebrarTexto(String texto, int tamanhoMaximo){
        int caracteres = texto.length();
        String novoTexto = String.format("<html><p style=\"width:%dpx; text-align: center \"> VOCÊ ERROU! EXPLICAÇÃO: " + texto + "</html>", tamanhoMaximo);
        return novoTexto;
    }
    
    private void ajustarBot(JButton bot, int sizeToAdd){
        bot.setSize(botSize[0]+ sizeToAdd, botSize[1] + sizeToAdd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelExplicacao = new javax.swing.JLabel();
        botaoTentarNovamente = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        labelExplicacao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        labelExplicacao.setForeground(new java.awt.Color(255, 255, 255));
        labelExplicacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExplicacao.setText("EXPLICAÇÃO");
        labelExplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelExplicacao);
        labelExplicacao.setBounds(0, 420, 1000, 140);

        botaoTentarNovamente.setBackground(new java.awt.Color(128, 0, 0));
        botaoTentarNovamente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        botaoTentarNovamente.setForeground(new java.awt.Color(255, 255, 255));
        botaoTentarNovamente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoTentarNovamente.setText("TENTAR NOVAMENTE");
        botaoTentarNovamente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoTentarNovamente.setContentAreaFilled(false);
        botaoTentarNovamente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoTentarNovamente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoTentarNovamente.setIconTextGap(0);
        botaoTentarNovamente.setRolloverEnabled(false);
        botaoTentarNovamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoTentarNovamenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoTentarNovamenteMouseExited(evt);
            }
        });
        botaoTentarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTentarNovamenteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoTentarNovamente);
        botaoTentarNovamente.setBounds(10, 370, 190, 40);

        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_fases/0_L.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundLabel.setAlignmentY(0.0F);
        backgroundLabel.setName(""); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1000, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTentarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTentarNovamenteActionPerformed
        if(quizManager.getFaseAtual().isBonus()){
         quizManager.proximaFase();
        }
        quizManager.getTelaQuiz().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoTentarNovamenteActionPerformed

    private void botaoTentarNovamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoTentarNovamenteMouseEntered
        ajustarBot(botaoTentarNovamente, 5);
    }//GEN-LAST:event_botaoTentarNovamenteMouseEntered

    private void botaoTentarNovamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoTentarNovamenteMouseExited
        ajustarBot(botaoTentarNovamente, 0);
    }//GEN-LAST:event_botaoTentarNovamenteMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoTentarNovamente;
    private javax.swing.JLabel labelExplicacao;
    // End of variables declaration//GEN-END:variables
}
