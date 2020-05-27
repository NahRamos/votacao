package telas;

import conexao.Conexao;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import nomes.*;

public class RemoverCandidato extends javax.swing.JInternalFrame {

    Conexao conexao = new Conexao();
    
    public RemoverCandidato() {
        
        initComponents();
        conexao.preencher_ComboBox_Categorias_RemoverCandidatos();
        listaCandidatos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listaCategorias = new javax.swing.JComboBox<>();
        listaCandidatos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        categoriaObrigatoria = new javax.swing.JLabel();
        nomeObrigatorio = new javax.swing.JLabel();

        setTitle("Remover Candidato");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Remover Candidato");

        listaCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCategorias.setSelectedIndex(0);
        listaCategorias.setSelectedItem(0);
        listaCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaCategoriasItemStateChanged(evt);
            }
        });
        listaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasMouseClicked(evt);
            }
        });
        listaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCategoriasActionPerformed(evt);
            }
        });

        listaCandidatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCandidatos.setSelectedIndex(0);
        listaCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCandidatosMouseClicked(evt);
            }
        });

        jLabel2.setText("Categorias");

        jLabel3.setText("Candidatos");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(confirmar)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 266, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoriaObrigatoria, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(nomeObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaCandidatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriaObrigatoria)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeObrigatorio)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(voltar))
                .addContainerGap(92, Short.MAX_VALUE))
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
        
        int indiceCat = listaCategorias.getSelectedIndex();
        int indiceCand = listaCandidatos.getSelectedIndex();
        String valorCand = listaCandidatos.getSelectedItem().toString();
        
        if(indiceCat == 0){
            categoriaObrigatoria.setText("Escolha uma categoria.");
        }else{
            categoriaObrigatoria.setText("");
        }
        
        
        if((indiceCand == 0)&&(indiceCat != 0)){
            nomeObrigatorio.setText("Escolha um candidato.");
        }else{
            nomeObrigatorio.setText("");
        }
        
        if((indiceCat != 0)&&(indiceCand != 0)){
            
            Candidato cn = new Candidato(valorCand);
            String nomeCandidato = cn.getNome();
            
            String[] opcoes = {"Sim", "Não"};
            int op1 = JOptionPane.showOptionDialog(this, "Tem certeza de que deseja remover o candidato " + valorCand + "?", "Remover candidato", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

            if(op1 == JOptionPane.YES_OPTION){
                
                conexao.excluirCandidato(nomeCandidato);
                
                JOptionPane.showMessageDialog(this, "Candidato removido com sucesso.");
                int op2 = JOptionPane.showOptionDialog(this, "Deseja remover mais um candidato?", "Remover candidato", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
                    
                    if(op2 == JOptionPane.NO_OPTION){
                        
                        this.dispose();
                        AcoesAdmin aa = new AcoesAdmin();
                        SistemaDeVotacao.jDesktopPane1.add(aa);
                        aa.setVisible(true);
                        
                    }else{
                        
                        listaCategorias.setSelectedIndex(0);
                        listaCandidatos.setSelectedIndex(0);
                    }
            }else{
                
                listaCandidatos.setSelectedIndex(0);
                nomeObrigatorio.setText("");
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed
    
    private void listaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCategoriasActionPerformed
        if(listaCategorias.getSelectedIndex() != 0){
            listaCandidatos.setEnabled(true);
        }
    }//GEN-LAST:event_listaCategoriasActionPerformed
    
    private void listaCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaCategoriasItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            listaCandidatos.removeAllItems();
            listaCandidatos.addItem("");
            conexao.preencher_ComboBox_Candidatos_RemoverCandidato(listaCategorias.getSelectedItem().toString());
        }
    }//GEN-LAST:event_listaCategoriasItemStateChanged

    private void listaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasMouseClicked
        categoriaObrigatoria.setText("");
    }//GEN-LAST:event_listaCategoriasMouseClicked

    private void listaCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCandidatosMouseClicked
        nomeObrigatorio.setText("");
    }//GEN-LAST:event_listaCandidatosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoriaObrigatoria;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JComboBox<String> listaCandidatos;
    public static javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JLabel nomeObrigatorio;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}