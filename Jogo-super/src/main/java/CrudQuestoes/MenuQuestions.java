/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudQuestoes;

import telaInicial.TocarSomIn;

/**
 *
 * @author felip
 */
public class MenuQuestions extends javax.swing.JFrame {

    /**
     * Creates new form MenuQuestions
     */
    public MenuQuestions() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotCriar = new javax.swing.JButton();
        BotConsultar = new javax.swing.JButton();
        BotAlterar = new javax.swing.JButton();
        BotRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-vindo à tela de edição de questões.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 52)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("EDITAR QUESTÕES");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Aqui, você pode atualizar, remover ou criar novas perguntas para o sistema. ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        BotCriar.setBackground(new java.awt.Color(6, 16, 6));
        BotCriar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotCriar.setForeground(new java.awt.Color(255, 255, 255));
        BotCriar.setText("Criar ");
        BotCriar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCriarActionPerformed(evt);
            }
        });
        getContentPane().add(BotCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 170, 40));

        BotConsultar.setBackground(new java.awt.Color(6, 16, 6));
        BotConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotConsultar.setForeground(new java.awt.Color(255, 255, 255));
        BotConsultar.setText("Consultar");
        BotConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BotConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 170, 40));

        BotAlterar.setBackground(new java.awt.Color(6, 16, 6));
        BotAlterar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotAlterar.setForeground(new java.awt.Color(255, 255, 255));
        BotAlterar.setText("Alterar");
        BotAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(BotAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 170, 40));

        BotRemover.setBackground(new java.awt.Color(6, 16, 6));
        BotRemover.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotRemover.setForeground(new java.awt.Color(255, 255, 255));
        BotRemover.setText("Remover");
        BotRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(BotRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 170, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("< Voltar");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adm2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCriarActionPerformed
        // TODO add your handling code here:
        TelaInserir inserir = new TelaInserir();
        inserir.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_BotCriarActionPerformed

    private void BotConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotConsultarActionPerformed
        // TODO add your handling code here:
        TelaConsultar consultar = new TelaConsultar();
        consultar.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_BotConsultarActionPerformed

    private void BotAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAlterarActionPerformed
        // TODO add your handling code here:
        TelaAlterar alterar = new TelaAlterar();
        alterar.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_BotAlterarActionPerformed

    private void BotRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRemoverActionPerformed
        // TODO add your handling code here:
        TelaRemover remover = new TelaRemover();
        remover.setVisible(true);
        TocarSomIn tocar = new TocarSomIn();
        tocar.sound_click();
    }//GEN-LAST:event_BotRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaInicialAdm tia = new TelaInicialAdm();
        tia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAlterar;
    private javax.swing.JButton BotConsultar;
    private javax.swing.JButton BotCriar;
    private javax.swing.JButton BotRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel loginTitulo;
    // End of variables declaration//GEN-END:variables
}
