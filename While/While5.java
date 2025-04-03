/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while5;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class While5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[10];

        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = entrada.nextInt();
        }


        int mn1 = nums[0];
        int mn2 = nums[1];


        if (mn2 > mn1) {
            int temp = mn1;
            mn1 = mn2;
            mn2 = temp;
        }


        for (int i = 2; i < 10; i++) {
            if (nums[i] > mn1) {
                mn2 = mn1;
                mn1 = nums[i];
            } else if (nums[i] > mn2 && nums[i] != mn1) {
                mn2 = nums[i];
            }
        }

        if (mn1 == mn2) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os dois numeros maiores sao: " + mn1 + " e " + mn2);
        }

        
    }
}

    