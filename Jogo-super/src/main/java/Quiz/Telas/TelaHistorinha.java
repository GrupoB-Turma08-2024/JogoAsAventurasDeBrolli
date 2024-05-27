package Quiz.Telas;

import Quiz.QuizManager;
import javax.swing.ImageIcon;
import java.util.ArrayList;

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
            imagens.add(new ImageIcon(s));
        }
        labelImagem.setIcon(imagens.get(0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoProxima = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 597));
        setMinimumSize(new java.awt.Dimension(1000, 597));
        setPreferredSize(new java.awt.Dimension(1000, 597));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoProxima.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        botaoProxima.setText("FAZER UM BOTAO EM FORMA DE SETINHA PFV OBG ===>");
        botaoProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProxima);
        botaoProxima.setBounds(20, 500, 370, 40);

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outros_fundos/final_0.jpg"))); // NOI18N
        labelImagem.setText("imagem");
        getContentPane().add(labelImagem);
        labelImagem.setBounds(0, 10, 1000, 563);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximaActionPerformed
        if(imagemAtiva < imagens.size() - 1){
            imagemAtiva++;
            labelImagem.setIcon(imagens.get(imagemAtiva));
        }else{
            qm.avisarFimHistoria(nomeHistoria);
            dispose();
        }
    }//GEN-LAST:event_botaoProximaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoProxima;
    private javax.swing.JLabel labelImagem;
    // End of variables declaration//GEN-END:variables
}
