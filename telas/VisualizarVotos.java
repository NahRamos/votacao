package telas;

import conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import nomes.Candidato;

public class VisualizarVotos extends javax.swing.JInternalFrame {

    Conexao conexao = new Conexao();
    List<Candidato> candidato = new ArrayList<>();
    DefaultTableModel modelo;
    String categoria;
    
    public VisualizarVotos() {
        initComponents();
        conexao.preencher_ComboBox_Categorias_VisualizarVotos();
        modelo = (DefaultTableModel) tabela.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listaCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Visualizar Votos");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Visualizar Votos");

        listaCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        listaCategorias.setSelectedIndex(-1);
        listaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCategoriasActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nº votos "
            }
        ));
        jScrollPane1.setViewportView(tabela);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(voltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(voltar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
        this.dispose();
        AcoesAdmin aa = new AcoesAdmin();
        SistemaDeVotacao.jDesktopPane1.add(aa);
        aa.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void listaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCategoriasActionPerformed
            
            categoria = listaCategorias.getSelectedItem().toString();
            mostrarCandidatos(categoria);
            candidato.clear();
        
    }//GEN-LAST:event_listaCategoriasActionPerformed

    public static JComboBox<String> getListaCategorias() {
        return listaCategorias;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> listaCategorias;
    public static javax.swing.JTable tabela;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
    
    public void mostrarCandidatos(String categoria){
        
        conexao.iniciarConexao();
        
        try {
            ResultSet resultado = conexao.consultarInformacoes("SELECT * FROM candidatos WHERE nome_cat='" + categoria + " "
                    + "' ORDER BY numeroVotos DESC");
            while(resultado.next()){
                Candidato c = new Candidato(resultado.getInt("id"), resultado.getString("nome"), resultado.getInt("numeroVotos"));
                candidato.add(c);
            }
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            conexao.encerrarConexao();
        }
        
        modelo.setRowCount(0);
        candidato.forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getNumeroVotos()
            });
        });
    }
}