/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudQuestoes;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
/**
 *
 * @author felip
 */
public class TelaRemover extends javax.swing.JFrame {

    /**
     * Creates new form TelaInserir
     */
    public TelaRemover() {
        initComponents();
        getId();
        setLocationRelativeTo(null);
        txtDificuldade.setOpaque(false);
        txtFase.setOpaque(false);
        txtA.setOpaque(false);
        txtB.setOpaque(false);
        txtC.setOpaque(false);
        txtD.setOpaque(false);
        txtCorreta.setOpaque(false);
        txtExplicacao.setOpaque(false);
        txtPergunta.setOpaque(false);
       
    }
    
    private void getId() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Obter conexão com o banco de dados
            connection = ConnectionFactory.obterConexao();

            // Criar um PreparedStatement para executar a consulta SQL
            String query = "SELECT idQuestoes FROM questoes";
            preparedStatement = connection.prepareStatement(query);

            // Executar a consulta SQL
            resultSet = preparedStatement.executeQuery();

            // Percorrer os resultados e adicionar ao JComboBox
            while (resultSet.next()) {
                int idQuestoes = resultSet.getInt("idQuestoes");
                jComboBox1.addItem(idQuestoes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void getDados(int idQuestoes) {
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        
        try {
            // Obter conexão com o banco de dados
            connection = ConnectionFactory.obterConexao();

            // Criar um statement para executar consultas SQL

            // Executar uma consulta SQL
            String query = "SELECT idQuestoes, fase,dificuldade, pergunta, resposta1, resposta2, resposta3, resposta4, respostaCorreta, explicacao from questoes WHERE idQuestoes = ?;";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idQuestoes);
            resultSet = preparedStatement.executeQuery();

            // Percorrer os resultados e adicionar ao JComboBox
            while (resultSet.next()) {
                String fase = resultSet.getString(2);
                String dificuldade = resultSet.getString(3);
                String pergunta = resultSet.getString(4);
                String resposta1 = resultSet.getString(5);
                String resposta2 = resultSet.getString(6);
                String resposta3 = resultSet.getString(7);
                String resposta4 = resultSet.getString(8);
                String respostaCorreta = resultSet.getString(9);
                String explicacao = resultSet.getString(10);
                txtFase.setText(fase);
                txtDificuldade.setText(dificuldade);
                txtPergunta.setText(pergunta);
                txtA.setText(resposta1);
                txtB.setText(resposta2);
                txtC.setText(resposta3);
                txtD.setText(resposta4);
                txtCorreta.setText(respostaCorreta);
                txtExplicacao.setText(explicacao);
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void limparcampos(){
    txtPergunta.setText("");
    txtA.setText("");
    txtB.setText("");
    txtC.setText("");
    txtD.setText("");
    txtCorreta.setText("");
    txtExplicacao.setText("");
    jComboBox1.setSelectedIndex(0); // Selecione o primeiro item da combobox
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        tituloFase = new javax.swing.JLabel();
        tituloDificuldade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPergunta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtCorreta = new javax.swing.JTextField();
        loginTitulo = new javax.swing.JLabel();
        voltarBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tituloFase1 = new javax.swing.JLabel();
        removerBotao = new javax.swing.JButton();
        procurarBotao = new javax.swing.JButton();
        BotLimpar = new javax.swing.JButton();
        txtExplicacao = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtFase = new javax.swing.JTextField();
        txtDificuldade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloFase.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        tituloFase.setForeground(new java.awt.Color(255, 255, 255));
        tituloFase.setText("Fase:");
        getContentPane().add(tituloFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 37, -1));

        tituloDificuldade.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        tituloDificuldade.setForeground(new java.awt.Color(255, 255, 255));
        tituloDificuldade.setText("Dificuldade:");
        getContentPane().add(tituloDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pergunta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Opção A:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Opção B:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 74, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opção C:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 74, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opção D:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 74, -1));

        txtPergunta.setBackground(new java.awt.Color(0,0,0,1));
        txtPergunta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPergunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPergunta.setToolTipText("Digite a pergunta");
        txtPergunta.setBorder(null);
        txtPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPergunta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPerguntaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPerguntaFocusLost(evt);
            }
        });
        txtPergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPerguntaMouseClicked(evt);
            }
        });
        txtPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 800, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 780, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 100, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 780, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 730, 20));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 780, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 780, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 780, 10));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 780, 10));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, 10));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{}));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 110, -1));

        txtCorreta.setBackground(new java.awt.Color(0,0,0,1));
        txtCorreta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCorreta.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreta.setBorder(null);
        txtCorreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorretaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 780, 20));

        loginTitulo.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        loginTitulo.setForeground(new java.awt.Color(255, 255, 255));
        loginTitulo.setText("REMOVER QUESTÃO");
        getContentPane().add(loginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

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
        getContentPane().add(voltarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Resposta ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Explicação:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 80, -1));

        tituloFase1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        tituloFase1.setForeground(new java.awt.Color(255, 255, 255));
        tituloFase1.setText("ID:");
        getContentPane().add(tituloFase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 37, -1));

        removerBotao.setBackground(new java.awt.Color(6, 16, 6));
        removerBotao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removerBotao.setForeground(new java.awt.Color(255, 255, 255));
        removerBotao.setText("Remover");
        removerBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        removerBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(removerBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 90, 30));

        procurarBotao.setBackground(new java.awt.Color(6, 16, 6));
        procurarBotao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        procurarBotao.setForeground(new java.awt.Color(255, 255, 255));
        procurarBotao.setText("Procurar");
        procurarBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        procurarBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procurarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(procurarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 90, 30));

        BotLimpar.setBackground(new java.awt.Color(6, 16, 6));
        BotLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotLimpar.setText("Limpar");
        BotLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotLimparActionPerformed(evt);
            }
        });
        getContentPane().add(BotLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 90, 30));

        txtExplicacao.setBackground(new java.awt.Color(0,0,0,1));
        txtExplicacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtExplicacao.setForeground(new java.awt.Color(255, 255, 255));
        txtExplicacao.setBorder(null);
        txtExplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtExplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 730, -1));

        txtD.setBackground(new java.awt.Color(0,0,0,1));
        txtD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtD.setForeground(new java.awt.Color(255, 255, 255));
        txtD.setBorder(null);
        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });
        getContentPane().add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 780, 20));

        txtB.setBackground(new java.awt.Color(0,0,0,1));
        txtB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtB.setForeground(new java.awt.Color(255, 255, 255));
        txtB.setToolTipText("Digite a alternativa B");
        txtB.setBorder(null);
        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 780, 20));

        txtC.setBackground(new java.awt.Color(0,0,0,1));
        txtC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtC.setForeground(new java.awt.Color(255, 255, 255));
        txtC.setBorder(null);
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        getContentPane().add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 780, 20));

        txtA.setBackground(new java.awt.Color(0,0,0,1));
        txtA.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtA.setForeground(new java.awt.Color(255, 255, 255));
        txtA.setToolTipText("Digite a alternativa A");
        txtA.setBorder(null);
        txtA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAFocusLost(evt);
            }
        });
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 800, -1));

        txtFase.setBackground(new java.awt.Color(0,0,0,1));
        txtFase.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtFase.setForeground(new java.awt.Color(255, 255, 255));
        txtFase.setToolTipText("Digite a pergunta");
        txtFase.setBorder(null);
        txtFase.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFaseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFaseFocusLost(evt);
            }
        });
        txtFase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFaseMouseClicked(evt);
            }
        });
        txtFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaseActionPerformed(evt);
            }
        });
        getContentPane().add(txtFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, 30));

        txtDificuldade.setBackground(new java.awt.Color(0,0,0,1));
        txtDificuldade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDificuldade.setForeground(new java.awt.Color(255, 255, 255));
        txtDificuldade.setToolTipText("Digite a pergunta");
        txtDificuldade.setBorder(null);
        txtDificuldade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDificuldade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDificuldadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDificuldadeFocusLost(evt);
            }
        });
        txtDificuldade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDificuldadeMouseClicked(evt);
            }
        });
        txtDificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDificuldadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtDificuldade, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 100, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/adm2.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -1, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBotaoActionPerformed
                boolean validacao = true;
        int id = jComboBox1.getSelectedIndex() + 1;
        try {
            Questoes q = new Questoes(id);
            validacao = false;
            
            QuestoesService.delete(q);
            
            JOptionPane.showMessageDialog(this, "A questão foi removida com sucesso!", "Questão Removida", JOptionPane.INFORMATION_MESSAGE);
            this.limparcampos();
        }
        catch (Exception e)
        {
            String title = validacao ? "Validação" : "Erro";
            int pane = validacao ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;

            JOptionPane.showMessageDialog(this, e.getMessage(), title, pane);
        }
    }//GEN-LAST:event_removerBotaoActionPerformed

    private void BotLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotLimparActionPerformed
        EfeitoSonoro.Play("back.wav");
        limparcampos();
    }//GEN-LAST:event_BotLimparActionPerformed

    private void txtPerguntaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPerguntaFocusGained
       
    }//GEN-LAST:event_txtPerguntaFocusGained

    private void txtPerguntaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPerguntaFocusLost
       
    }//GEN-LAST:event_txtPerguntaFocusLost

    private void txtPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerguntaActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtPerguntaActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtAActionPerformed

    private void txtAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusLost
        
    }//GEN-LAST:event_txtAFocusLost

    private void txtAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAFocusGained
        
    }//GEN-LAST:event_txtAFocusGained

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
        EfeitoSonoro.Play("back.wav");
        MenuQuestions mq = new MenuQuestions();
        mq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void txtPerguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPerguntaMouseClicked
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtPerguntaMouseClicked

    private void procurarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarBotaoActionPerformed
    Integer selectedId = (Integer) jComboBox1.getSelectedItem();
        if (selectedId != null) {
            getDados(selectedId);
        }
    }//GEN-LAST:event_procurarBotaoActionPerformed

    private void txtFaseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFaseFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaseFocusGained

    private void txtFaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFaseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaseFocusLost

    private void txtFaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFaseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaseMouseClicked

    private void txtFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaseActionPerformed

    private void txtDificuldadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDificuldadeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDificuldadeFocusGained

    private void txtDificuldadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDificuldadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDificuldadeFocusLost

    private void txtDificuldadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDificuldadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDificuldadeMouseClicked

    private void txtDificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDificuldadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDificuldadeActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtCActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtDActionPerformed

    private void txtCorretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorretaActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtCorretaActionPerformed

    private void txtExplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExplicacaoActionPerformed
        EfeitoSonoro.Play("text.wav");
    }//GEN-LAST:event_txtExplicacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRemover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotLimpar;
    private javax.swing.JComboBox<Integer> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel loginTitulo;
    private javax.swing.JButton procurarBotao;
    private javax.swing.JButton removerBotao;
    private javax.swing.JLabel tituloDificuldade;
    private javax.swing.JLabel tituloFase;
    private javax.swing.JLabel tituloFase1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtCorreta;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtDificuldade;
    private javax.swing.JTextField txtExplicacao;
    private javax.swing.JTextField txtFase;
    private javax.swing.JTextField txtPergunta;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
