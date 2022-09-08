/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java03atividade25java.java;
import static javax.management.Query.div;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathany
 */
public class Java03atividade25JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int data, dia, mes, ano;
         String s;
        
        
        s = JOptionPane.showInputDialog("Digite a data no formato DDMMAA: ");
        data = (int) Float.parseFloat(s);
        
        dia = data / 10000;
        System.out.println("Dia:.."+dia);
        
        mes = data %10000 / 100;
        System.out.println("Mes:.."+mes);
        
        ano = data % 100;
        System.out.println("Ano:.."+ano);
      
    }
    
}
