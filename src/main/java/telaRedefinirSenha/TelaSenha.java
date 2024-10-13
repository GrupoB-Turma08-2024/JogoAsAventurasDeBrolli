package telaRedefinirSenha;

import Connection.ConnectionFactory;
import Connection.DAO;
import static telaRedefinirSenha.Email.generateCode;
import Usuario.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
import telaInicial.TelaLogin;
import telaInicial.TelaPrincipal;
import static telaRedefinirSenha.Email.sendEmail;

public class TelaSenha extends javax.swing.JFrame {

    public TelaSenha() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setSize(1000, 560);
        esqueceuSenhaText.setOpaque(false);
        esqueceuSenhaText.setText("Digite o e-mail");
    }
    public void salvarCodigo(String email, String codigo) throws Exception {
        String sql = "UPDATE Jogador SET codigo = ? WHERE emailAluno = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); // Método para obter a conexão
             PreparedStatement stmt = conn.prepareStatement(sql)) {

           

            stmt.setString(1, codigo);
            stmt.setString(2, email);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrarBotao = new javax.swing.JButton();
        loginTitulo = new javax.swing.JLabel();
        esqueceuSenhaText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        voltarLogin = new javax.swing.JButton();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrarBotao.setBackground(new java.awt.Color(40, 40, 40));
        entrarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("Recuperar acesso");
        entrarBotao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        entrarBotao.setContentAreaFilled(false);
        entrarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(entrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 200, 30));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitulo.setText("REDEFINIR SENHA");
        loginTitulo.setToolTipText("");
        loginTitulo.setAlignmentY(0.0F);
        loginTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        esqueceuSenhaText.setBackground(new java.awt.Color(0,0,0,1));
        esqueceuSenhaText.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        esqueceuSenhaText.setForeground(new java.awt.Color(255, 255, 255));
        esqueceuSenhaText.setText("Digite o e-mail");
        esqueceuSenhaText.setToolTipText("Digite o usuário");
        esqueceuSenhaText.setBorder(null);
        esqueceuSenhaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        esqueceuSenhaText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                esqueceuSenhaTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                esqueceuSenhaTextFocusLost(evt);
            }
        });
        esqueceuSenhaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceuSenhaTextActionPerformed(evt);
            }
        });
        getContentPane().add(esqueceuSenhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 190, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setText("copyright © As Aventuras De Brolli All rights reserved ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        voltarLogin.setBackground(new java.awt.Color(0, 0, 0));
        voltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        voltarLogin.setText("Voltar");
        voltarLogin.setBorder(null);
        voltarLogin.setContentAreaFilled(false);
        voltarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarLoginMouseClicked(evt);
            }
        });
        voltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(voltarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 80, 30));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/telaSenha_1.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed
         // TODO add your handling code here:
        String email = esqueceuSenhaText.getText();
        String code = generateCode();
        try {
            entrarBotao.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            sendEmail(email, code);
            salvarCodigo(email,code);
            System.out.println("Email enviado com sucesso!");
            TelaCodigo tp = new TelaCodigo();
            tp.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(TelaSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_entrarBotaoActionPerformed

    private void esqueceuSenhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceuSenhaTextActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_esqueceuSenhaTextActionPerformed

    private void esqueceuSenhaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esqueceuSenhaTextFocusLost
        if(esqueceuSenhaText.getText().equals("")){
            esqueceuSenhaText.setText("Digite o e-mail");
        }
    }//GEN-LAST:event_esqueceuSenhaTextFocusLost

    private void esqueceuSenhaTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esqueceuSenhaTextFocusGained
        if(esqueceuSenhaText.getText().equals("Digite o e-mail"))
        esqueceuSenhaText.setText("");
    }//GEN-LAST:event_esqueceuSenhaTextFocusGained

    private void voltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLoginActionPerformed
        EfeitoSonoro.Play("back.wav");
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarLoginActionPerformed

    private void voltarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarLoginMouseClicked
        // TODO add your handling code here:
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarLoginMouseClicked
    
    /*public void sound_click(){
        try{
            File sound = new File("C:\\Users\\Lyssa\\OneDrive\\Documentos\\NetBeansProjects\\AsAventurasDeBrolli\\click.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        }catch(Exception e){
            
        }
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarBotao;
    private javax.swing.JTextField esqueceuSenhaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JLabel telaLogin;
    private javax.swing.JButton voltarLogin;
    // End of variables declaration//GEN-END:variables
}
