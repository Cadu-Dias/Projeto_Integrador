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



public class QuestoesDificeisTela extends javax.swing.JFrame {

    int valor = 0;
    String[] questions = {"Explique os princípios da orientação a objeto?", "Quais operações compõem o termo CRUD?", "Qual é uma das principais características de um Sistema gerenciador de banco de dados (SGBD)?", "Uma classe pode fazer a definição de elementos (atributos, métodos) que sejam comuns a diversas outras", "O método showInputDialog sempre devolve uma?"};
    String [] questions3 = {"", "", "", "Classes e então, por meio da _____, elas obtêm uma cópia desses elementos sem ter que defini-los novamente", ""};
    String[] [] options ={{"Herança dada pela classe encapsulada", "Abstração, encapsulamento e herança são os princípios constituintes da Programação Orientada a Objetos", "Abstração, encapsulamento, herança e polimorfismo são os princípios da Orientação ao Objeto", "Herança e abstração são os princípios da orientação a objeto", "Encapsulamento, String theory e Mainframe adaption são os princípios da Orientação ao Objeto", "C"}, {"Construct, Reanalize, Update e Delete", "Convey, Reach, Update e Delete", "Create, Reastore, Unlearn e Destroy", "Create, Retouch, Update e Delete", "Create, Read, Update e Delete", "E"}, {"Simplificar a implementação das operações CRUD", "Deletar e fazer um update dos dados presentes dentro do banco de dados", "Fazer com que o banco de dados tenha uma taxa de updates maiores e com que ele consiga rodar mais rapidamente", "Comparar todos os dados que estão presentes dentro do banco de dados e verificar se não estão afetando as operações CRUD", "Utilizar as operações\n" +
     "Crud", "A"}, {"Java", "MainFrame", "Class", "Herança", "String", "E"}, {"Classe", "String", "Resultado", "Uma Mensagem", "Nada", "E"}};
    int index = 0, correct = 0;
    int numeroquestao = 2;
    int contador = 2;
    
    public Timer tempo;
    public int segundos = 1;
    public int minutos = 0;
    
    
    
    ButtonGroup bg = new ButtonGroup();
    
    /** Creates new form QuestaoDificil */
    public QuestoesDificeisTela() {
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
            
            txtSegundo.setText(String.valueOf(segundos));
            segundos = segundos + 1;
            if (segundos == 60) {
                
                valor = valor - 3;
                NumeroPontuacao.setText(String.valueOf(valor));
                minutos = minutos + 1;
                txtMinuto.setText(String.valueOf(minutos));
                segundos = 0;
            }
            else if (minutos == 3) {
                ResultadoFacilTela TRF = new ResultadoFacilTela();
                TRF.setVisible(true);
                
                
                ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "15");
                ResultadoDificilTela.txtConclusao.setText("Acabou o tempo. Essa foi quase lá!!");
                String tempoMinutos = txtMinuto.getText();
                ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
                String tempoSegundos = txtSegundo.getText();
                ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            }
        
        }
    };
    
    
    public void getSelectedOption (JButton jbtn) {
      System.out.println(jbtn.getText());
      System.out.println(options[index][5]);
        if(jbtn.getText().equals(options[index] [5])) {
            correct++;
            valor = valor + 5;
            NumeroPontuacao.setText(String.valueOf(valor));
            
        }
        else {
            valor = valor - 4;
            NumeroPontuacao.setText(String.valueOf(valor));
            
        }
        index++;
        enablebuttons(false);
    };
    public void enablebuttons (boolean yes_or_no) {
        jButton1.setEnabled(yes_or_no);
        jButton2.setEnabled(yes_or_no);
        jButton3.setEnabled(yes_or_no);
        jButton4.setEnabled(yes_or_no);
        jButton5.setEnabled(yes_or_no);
        
        //limpar a seleção
        bg.clearSelection();
    };
   
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
        txtMinuto = new javax.swing.JLabel();
        txtSegundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Enunciado = new javax.swing.JLabel();
        Enunciado2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        NomeDificuldade.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        NomeDificuldade.setForeground(new java.awt.Color(255, 255, 255));
        NomeDificuldade.setText("Difícil");

        CaixaParaEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoDiscite.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\Downloads\\Icone Laranja Discite (2) (1).png")); // NOI18N
        jPanel1.add(LogoDiscite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        TermoDiscite.setFont(new java.awt.Font("MV Boli", 0, 30)); // NOI18N
        TermoDiscite.setForeground(new java.awt.Color(255, 102, 0));
        TermoDiscite.setText("iscite");
        jPanel1.add(TermoDiscite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, -1));

        Questao_DificuldadeDificil.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        Questao_DificuldadeDificil.setForeground(new java.awt.Color(255, 153, 51));
        Questao_DificuldadeDificil.setText("Questão     -    Nível Difícil");
        jPanel1.add(Questao_DificuldadeDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 290, 30));

        EscritaPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        EscritaPontuacao.setForeground(new java.awt.Color(0, 153, 255));
        EscritaPontuacao.setText("Pontuação: ");
        jPanel1.add(EscritaPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        NumeroPontuacao.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        NumeroPontuacao.setText("0");
        jPanel1.add(NumeroPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 40, -1));

        EscritaTempo.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        EscritaTempo.setForeground(new java.awt.Color(0, 153, 255));
        EscritaTempo.setText("Tempo:");
        jPanel1.add(EscritaTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        NumeroQuestao.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        NumeroQuestao.setForeground(new java.awt.Color(255, 153, 51));
        NumeroQuestao.setText("1");
        jPanel1.add(NumeroQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        txtMinuto.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtMinuto.setText("0");
        txtMinuto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtMinutoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtMinuto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txtMinutoComponentShown(evt);
            }
        });
        txtMinuto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMinutoPropertyChange(evt);
            }
        });
        jPanel1.add(txtMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 20, 30));

        txtSegundo.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        txtSegundo.setText("0");
        jPanel1.add(txtSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel1.setText(":");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 10, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cadub\\OneDrive\\Imagens\\Saved Pictures\\Azul Laranja.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

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
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Herança dada pela classe encapsulada ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 970, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Abstração, encapsulamento e herança são os princípios constituintes da Programação Orientada a Objetos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 980, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Abstração, encapsulamento, herança e polimorfismo são os princípios da Orientação ao Objeto");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 960, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Herança e abstração são os princípios da orientação a objeto ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 940, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Encapsulamento, String theory e Mainframe adaption são os princípios da Orientação ao Objeto");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 950, -1));

        Enunciado.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Enunciado.setText("Explique os princípios da orientação a objeto? ");
        getContentPane().add(Enunciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1040, -1));

        Enunciado2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        getContentPane().add(Enunciado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1040, 30));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1100, 370));

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
            ResultadoDificilTela TRD = new ResultadoDificilTela();
            TRD.setVisible(true);
            
            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "25");
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinuto.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
             
            
            String tempoSegundos = txtSegundo.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enablebuttons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            Enunciado2.setText(questions3[index]);
            jLabel8.setText (options[index] [0]);
            jLabel9.setText (options[index] [1]);
            jLabel10.setText (options[index] [2]);
            jLabel11.setText (options[index] [3]);
            jLabel12.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
             ResultadoDificilTela TRD = new ResultadoDificilTela();
            TRD.setVisible(true);
            
            
            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "25");
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinuto.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
            String tempoSegundos = txtSegundo.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enablebuttons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            Enunciado2.setText(questions3[index]);
            jLabel8.setText (options[index] [0]);
            jLabel9.setText (options[index] [1]);
            jLabel10.setText (options[index] [2]);
            jLabel11.setText (options[index] [3]);
            jLabel12.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
             ResultadoDificilTela TRD = new ResultadoDificilTela();
            TRD.setVisible(true);
            
            
            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "25");
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");
            
             UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinuto.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
            
            
            String tempoSegundos = txtSegundo.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
            
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enablebuttons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            Enunciado2.setText(questions3[index]);
            jLabel8.setText (options[index] [0]);
            jLabel9.setText (options[index] [1]);
            jLabel10.setText (options[index] [2]);
            jLabel11.setText (options[index] [3]);
            jLabel12.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoDificilTela TRD = new ResultadoDificilTela();
            TRD.setVisible(true);
            
           
            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "25");
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinuto.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
             
            
            String tempoSegundos = txtSegundo.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
             
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enablebuttons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            Enunciado2.setText(questions3[index]);
            jLabel8.setText (options[index] [0]);
            jLabel9.setText (options[index] [1]);
            jLabel10.setText (options[index] [2]);
            jLabel11.setText (options[index] [3]);
            jLabel12.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        NumeroQuestao.setText(String.valueOf(numeroquestao));
        numeroquestao = numeroquestao + 1;
        
        if (index == questions.length) {
            ResultadoDificilTela TRD = new ResultadoDificilTela();
            TRD.setVisible(true);
            
            
            ResultadoDificilTela.txtPontuacao.setText("Sua Pontuação: " + valor + " / " + "25");
            ResultadoDificilTela.txtConclusao.setText("Voce concluiu o quiz de Nível Difícil!!");
            
            UsuarioLogado.usuario.setPontuacaoTotal(UsuarioLogado.usuario.getPontuacaoTotal() + valor);
            
            String tempoMinutos = txtMinuto.getText();
            ResultadoDificilTela.txtTempo.setText("Seu tempo: " + tempoMinutos);
             
            
            String tempoSegundos = txtSegundo.getText();
            ResultadoDificilTela.txtTempoSegundos.setText(":" + tempoSegundos);
                
            this.dispose();
        }

        else  {
            //liberar os radio buttons
            enablebuttons(true);
            //mostrar a proxima questao
            
            Enunciado.setText(questions[index]);
            Enunciado2.setText(questions3[index]);
            jLabel8.setText (options[index] [0]);
            jLabel9.setText (options[index] [1]);
            jLabel10.setText (options[index] [2]);
            jLabel11.setText (options[index] [3]);
            jLabel12.setText (options[index] [4]);

            if(index == questions.length-1){
                System.out.println("Finalizado e Veja o Resultado");
            }

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void txtMinutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtMinutoComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMinutoComponentShown

    private void txtMinutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtMinutoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutoAncestorAdded

    private void txtMinutoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMinutoPropertyChange
      
    }//GEN-LAST:event_txtMinutoPropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here
        tempo.start();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        tempo.stop();
        String pegarEmail = CaixaParaEmail.getText();
        ResultadoDificilTela.CaixaParaEmail.setText(pegarEmail);
        
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestoesDificeisTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CaixaParaEmail;
    public static javax.swing.JLabel Enunciado;
    public static javax.swing.JLabel Enunciado2;
    private javax.swing.JLabel EscritaPontuacao;
    private javax.swing.JLabel EscritaTempo;
    private javax.swing.JLabel LogoDiscite;
    private javax.swing.JLabel NomeDificuldade;
    public static javax.swing.JLabel NumeroPontuacao;
    private javax.swing.JLabel NumeroQuestao;
    private javax.swing.JLabel Questao_DificuldadeDificil;
    private javax.swing.JLabel TermoDiscite;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel txtMinuto;
    public static javax.swing.JLabel txtSegundo;
    // End of variables declaration//GEN-END:variables

}
