/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Jogo;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class QuestoesDAODificil {
    
    
    public List <Pergunta> obterPerguntas () throws Exception{
        
       
        
            List <Pergunta> perguntas = new ArrayList <>();
   
            //1. abrir uma conexao com o banco
            Connection conexao = ConnectionFactory.getConnection();
            //2. Executar o comando SELECT com join
            String sql = "select * from perguntas, respostas where perguntas.idPergunta = respostas.idPergunta and exists (select * from perguntas where idResposta Like \"%RD%\") ";
            //3. Tratar o resultado que estara dentro de um ResultSet...
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            
            ResultSet rs = ps.executeQuery();
            
            List <String> letras = Arrays.asList(new String []{"A", "B", "C", "D", "E"});
            Collections.shuffle(letras);
            
            while (rs.next()){

                Pergunta p = new Pergunta();

                p.setEnunciado(rs.getString("Pergunta"));
                p.setAlternativaA(rs.getString("Resp" + letras.get(0)));
                p.setAlternativaB(rs.getString("Resp" + letras.get(1)));
                p.setAlternativaC(rs.getString("Resp" + letras.get(2)));
                p.setAlternativaD(rs.getString("Resp" + letras.get(3)));
                p.setAlternativaE(rs.getString("Resp" + letras.get(4)));
                p.setRespostaCorreta(rs.getString("RespCorreta"));

                perguntas.add(p);
                
               
            }
        
            return perguntas;     
    }    
}

