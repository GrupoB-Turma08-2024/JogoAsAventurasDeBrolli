
package telaInicial;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        emailText.setText("Digite o email");
        senhaText.setText("Digite a senha");
        serieText.setText("Digite a série");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarBotao = new javax.swing.JButton();
        senhaText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        loginTitulo = new javax.swing.JLabel();
        serieText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarBotao.setBackground(new java.awt.Color(0, 0, 0));
        cadastrarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        cadastrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarBotaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarBotaoMouseExited(evt);
            }
        });
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 90, 30));

        senhaText.setBackground(new java.awt.Color(0,0,0,1));
        senhaText.setForeground(new java.awt.Color(255, 255, 255));
        senhaText.setText("Digite a senha");
        senhaText.setToolTipText("Digite a senha");
        senhaText.setBorder(null);
        senhaText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        senhaText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaTextFocusLost(evt);
            }
        });
        senhaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextActionPerformed(evt);
            }
        });
        getContentPane().add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 90, 30));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 52)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("CADASTRO");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        serieText.setBackground(new java.awt.Color(0,0,0,1));
        serieText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        serieText.setForeground(new java.awt.Color(255, 255, 255));
        serieText.setText("Digite a série");
        serieText.setToolTipText("Digite a série");
        serieText.setBorder(null);
        serieText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serieText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serieTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serieTextFocusLost(evt);
            }
        });
        serieText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieTextActionPerformed(evt);
            }
        });
        getContentPane().add(serieText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 120, 40));

        emailText.setBackground(new java.awt.Color(0,0,0,1));
        emailText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.setText("Digite o e-mail");
        emailText.setToolTipText("Digite o e-mail\n");
        emailText.setBorder(null);
        emailText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFocusLost(evt);
            }
        });
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 130, 40));

        usuarioText.setBackground(new java.awt.Color(0,0,0,1));
        usuarioText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setText("Digite o usuário");
        usuarioText.setToolTipText("Digite o usuário");
        usuarioText.setBorder(null);
        usuarioText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarioText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioTextFocusLost(evt);
            }
        });
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 120, 30));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaCadastro5.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusGained
        if(emailText.getText().equals("Digite o email"))    
            emailText.setText("");
    }//GEN-LAST:event_emailTextFocusGained
    private void emailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusLost
        if(emailText.getText().equals("")){
            emailText.setText("Digite o email");
        }
    }//GEN-LAST:event_emailTextFocusLost

    private void senhaTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaTextFocusGained
    String aux = new String(senhaText.getPassword());
        if(aux.equals("Senha"))    
            senhaText.setText("");
    }//GEN-LAST:event_senhaTextFocusGained

    private void senhaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaTextFocusLost
        String aux = new String(senhaText.getPassword());
         if(aux.equals("")){
            senhaText.setText("Senha");
        }
    }//GEN-LAST:event_senhaTextFocusLost

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void senhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextActionPerformed

    private void cadastrarBotaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBotaoMouseExited
                              
    }//GEN-LAST:event_cadastrarBotaoMouseExited

    private void cadastrarBotaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBotaoMouseEntered

    }//GEN-LAST:event_cadastrarBotaoMouseEntered

    private void usuarioTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusGained
        if(usuarioText.getText().equals("Digite o e-mail"))    
            usuarioText.setText("");
    }//GEN-LAST:event_usuarioTextFocusGained

    private void usuarioTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusLost
        if(usuarioText.getText().equals("")){
            usuarioText.setText("Digite o e-mail");
        }
    }//GEN-LAST:event_usuarioTextFocusLost

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
       
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void serieTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieTextFocusGained
        if(usuarioText.getText().equals("Digite a série"))    
            usuarioText.setText("");
    }//GEN-LAST:event_serieTextFocusGained

    private void serieTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieTextFocusLost
        if(serieText.getText().equals("")){
           serieText.setText("Digite a série");
        }
    }//GEN-LAST:event_serieTextFocusLost

    private void serieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieTextActionPerformed

    }//GEN-LAST:event_serieTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TocarSomOut tocar = new TocarSomOut();
        tocar.sound_click();
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        if (serieText.getText().equals("1") || serieText.getText().equals("2") || serieText.getText().equals("3")){ 
        }else
            JOptionPane.showMessageDialog(null, "Digite 1, 2 ou 3 (apenas números).");
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JPasswordField senhaText;
    private javax.swing.JTextField serieText;
    private javax.swing.JLabel telaLogin;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
