package telas;

import conexao.Conexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

public class TelaEleitor extends javax.swing.JInternalFrame {
    
    Conexao conexao = new Conexao();
    Connection con;
    PreparedStatement stmt = null;
    ResultSet resultado = null;
    
    public TelaEleitor() {
        initComponents();
        PainelInfo.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        procurar = new javax.swing.JButton();
        campoID = new javax.swing.JTextField();
        PainelInfo = new javax.swing.JPanel();
        confirmar = new javax.swing.JButton();
        corrigir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        idObrigatorio = new javax.swing.JLabel();

        setTitle("Identificação do Eleitor");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Identifique-se");

        jLabel2.setText("ID: ");

        procurar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        procurar.setText("Procurar");
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });

        campoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoIDKeyTyped(evt);
            }
        });

        PainelInfo.setPreferredSize(new java.awt.Dimension(290, 151));

        confirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setFocusable(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        corrigir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        corrigir.setText("Corrigir");
        corrigir.setFocusable(false);
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome do Eleitor: ");

        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout PainelInfoLayout = new javax.swing.GroupLayout(PainelInfo);
        PainelInfo.setLayout(PainelInfoLayout);
        PainelInfoLayout.setHorizontalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelInfoLayout.createSequentialGroup()
                .addComponent(corrigir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(confirmar))
            .addGroup(PainelInfoLayout.createSequentialGroup()
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PainelInfoLayout.setVerticalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ID))
                .addGap(29, 29, 29)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(corrigir)))
        );

        nome.getAccessibleContext().setAccessibleName("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(PainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoID, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(procurar)))))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idObrigatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(PainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed
        conexao.iniciarConexao();
        
        //SE O CAMPO ID NÃO ESTIVER VAZIO...
        if(!campoID.getText().trim().isEmpty()){
            
            //...E SE TIVER CINCO DÍGITOS...
            if(campoID.getText().length() == 5){
            
                //...O SISTEMA BUSCA AS INFORMAÇÕES DO ELEITOR NO BANCO...
                if(conexao.consultarEleitor(Integer.parseInt(campoID.getText()))){
                    
                    //...E SE O MESMO AINDA NÃO VOTOU...
                    if(conexao.verificarVoto(Integer.parseInt(campoID.getText())) != false){

                        PainelInfo.setVisible(true);
                        campoID.setEnabled(false);
                        procurar.setEnabled(false);

                    }else{
                        campoID.setText("");
                    }
                    
                }else 
                    {
                    JOptionPane.showMessageDialog(this, "Eleitor não encontrado.\nTente novamente.", "Eleitor não encontrado", 2);
                    campoID.setText("");
                    campoID.requestFocus();
                }
            }else{
                idObrigatorio.setText("O ID deve possuir 5 dígitos.");
                }               
        }else{
            JOptionPane.showMessageDialog(this, "Você deve digitar o seu ID.", "Identifique-se!", 2);
        }
    }//GEN-LAST:event_procurarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        this.dispose();
        TelaCandidato telaCandidato = new TelaCandidato();
        SistemaDeVotacao.jDesktopPane1.add(telaCandidato);
        telaCandidato.setVisible(true);
    }//GEN-LAST:event_confirmarActionPerformed

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
        
        campoID.setText("");
        PainelInfo.setVisible(false);
        campoID.setEnabled(true);
        procurar.setEnabled(true);
        campoID.requestFocus();
    }//GEN-LAST:event_corrigirActionPerformed

    private void campoIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIDKeyTyped
        c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        if(campoID.getText().length() >= 5){
            evt.consume();
        }
    }//GEN-LAST:event_campoIDKeyTyped

    private void campoIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            procurar.doClick();
        }
    }//GEN-LAST:event_campoIDKeyPressed

    private void campoIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIDKeyReleased
        idObrigatorio.setText("");
    }//GEN-LAST:event_campoIDKeyReleased

//    public JPanel getPainelInfo() {
//        return PainelInfo;
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ID;
    private javax.swing.JPanel PainelInfo;
    public static javax.swing.JTextField campoID;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton corrigir;
    private javax.swing.JLabel idObrigatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel nome;
    private javax.swing.JButton procurar;
    // End of variables declaration//GEN-END:variables
    private char c;
}