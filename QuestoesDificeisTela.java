/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jogo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;

/**
 *
 * @author cadub
 */
public class QuestoesDificeisTela extends javax.swing.JFrame {

     ButtonGroup bg = new ButtonGroup();
    
    List <Pergunta> perguntas;
   
    
    public Timer tempo;
    public int segundos = 1;
    public int minutos = 0;
  
    int index = 0;
    int Pontuacao = 0;
    int numeroQuestao = 2;
    
    public QuestoesDificeisTela() throws Exception {
        initComponents();
        
        perguntas = new QuestoesDAODificil().obterPerguntas();
        
        Enunciado.setText(perguntas.get(0).getEnunciado());
        txtAltA.setText(perguntas.get(0).getAlternativaA());
        txtAltB.setText(perguntas.get(0).getAlternativaB());
        txtAltC.setText(perguntas.get(0).getAlternativaC());
        txtAltD.setText(perguntas.get(0).getAlternativaD());
        txtAltE.setText(perguntas.get(0).getAlternativaE());
        txtRespostaCorreta.setText(perguntas.get(0).getRespostaCorreta());
        
        tempo = new Timer(1000, acao);

    }
    
    
   public ActionListener acao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
                txtSegundos.setText(String.valueOf(segundos));
                segundos = segundos + 1;
                if (segundos == 60) {
                    minutos = minutos + 1;
                    txtMinutos.setText(String.valueOf(minutos));
                    segundos = 0;
                }
                else if (minutos == 3) {
                    ResultadoDificilTela TRF = new ResultadoDificilTela();
                    TRF.setVisible(true);

                    ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
                    ResultadoDificilTela.txtConclusao.setText("Acabou o tempo. Essa foi quase lá!!");


                    String tempoMinutos = txtMinutos.getText();
                    ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);


                    String tempoSegundos = txtSegundos.getText();
                    ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

                    tempo.stop();
                }
            
        
        }
    };
   
    public void getSelectedOption (JRadioButton Jrbtn) {
        
        if (Jrbtn.getText().equals(txtRespostaCorreta.getText())) {      
            Pontuacao = Pontuacao + 5;
            NumeroPontuacao.setText(String.valueOf(Pontuacao));
        }
        else {
            Pontuacao = Pontuacao - 4;
            NumeroPontuacao.setText(String.valueOf(Pontuacao));      
        }
        index++;
        enableRButtons(false);
    }
    
    public void enableRButtons (boolean yes_or_no) {
        txtAltA.setEnabled(yes_or_no);
        txtAltB.setEnabled(yes_or_no);
        txtAltC.setEnabled(yes_or_no);
        txtAltD.setEnabled(yes_or_no);
        txtAltE.setEnabled(yes_or_no);
        
        //limpar a seleção
        bg.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRespostaCorreta = new javax.swing.JLabel();
        CaixaParaEmail = new javax.swing.JLabel();
        Enunciado = new javax.swing.JLabel();
        txtAltA = new javax.swing.JRadioButton();
        txtAltB = new javax.swing.JRadioButton();
        txtAltC = new javax.swing.JRadioButton();
        txtAltD = new javax.swing.JRadioButton();
        txtAltE = new javax.swing.JRadioButton();
        NumeroPontuacao = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JLabel();
        NumeroQuestao = new javax.swing.JLabel();
        LabelFacil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        txtRespostaCorreta.setText("jLabel3");

        CaixaParaEmail.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Enunciado.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        Enunciado.setForeground(new java.awt.Color(255, 255, 255));
        Enunciado.setText("A");
        getContentPane().add(Enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 1310, 40));

        txtAltA.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAltA.setForeground(new java.awt.Color(255, 255, 255));
        txtAltA.setText(" jRadioButton1");
        txtAltA.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\AlternativaA.png")); // NOI18N
        txtAltA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltAMouseClicked(evt);
            }
        });
        txtAltA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltAActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 1120, 60));

        txtAltB.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAltB.setForeground(new java.awt.Color(255, 255, 255));
        txtAltB.setText(" jRadioButton2");
        txtAltB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 84, 242), 3));
        txtAltB.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\AlternativaB.png")); // NOI18N
        txtAltB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltBMouseClicked(evt);
            }
        });
        txtAltB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltBActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 1120, -1));

        txtAltC.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAltC.setForeground(new java.awt.Color(255, 255, 255));
        txtAltC.setText("  jRadioButton3");
        txtAltC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 84, 242), 3));
        txtAltC.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\AlternativaC.png")); // NOI18N
        txtAltC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltCMouseClicked(evt);
            }
        });
        txtAltC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltCActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 1140, 70));

        txtAltD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAltD.setForeground(new java.awt.Color(255, 255, 255));
        txtAltD.setText("  jRadioButton4");
        txtAltD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 84, 242), 3));
        txtAltD.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\AlternativaD.png")); // NOI18N
        txtAltD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltDMouseClicked(evt);
            }
        });
        txtAltD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltDActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 1130, 60));

        txtAltE.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtAltE.setForeground(new java.awt.Color(255, 255, 255));
        txtAltE.setText(" A");
        txtAltE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 84, 242), 3));
        txtAltE.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\AlternativaE.png")); // NOI18N
        txtAltE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAltEMouseClicked(evt);
            }
        });
        txtAltE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAltEActionPerformed(evt);
            }
        });
        getContentPane().add(txtAltE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 1130, -1));

        NumeroPontuacao.setFont(new java.awt.Font("Eras Bold ITC", 1, 32)); // NOI18N
        NumeroPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        NumeroPontuacao.setText("0");
        getContentPane().add(NumeroPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 40, 40));

        txtSegundos.setFont(new java.awt.Font("Eras Bold ITC", 1, 32)); // NOI18N
        txtSegundos.setForeground(new java.awt.Color(255, 255, 255));
        txtSegundos.setText("0");
        getContentPane().add(txtSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 50, 70, 40));

        txtMinutos.setFont(new java.awt.Font("Eras Bold ITC", 1, 32)); // NOI18N
        txtMinutos.setForeground(new java.awt.Color(255, 255, 255));
        txtMinutos.setText("0");
        getContentPane().add(txtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 40, 40));

        NumeroQuestao.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        NumeroQuestao.setForeground(new java.awt.Color(255, 255, 255));
        NumeroQuestao.setText("1");
        getContentPane().add(NumeroQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, 40));

        LabelFacil.setFont(new java.awt.Font("Eras Bold ITC", 0, 32)); // NOI18N
        LabelFacil.setForeground(new java.awt.Color(255, 255, 255));
        LabelFacil.setText("Difícil");
        getContentPane().add(LabelFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\1253QUANTUMVM.UNRARMETRO_ckbnxvahp5f44!App\\Extracted\\Questões.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAltAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAltAMouseClicked

    private void txtAltAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltAActionPerformed
        // TODO add your handling code here:
        getSelectedOption(txtAltA);

        NumeroQuestao.setText(String.valueOf(numeroQuestao));
        numeroQuestao = numeroQuestao + 1;

        if (index == perguntas.size()) {

            ResultadoDificilTela Tr = new ResultadoDificilTela();
            Tr.setVisible(true);

            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");

            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + Pontuacao);

            String tempoMinutos = txtMinutos.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);

            String tempoSegundos = txtSegundos.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableRButtons(true);
            //mostrar a proxima questao

            Enunciado.setText(perguntas.get(index).getEnunciado());
            txtAltA.setText(perguntas.get(index).getAlternativaA());
            txtAltB.setText(perguntas.get(index).getAlternativaB());
            txtAltC.setText(perguntas.get(index).getAlternativaC());
            txtAltD.setText(perguntas.get(index).getAlternativaD());
            txtAltE.setText(perguntas.get(index).getAlternativaE());
            txtRespostaCorreta.setText(perguntas.get(index).getRespostaCorreta());

            bg.clearSelection();
        }
    }//GEN-LAST:event_txtAltAActionPerformed

    private void txtAltBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltBMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAltBMouseClicked

    private void txtAltBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltBActionPerformed
        // TODO add your handling code here:
        getSelectedOption(txtAltB);

        NumeroQuestao.setText(String.valueOf(numeroQuestao));
        numeroQuestao = numeroQuestao + 1;

        if (index == perguntas.size()) {

            ResultadoDificilTela Tr = new ResultadoDificilTela();
            Tr.setVisible(true);

            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");

            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + Pontuacao);

            String tempoMinutos = txtMinutos.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);

            String tempoSegundos = txtSegundos.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableRButtons(true);
            //mostrar a proxima questao

            Enunciado.setText(perguntas.get(index).getEnunciado());
            txtAltA.setText(perguntas.get(index).getAlternativaA());
            txtAltB.setText(perguntas.get(index).getAlternativaB());
            txtAltC.setText(perguntas.get(index).getAlternativaC());
            txtAltD.setText(perguntas.get(index).getAlternativaD());
            txtAltE.setText(perguntas.get(index).getAlternativaE());
            txtRespostaCorreta.setText(perguntas.get(index).getRespostaCorreta());

            bg.clearSelection();
        }
    }//GEN-LAST:event_txtAltBActionPerformed

    private void txtAltCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltCMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAltCMouseClicked

    private void txtAltCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltCActionPerformed
        // TODO add your handling code here:
        getSelectedOption(txtAltC);

        NumeroQuestao.setText(String.valueOf(numeroQuestao));
        numeroQuestao = numeroQuestao + 1;

        if (index == perguntas.size()) {

            ResultadoDificilTela Tr = new ResultadoDificilTela();
            Tr.setVisible(true);

            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");

            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + Pontuacao);

            String tempoMinutos = txtMinutos.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);

            String tempoSegundos = txtSegundos.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableRButtons(true);
            //mostrar a proxima questao

            Enunciado.setText(perguntas.get(index).getEnunciado());
            txtAltA.setText(perguntas.get(index).getAlternativaA());
            txtAltB.setText(perguntas.get(index).getAlternativaB());
            txtAltC.setText(perguntas.get(index).getAlternativaC());
            txtAltD.setText(perguntas.get(index).getAlternativaD());
            txtAltE.setText(perguntas.get(index).getAlternativaE());
            txtRespostaCorreta.setText(perguntas.get(index).getRespostaCorreta());

            bg.clearSelection();
        }
    }//GEN-LAST:event_txtAltCActionPerformed

    private void txtAltDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltDMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAltDMouseClicked

    private void txtAltDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltDActionPerformed
        // TODO add your handling code here:
        getSelectedOption(txtAltD);

        NumeroQuestao.setText(String.valueOf(numeroQuestao));
        numeroQuestao = numeroQuestao + 1;

        if (index == perguntas.size()) {

            ResultadoDificilTela Tr = new ResultadoDificilTela();
            Tr.setVisible(true);

            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");

            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + Pontuacao);

            String tempoMinutos = txtMinutos.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);

            String tempoSegundos = txtSegundos.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableRButtons(true);
            //mostrar a proxima questao

            Enunciado.setText(perguntas.get(index).getEnunciado());
            txtAltA.setText(perguntas.get(index).getAlternativaA());
            txtAltB.setText(perguntas.get(index).getAlternativaB());
            txtAltC.setText(perguntas.get(index).getAlternativaC());
            txtAltD.setText(perguntas.get(index).getAlternativaD());
            txtAltE.setText(perguntas.get(index).getAlternativaE());
            txtRespostaCorreta.setText(perguntas.get(index).getRespostaCorreta());

            bg.clearSelection();
        }
    }//GEN-LAST:event_txtAltDActionPerformed

    private void txtAltEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAltEMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAltEMouseClicked

    private void txtAltEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAltEActionPerformed
        // TODO add your handling code here:
        getSelectedOption(txtAltE);

        NumeroQuestao.setText(String.valueOf(numeroQuestao));
        numeroQuestao = numeroQuestao + 1;

        if (index == perguntas.size()) {

            ResultadoDificilTela Tr = new ResultadoDificilTela();
            Tr.setVisible(true);

            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + Pontuacao + " / " + perguntas.size() * 5);
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");

            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + Pontuacao);

            String tempoMinutos = txtMinutos.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);

            String tempoSegundos = txtSegundos.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);

            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableRButtons(true);
            //mostrar a proxima questao

            Enunciado.setText(perguntas.get(index).getEnunciado());
            txtAltA.setText(perguntas.get(index).getAlternativaA());
            txtAltB.setText(perguntas.get(index).getAlternativaB());
            txtAltC.setText(perguntas.get(index).getAlternativaC());
            txtAltD.setText(perguntas.get(index).getAlternativaD());
            txtAltE.setText(perguntas.get(index).getAlternativaE());
            txtRespostaCorreta.setText(perguntas.get(index).getRespostaCorreta());

            bg.clearSelection();
        }
    }//GEN-LAST:event_txtAltEActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
           tempo.start();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        tempo.stop();
        
        String pegarEmail = CaixaParaEmail.getText();
        ResultadoDificilTela.CaixaParaEmail.setText(pegarEmail);
         try{
                String sql = "Update login Set pontuacaoTotal = ? where email = ?";
                Connection conexao = ConnectionFactory.getConnection();
                PreparedStatement ps = conexao.prepareStatement(sql);

                
                
                ps.setInt(1, UsuarioLogado.usuario.getPontuacaoTotal());
                ps.setString(2, CaixaParaEmail.getText());

                ps.execute();

                ps.close();
                conexao.close();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(QuestoesDificeisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestoesDificeisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestoesDificeisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestoesDificeisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuestoesDificeisTela().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QuestoesDificeisTela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CaixaParaEmail;
    public static javax.swing.JLabel Enunciado;
    private javax.swing.JLabel LabelFacil;
    public static javax.swing.JLabel NumeroPontuacao;
    private javax.swing.JLabel NumeroQuestao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton txtAltA;
    private javax.swing.JRadioButton txtAltB;
    private javax.swing.JRadioButton txtAltC;
    private javax.swing.JRadioButton txtAltD;
    private javax.swing.JRadioButton txtAltE;
    public static javax.swing.JLabel txtMinutos;
    private javax.swing.JLabel txtRespostaCorreta;
    public static javax.swing.JLabel txtSegundos;
    // End of variables declaration//GEN-END:variables
}
