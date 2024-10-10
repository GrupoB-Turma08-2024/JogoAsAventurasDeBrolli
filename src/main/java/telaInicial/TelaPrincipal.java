
package telaInicial;

import Quiz.QuizManager;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static QuizManager quizManager;
    
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoJogar = new javax.swing.JButton();
        botaoRanking = new javax.swing.JButton();
        botaoMenu = new javax.swing.JButton();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoJogar.setBorder(null);
        botaoJogar.setContentAreaFilled(false);
        botaoJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoJogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoJogarMouseExited(evt);
            }
        });
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 170, 60));

        botaoRanking.setBorder(null);
        botaoRanking.setContentAreaFilled(false);
        botaoRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoRankingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoRankingMouseExited(evt);
            }
        });
        botaoRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRankingActionPerformed(evt);
            }
        });
        getContentPane().add(botaoRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 170, 60));

        botaoMenu.setBorder(null);
        botaoMenu.setContentAreaFilled(false);
        botaoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoMenuMouseExited(evt);
            }
        });
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 190, 60));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/telaPrincipal.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
        try {
            botaoJogar.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            quizManager = new QuizManager();
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoJogarActionPerformed

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        EfeitoSonoro.Play("click.wav");
        TelaMenu tm = new TelaMenu();
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRankingActionPerformed
        EfeitoSonoro.Play("click.wav");
        try {
            botaoRanking.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            TelaRanking ra = new TelaRanking();
            ra.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoRankingActionPerformed

    private void botaoJogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoJogarMouseEntered

    }//GEN-LAST:event_botaoJogarMouseEntered

    private void botaoJogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoJogarMouseExited

    }//GEN-LAST:event_botaoJogarMouseExited

    private void botaoRankingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRankingMouseEntered

    }//GEN-LAST:event_botaoRankingMouseEntered

    private void botaoRankingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRankingMouseExited

    }//GEN-LAST:event_botaoRankingMouseExited

    private void botaoMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMenuMouseEntered

    }//GEN-LAST:event_botaoMenuMouseEntered

    private void botaoMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMenuMouseExited

    }//GEN-LAST:event_botaoMenuMouseExited

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoJogar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoRanking;
    private javax.swing.JLabel telaLogin;
    // End of variables declaration//GEN-END:variables
}
