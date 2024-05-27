
package telaInicial;

import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairContaBotao = new javax.swing.JButton();
        musicaText = new javax.swing.JLabel();
        efeitoSonotoTxt = new javax.swing.JLabel();
        offEfeitoBotao = new javax.swing.JButton();
        onEfeitoBotao = new javax.swing.JButton();
        sobreNos = new javax.swing.JLabel();
        offMusicaBotao = new javax.swing.JButton();
        onMusicaBotao = new javax.swing.JButton();
        creditoTxt = new javax.swing.JLabel();
        creditoBotao = new javax.swing.JButton();
        sobreNosBotao = new javax.swing.JButton();
        voltarBotao = new javax.swing.JButton();
        logoutTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sairContaBotao.setBackground(new java.awt.Color(64, 64, 64));
        sairContaBotao.setForeground(new java.awt.Color(255, 255, 255));
        sairContaBotao.setText("Deseja sair da sua conta?");
        sairContaBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        sairContaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairContaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairContaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairContaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 160, 30));

        musicaText.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        musicaText.setForeground(new java.awt.Color(255, 255, 255));
        musicaText.setText("Música");
        getContentPane().add(musicaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        efeitoSonotoTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        efeitoSonotoTxt.setForeground(new java.awt.Color(255, 255, 255));
        efeitoSonotoTxt.setText("Efeito sonoro");
        getContentPane().add(efeitoSonotoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        offEfeitoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off1_1.png"))); // NOI18N
        offEfeitoBotao.setBorder(null);
        offEfeitoBotao.setContentAreaFilled(false);
        offEfeitoBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(offEfeitoBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, 50));

        onEfeitoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/on1.png"))); // NOI18N
        onEfeitoBotao.setBorder(null);
        onEfeitoBotao.setContentAreaFilled(false);
        onEfeitoBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(onEfeitoBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        sobreNos.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        sobreNos.setForeground(new java.awt.Color(220, 220, 220));
        sobreNos.setText(" Sobre nós");
        sobreNos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreNosMouseClicked(evt);
            }
        });
        getContentPane().add(sobreNos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 110, 40));

        offMusicaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off1_1.png"))); // NOI18N
        offMusicaBotao.setBorder(null);
        offMusicaBotao.setContentAreaFilled(false);
        offMusicaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offMusicaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offMusicaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(offMusicaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        onMusicaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/on1.png"))); // NOI18N
        onMusicaBotao.setBorder(null);
        onMusicaBotao.setContentAreaFilled(false);
        onMusicaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(onMusicaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        creditoTxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        creditoTxt.setForeground(new java.awt.Color(220, 220, 220));
        creditoTxt.setText("Créditos");
        getContentPane().add(creditoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 120, 50));

        creditoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao1.png"))); // NOI18N
        creditoBotao.setBorder(null);
        creditoBotao.setContentAreaFilled(false);
        creditoBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(creditoBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        sobreNosBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao1.png"))); // NOI18N
        sobreNosBotao.setBorder(null);
        sobreNosBotao.setContentAreaFilled(false);
        sobreNosBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sobreNosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sobreNosBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 210, 80));

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

        logoutTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaMenu.jpg"))); // NOI18N
        getContentPane().add(logoutTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        TocarSomOut tocar = new TocarSomOut();
        tocar.sound_click();
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible (true);
        dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void sobreNosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNosBotaoActionPerformed
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
        TelaInformacao tp = new TelaInformacao();
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_sobreNosBotaoActionPerformed

    private void offMusicaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offMusicaBotaoActionPerformed
        MusicaParar parar = new MusicaParar();
        parar.stop(TelaMusica.clip);
    }//GEN-LAST:event_offMusicaBotaoActionPerformed

    private void sairContaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairContaBotaoActionPerformed
        int i = JOptionPane.showConfirmDialog(
        null, 
        "Tem certeza?\nO Brolli sentirá sua falta... ☹ ",
        "Adeus Fofete!",
        JOptionPane.OK_CANCEL_OPTION
        );
        if(i == JOptionPane.OK_OPTION) {
        System.out.println("Clicou em ok");
        TelaLogin tl = TelaLogin();
        tl.setVisible(true);
        this.dispose();
        }
        else if (i == JOptionPane.CANCEL_OPTION) {
        System.out.println("Clicou em cancelar");
        }
        
    }//GEN-LAST:event_sairContaBotaoActionPerformed

    private void sobreNosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreNosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sobreNosMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditoBotao;
    private javax.swing.JLabel creditoTxt;
    private javax.swing.JLabel efeitoSonotoTxt;
    private javax.swing.JLabel logoutTxt;
    private javax.swing.JLabel musicaText;
    private javax.swing.JButton offEfeitoBotao;
    private javax.swing.JButton offMusicaBotao;
    private javax.swing.JButton onEfeitoBotao;
    private javax.swing.JButton onMusicaBotao;
    private javax.swing.JButton sairContaBotao;
    private javax.swing.JLabel sobreNos;
    private javax.swing.JButton sobreNosBotao;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables

    private TelaLogin TelaLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
