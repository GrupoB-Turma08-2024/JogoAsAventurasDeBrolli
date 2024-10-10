
package telaInicial;

public class TelaCreditos extends javax.swing.JFrame {

    public TelaCreditos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarBotao = new javax.swing.JButton();
        telaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarBotao.setBackground(new java.awt.Color(0, 0, 0));
        voltarBotao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarBotao.setForeground(new java.awt.Color(255, 255, 255));
        voltarBotao.setText("< Voltar");
        voltarBotao.setBorder(null);
        voltarBotao.setContentAreaFilled(false);
        voltarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(voltarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        telaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/phonto.jpg"))); // NOI18N
        getContentPane().add(telaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        EfeitoSonoro.Play("back.wav");
        TelaMenu tm = new TelaMenu();
        tm.setVisible (true);
        dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaCreditos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel telaLogin;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
