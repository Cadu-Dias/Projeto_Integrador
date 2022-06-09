/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UsuarioDAO {
    
    
    public boolean existe (Usuario usuario)throws Exception{
        //Especificar o comando
        String sql = "Select * from login where email = ? AND senha = ?";
        //Abrir um conexao com o MySql
        Connection conexao = ConnectionFactory.getConnection();
        //Preparar conexao
        PreparedStatement ps = conexao.prepareStatement(sql);
        //Substituir os placeholders (?)
        
        ps.setString(1, usuario.getEmail());
        ps.setString(2, usuario.getSenha());
        //Executar
        ResultSet rs = ps.executeQuery();
        boolean usuarioExiste = rs.next();
        
        if (usuarioExiste){
            UsuarioLogado.usuario = usuario;
            UsuarioLogado.usuario.setPontuacaoTotal(rs.getInt("pontuacaoTotal"));
            
        }
        //Fechar os recursos
        rs.close();
        ps.close();
        conexao.close();
        return usuarioExiste;
    }     
}

