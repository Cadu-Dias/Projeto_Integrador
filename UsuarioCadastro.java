/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author cadub
 */
public class UsuarioCadastro {
    private String nome;
    private String senha;
    private String email;
    private int pontuacaoTotal;

   
    public void UsuarioCadastro (String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
     public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }
    
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
}

