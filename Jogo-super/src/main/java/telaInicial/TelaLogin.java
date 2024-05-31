
package telaInicial;

import Connection.DAO;
import CrudQuestoes.TelaInicialAdm;
import Usuario.Usuario;
import java.awt.Color;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        usuarioText.setText("Digite o usuário");
        senhaText.setText("Senha");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semCadastroBotao = new javax.swing.JButton();
        entrarBotao = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        esqueciSenhaBotao = new javax.swing.JButton();
        cadatrarBotao = new javax.swing.JButton();
        senhaText = new javax.swing.JPasswordField();
        loginTitulo = new javax.swing.JLabel();
        usuarioText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        semCadastroBotao.setForeground(new java.awt.Color(255, 255, 255));
        semCadastroBotao.setText("Jogar sem cadastro  >");
        semCadastroBotao.setContentAreaFilled(false);
        semCadastroBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        semCadastroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semCadastroBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(semCadastroBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, -1, -1));

        entrarBotao.setBackground(new java.awt.Color(40, 40, 40));
        entrarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("Entrar");
        entrarBotao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        entrarBotao.setContentAreaFilled(false);
        entrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(entrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 200, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 190, 10));

        esqueciSenhaBotao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        esqueciSenhaBotao.setForeground(new java.awt.Color(255, 255, 255));
        esqueciSenhaBotao.setText("Esqueceu a senha?");
        esqueciSenhaBotao.setContentAreaFilled(false);
        esqueciSenhaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esqueciSenhaBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueciSenhaBotaoMouseClicked(evt);
            }
        });
        esqueciSenhaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueciSenhaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(esqueciSenhaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 130, 20));

        cadatrarBotao.setBackground(new java.awt.Color(0, 0, 0));
        cadatrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cadatrarBotao.setText("Não tem uma conta? Clique aqui");
        cadatrarBotao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        cadatrarBotao.setBorderPainted(false);
        cadatrarBotao.setContentAreaFilled(false);
        cadatrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadatrarBotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadatrarBotaoMouseEntered(evt);
            }
        });
        cadatrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadatrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadatrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 190, 20));

        senhaText.setBackground(new java.awt.Color(0,0,0,1));
        senhaText.setForeground(new java.awt.Color(255, 255, 255));
        senhaText.setText("jPasswordField1");
        senhaText.setToolTipText("Digite a senha");
        senhaText.setBorder(null);
        senhaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        getContentPane().add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 190, 30));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 52)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("LOGIN");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        usuarioText.setBackground(new java.awt.Color(0,0,0,1));
        usuarioText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setText("Digite o usuário");
        usuarioText.setToolTipText("Digite o usuário");
        usuarioText.setBorder(null);
        usuarioText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        getContentPane().add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 201, 190, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("copyright © As Aventuras De Brolli All rights reserved ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 20));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TelaLogin1.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusGained
        if(usuarioText.getText().equals("Digite o usuário"))    
            usuarioText.setText("");
    }//GEN-LAST:event_usuarioTextFocusGained
    private void usuarioTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusLost
        if(usuarioText.getText().equals("")){
            usuarioText.setText("Digite o usuário");
        }
    }//GEN-LAST:event_usuarioTextFocusLost

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

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void senhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextActionPerformed

    private void cadatrarBotaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadatrarBotaoMouseEntered
        
    }//GEN-LAST:event_cadatrarBotaoMouseEntered

    private void cadatrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadatrarBotaoActionPerformed
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
        TelaCadastro telaDeCadastro = new TelaCadastro();
        telaDeCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadatrarBotaoActionPerformed

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed

            String senha = senhaText.getText();
            String apelido = usuarioText.getText(); 
            //1- ConstruiR um objeto usuario
            Usuario u;
            //2- Construir um objeto DAO
            var dao = new DAO();
        try{
            u = new Usuario(apelido, senha);
            if (dao.existe(u)) {
                if (dao.existeAdm(u)) {
                    JOptionPane.showMessageDialog(null,"O jogador é um administrador.");
                    TelaInicialAdm tia = new TelaInicialAdm();
                    tia.setVisible(true);
            // Ação para administrador
                } else {
                    JOptionPane.showMessageDialog(null,"O jogador é um aluno.");
                // Ação para jogador
                    TelaPrincipal inserir = new TelaPrincipal();
                    inserir.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Usuário não encontrado.");
            }

        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Houve um problema.");
        }
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
        
    }//GEN-LAST:event_entrarBotaoActionPerformed

    private void esqueciSenhaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueciSenhaBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esqueciSenhaBotaoActionPerformed

    private void semCadastroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semCadastroBotaoActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_semCadastroBotaoActionPerformed

    private void esqueciSenhaBotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueciSenhaBotaoMouseClicked
        // TODO add your handling code here:
        TelaSenha ts = new TelaSenha();
        ts.setVisible(true);
        dispose();
    }//GEN-LAST:event_esqueciSenhaBotaoMouseClicked
    
    /*public void sound_click(){
        try{
            File sound = new File("C:\\Users\\Lyssa\\OneDrive\\Documentos\\NetBeansProjects\\AsAventurasDeBrolli\\click.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        }catch(Exception e){
            
        }
    }*/
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadatrarBotao;
    private javax.swing.JButton entrarBotao;
    private javax.swing.JButton esqueciSenhaBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JButton semCadastroBotao;
    private javax.swing.JPasswordField senhaText;
    private javax.swing.JLabel telaLogin;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
