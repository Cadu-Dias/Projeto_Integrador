/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Jogo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UsuarioCadastroDAO {
    
    
    public void cadastrar (Usuario usuario)throws Exception{
        //Especificar o comando
        String sql = "Insert into login (nome, senha, email) values (?, ?, ?)";
        //Abrir um conexao com o MySql
        Connection conexao = ConnectionFactory.getConnection();
        //Preparar conexao
        PreparedStatement ps = conexao.prepareStatement(sql);
        //Substituir os placeholders (?)
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
        ps.setString(3, usuario.getEmail());
        
        //Executar
        
        ps.execute();
        
            
        UsuarioLogado.usuario = usuario;
        UsuarioLogado.usuario.setPontuacaoTotal(0);
            
        
        //Fec
        
        //Fechar os recursos
        
        ps.close();
        conexao.close();
        
    }     
}
