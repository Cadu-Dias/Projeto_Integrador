/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;



/**
 *
 * @author cadub
 */
public class DificuldadeFacilTela extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form TelaDificuldadeFacil
     */
    public DificuldadeFacilTela() {
        initComponents();
        
        
        
    }
    
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaixaParaEmail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        StartFácil = new javax.swing.JButton();
        BotãoVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        CaixaParaEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CaixaParaEmail.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dificuldade Fácil");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        StartFácil.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\4842316-start-icon-in-trendy-long-shadow-style-isolated-on-soft-blue-background-grátis-vetor.jpg")); // NOI18N
        StartFácil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartFácilActionPerformed(evt);
            }
        });
        getContentPane().add(StartFácil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        BotãoVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Botão-Voltar.png")); // NOI18N
        BotãoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BotãoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 31, 150, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Instruções:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- Este Quiz apresenta 5 perguntas no total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- Você tera 5 minutos para respondê-la");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- Para cada acerto você obterá 1 ponto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        Fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
        // TODO add your handling code here:
         DificuldadeTela TD = new DificuldadeTela();
        TD.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_BotãoVoltarActionPerformed

    private void StartFácilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartFácilActionPerformed
        // TODO add your handling code here:
        QuestoesFaceisTela QF = new QuestoesFaceisTela();
        QF.setVisible(true);
        
        String pegarEmail = CaixaParaEmail.getText();
        QuestoesFaceisTela.CaixaParaEmail.setText(pegarEmail);
        
        this.dispose();
    
    }//GEN-LAST:event_StartFácilActionPerformed

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
            java.util.logging.Logger.getLogger(DificuldadeFacilTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DificuldadeFacilTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DificuldadeFacilTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DificuldadeFacilTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DificuldadeFacilTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoVoltar;
    public static javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JLabel Fundo;
    public static javax.swing.JButton StartFácil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
