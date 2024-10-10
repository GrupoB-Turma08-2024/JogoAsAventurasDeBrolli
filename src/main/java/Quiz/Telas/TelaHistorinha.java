package Quiz.Telas;

import Quiz.QuizManager;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.JButton;

public class TelaHistorinha extends javax.swing.JFrame {
    
    private ArrayList<ImageIcon> imagens = new ArrayList<>();
    private int imagemAtiva = 0;
    private String nomeHistoria;
    private QuizManager qm;
    
    public TelaHistorinha(String[] caminhoImagens, String nomeHistoria, QuizManager qm) {
        this.qm = qm;
        this.nomeHistoria = nomeHistoria;
        initComponents();
        setLocationRelativeTo(null);
        for(String s : caminhoImagens){
            var imageURL = getClass().getClassLoader().getResource(s);
            imagens.add(new ImageIcon(imageURL));
        }
        labelImagem.setIcon(imagens.get(0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        botaoProxima = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoProxima.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        botaoProxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/botao_setinha.png"))); // NOI18N
        botaoProxima.setBorder(null);
        botaoProxima.setBorderPainted(false);
        botaoProxima.setContentAreaFilled(false);
        botaoProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoProximaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoProximaMouseExited(evt);
            }
        });
        botaoProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProxima);
        botaoProxima.setBounds(760, 440, 210, 120);

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/inicial_0.jpg"))); // NOI18N
        labelImagem.setText("imagem");
        getContentPane().add(labelImagem);
        labelImagem.setBounds(0, -17, 1000, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaActionPerformed
        if(imagemAtiva < imagens.size() - 1){
            imagemAtiva++;
            labelImagem.setIcon(imagens.get(imagemAtiva));
        }else{
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            qm.avisarFimHistoria(nomeHistoria);
            dispose();
        }
    }//GEN-LAST:event_botaoProximaActionPerformed

    private void botaoProximaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProximaMouseEntered
        ajustarBot(botaoProxima, 5);
    }//GEN-LAST:event_botaoProximaMouseEntered

    private void botaoProximaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProximaMouseExited
        ajustarBot(botaoProxima, 0);
    }//GEN-LAST:event_botaoProximaMouseExited

    private void ajustarBot(JButton bot, int sizeToAdd){
        bot.setSize(210+ sizeToAdd, 120 + sizeToAdd);
    }
    
    public void mudarPosicaoSeta(int x, int y){
        botaoProxima.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoProxima;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel labelImagem;
    // End of variables declaration//GEN-END:variables
}
