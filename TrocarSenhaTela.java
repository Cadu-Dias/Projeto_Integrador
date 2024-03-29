/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import java.util.Random;
/**
 *
 * @author cadub
 */
public class TrocarSenhaTela extends javax.swing.JFrame {

    /**
     * Creates new form TrocarSenhaTela
     */
    public TrocarSenhaTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaixaParaEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        BotaoVerificar = new javax.swing.JButton();
        BotaoMudarSenha = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        CaixaParaEmail.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(94, 83, 239));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 500, 50));

        BotaoVerificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoVerificarEmail.png")); // NOI18N
        BotaoVerificar.setBorder(null);
        BotaoVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 220, 80));

        BotaoMudarSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoMudarSenha.png")); // NOI18N
        BotaoMudarSenha.setBorder(null);
        BotaoMudarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMudarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoMudarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, 230, 80));

        txtSenha.setBackground(new java.awt.Color(94, 83, 239));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 500, 50));

        txtConfirmarSenha.setBackground(new java.awt.Color(94, 83, 239));
        txtConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtConfirmarSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmarSenha.setBorder(null);
        getContentPane().add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 490, 50));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1° Escreva o email que foi cadastrado ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 30));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2° Clique no botão \"Verificar Email\"");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("3° Caso o email exista, escreva sua nova senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4° Clique no botão \"Mudar Senha\" ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Instruções: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        BotaoVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\BotãoVoltarAzul.png")); // NOI18N
        BotaoVoltar.setBorder(null);
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 90));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\1253QUANTUMVM.UNRARMETRO_ckbnxvahp5f44!App\\Extracted\\Imagens feitas\\Senha.png")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarActionPerformed
        // TODO add your handling code here:
        try {
            String email = txtEmail.getText();
            UsuarioVerificacao ObjetoUsuario2 = new UsuarioVerificacao();
            ObjetoUsuario2.setEmail(email);

            UsuarioVerificacaoDAO ObjetoUsuarioDAO2 = new UsuarioVerificacaoDAO();

            boolean rsusuarioDAO2 = ObjetoUsuarioDAO2.existe(ObjetoUsuario2);

            if (rsusuarioDAO2){

               InserirCodigoTela Ict = new InserirCodigoTela();
               Ict.setVisible(true);
                
               InserirCodigoTela.CaixaParaEmail.setText(email);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Email Inválido");
            }
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_BotaoVerificarActionPerformed

    private void BotaoMudarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMudarSenhaActionPerformed
        // TODO add your handling code here:
        String senha = new String (txtSenha.getPassword());
        String confirmarSenha = new String (txtConfirmarSenha.getPassword());
        
        if (senha.equals(confirmarSenha)) {
            try {
                String sql = "Update login Set senha = ? where email = ?";

                Connection conexao = ConnectionFactory.getConnection();
                PreparedStatement ps = conexao.prepareStatement(sql);

                ps.setString(1, senha);
                ps.setString(2, CaixaParaEmail.getText());

                ps.execute();

                ps.close();
                conexao.close();

                JOptionPane.showMessageDialog(null, "Senha alterada");

                LoginTela Lt = new LoginTela();
                Lt.setVisible(true);

                this.dispose();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "As duas senhas devem ser iguais");
        }

    }//GEN-LAST:event_BotaoMudarSenhaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtSenha.setEnabled(false);
        txtConfirmarSenha.setEnabled(false);
        BotaoMudarSenha.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
        LoginTela Lt = new LoginTela();
        Lt.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrocarSenhaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrocarSenhaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrocarSenhaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrocarSenhaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrocarSenhaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BotaoMudarSenha;
    public static javax.swing.JButton BotaoVerificar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPasswordField txtConfirmarSenha;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
