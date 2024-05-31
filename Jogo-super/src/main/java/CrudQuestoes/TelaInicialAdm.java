
package CrudQuestoes;

import CrudQuestoes.MenuQuestions;
import Usuario.CrudUsuarios;
import javax.swing.JOptionPane;
import telaInicial.TelaLogin;
import telaInicial.TelaLogin;
import telaInicial.TelaPrincipal;
import telaInicial.TelaPrincipal;
import telaInicial.TocarSomIn;
import telaInicial.TocarSomIn;

public class TelaInicialAdm extends javax.swing.JFrame {

    public TelaInicialAdm() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        saircontaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 562));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 130, 10));

        jButton1.setBackground(new java.awt.Color(51, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar Questões");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 200, 40));

        jButton2.setBackground(new java.awt.Color(51, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Moderar Usuarios");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 200, 40));

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Jogar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 200, 40));

        saircontaBotao.setForeground(new java.awt.Color(255, 255, 255));
        saircontaBotao.setText("Deseja sair da sua conta?");
        saircontaBotao.setBorder(null);
        saircontaBotao.setContentAreaFilled(false);
        saircontaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saircontaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saircontaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(saircontaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 500, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adm1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -5, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuQuestions inserir = new MenuQuestions();
        inserir.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CrudUsuarios inserir = new CrudUsuarios();
        inserir.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
        TelaPrincipal inserir = new TelaPrincipal();
        inserir.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void saircontaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saircontaBotaoActionPerformed
                int i = JOptionPane.showConfirmDialog(
        null, 
        "Tem certeza?\nO Brolli sentirá sua falta... ☹ ",
        "Adeus Amigo!",
        JOptionPane.OK_CANCEL_OPTION
        );
        if(i == JOptionPane.OK_OPTION) {
        System.out.println("Clicou em ok");
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
        }
        else if (i == JOptionPane.CANCEL_OPTION) {
        System.out.println("Clicou em cancelar");
        }
    }//GEN-LAST:event_saircontaBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saircontaBotao;
    // End of variables declaration//GEN-END:variables
}
