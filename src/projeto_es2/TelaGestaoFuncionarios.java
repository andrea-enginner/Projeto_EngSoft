/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_es2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class TelaGestaoFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaGestaoFuncionarios
     */
    public TelaGestaoFuncionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableFuncionarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextSobrenome = new javax.swing.JTextField();
        BoxFuncao = new javax.swing.JComboBox<>();
        TextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextCPF = new javax.swing.JTextField();
        TextFuncao = new javax.swing.JTextField();
        TextSenha = new javax.swing.JTextField();
        ButtonAdicionar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Função"
            }
        ));
        TableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFuncionarios);

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        TextSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSobrenomeActionPerformed(evt);
            }
        });

        BoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Veterinario", "Administrador" }));
        BoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxFuncaoActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF:");

        jLabel4.setText("Função:");

        jLabel5.setText("Senha:");

        TextFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFuncaoActionPerformed(evt);
            }
        });

        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });

        ButtonAdicionar.setText("Adicionar");
        ButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdicionarActionPerformed(evt);
            }
        });

        ButtonEditar.setText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextCPF)
                                        .addGap(122, 122, 122))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TextSobrenome)
                                            .addComponent(TextNome))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(TextSenha))
                                .addGap(18, 18, 18)
                                .addComponent(BoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonExcluir)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonVoltar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAdicionar)
                            .addComponent(ButtonEditar)
                            .addComponent(ButtonExcluir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSobrenomeActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void ButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdicionarActionPerformed
        // TODO add your handling code here:
        
        String nome = TextNome.getText();
        String sobrenome = TextSobrenome.getText();
        String cpf = TextCPF.getText();
        String funcao = TextFuncao.getText();
        String senha = TextSenha.getText();
        
        if(nome.isEmpty()||sobrenome.isEmpty()||cpf.isEmpty()||funcao.isEmpty()||senha.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por Favor, Preencha todos os campos!");
            return;
        }
        
        //ADD informações no Banco de Dados
        
        Funcionario novoFuncionario = new Funcionario(nome,sobrenome,cpf,funcao,senha);
        
        DefaultTableModel tableFuncionarios = (DefaultTableModel) TableFuncionarios.getModel();
        
        Object[] newrow = {nome,sobrenome,cpf,funcao};
        
        tableFuncionarios.addRow(newrow);
        
        TextNome.setText("");
        TextSobrenome.setText("");
        TextFuncao.setText("");
        TextCPF.setText("");
        TextSenha.setText("");
        
        JOptionPane.showMessageDialog(this, "Funcionario adicionado com sucesso!");
    }//GEN-LAST:event_ButtonAdicionarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        // TODO add your handling code here:
        
        int linhaSelecionada = TableFuncionarios.getSelectedRow();
        
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Por Favor, Selecione uma Linha da Tabela!");
        }
        
        DefaultTableModel tableFuncionarios = (DefaultTableModel) TableFuncionarios.getModel();
        
        //CPF para busca no Banco de Dados
        String cpf = (String)TableFuncionarios.getValueAt(linhaSelecionada, 2);
        
        
        //Remover as informações do funcionário selecionado da tabela
        
        tableFuncionarios.removeRow(linhaSelecionada);
        
        TextNome.setText("");
        TextSobrenome.setText("");
        TextFuncao.setText("");
        TextCPF.setText("");
        TextSenha.setText("");
        
        JOptionPane.showMessageDialog(this, "Funcionario excluido com sucesso!");
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void TextFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFuncaoActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        // TODO add your handling code here:
        
        TelaInicial TI = new TelaInicial();
        
        TI.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void BoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxFuncaoActionPerformed
        // TODO add your handling code here:
        
        String funcao = BoxFuncao.getSelectedItem().toString();
        
        TextFuncao.setText(funcao);
    }//GEN-LAST:event_BoxFuncaoActionPerformed

    private void TableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFuncionariosMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount() == 1){
            int linha = TableFuncionarios.getSelectedRow();
            
            String nome = (String)TableFuncionarios.getValueAt(linha, 0);
            String sobrenome = (String)TableFuncionarios.getValueAt(linha, 1);
            String cpf = (String)TableFuncionarios.getValueAt(linha, 2);
            String funcao = (String)TableFuncionarios.getValueAt(linha, 3);
            
            //String senha = ; Buscar no Banco de dados
            
            TextNome.setText(nome);
            TextSobrenome.setText(sobrenome);
            TextCPF.setText(cpf);
            TextFuncao.setText(funcao);
            //TextSenha.setText(senha);
        }
    }//GEN-LAST:event_TableFuncionariosMouseClicked

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = TableFuncionarios.getSelectedRow();
        
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Por Favor, Selecione uma Linha da Tabela!");
        }else{
            
            //CPF para busca no Banco de Dados, para editar;
            String cpf = (String)TableFuncionarios.getValueAt(linhaSelecionada, 2);
            
            
            
            setTableFuncionarios(TextNome.getText(),TextSobrenome.getText(),TextCPF.getText(),
                    TextFuncao.getText(),linhaSelecionada);
            
            TextNome.setText("");
            TextSobrenome.setText("");
            TextFuncao.setText("");
            TextCPF.setText("");
            TextSenha.setText("");
            
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

    public void setTableFuncionarios(String nome, String sobrenome, String cpf, String funcao, int linha){
        
        TableFuncionarios.setValueAt(nome, linha, 0);
        TableFuncionarios.setValueAt(sobrenome, linha, 1);
        TableFuncionarios.setValueAt(cpf, linha, 2);
        TableFuncionarios.setValueAt(funcao, linha, 3);
    }
    
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
            java.util.logging.Logger.getLogger(TelaGestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGestaoFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGestaoFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxFuncao;
    private javax.swing.JButton ButtonAdicionar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JTable TableFuncionarios;
    private javax.swing.JTextField TextCPF;
    private javax.swing.JTextField TextFuncao;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextSenha;
    private javax.swing.JTextField TextSobrenome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
