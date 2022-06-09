/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Jogo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionFactory {
   
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "ProjetoPi";
    private static String usuario = "root";
    private static String senha = "Ca864263";
    
    //clausula catch or declare
    public static Connection getConnection() throws Exception{
        //jdbc:mysql//localhost:3306//20221_maua_poo_turmaA_sistema_academico?useTimezOne=true&serverTimezone=UTC
        String stringDeConexao = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", host, port, db);
        Connection c = DriverManager.getConnection(stringDeConexao, usuario, senha); 
       
        return c;
    }
    public static void main (String [] args) {
        
        try{
        Connection teste = ConnectionFactory.getConnection();
            JOptionPane.showMessageDialog(null, "Conexão OK!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exceção: " + e.getMessage());
        }
        
    }
}
