package telas;

import javax.swing.JOptionPane;
import conexao.Conexao;
import nomes.Candidato;

public class AdicionarCandidato extends javax.swing.JInternalFrame {

    Conexao conexao = new Conexao();
    
    public AdicionarCandidato() {
        initComponents();
        conexao.preencher_ComboBox_Categorias_AdicionarCandidatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeCandidato = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        categoriaObrigatoria = new javax.swing.JLabel();
        nomeCandObrig = new javax.swing.JLabel();
        listaCategorias = new javax.swing.JComboBox<>();

        setTitle("Adicionar Candidato");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Adicionar Candidato");

        jLabel2.setText("Categoria");

        jLabel3.setText("Nome");

        nomeCandidato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeCandidatoKeyReleased(evt);
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

        listaCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeCandObrig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeCandidato)
                            .addComponent(categoriaObrigatoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaCategorias, 0, 226, Short.MAX_VALUE))))
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriaObrigatoria)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCandObrig)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(voltar))
                .addContainerGap(76, Short.MAX_VALUE))
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
        
        if(listaCategorias.getSelectedIndex() == 0){
            categoriaObrigatoria.setText("Escolha uma categoria.");
        }
        
        if(nomeCandidato.getText().trim().isEmpty()){
            nomeCandObrig.setText("Campo obrigatório.");
        }
        
        if((listaCategorias.getSelectedIndex() != 0)&&!(nomeCandidato.getText().trim().isEmpty())){
            String[] opcoes = {"Sim", "Não"};
            int op1 = JOptionPane.showOptionDialog(this, "Tem certeza de que deseja adicionar o candidato " + nomeCandidato.getText() + "?", "Adicionar candidato", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);

            if(op1 == JOptionPane.YES_OPTION){
                
                String nome = nomeCandidato.getText();
                String categoria = listaCategorias.getSelectedItem().toString();
                
                Candidato candidato = new Candidato(nome, categoria);
                conexao.adicionarCandidato(candidato);
                
                JOptionPane.showMessageDialog(this, "Candidato adicionado com sucesso.");

                int op2 = JOptionPane.showOptionDialog(this, "Deseja adicionar mais um candidato?", "Adicionar candidato", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
                if(op2 == JOptionPane.NO_OPTION){
                    
                    this.dispose();
                    AcoesAdmin aa = new AcoesAdmin();
                    SistemaDeVotacao.jDesktopPane1.add(aa);
                    aa.setVisible(true);
                }else{
                    
                    listaCategorias.setSelectedIndex(0);
                    nomeCandidato.setText("");
                }
            }else{
                listaCategorias.setSelectedIndex(0);
                nomeCandidato.setText("");
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void nomeCandidatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeCandidatoKeyReleased
        nomeCandObrig.setText("");
    }//GEN-LAST:event_nomeCandidatoKeyReleased

    private void listaCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasMouseClicked
        categoriaObrigatoria.setText("");
    }//GEN-LAST:event_listaCategoriasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoriaObrigatoria;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JLabel nomeCandObrig;
    private javax.swing.JTextField nomeCandidato;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}