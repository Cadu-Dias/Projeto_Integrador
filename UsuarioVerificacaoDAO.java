/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UsuarioVerificacaoDAO {
    
    
    public boolean existe (UsuarioVerificacao ObjetoUsuario2)throws Exception{
        //Especificar o comando
        String sql = "Select * from login where email = ?";
        //Abrir um conexao com o MySql
        Connection conexao = ConnectionFactoryLogin.getConnection();
        //Preparar conexao
        PreparedStatement ps = conexao.prepareStatement(sql);
        //Substituir os placeholders (?)
        
        ps.setString(1, ObjetoUsuario2.getEmail());
        
        //Executar
        ResultSet rs = ps.executeQuery();
        boolean usuarioExiste = rs.next();
        //Fechar os recursos
        rs.close();
        ps.close();
        conexao.close();
        return usuarioExiste;
    }     
}