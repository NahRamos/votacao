package telas;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nomes.Categoria;

public class TelaCandidato extends javax.swing.JInternalFrame {

    Categoria c;
    PreparedStatement preparedStatement;
    Conexao conexao = new Conexao();
    private List<Categoria> listaCategorias;
    private int numeroDeCategorias;
    private int categoriaAtual;
    Statement statement;
    ResultSet resultSet;
    Connection connection;
    TelaEleitor te;
    
    
    public TelaCandidato() {
        
        initComponents();
        PainelCandidatos.setVisible(false);
        PainelVotoNulo.setVisible(false);
        iterarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoria = new javax.swing.JLabel();
        listaCandidatos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoCategoria = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PainelCandidatos = new javax.swing.JPanel();
        corrigir = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelCandidato = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        PainelVotoNulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        corrigirNulo = new javax.swing.JButton();
        confirmarNulo = new javax.swing.JButton();

        setTitle("Candidados");

        categoria.setText("Categoria: ");

        listaCandidatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCandidatosActionPerformed(evt);
            }
        });

        jLabel1.setText("Escolha um candidato");

        campoCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        corrigir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        corrigir.setText("Corrigir");
        corrigir.setFocusable(false);
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });

        confirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setFocusable(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Categoria: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Candidato: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID: ");

        labelCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelCandidato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        labelID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout PainelCandidatosLayout = new javax.swing.GroupLayout(PainelCandidatos);
        PainelCandidatos.setLayout(PainelCandidatosLayout);
        PainelCandidatosLayout.setHorizontalGroup(
            PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCandidatosLayout.createSequentialGroup()
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(corrigir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelCandidatosLayout.createSequentialGroup()
                            .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap()))
                    .addComponent(confirmar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        PainelCandidatosLayout.setVerticalGroup(
            PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCandidatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCategoria))
                .addGap(31, 31, 31)
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelCandidato))
                .addGap(34, 34, 34)
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(PainelCandidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corrigir)
                    .addComponent(confirmar)))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Voto em Branco");

        corrigirNulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        corrigirNulo.setText("Corrigir");
        corrigirNulo.setFocusable(false);
        corrigirNulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirNuloActionPerformed(evt);
            }
        });

        confirmarNulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmarNulo.setText("Confirmar");
        confirmarNulo.setFocusable(false);
        confirmarNulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarNuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelVotoNuloLayout = new javax.swing.GroupLayout(PainelVotoNulo);
        PainelVotoNulo.setLayout(PainelVotoNuloLayout);
        PainelVotoNuloLayout.setHorizontalGroup(
            PainelVotoNuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVotoNuloLayout.createSequentialGroup()
                .addComponent(corrigirNulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarNulo))
            .addGroup(PainelVotoNuloLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PainelVotoNuloLayout.setVerticalGroup(
            PainelVotoNuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelVotoNuloLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(PainelVotoNuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corrigirNulo)
                    .addComponent(confirmarNulo)))
        );

        jLayeredPane1.setLayer(PainelCandidatos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PainelVotoNulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCandidatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelVotoNulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCandidatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PainelVotoNulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(listaCandidatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1))
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria)
                    .addComponent(campoCategoria))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void listaCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCandidatosActionPerformed

        conexao.consultarCandidato(listaCandidatos.getSelectedItem().toString());
        PainelCandidatos.setVisible(true);
        listaCandidatos.setEnabled(false);
        
        if(listaCandidatos.getSelectedIndex() == 0){
            
            PainelCandidatos.setVisible(false);
            listaCandidatos.setEnabled(true);
        }
        
        if(listaCandidatos.getSelectedItem() == "Nulo"){
            
            PainelCandidatos.setVisible(false);
            PainelVotoNulo.setVisible(true);
        }
    }//GEN-LAST:event_listaCandidatosActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        conexao.computarVoto(listaCandidatos.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Voto computado.", "Voto válido", 1);
        categoriaAtual++;
        
        if(categoriaAtual < numeroDeCategorias){

            listaCandidatos.removeItem("Nulo");//remove o elemento "Nulo" da categoria anterior.
            PainelCandidatos.setVisible(false);
            listaCandidatos.setSelectedIndex(0);
            conexao.rodarCategorias(categoriaAtual);
        }
        else{    
            categoriaAtual = listaCategorias.size()-1;
            conexao.mudarStatusEleitor(Integer.parseInt(TelaEleitor.campoID.getText()));
            
            this.dispose();
            TelaInicial ti = new TelaInicial();
            SistemaDeVotacao.jDesktopPane1.add(ti);
            ti.setVisible(true);
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
        
        PainelCandidatos.setVisible(false);
        listaCandidatos.setSelectedIndex(0);
        listaCandidatos.setEnabled(true);
        
    }//GEN-LAST:event_corrigirActionPerformed

    private void confirmarNuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarNuloActionPerformed

        JOptionPane.showMessageDialog(this, "Voto anulado.", "Voto nulo", 1);
        categoriaAtual++;
        
        if(categoriaAtual < numeroDeCategorias){
            
            listaCandidatos.setSelectedIndex(0);
            conexao.rodarCategorias(categoriaAtual);
            listaCandidatos.removeItem("Nulo");
            PainelVotoNulo.setVisible(false);
        }
        else{
            categoriaAtual = listaCategorias.size() - 1;
            conexao.mudarStatusEleitor(Integer.parseInt(TelaEleitor.campoID.getText()));
            
            this.dispose();
            TelaInicial ti = new TelaInicial();
            SistemaDeVotacao.jDesktopPane1.add(ti);
            ti.setVisible(true);
        }
    }//GEN-LAST:event_confirmarNuloActionPerformed

    private void corrigirNuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirNuloActionPerformed
        
        PainelVotoNulo.setVisible(false);
        listaCandidatos.setSelectedIndex(0);
        listaCandidatos.setEnabled(true); 
    }//GEN-LAST:event_corrigirNuloActionPerformed

    public void iterarCategorias(){
    
    listaCategorias = new ArrayList<>();
    listaCategorias = conexao.juntarTodasAsCategorias();
    numeroDeCategorias = listaCategorias.size();
    
    if(numeroDeCategorias != 0){
        
        c = listaCategorias.get(categoriaAtual);
        campoCategoria.setText(c.getNome());
        conexao.preencher_ComboBox_Candidatos_TelaCandidato(c.getNome());
        listaCandidatos.addItem("Nulo");
    }
  }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCandidatos;
    private javax.swing.JPanel PainelVotoNulo;
    public static javax.swing.JLabel campoCategoria;
    private javax.swing.JLabel categoria;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton confirmarNulo;
    private javax.swing.JButton corrigir;
    private javax.swing.JButton corrigirNulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    public static javax.swing.JLabel labelCandidato;
    public static javax.swing.JLabel labelCategoria;
    public static javax.swing.JLabel labelID;
    public static javax.swing.JComboBox<String> listaCandidatos;
    // End of variables declaration//GEN-END:variables
}