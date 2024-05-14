
package telaInicial;

public class TelaCover extends javax.swing.JFrame {

    public TelaCover() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuarBotao = new javax.swing.JToggleButton();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continuarBotao.setBackground(new java.awt.Color(0,0,0,1));
        continuarBotao.setBorder(null);
        continuarBotao.setContentAreaFilled(false);
        continuarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(continuarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 350, 60));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaCover.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotaoActionPerformed
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCover().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton continuarBotao;
    private javax.swing.JLabel telaLogin;
    // End of variables declaration//GEN-END:variables
}
