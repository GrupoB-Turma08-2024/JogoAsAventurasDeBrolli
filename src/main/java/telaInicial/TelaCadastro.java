
package telaInicial;

import Connection.DAO;
import Usuario.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    public TelaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        emailText.setOpaque(false);
        senhaText.setOpaque(false);
        usuarioText.setOpaque(false);
        serieText.setOpaque(false);
        emailText.setText("Digite o email");
        senhaText.setText("Senha");
        usuarioText.setText("Digite o usuário");
        serieText.setText("Digite sua série");
    }
    public static boolean isValidEmail(String email) {  
        if (email == null) return false;
        if (email.endsWith("@jpiaget.pro.br")) return true;
        
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
          
    }
    public static boolean isDomainValid(String email) {
        if (email == null) return false;

        if (email.endsWith("@jpiaget.pro.br")) return true;
        try {
            String domain = email.substring(email.indexOf("@") + 1);
            InetAddress.getByName(domain);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarBotao = new javax.swing.JButton();
        senhaText = new javax.swing.JPasswordField();
        botaoVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        loginTitulo = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        serieText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        copyrightLabel = new javax.swing.JLabel();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarBotao.setBackground(new java.awt.Color(51, 51, 51));
        cadastrarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cadastrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        cadastrarBotao.setContentAreaFilled(false);
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
        getContentPane().add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 200, 30));

        senhaText.setBackground(new java.awt.Color(0,0,0,1));
        senhaText.setForeground(new java.awt.Color(255, 255, 255));
        senhaText.setText("Digite a senha");
        senhaText.setToolTipText("Digite a senha");
        senhaText.setBorder(null);
        senhaText.setCaretColor(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 180, 30));

        botaoVoltar.setBackground(new java.awt.Color(0, 0, 0));
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.setBorder(null);
        botaoVoltar.setContentAreaFilled(false);
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 90, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 50, 10));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 52)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("CADASTRO");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        emailText.setBackground(new java.awt.Color(0,0,0,1));
        emailText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        emailText.setText("Digite o e-mail");
        emailText.setToolTipText("Digite o e-mail\n");
        emailText.setBorder(null);
        emailText.setCaretColor(new java.awt.Color(255, 255, 255));
        emailText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 180, 30));

        serieText.setBackground(new java.awt.Color(0,0,0,1));
        serieText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        serieText.setForeground(new java.awt.Color(255, 255, 255));
        serieText.setText("Digite sua série");
        serieText.setToolTipText("Digite sua série");
        serieText.setBorder(null);
        serieText.setCaretColor(new java.awt.Color(255, 255, 255));
        serieText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        getContentPane().add(serieText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 180, 30));

        usuarioText.setBackground(new java.awt.Color(0,0,0,1));
        usuarioText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(255, 255, 255));
        usuarioText.setText("Digite o usuário");
        usuarioText.setToolTipText("Digite o usuário");
        usuarioText.setBorder(null);
        usuarioText.setCaretColor(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 180, 30));

        copyrightLabel.setBackground(new java.awt.Color(0, 0, 0));
        copyrightLabel.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        copyrightLabel.setText("copyright © As Aventuras De Brolli All rights reserved ");
        getContentPane().add(copyrightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 20));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/TelaCadastro5.jpg"))); // NOI18N
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
         
    }//GEN-LAST:event_emailTextActionPerformed

    private void senhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextActionPerformed

    private void cadastrarBotaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBotaoMouseExited
                              
    }//GEN-LAST:event_cadastrarBotaoMouseExited

    private void cadastrarBotaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBotaoMouseEntered

    }//GEN-LAST:event_cadastrarBotaoMouseEntered

    private void usuarioTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusGained
        if(usuarioText.getText().equals("Digite o usuário"))    
            usuarioText.setText("");
    }//GEN-LAST:event_usuarioTextFocusGained

    private void usuarioTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusLost
       if(usuarioText.getText().equals("")){
            usuarioText.setText("Digite o usuário");
        }
    }//GEN-LAST:event_usuarioTextFocusLost

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
       
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        EfeitoSonoro.Play("back.wav");
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        cadastrarBotao.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        if (usuarioText.getText().length() < 6 || senhaText.getText().length() < 6) {
            JOptionPane.showMessageDialog(null, "Nome de usuário e/ou senha precisa conter no mínimo 6 caracteres!");
            return;
        }

        var dao = new DAO(); 
        Usuario a;
        String email = emailText.getText();
        String s = serieText.getText();
        int serie;

        try {
            serie = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Série deve ser um número válido.");
            return;
        }

        boolean isValidEmail = isValidEmail(email);
        boolean isDomainValid = isDomainValid(email);
        boolean w = email.endsWith("@jpiaget.pro.br");

        if (isValidEmail && isDomainValid) {
            try {
                a = new Usuario(usuarioText.getText(), email, senhaText.getText(), serie);
                if (w) {
                dao.cadastrarAdmin(a);
                JOptionPane.showMessageDialog(null, "Admin cadastrado com sucesso!");
                System.out.println("Admin cadastrado com sucesso!");
            } else {
                dao.cadastrarUsuario(a);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                System.out.println("Usuário cadastrado com sucesso!");
            }
         } catch (Exception ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("Email inválido");
        JOptionPane.showMessageDialog(null, "Favor digitar um e-mail válido.");
    }
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void serieTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieTextFocusGained
        if(serieText.getText().equals("Digite sua série")){
            serieText.setText("");
        }
    }//GEN-LAST:event_serieTextFocusGained

    private void serieTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serieTextFocusLost
        if(serieText.getText().equals("")){
            serieText.setText("Digite sua série");
        }
    }//GEN-LAST:event_serieTextFocusLost

    private void serieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieTextActionPerformed
        
    }//GEN-LAST:event_serieTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JPasswordField senhaText;
    private javax.swing.JTextField serieText;
    private javax.swing.JLabel telaLogin;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
