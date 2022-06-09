/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo;

public class Usuario {

    private String nome;
    private String senha;
    private String email;
    private int pontuacaoTotal;

    public  Usuario(String nome, String email, String senha) {

        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    public Usuario(String email, String senha) {
       
        this.email = email;
        this.senha = senha;
        
    }

    public Usuario(String nome, String senha, String email, int pontuacaoTotal) {
        
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.pontuacaoTotal = pontuacaoTotal;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
