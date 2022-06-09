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
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author cadub
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuestoesFaceisTela extends javax.swing.JFrame {

   
    String[] questions = {"Quais são os IDES do Java?","O que é uma class?", "Para quaisquer nomes, respeitamos o padrão conhecido como?", "Uma boa prática de programação é?", "Métodos sempre têm parênteses para parâmetros, mesmo que fiquem vazios?"};
    String[] [] options ={{"JBlue", "Mainframe e Classe", "Visual Studio","Eclipse e Netbeans","JavaScript", "D"}, {"Lugar onde o professor dá uma aula","Uma class é um elemento do código Java que utilizamos para representar as Strings do nosso programa de Java","Uma classe é um elemento do código que iremos utilizar para armazenar as variáveis que iremos utilizar em Java","Uma classe é um elemento do código Java que utilizamos somente em lugares específicos do código para que aumente a velocidade de atualização do programa","Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real","E"}, {"CamelCase","Elephant Case","TigerCase","DonkeyCase","RiverCase", "A"},{"Sempre iniciar o programa usando um laço de repetição","Ligar as Strings para fazer o programa de Java conseguir rodar com uma taxa maior de atualização","Indentrar a classe utilizando o CamelCase","Fazer os programas rodarem sem precisarem serem indentados","Indentar sempre programas", "C"},{"Nunca se precisa de parêntese em um programa Java","Parâmetros nunca irão necessitar de algo especifíco","O método irá precisar de pontos além de parênteses","Falso","Verdadeiro","D"}};
    int index = 0, correct = 0;
    int valor = 1;
    int numeroquestao = 2;
    List <Pergunta> perguntas;
    
    ButtonGroup bg = new ButtonGroup();
    
    public Timer tempo;
    public int segundos = 1;
    public int minutos = 0;
    
          
    
    public QuestoesFaceisTela(){
        initComponents();
        
        
        bg.add(AlternativaA);
        bg.add(AlternativaB);
        bg.add(AlternativaC);
        bg.add(AlternativaD);
        bg.add(AlternativaE);
        
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
            else if (minutos == 5) {
                ResultadoFacilTela TRF = new ResultadoFacilTela();
                TRF.setVisible(true);
                
                ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "15");
                ResultadoFacilTela.txtConclusao.setText("Acabou o tempo. Essa foi quase lá!!");
                ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
                
                String tempoMinutos = txtMinutos.getText();
                ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
                String tempoSegundos = txtSegundos.getText();
                ResultadoFacilTela.txtTempoSegundos.setText(":" + tempoSegundos);
                
                tempo.stop();
            }
        
        }
    };
    
    public void getSelectedOption (JButton rbtn) {
        System.out.println(rbtn.getText());
        System.out.println(options[index][5]);
        if(rbtn.getText().equals(options[index] [5])) {
            correct++;
            NumeroPontuacao.setText(String.valueOf(valor));
            valor++;
        }
        index++;
        enableButtons(false);
    }
    
    public void enableButtons (boolean yes_or_no) {
        AlternativaA.setEnabled(yes_or_no);
        AlternativaB.setEnabled(yes_or_no);
        AlternativaC.setEnabled(yes_or_no);
        AlternativaD.setEnabled(yes_or_no);
        AlternativaE.setEnabled(yes_or_no);
        
        //limpar a seleção
        bg.clearSelection();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeDificuldade = new javax.swing.JLabel();
        CaixaParaEmail = new javax.swing.JLabel();
        AlternativaA = new javax.swing.JButton();
        AlternativaB = new javax.swing.JButton();
        AlternativaC = new javax.swing.JButton();
        AlternativaD = new javax.swing.JButton();
        AlternativaE = new javax.swing.JButton();
        txtAltB = new javax.swing.JLabel();
        txtAltC = new javax.swing.JLabel();
        txtAltD = new javax.swing.JLabel();
        txtAltE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Enunciado = new javax.swing.JLabel();
        txtAltA = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroPontuacao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumeroQuestao = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        NomeDificuldade.setText("Fácil");

        CaixaParaEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CaixaParaEmail.setText("se não rodar é gay");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        AlternativaA.setText("A");
        AlternativaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlternativaAMouseClicked(evt);
            }
        });
        AlternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativaAActionPerformed(evt);
            }
        });
        getContentPane().add(AlternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        AlternativaB.setText("B");
        AlternativaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlternativaBMouseClicked(evt);
            }
        });
        AlternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativaBActionPerformed(evt);
            }
        });
        getContentPane().add(AlternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        AlternativaC.setText("C");
        AlternativaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlternativaCMouseClicked(evt);
            }
        });
        AlternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativaCActionPerformed(evt);
            }
        });
        getContentPane().add(AlternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        AlternativaD.setText("D");
        AlternativaD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlternativaDMouseClicked(evt);
            }
        });
        AlternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativaDActionPerformed(evt);
            }
        });
        getContentPane().add(AlternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        AlternativaE.setText("E");
        AlternativaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlternativaEMouseClicked(evt);
            }
        });
        AlternativaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternativaEActionPerformed(evt);
            }
        });
        getContentPane().add(AlternativaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtAltB.setText("MainFrame e Classe");
        getContentPane().add(txtAltB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 870, 30));

        txtAltC.setText("Visual Studio");
        getContentPane().add(txtAltC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 870, 30));

        txtAltD.setText("Eclipse e Netbeans");
        getContentPane().add(txtAltD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 870, 30));

        txtAltE.setText("Dr . JavaScript");
        getContentPane().add(txtAltE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 850, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Enunciado.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Enunciado.setText("Quais são os IDES do Java?  ");
        Enunciado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                EnunciadoComponentHidden(evt);
            }
        });
        jPanel3.add(Enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 960, 30));

        txtAltA.setText("JBueG");
        jPanel3.add(txtAltA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 850, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1010, 330));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (2) (1).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("iscite");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Questão      -  Fácil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Pontuação: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        NumeroPontuacao.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        NumeroPontuacao.setText("0");
        jPanel1.add(NumeroPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Tempo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        NumeroQuestao.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        NumeroQuestao.setForeground(new java.awt.Color(255, 153, 51));
        NumeroQuestao.setText("1");
        jPanel1.add(NumeroQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        txtMinutos.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtMinutos.setText("0");
        jPanel1.add(txtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 30, -1));

        txtSegundos.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtSegundos.setText("0");
        jPanel1.add(txtSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 10, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AlternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativaAActionPerformed
        // TODO add your handling code here:
        getSelectedOption(AlternativaA);
        
    }//GEN-LAST:event_AlternativaAActionPerformed

    private void AlternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativaBActionPerformed
        // TODO add your handling code here:
        getSelectedOption(AlternativaB);
        
    }//GEN-LAST:event_AlternativaBActionPerformed

    private void AlternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativaCActionPerformed
        // TODO add your handling code here:
        getSelectedOption(AlternativaC);
    }//GEN-LAST:event_AlternativaCActionPerformed

    private void AlternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativaDActionPerformed
        // TODO add your handling code here:
        getSelectedOption(AlternativaD);
    }//GEN-LAST:event_AlternativaDActionPerformed

    private void AlternativaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternativaEActionPerformed
        // TODO add your handling code here:
        getSelectedOption(AlternativaE);
        
       
    }//GEN-LAST:event_AlternativaEActionPerformed

    private void AlternativaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlternativaAMouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoFacilTela Tr = new ResultadoFacilTela();
            Tr.setVisible(true);
            
           
            ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
            ResultadoFacilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Fácil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutos.getText();
            ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
            String tempoSegundos = txtSegundos.getText();
            ResultadoFacilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            
            Enunciado.setText(questions[index]);
            
            txtAltA.setText (options[index] [0]);
            txtAltB.setText (options[index] [1]);
            txtAltC.setText (options[index] [2]);
            txtAltD.setText (options[index] [3]);
            txtAltE.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_AlternativaAMouseClicked

    private void AlternativaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlternativaBMouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoFacilTela Tr = new ResultadoFacilTela();
            Tr.setVisible(true);
            
            ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
            ResultadoFacilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Fácil!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutos.getText();
            ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            String tempoSegundos = txtSegundos.getText();
            ResultadoFacilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            txtAltA.setText (options[index] [0]);
            txtAltB.setText (options[index] [1]);
            txtAltC.setText (options[index] [2]);
            txtAltD.setText (options[index] [3]);
            txtAltE.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_AlternativaBMouseClicked

    private void AlternativaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlternativaCMouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoFacilTela Tr = new ResultadoFacilTela();
            Tr.setVisible(true);
            
            ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
            ResultadoFacilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Fácil!!");
            
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            String tempoMinutos = txtMinutos.getText();
            ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            txtAltA.setText (options[index] [0]);
            txtAltB.setText (options[index] [1]);
            txtAltC.setText (options[index] [2]);
            txtAltD.setText (options[index] [3]);
            txtAltE.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_AlternativaCMouseClicked

    private void AlternativaDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlternativaDMouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoFacilTela Tr = new ResultadoFacilTela();
            Tr.setVisible(true);
             
            ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
            ResultadoFacilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Fácil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutos.getText();
            ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
            
            String tempoSegundos = txtSegundos.getText();
            ResultadoFacilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            txtAltA.setText (options[index] [0]);
            txtAltB.setText (options[index] [1]);
            txtAltC.setText (options[index] [2]);
            txtAltD.setText (options[index] [3]);
            txtAltE.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_AlternativaDMouseClicked

    private void AlternativaEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlternativaEMouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoFacilTela Tr = new ResultadoFacilTela();
            Tr.setVisible(true);
            
            ResultadoFacilTela.txtPontuacao.setText("Sua Pontuação: " + correct + " / " + questions.length);
            ResultadoFacilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Fácil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinutos.getText();
            ResultadoFacilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
            
            String tempoSegundos = txtSegundos.getText();
            ResultadoFacilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enableButtons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            txtAltA.setText (options[index] [0]);
            txtAltB.setText (options[index] [1]);
            txtAltC.setText (options[index] [2]);
            txtAltD.setText (options[index] [3]);
            txtAltE.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_AlternativaEMouseClicked

    private void EnunciadoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EnunciadoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_EnunciadoComponentHidden

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tempo.start();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        tempo.stop();
    
        
        String pegarEmail = CaixaParaEmail.getText();
        ResultadoFacilTela.CaixaParaEmail.setText(pegarEmail);
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
            java.util.logging.Logger.getLogger(QuestoesFaceisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestoesFaceisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestoesFaceisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestoesFaceisTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestoesFaceisTela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlternativaA;
    private javax.swing.JButton AlternativaB;
    private javax.swing.JButton AlternativaC;
    private javax.swing.JButton AlternativaD;
    private javax.swing.JButton AlternativaE;
    public static javax.swing.JLabel CaixaParaEmail;
    private javax.swing.JLabel Enunciado;
    private javax.swing.JLabel NomeDificuldade;
    public static javax.swing.JLabel NumeroPontuacao;
    private javax.swing.JLabel NumeroQuestao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtAltA;
    private javax.swing.JLabel txtAltB;
    private javax.swing.JLabel txtAltC;
    private javax.swing.JLabel txtAltD;
    private javax.swing.JLabel txtAltE;
    public static javax.swing.JLabel txtMinutos;
    public static javax.swing.JLabel txtSegundos;
    // End of variables declaration//GEN-END:variables
}
