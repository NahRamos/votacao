package telas;

public class TelaInicial extends javax.swing.JInternalFrame {
    
    public TelaInicial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JButton();
        novoVoto = new javax.swing.JButton();

        setTitle("Tela Inicial");
        setPreferredSize(new java.awt.Dimension(600, 400));

        admin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        admin.setText("Administrador");
        admin.setFocusable(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        novoVoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        novoVoto.setText("Novo Voto");
        novoVoto.setFocusable(false);
        novoVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoVotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(admin))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(novoVoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(novoVoto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(admin))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void novoVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoVotoActionPerformed
        
        this.dispose();
        TelaEleitor te = new TelaEleitor();
        SistemaDeVotacao.jDesktopPane1.add(te);
        te.setVisible(true);
    }//GEN-LAST:event_novoVotoActionPerformed

    
    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        
        this.dispose();
        IdentificacaoAdministrador ia = new IdentificacaoAdministrador();
        SistemaDeVotacao.jDesktopPane1.add(ia);
        ia.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton novoVoto;
    // End of variables declaration//GEN-END:variables
}