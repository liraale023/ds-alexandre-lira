/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while6;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class WHILE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = entrada.nextInt();
        }

        int maiorn = nums[0];

        for (int numero : nums) {
            if (numero > maiorn) { 
                maiorn = numero;
            }
        }

        System.out.println("O maior numero e: " + maiorn);
        entrada.close();
    }
    
}
