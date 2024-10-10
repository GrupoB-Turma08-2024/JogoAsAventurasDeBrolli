package Quiz.Telas;

import Quiz.QuizManager;
import java.awt.Color;
import javax.swing.JButton;

public class TelaLousa extends javax.swing.JFrame {

    QuizManager quizManager;
    private final static int[] botSize = {190,40};
    
    public TelaLousa(QuizManager qM, String explicacao) {
        initComponents();
        quizManager = qM;
        setLocationRelativeTo(null);
        labelExplicacao.setText(quebrarTexto(explicacao, 450));
        setVisible(true);
    }
    
    private String quebrarTexto(String texto, int tamanhoMaximo){
        int caracteres = texto.length();
        String novoTexto = String.format("<html><p style=\"width:%dpx; text-align: left \">  " + texto + "</html>", tamanhoMaximo);
        return novoTexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelExplicacao = new javax.swing.JLabel();
        botaoProximaPergunta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        labelExplicacao.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelExplicacao.setForeground(new java.awt.Color(255, 255, 255));
        labelExplicacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExplicacao.setText("EXPLICAÇÃO");
        labelExplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelExplicacao);
        labelExplicacao.setBounds(60, 90, 580, 200);

        botaoProximaPergunta.setBackground(new java.awt.Color(0, 0, 0));
        botaoProximaPergunta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        botaoProximaPergunta.setForeground(new java.awt.Color(255, 255, 255));
        botaoProximaPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoProximaPergunta.setText("PRÓXIMA PERGUNTA");
        botaoProximaPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoProximaPergunta.setContentAreaFilled(false);
        botaoProximaPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProximaPergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoProximaPergunta.setIconTextGap(0);
        botaoProximaPergunta.setRolloverEnabled(false);
        botaoProximaPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoProximaPerguntaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoProximaPerguntaMouseExited(evt);
            }
        });
        botaoProximaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProximaPergunta);
        botaoProximaPergunta.setBounds(20, 500, 190, 40);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACERTOU!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 170, 40);

        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/imagem_explicacao.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundLabel.setAlignmentY(0.0F);
        backgroundLabel.setName(""); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1000, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaPerguntaActionPerformed
        quizManager.proximaPergunta();
        dispose();
    }//GEN-LAST:event_botaoProximaPerguntaActionPerformed

    private void botaoProximaPerguntaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProximaPerguntaMouseEntered
        ajustarBot(botaoProximaPergunta, 5);
    }//GEN-LAST:event_botaoProximaPerguntaMouseEntered

    private void botaoProximaPerguntaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProximaPerguntaMouseExited
        ajustarBot(botaoProximaPergunta, 0);
    }//GEN-LAST:event_botaoProximaPerguntaMouseExited

    private void ajustarBot(JButton bot, int sizeToAdd){
        bot.setSize(botSize[0]+ sizeToAdd, botSize[1] + sizeToAdd);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoProximaPergunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelExplicacao;
    // End of variables declaration//GEN-END:variables
}
