package telas;

import javax.swing.JOptionPane;
import conexao.Conexao;
import javax.swing.JComboBox;
import nomes.Categoria;

public class RemoverCategoria extends javax.swing.JInternalFrame {

    Conexao conexao = new Conexao();
    
    public RemoverCategoria() {
        initComponents();
        conexao.preencher_ComboBox_Categorias_RemoverCategoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listaCategorias = new javax.swing.JComboBox<>();
        confirmar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        categoriaObrigatoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Remover Categoria");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Remover Categoria");

        listaCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasMouseClicked(evt);
            }
        });

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

        jLabel2.setText("Categorias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(81, 81, 81)
                        .addComponent(confirmar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaObrigatoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriaObrigatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(voltar))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
        this.dispose();
        AcoesAdmin aa = new AcoesAdmin();
        SistemaDeVotacao.jDesktopPane1.add(aa);
        aa.setVisible(true);
       
    }//GEN-LAST:event_voltarActionPerformed

    
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed

        int ct = listaCategorias.getSelectedIndex();
        
        if(ct == 0){
            categoriaObrigatoria.setText("Escolha uma categoria.");
        }
        
        else{
            
            String categoria = listaCategorias.getSelectedItem().toString();
            
            String[] opcoes = {"Sim", "Não"};
            int op1 = JOptionPane.showOptionDialog(this, "Tem certeza de que deseja remover a categoria " + categoria + "?", "Remover categoria", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

            if(op1 == JOptionPane.YES_OPTION){
                
                Categoria c = new Categoria(categoria);
                String nomeCategoria = c.getNome();
                
                conexao.excluirCategoria(nomeCategoria);
                
                JOptionPane.showMessageDialog(this, "Categoria removida com sucesso.");
                int op2 = JOptionPane.showOptionDialog(this, "Deseja remover mais uma categoria?", "Remover categoria", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
                    
                if(op2 == JOptionPane.NO_OPTION){
                    
                        this.dispose();
                        AcoesAdmin aa = new AcoesAdmin();
                        SistemaDeVotacao.jDesktopPane1.add(aa);
                        aa.setVisible(true);
                        
                    }else{
                        listaCategorias.setSelectedIndex(0);
                    }
            }else{
                listaCategorias.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    
    private void listaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasMouseClicked
         categoriaObrigatoria.setText("");
    }//GEN-LAST:event_listaCategoriasMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoriaObrigatoria;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getListaCategorias() {
        return listaCategorias;
    }
}