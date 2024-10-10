package Quiz.Telas;

import Quiz.Fase;
import Quiz.QuizManager;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
import telaInicial.Musica;

public class TelaQuiz extends javax.swing.JFrame {

    private QuizManager quizManager;
    private final static int[] botSize = {230,120};
    
    public TelaQuiz(QuizManager quizManager){
        this.quizManager = quizManager;
        initComponents();
        setLocationRelativeTo(null);
        labelPergunta.setOpaque(true);
        labelPergunta.setBackground(new Color(0,0,0,100));
        labelPergunta.setVisible(false);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPergunta = new javax.swing.JLabel();
        botaoAlternativaA = new javax.swing.JButton();
        botaoAlternativaB = new javax.swing.JButton();
        botaoAlternativaC = new javax.swing.JButton();
        botaoAlternativaD = new javax.swing.JButton();
        botaoAlternativaE = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(null);

        labelPergunta.setBackground(new java.awt.Color(255, 255, 255));
        labelPergunta.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelPergunta.setForeground(new java.awt.Color(255, 255, 255));
        labelPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPergunta.setText("PERGUNTA");
        labelPergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPergunta);
        labelPergunta.setBounds(0, 0, 1000, 210);

        botaoAlternativaA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaA.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoAlternativaA.setText("teste");
        botaoAlternativaA.setBorder(null);
        botaoAlternativaA.setBorderPainted(false);
        botaoAlternativaA.setContentAreaFilled(false);
        botaoAlternativaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlternativaA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaA.setIconTextGap(0);
        botaoAlternativaA.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAlternativaAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAlternativaAMouseExited(evt);
            }
        });
        botaoAlternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaAActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaA);
        botaoAlternativaA.setBounds(220, 360, 230, 120);

        botaoAlternativaB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaB.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoAlternativaB.setText("teste");
        botaoAlternativaB.setBorder(null);
        botaoAlternativaB.setBorderPainted(false);
        botaoAlternativaB.setContentAreaFilled(false);
        botaoAlternativaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlternativaB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaB.setIconTextGap(0);
        botaoAlternativaB.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlternativaBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAlternativaBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAlternativaBMouseExited(evt);
            }
        });
        botaoAlternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaBActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaB);
        botaoAlternativaB.setBounds(450, 360, 230, 120);

        botaoAlternativaC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaC.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoAlternativaC.setText("teste");
        botaoAlternativaC.setBorder(null);
        botaoAlternativaC.setBorderPainted(false);
        botaoAlternativaC.setContentAreaFilled(false);
        botaoAlternativaC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlternativaC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaC.setIconTextGap(0);
        botaoAlternativaC.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAlternativaCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAlternativaCMouseExited(evt);
            }
        });
        botaoAlternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaCActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaC);
        botaoAlternativaC.setBounds(110, 440, 230, 120);

        botaoAlternativaD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaD.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoAlternativaD.setText("teste");
        botaoAlternativaD.setBorder(null);
        botaoAlternativaD.setBorderPainted(false);
        botaoAlternativaD.setContentAreaFilled(false);
        botaoAlternativaD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlternativaD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaD.setIconTextGap(0);
        botaoAlternativaD.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAlternativaDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAlternativaDMouseExited(evt);
            }
        });
        botaoAlternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaDActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaD);
        botaoAlternativaD.setBounds(340, 440, 230, 120);

        botaoAlternativaE.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaE.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/retangulo.png"))); // NOI18N
        botaoAlternativaE.setText("teste");
        botaoAlternativaE.setBorder(null);
        botaoAlternativaE.setBorderPainted(false);
        botaoAlternativaE.setContentAreaFilled(false);
        botaoAlternativaE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlternativaE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaE.setIconTextGap(0);
        botaoAlternativaE.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaE.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaE.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoAlternativaEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoAlternativaEMouseExited(evt);
            }
        });
        botaoAlternativaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaEActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaE);
        botaoAlternativaE.setBounds(570, 440, 230, 120);

        backgroundLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_fases/0_0.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundLabel.setAlignmentY(0.0F);
        backgroundLabel.setName(""); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1000, 562);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAlternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlternativaAActionPerformed
        quizManager.responder('A');
    }//GEN-LAST:event_botaoAlternativaAActionPerformed

    private void botaoAlternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlternativaBActionPerformed
        quizManager.responder('B');
    }//GEN-LAST:event_botaoAlternativaBActionPerformed

    private void botaoAlternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlternativaCActionPerformed
        quizManager.responder('C');
    }//GEN-LAST:event_botaoAlternativaCActionPerformed

    private void botaoAlternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlternativaDActionPerformed
        quizManager.responder('D');
    }//GEN-LAST:event_botaoAlternativaDActionPerformed

    private void botaoAlternativaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlternativaEActionPerformed
        quizManager.responder('E');
    }//GEN-LAST:event_botaoAlternativaEActionPerformed

    private void botaoAlternativaAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaAMouseEntered
        ajustarBot(botaoAlternativaA, 5);
    }//GEN-LAST:event_botaoAlternativaAMouseEntered

    private void botaoAlternativaAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaAMouseExited
        ajustarBot(botaoAlternativaA, 0);
    }//GEN-LAST:event_botaoAlternativaAMouseExited

    private void botaoAlternativaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlternativaBMouseClicked

    private void botaoAlternativaBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaBMouseEntered
        ajustarBot(botaoAlternativaB, 5);
    }//GEN-LAST:event_botaoAlternativaBMouseEntered

    private void botaoAlternativaBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaBMouseExited
        ajustarBot(botaoAlternativaB, 0);
    }//GEN-LAST:event_botaoAlternativaBMouseExited

    private void botaoAlternativaCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaCMouseEntered
        ajustarBot(botaoAlternativaC, 5);
    }//GEN-LAST:event_botaoAlternativaCMouseEntered

    private void botaoAlternativaCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaCMouseExited
        ajustarBot(botaoAlternativaC, 0);
    }//GEN-LAST:event_botaoAlternativaCMouseExited

    private void botaoAlternativaDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaDMouseEntered
        ajustarBot(botaoAlternativaD, 5);
    }//GEN-LAST:event_botaoAlternativaDMouseEntered

    private void botaoAlternativaDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaDMouseExited
        ajustarBot(botaoAlternativaD, 0);
    }//GEN-LAST:event_botaoAlternativaDMouseExited

    private void botaoAlternativaEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaEMouseEntered
        ajustarBot(botaoAlternativaE, 5);
    }//GEN-LAST:event_botaoAlternativaEMouseEntered

    private void botaoAlternativaEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlternativaEMouseExited
        ajustarBot(botaoAlternativaE, 0);
    }//GEN-LAST:event_botaoAlternativaEMouseExited
    
    private void ajustarBot(JButton bot, int sizeToAdd){
        bot.setSize(botSize[0]+ sizeToAdd, botSize[1] + sizeToAdd);
    }
    
    public void atualizarTela(Fase fase, int numeroPergunta) {
        botaoAlternativaA.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('A'), 120));
        botaoAlternativaB.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('B'), 120));
        botaoAlternativaC.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('C'), 120));
        botaoAlternativaD.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('D'), 120));
        botaoAlternativaE.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('E'), 120));
        labelPergunta.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getTextoPergunta(), 700));
        arrumarTamanhoTextoBotao(botaoAlternativaA);
        arrumarTamanhoTextoBotao(botaoAlternativaB);
        arrumarTamanhoTextoBotao(botaoAlternativaC);
        arrumarTamanhoTextoBotao(botaoAlternativaD);
        arrumarTamanhoTextoBotao(botaoAlternativaE);
        backgroundLabel.setIcon(fase.getImagemFundo());
        labelPergunta.setVisible(true);
    }
    
    private String quebrarTexto(String texto, int tamanhoMaximo){
        int caracteres = texto.length();
        String novoTexto = String.format("<html><p style=\"width:%dpx; text-align: center \">" + texto + "</html>", tamanhoMaximo);
        return novoTexto;
    }
    
    private void arrumarTamanhoTextoBotao(javax.swing.JButton botao){
        Font font = new Font("Segoe UI", 0, 1650/botao.getText().length());
        botao.setFont(font);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoAlternativaA;
    private javax.swing.JButton botaoAlternativaB;
    private javax.swing.JButton botaoAlternativaC;
    private javax.swing.JButton botaoAlternativaD;
    private javax.swing.JButton botaoAlternativaE;
    private javax.swing.JLabel labelPergunta;
    // End of variables declaration//GEN-END:variables

}
