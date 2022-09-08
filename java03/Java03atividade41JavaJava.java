/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java03atividade41java.java;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathany
 */
public class Java03atividade41JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int a, b, c, d, mp;
        String s;
        
        s = JOptionPane.showInputDialog ("Entre com 1 numero: ");
        a = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 2 numeros: ");
        b = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 3 numeros: ");
        c = (int) Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Entre com 4 numeros: ");
        d = (int) Float.parseFloat(s);
        
        mp = (a*1 + b*2 + c*3 + d*4)/10;
        System.out.println("Media Emponderada: " +mp);
    }
    
}
