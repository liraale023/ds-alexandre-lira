/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while8;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class WHILE8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        if (lado < 1 || lado > 20) {
            System.out.println("O tamanho deve estar entre 1 e 20.");
        } else {
            for (int i = 0; i < lado; i++) {
                for (int a = 0; a < lado; a++) {
                    if (i == 0 || i == lado - 1 || a == 0 || a == lado - 1 ){
                    System.out.print("*");
                } else {
                System.out.print(" ");
            }
           }
                System.out.println();
            }
        }
        scanner.close();
    }
        }
    }
    
}
