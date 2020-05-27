package telas;

import javax.swing.JOptionPane;

public class AcoesAdmin extends javax.swing.JInternalFrame {

    public AcoesAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        adCategoria = new javax.swing.JRadioButton();
        remCategoria = new javax.swing.JRadioButton();
        adCandidato = new javax.swing.JRadioButton();
        remCandidato = new javax.swing.JRadioButton();
        avancar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        viVotos = new javax.swing.JRadioButton();
        viEleitores = new javax.swing.JRadioButton();

        setTitle("Ações Administrador");
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("O que deseja fazer?");

        buttonGroup1.add(adCategoria);
        adCategoria.setText("Adicionar categoria");

        buttonGroup1.add(remCategoria);
        remCategoria.setText("Remover categoria");

        buttonGroup1.add(adCandidato);
        adCandidato.setText("Adicionar candidato");

        buttonGroup1.add(remCandidato);
        remCandidato.setText("Remover candidato");

        avancar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        avancar.setText("Avançar");
        avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        buttonGroup1.add(viVotos);
        viVotos.setText("Visualizar votos");

        buttonGroup1.add(viEleitores);
        viEleitores.setText("Visualizar eleitores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(remCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adCategoria, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(77, 77, 77))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viVotos)
                        .addGap(95, 95, 95)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viEleitores)
                    .addComponent(avancar)
                    .addComponent(adCandidato)
                    .addComponent(remCandidato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adCandidato)
                    .addComponent(adCategoria))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remCategoria)
                    .addComponent(remCandidato))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viVotos)
                    .addComponent(viEleitores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(avancar))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        IdentificacaoAdministrador ia = new IdentificacaoAdministrador();
        SistemaDeVotacao.jDesktopPane1.add(ia);
        ia.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void avancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarActionPerformed
        if(adCategoria.isSelected()){
            
            this.dispose();
            AdicionarCategoria adicionarCategoria = new AdicionarCategoria();
            SistemaDeVotacao.jDesktopPane1.add(adicionarCategoria);
            adicionarCategoria.setVisible(true);
            
        }else if(adCandidato.isSelected()){
            
            this.dispose();
            AdicionarCandidato adicionarCandidato = new AdicionarCandidato();
            SistemaDeVotacao.jDesktopPane1.add(adicionarCandidato);
            adicionarCandidato.setVisible(true);
            
        }else if(remCategoria.isSelected()){
            
            this.dispose();
            RemoverCategoria removerCategoria = new RemoverCategoria();
            SistemaDeVotacao.jDesktopPane1.add(removerCategoria);
            removerCategoria.setVisible(true);
            
        }else if(remCandidato.isSelected()){
            
            this.dispose();
            RemoverCandidato removerCandidato = new RemoverCandidato();
            SistemaDeVotacao.jDesktopPane1.add(removerCandidato);
            removerCandidato.setVisible(true);
            
        }else if(viVotos.isSelected()){
            
            this.dispose();
            VisualizarVotos visualizarVotos = new VisualizarVotos();
            SistemaDeVotacao.jDesktopPane1.add(visualizarVotos);
            visualizarVotos.setVisible(true);
        
        }else if(viEleitores.isSelected()){
            
            this.dispose();
            VisualizarEleitores visualizarEleitores = new VisualizarEleitores();
            SistemaDeVotacao.jDesktopPane1.add(visualizarEleitores);
            visualizarEleitores.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(this, "Você precisa escolher uma opção.");
        }
    }//GEN-LAST:event_avancarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adCandidato;
    private javax.swing.JRadioButton adCategoria;
    private javax.swing.JButton avancar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton remCandidato;
    private javax.swing.JRadioButton remCategoria;
    private javax.swing.JRadioButton viEleitores;
    private javax.swing.JRadioButton viVotos;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}