package telas;

import javax.swing.JOptionPane;
import conexao.Conexao;
import nomes.Categoria;

public class AdicionarCategoria extends javax.swing.JInternalFrame {

    Conexao conexao = new Conexao();
    
    public AdicionarCategoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descCategoria = new javax.swing.JTextArea();
        confirmar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        nomeObrigatorio = new javax.swing.JLabel();
        descObrigatoria = new javax.swing.JLabel();

        setTitle("Adicionar Categoria");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Adicionar Categoria");

        jLabel2.setText("Nome");

        nomeCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeCategoriaKeyReleased(evt);
            }
        });

        jLabel3.setText("Descrição");

        descCategoria.setColumns(20);
        descCategoria.setRows(5);
        descCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descCategoriaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(descCategoria);

        confirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(confirmar)
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeCategoria)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeObrigatorio)
                                    .addComponent(descObrigatoria))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nomeObrigatorio))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmar)
                            .addComponent(voltar)))
                    .addComponent(descObrigatoria))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        if(nomeCategoria.getText().trim().isEmpty()){
            nomeObrigatorio.setText("Campo obrigatório.");
        }
        
        if(descCategoria.getText().trim().isEmpty()){
            descObrigatoria.setText("Digite uma descrição válida.");
        }
        
        if((!(nomeCategoria.getText().trim().isEmpty())&&!(descCategoria.getText().trim().isEmpty()))){
            
            String nome = nomeCategoria.getText();
            String descricao = descCategoria.getText();
            
            Categoria c = new Categoria(nome, descricao);
            Conexao con = new Conexao();
            con.iniciarConexao();
            
            String[] opcoes = {"Sim", "Não"};
            int op1 = JOptionPane.showOptionDialog(this, "Tem certeza de que deseja adicionar a categoria " + nome + "?", "Adicionar categoria", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
        
            if(op1 == JOptionPane.YES_OPTION){
                
                con.adicionarCategoria(c);
                JOptionPane.showMessageDialog(this, "Categoria adicionada com sucesso.");
                
                int op2 = JOptionPane.showOptionDialog(this, "Deseja adicionar mais uma categoria?", "Adicionar categoria", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
                
                if(op2 == JOptionPane.NO_OPTION){
                    
                    this.dispose();
                    AcoesAdmin aa = new AcoesAdmin();
                    SistemaDeVotacao.jDesktopPane1.add(aa);
                    aa.setVisible(true);
                    
                }
                else{
                    
                    nomeCategoria.setText("");
                    descCategoria.setText("");
                }
                
                con.encerrarConexao();
                
            }else{
                
                nomeCategoria.setText("");
                descCategoria.setText("");
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void nomeCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeCategoriaKeyReleased
        nomeObrigatorio.setText("");
    }//GEN-LAST:event_nomeCategoriaKeyReleased

    private void descCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descCategoriaKeyReleased
        descObrigatoria.setText("");
    }//GEN-LAST:event_descCategoriaKeyReleased

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
        this.dispose();
        AcoesAdmin aa = new AcoesAdmin();
        SistemaDeVotacao.jDesktopPane1.add(aa);
        aa.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JTextArea descCategoria;
    private javax.swing.JLabel descObrigatoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeCategoria;
    private javax.swing.JLabel nomeObrigatorio;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}