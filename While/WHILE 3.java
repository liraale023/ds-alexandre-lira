/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile.pkg3;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class WHILE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner (System.in);
         System.out.println("Selecione um numero: ");
         int n1 = entrada.nextInt();
             System.out.println("Esses sao os numeros impares de 1 ate o escolhido: ");
         for (int i = 1; i <= n1; i ++){
                 if (i % 2 != 0){
                     System.out.println(i);
                 }
             }
         
         System.out.println();
         System.out.println("Esses sao os numeros pares de 1 ate o escolhido");
         for (int p = 1; p <= n1; p++){
                 if (p % 2 == 0){
                     System.out.println(p);
    }
    
}
    }
}