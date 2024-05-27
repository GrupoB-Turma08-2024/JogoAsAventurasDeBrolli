
package telaInicial;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TelaCover extends javax.swing.JFrame {
    public static void PlayMusic(String location) throws UnsupportedAudioFileException, IOException{
        
        File musicPath = new File(location);
            
        if(musicPath.exists()){
            try {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(TelaCover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.println("Arquivo de audio nao achado");
        }
    }
    public TelaCover() throws UnsupportedAudioFileException, IOException {
        initComponents();
        setLocationRelativeTo(null);
        String filepath = "inicio.wav";
        PlayMusic(filepath);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuarBotao = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("copyright © As Aventuras De Brolli All rights reserved ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 20));

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
            try {
                new TelaCover().setVisible(true);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(TelaCover.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaCover.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton continuarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel telaLogin;
    // End of variables declaration//GEN-END:variables
}
