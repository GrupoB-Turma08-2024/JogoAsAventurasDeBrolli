/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Usuario;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class CrudUsuarios extends javax.swing.JFrame {
    private int indexSelecionado = -1;
    private UsuarioTableModel tabelaUsuario = new UsuarioTableModel();

    /**
     * Creates new form ManterUsuarios
     */
    public CrudUsuarios() {
        initComponents();
        JTableUsuarios.setModel(tabelaUsuario);
        getUsuarios();
        setLocationRelativeTo(null);
    }

    private void getUsuarios() {
        try {
            while (this.tabelaUsuario.getRowCount() > 0) {
                this.tabelaUsuario.removeRow(0);
            }

            for (Usuario usuario : UsuarioService.get()) {
                this.tabelaUsuario.addRow(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar usuários", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean usuarioExiste(String nomeUsuario) throws Exception {
        String query = "SELECT COUNT(*) FROM Jogador WHERE nomeJogador = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nomeUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableUsuarios = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        ButSalvar = new javax.swing.JButton();
        ButAlterar = new javax.swing.JButton();
        ButRemover = new javax.swing.JButton();
        ButNovo = new javax.swing.JButton();
        ButSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        JTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableUsuarios);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Email:");

        ButSalvar.setText("Salvar");
        ButSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalvarActionPerformed(evt);
            }
        });

        ButAlterar.setText("Atualizar");
        ButAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAlterarActionPerformed(evt);
            }
        });

        ButRemover.setText("Remover");
        ButRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRemoverActionPerformed(evt);
            }
        });

        ButNovo.setText("Criar Usuário");
        ButNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButNovoActionPerformed(evt);
            }
        });

        ButSair.setText("Voltar");
        ButSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSairActionPerformed(evt);
            }
        });

        jLabel4.setText("Manter Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(ButSalvar)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel1)
                                                                                .addGap(4, 4, 4)
                                                                                .addComponent(txtNome))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        37,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtSenha))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        37,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtEmail)))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(ButAlterar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        139, Short.MAX_VALUE)
                                                .addComponent(ButRemover)
                                                .addGap(130, 130, 130)
                                                .addComponent(ButNovo)
                                                .addGap(97, 97, 97))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ButSair)
                                .addGap(275, 275, 275)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(ButSair))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButSalvar)
                                        .addComponent(ButAlterar)
                                        .addComponent(ButRemover)
                                        .addComponent(ButNovo))
                                .addGap(42, 42, 42)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButSalvarActionPerformed
        // TODO add your handling code here:

        String nome = txtNome.getText();
        boolean validacao = true;
        try {
            if (!usuarioExiste(nome)) {
                Usuario u = new Usuario(txtNome.getText(), txtEmail.getText(), txtSenha.getText());
                validacao = false;

                UsuarioService.insert(u);
                this.getUsuarios();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario já existe!");
            }
        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }

    }// GEN-LAST:event_ButSalvarActionPerformed

    private void ButRemoverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButRemoverActionPerformed
        // TODO add your handling code here:

        if (this.indexSelecionado == -1)
            return;

        try {
            Usuario u = this.tabelaUsuario.getUsuario(this.indexSelecionado);
            UsuarioService.delete(u);

            this.tabelaUsuario.removeRow(this.indexSelecionado);
            this.limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao deletar usuário", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_ButRemoverActionPerformed

    private void ButAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButAlterarActionPerformed
        // TODO add your handling code here:
        if (indexSelecionado == -1)
            return;

        boolean validacao = true;
        try {
            Usuario u = this.tabelaUsuario.getUsuario(this.indexSelecionado);
            u.setNome(this.txtNome.getText());
            u.setEmail(this.txtEmail.getText());
            u.setSenha(this.txtSenha.getText());
            validacao = false;

            UsuarioService.update(u);
            this.tabelaUsuario.atualizar(u, this.indexSelecionado);

            this.limparCampos();
        } catch (Exception e) {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }// GEN-LAST:event_ButAlterarActionPerformed

    private void ButNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButNovoActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }// GEN-LAST:event_ButNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeActionPerformed

    private void JTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_JTableUsuariosMouseClicked
        // TODO add your handling code here:
        Usuario u = tabelaUsuario.getUsuario(JTableUsuarios.getSelectedRow());

        txtNome.setText(u.getNome());
        txtEmail.setText(u.getEmail());
        txtSenha.setText(u.getSenha());

        indexSelecionado = JTableUsuarios.getSelectedRow();
    }// GEN-LAST:event_JTableUsuariosMouseClicked

    private void ButSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ButSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }// GEN-LAST:event_ButSairActionPerformed

    /**
     * @param args the command line arguments
     */
    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAlterar;
    private javax.swing.JButton ButNovo;
    private javax.swing.JButton ButRemover;
    private javax.swing.JButton ButSair;
    private javax.swing.JButton ButSalvar;
    private javax.swing.JTable JTableUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
