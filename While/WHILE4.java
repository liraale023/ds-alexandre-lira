/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile.pkg4;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class WHILE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
         System.out.println("Insira quantos alunos tem na sala: ");
         int alunos = entrada.nextInt();
         
         double somaNotas = 0;
         int contador = 0;
         
         while (contador < alunos) {
             System.out.println("Digite a nota: " + (contador + 1) + ": ");
             double nota = scanner.nextDouble();
             somaNotas += nota;
             contador++;
         }
         
         double media = somaNotas / alunos;
         System.out.println("A media da turma e igual a: " + media);
         
         
    }
    
}
