package Quiz.Telas;

import Quiz.QuizManager;
import java.awt.Color;

public class TelaLousa extends javax.swing.JFrame {

    QuizManager quizManager;
    
    public TelaLousa(QuizManager qM, String explicacao) {
        initComponents();
        quizManager = qM;
        setLocationRelativeTo(null);
        labelExplicacao.setText(quebrarTexto(explicacao, 450));
        setVisible(true);
    }
    
    private String quebrarTexto(String texto, int tamanhoMaximo){
        int caracteres = texto.length();
        String novoTexto = String.format("<html><p style=\"width:%dpx; text-align: left \"> CORRETO! EXPLICAÇÃO: " + texto + "</html>", tamanhoMaximo);
        return novoTexto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelExplicacao = new javax.swing.JLabel();
        botaoProximaPergunta = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 597));
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setPreferredSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        labelExplicacao.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        labelExplicacao.setForeground(new java.awt.Color(255, 255, 255));
        labelExplicacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExplicacao.setText("EXPLICAÇÃO");
        labelExplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelExplicacao);
        labelExplicacao.setBounds(60, 40, 580, 250);

        botaoProximaPergunta.setBackground(new java.awt.Color(0, 0, 0));
        botaoProximaPergunta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        botaoProximaPergunta.setForeground(new java.awt.Color(255, 255, 255));
        botaoProximaPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_ui/retangulo.png"))); // NOI18N
        botaoProximaPergunta.setText("PRÓXIMA PERGUNTA");
        botaoProximaPergunta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoProximaPergunta.setContentAreaFilled(false);
        botaoProximaPergunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoProximaPergunta.setIconTextGap(0);
        botaoProximaPergunta.setRolloverEnabled(false);
        botaoProximaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProximaPergunta);
        botaoProximaPergunta.setBounds(20, 500, 190, 40);

        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outros_fundos/imagem_explicacao.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundLabel.setAlignmentY(0.0F);
        backgroundLabel.setName(""); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1000, 562);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaPerguntaActionPerformed
        quizManager.proximaPergunta();
        dispose();
    }//GEN-LAST:event_botaoProximaPerguntaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoProximaPergunta;
    private javax.swing.JLabel labelExplicacao;
    // End of variables declaration//GEN-END:variables
}
