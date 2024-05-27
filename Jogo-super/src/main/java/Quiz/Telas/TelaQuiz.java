package Quiz.Telas;

import Quiz.Fase;
import Quiz.QuizManager;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaQuiz extends javax.swing.JFrame {

    private QuizManager quizManager;
    
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

        jButton1 = new javax.swing.JButton();
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

        jButton1.setFont(new java.awt.Font("Goudy Stout", 3, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem_ilegal_em_17_paises.png"))); // NOI18N
        jButton1.setText("BOTÃO SUPER SECRETO DO PORTO");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 160, 380, 50);

        labelPergunta.setBackground(new java.awt.Color(255, 255, 255));
        labelPergunta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelPergunta.setForeground(new java.awt.Color(255, 255, 255));
        labelPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPergunta.setText("PERGUNTA");
        labelPergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelPergunta);
        labelPergunta.setBounds(0, 0, 1000, 160);

        botaoAlternativaA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaA.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoAlternativaA.setText("teste");
        botaoAlternativaA.setBorder(null);
        botaoAlternativaA.setBorderPainted(false);
        botaoAlternativaA.setContentAreaFilled(false);
        botaoAlternativaA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaA.setIconTextGap(0);
        botaoAlternativaA.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaAActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaA);
        botaoAlternativaA.setBounds(220, 360, 230, 120);

        botaoAlternativaB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaB.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoAlternativaB.setText("teste");
        botaoAlternativaB.setBorder(null);
        botaoAlternativaB.setBorderPainted(false);
        botaoAlternativaB.setContentAreaFilled(false);
        botaoAlternativaB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaB.setIconTextGap(0);
        botaoAlternativaB.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaBActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaB);
        botaoAlternativaB.setBounds(450, 360, 230, 120);

        botaoAlternativaC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaC.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoAlternativaC.setText("teste");
        botaoAlternativaC.setBorder(null);
        botaoAlternativaC.setBorderPainted(false);
        botaoAlternativaC.setContentAreaFilled(false);
        botaoAlternativaC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaC.setIconTextGap(0);
        botaoAlternativaC.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaCActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaC);
        botaoAlternativaC.setBounds(110, 440, 230, 120);

        botaoAlternativaD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaD.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoAlternativaD.setText("teste");
        botaoAlternativaD.setBorder(null);
        botaoAlternativaD.setBorderPainted(false);
        botaoAlternativaD.setContentAreaFilled(false);
        botaoAlternativaD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaD.setIconTextGap(0);
        botaoAlternativaD.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.setPreferredSize(new java.awt.Dimension(230, 120));
        botaoAlternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlternativaDActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlternativaD);
        botaoAlternativaD.setBounds(340, 440, 230, 120);

        botaoAlternativaE.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        botaoAlternativaE.setForeground(new java.awt.Color(255, 255, 255));
        botaoAlternativaE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoAlternativaE.setText("teste");
        botaoAlternativaE.setBorder(null);
        botaoAlternativaE.setBorderPainted(false);
        botaoAlternativaE.setContentAreaFilled(false);
        botaoAlternativaE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAlternativaE.setIconTextGap(0);
        botaoAlternativaE.setMaximumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaE.setMinimumSize(new java.awt.Dimension(230, 120));
        botaoAlternativaE.setPreferredSize(new java.awt.Dimension(230, 120));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        quizManager.proximaPergunta();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void atualizarTela(Fase fase, int numeroPergunta) {
        botaoAlternativaA.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('A'), 115));
        botaoAlternativaB.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('B'), 115));
        botaoAlternativaC.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('C'), 115));
        botaoAlternativaD.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('D'), 115));
        botaoAlternativaE.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getAlternativa('E'), 115));
        labelPergunta.setText(quebrarTexto(fase.getQuestao(numeroPergunta).getTextoPergunta(), 700));
        backgroundLabel.setIcon(fase.getImagemFundo());
        labelPergunta.setVisible(true);
    }
    
    private String quebrarTexto(String texto, int tamanhoMaximo){
        int caracteres = texto.length();
        String novoTexto = String.format("<html><p style=\"width:%dpx; text-align: center \">" + texto + "</html>", tamanhoMaximo);
        return novoTexto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoAlternativaA;
    private javax.swing.JButton botaoAlternativaB;
    private javax.swing.JButton botaoAlternativaC;
    private javax.swing.JButton botaoAlternativaD;
    private javax.swing.JButton botaoAlternativaE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelPergunta;
    // End of variables declaration//GEN-END:variables

}
