/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java03atividade43java.java;
import javax.swing.JOptionPane;
/**
 *
 * @author Nathany
 */
public class Java03atividade43JavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float num, logaritmo;
        String s;
        
        s = JOptionPane.showInputDialog("Entre com o logaritmo: ");
        num = Float.parseFloat (s);
        
        logaritmo = (float) (Math.log(num)/ Math.log(10));
        System.out.println("Logaritmo: " +logaritmo);
    }
    
}
