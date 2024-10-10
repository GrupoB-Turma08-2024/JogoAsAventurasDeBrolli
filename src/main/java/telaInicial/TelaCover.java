
package telaInicial;

public class TelaCover extends javax.swing.JFrame {
    
    public TelaCover() {
        initComponents();
        setLocationRelativeTo(null);
        Musica.Play("inicio.wav");
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

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/TelaCover.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotaoActionPerformed
        EfeitoSonoro.Play("click.wav");
        TelaLogin telaDeLogin = new TelaLogin();
        telaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_continuarBotaoActionPerformed

    public static void main(String args[]) {
        TelaCover telaCover = new TelaCover();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton continuarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel telaLogin;
    // End of variables declaration//GEN-END:variables
}
