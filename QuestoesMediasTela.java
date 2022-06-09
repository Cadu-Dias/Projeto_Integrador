/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import javax.swing.Timer;


/**
 *
 * @author cadub
 */
public class QuestoesMediasTela extends javax.swing.JFrame {

    String[] questions = {"Que tipo de estrutura o comando Switch faz parte?","Qual o uso do comando break em Java?", "Quantos comandos de tomadas de decisões existem no Java?", "O que são strings?", "Quantos comandos de laços de repetições existem no Java?"};
    String[] [] options ={{"Uma estrutura de repetição", "Uma estrutura de troca", "Uma estrutura de finalidade", "Uma estrutura de decisões", "Uma estrutura de alternativa", "D"}, {"O comando break é usado para acabar com o programa", "O comando break é usado para quebrar as falhas", "O comando break é usado para facilitar a existência de alguns loops e quebrar com algumas falhas existentes dentro do sistema", "O comando break é usado para criar loops e continuar com a sequência do programa", "O comando break é usado para sair de loops e continuar com a sequência do programa", "E"}, {"Nenhuma", "3", "1", "5", "4", "B"}, {"Strings são códigos usados para conseguirmos fazer o programa de Java rodar", "String são linhas", "String não estão dentro da classe do programa de Java", "String é uma forma de classificar varíaveis em que atribui-se números", "Strings são objetos que manipulamos utilizando variáveis de referência", "E"}, {"Nenhuma", "4", "2", "1", "3", "E"}};
    int index = 0, correct = 0;
    int valor = 0;
    int numeroquestao = 2;
    
    
    public Timer tempo;
    public int segundos = 1;
    public int minutos = 0;
    
    ButtonGroup bg = new ButtonGroup();
    
    
    
    public QuestoesMediasTela() {
        initComponents();
        
        bg.add(jButton1);
        bg.add(jButton2);
        bg.add(jButton3);
        bg.add(jButton4);
        bg.add(jButton5);
        
        tempo = new Timer(1000, acao);
    }
    
     public ActionListener acao = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            txtSegundoMedio.setText(String.valueOf(segundos));
            segundos = segundos + 1;
            if (segundos == 60) {
                
                valor = valor - 1;
                NumeroPontuacao.setText(String.valueOf(valor));
                
                minutos = minutos + 1;
                txtMinutoMedio.setText(String.valueOf(minutos));
                segundos = 0;
            }
            
            else if (minutos == 4) {
                
                ResultadoMedioTela TRM = new ResultadoMedioTela();
                TRM.setVisible(true);
                
                ResultadoMedioTela.txtPontuacao.setText(valor + " / " + "15");
                ResultadoMedioTela.txtConclusao.setText("Acabou o tempo. Essa foi quase lá!!");
                String tempoMinutos = txtMinutoMedio.getText();
                ResultadoMedioTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
                String tempoSegundos = txtSegundoMedio.getText();
                ResultadoMedioTela.txtTempoSegundos.setText(":" + tempoSegundos);
                
                this.dispose();
            }
        
        }

        private void dispose() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    public void getSelectedOption (JButton Jbtn) {
        if(Jbtn.getText().equals(options[index] [5])) {
            correct++;
            valor = valor + 3;
            NumeroPontuacao.setText(String.valueOf(valor));
           
        }
        else {
            valor = valor - 2;
            NumeroPontuacao.setText(String.valueOf(valor));
            
        }
        
        index++;
        enableButtons(false);
    };
    public void enableButtons (boolean yes_or_no) {
        
        
        jButton1.setEnabled(yes_or_no);
        jButton2.setEnabled(yes_or_no);
        jButton3.setEnabled(yes_or_no);
        jButton4.setEnabled(yes_or_no);
        jButton5.setEnabled(yes_or_no);
        
        //limpar a seleção
        bg.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeDificuldade = new javax.swing.JLabel();
        CaixaParaEmail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LogoDiscite = new javax.swing.JLabel();
        TermoDiscite = new javax.swing.JLabel();
        Questao_DificuldadeDificil = new javax.swing.JLabel();
        EscritaPontuacao = new javax.swing.JLabel();
        NumeroPontuacao = new javax.swing.JLabel();
        EscritaTempo = new javax.swing.JLabel();
        NumeroQuestao = new javax.swing.JLabel();
        txtMinutoMedio = new javax.swing.JLabel();
        txtSegundoMedio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FundoParteCima = new javax.swing.JLabel();
        Enunciado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        NomeDificuldade.setText("Médio");

        CaixaParaEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoDiscite.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (2) (1).png")); // NOI18N
        jPanel1.add(LogoDiscite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        TermoDiscite.setFont(new java.awt.Font("MV Boli", 0, 30)); // NOI18N
        TermoDiscite.setForeground(new java.awt.Color(255, 102, 0));
        TermoDiscite.setText("iscite");
        jPanel1.add(TermoDiscite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, -1));

        Questao_DificuldadeDificil.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Questao_DificuldadeDificil.setForeground(new java.awt.Color(255, 153, 0));
        Questao_DificuldadeDificil.setText("Questão      -    Nível Médio");
        jPanel1.add(Questao_DificuldadeDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 290, 30));

        EscritaPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        EscritaPontuacao.setForeground(new java.awt.Color(0, 153, 255));
        EscritaPontuacao.setText("Pontuação: ");
        jPanel1.add(EscritaPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        NumeroPontuacao.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        NumeroPontuacao.setText("0");
        jPanel1.add(NumeroPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 40, -1));

        EscritaTempo.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        EscritaTempo.setForeground(new java.awt.Color(0, 153, 255));
        EscritaTempo.setText("Tempo:");
        jPanel1.add(EscritaTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        NumeroQuestao.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        NumeroQuestao.setForeground(new java.awt.Color(255, 153, 51));
        NumeroQuestao.setText("1");
        jPanel1.add(NumeroQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        txtMinutoMedio.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtMinutoMedio.setText("0");
        jPanel1.add(txtMinutoMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        txtSegundoMedio.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtSegundoMedio.setText("0");
        jPanel1.add(txtSegundoMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel1.setText(":");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 10, -1));

        FundoParteCima.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        jPanel1.add(FundoParteCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        Enunciado.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Enunciado.setText("Que tipo de estrutura o comando Switch faz parte? ");
        getContentPane().add(Enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 880, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Uma estrutura de repetição");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 950, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Uma estrutura de troca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 970, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Uma estrutra de finalidade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 990, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Uma estrutura de decisões");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 940, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("Uma estrutura de alternativa");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 950, -1));

        jButton1.setText("A");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jButton2.setText("B");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jButton3.setText("C");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton4.setText("D");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jButton5.setText("E");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1090, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            
            ResultadoMedioTela TRM = new ResultadoMedioTela();
            TRM.setVisible(true);
            
            ResultadoMedioTela.txtPontuacao.setText( valor + " / " + "15");
            ResultadoMedioTela.txtConclusao.setText("Voce concluiu o quiz de Nível Médio!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutoMedio.getText();
            ResultadoMedioTela.txtTempo.setText(tempoMinutos);
            
            String tempoSegundos = txtSegundoMedio.getText();
            ResultadoMedioTela.txtTempoSegundos.setText( tempoSegundos);
            
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            jLabel2.setText (options[index] [0]);
            jLabel3.setText (options[index] [1]);
            jLabel4.setText (options[index] [2]);
            jLabel5.setText (options[index] [3]);
            jLabel6.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoMedioTela TRM = new ResultadoMedioTela();
            TRM.setVisible(true);
            ResultadoMedioTela.txtPontuacao.setText( valor + " / " + "15");
            ResultadoMedioTela.txtConclusao.setText("Voce concluiu o quiz de Nível Médio!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutoMedio.getText();
            ResultadoMedioTela.txtTempo.setText( tempoMinutos);
            
            String tempoSegundos = txtSegundoMedio.getText();
            ResultadoMedioTela.txtTempoSegundos.setText( tempoSegundos);
           
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            jLabel2.setText (options[index] [0]);
            jLabel3.setText (options[index] [1]);
            jLabel4.setText (options[index] [2]);
            jLabel5.setText (options[index] [3]);
            jLabel6.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoMedioTela TRM = new ResultadoMedioTela();
            TRM.setVisible(true);
            ResultadoMedioTela.txtPontuacao.setText( + valor + " / " + "15");
            ResultadoMedioTela.txtConclusao.setText("Voce concluiu o quiz de Nível Médio!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutoMedio.getText();
            ResultadoMedioTela.txtTempo.setText( tempoMinutos);
            
            String tempoSegundos = txtSegundoMedio.getText();
            ResultadoMedioTela.txtTempoSegundos.setText( tempoSegundos);
            
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            jLabel2.setText (options[index] [0]);
            jLabel3.setText (options[index] [1]);
            jLabel4.setText (options[index] [2]);
            jLabel5.setText (options[index] [3]);
            jLabel6.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoMedioTela TRM = new ResultadoMedioTela();
            TRM.setVisible(true);
            ResultadoMedioTela.txtPontuacao.setText(valor + " / " + "15");
            ResultadoMedioTela.txtConclusao.setText("Voce concluiu o quiz de Nível Médio!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutoMedio.getText();
            ResultadoMedioTela.txtTempo.setText( tempoMinutos);
            
            String tempoSegundos = txtSegundoMedio.getText();
            ResultadoMedioTela.txtTempoSegundos.setText( tempoSegundos);
            
            
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            jLabel2.setText (options[index] [0]);
            jLabel3.setText (options[index] [1]);
            jLabel4.setText (options[index] [2]);
            jLabel5.setText (options[index] [3]);
            jLabel6.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoMedioTela TRM = new ResultadoMedioTela();
            TRM.setVisible(true);
            ResultadoMedioTela.txtPontuacao.setText(valor + " / " + "15");
            ResultadoMedioTela.txtConclusao.setText("Voce concluiu o quiz de Nível Médio!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutoMedio.getText();
            ResultadoMedioTela.txtTempo.setText(tempoMinutos);
            
            String tempoSegundos = txtSegundoMedio.getText();
            ResultadoMedioTela.txtTempoSegundos.setText(tempoSegundos);
            
            
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            jLabel2.setText (options[index] [0]);
            jLabel3.setText (options[index] [1]);
            jLabel4.setText (options[index] [2]);
            jLabel5.setText (options[index] [3]);
            jLabel6.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
        bg.clearSelection();
    }//GEN-LAST:event_jButton5MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tempo.start();
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        tempo.stop();
        
        String pegarEmail = CaixaParaEmail.getText();
        ResultadoMedioTela.CaixaParaEmail.setText(pegarEmail);
        try{
                String sql = "Update login Set pontuacaoTotal = ? where email = ?";
                Connection conexao = ConexaoHistorico.getConnection();
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
            java.util.logging.Logger.getLogger(QuestoesMediasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestoesMediasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestoesMediasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestoesMediasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestoesMediasTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CaixaParaEmail;
    public static javax.swing.JLabel Enunciado;
    private javax.swing.JLabel EscritaPontuacao;
    private javax.swing.JLabel EscritaTempo;
    private javax.swing.JLabel FundoParteCima;
    private javax.swing.JLabel LogoDiscite;
    private javax.swing.JLabel NomeDificuldade;
    public static javax.swing.JLabel NumeroPontuacao;
    private javax.swing.JLabel NumeroQuestao;
    private javax.swing.JLabel Questao_DificuldadeDificil;
    private javax.swing.JLabel TermoDiscite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel txtMinutoMedio;
    public static javax.swing.JLabel txtSegundoMedio;
    // End of variables declaration//GEN-END:variables
}
