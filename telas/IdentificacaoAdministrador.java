package telas;

import conexao.Conexao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class IdentificacaoAdministrador extends javax.swing.JInternalFrame {
        
    private char c;
    
    public IdentificacaoAdministrador() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        loginObrigatorio = new javax.swing.JLabel();
        senhaObrigatoria = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setTitle("Identificação do administrador");
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("Login");

        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoLoginKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoLoginKeyTyped(evt);
            }
        });

        jLabel2.setText("Senha");

        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoSenhaKeyReleased(evt);
            }
        });

        entrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
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
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(entrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoLogin)
                            .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(senhaObrigatoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginObrigatorio)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaObrigatoria)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(voltar))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        if(campoLogin.getText().trim().isEmpty()){
            loginObrigatorio.setText("Campo obrigatório.");
        }
        
        if(campoSenha.getText().trim().isEmpty()){
            senhaObrigatoria.setText("Campo obrigatório.");
        }
        
        Conexao conexao = new Conexao();
        conexao.iniciarConexao();
        
        
        if(!(campoLogin.getText().trim().isEmpty())&& !(campoSenha.getText().isEmpty())){
            if(conexao.consultarLoginSenhaAdministrador(campoLogin.getText(), campoSenha.getText())){
                
                JOptionPane.showMessageDialog(this, "Bem-vindo, administrador!", "Logado", 1);
                this.dispose();
                AcoesAdmin aa = new AcoesAdmin();
                SistemaDeVotacao.jDesktopPane1.add(aa);
                aa.setVisible(true);
                
            }else{
                
                JOptionPane.showMessageDialog(this, "Verifique as informações.", "Informações incorretas.", 2);
                campoLogin.setText("");
                campoSenha.setText("");
                campoLogin.requestFocus();
            }
            
        }else if(!(campoLogin.getText().trim().isEmpty())&& (campoSenha.getText().isEmpty())){
            campoSenha.requestFocus();
            
        }else if((campoLogin.getText().trim().isEmpty())&& !(campoSenha.getText().isEmpty())){
            campoLogin.requestFocus();
            
        }else{
            campoLogin.requestFocus();
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void campoLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyReleased
        loginObrigatorio.setText("");
    }//GEN-LAST:event_campoLoginKeyReleased

    private void campoSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyReleased
        senhaObrigatoria.setText("");
    }//GEN-LAST:event_campoSenhaKeyReleased

    private void campoLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyTyped
        c = evt.getKeyChar();
        if(!Character.isLetter(c))
            evt.consume();
    }//GEN-LAST:event_campoLoginKeyTyped

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            entrar.doClick();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

        TelaInicial ti = new TelaInicial();
        SistemaDeVotacao.jDesktopPane1.add(ti);
        ti.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginObrigatorio;
    private javax.swing.JLabel senhaObrigatoria;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}