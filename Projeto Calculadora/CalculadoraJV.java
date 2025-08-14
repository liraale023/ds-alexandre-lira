import java.util.Scanner;

public class CalculadoraJV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Operacoes basicas");
            System.out.println("2 - Calcular uma raiz quadrada qualquer");
            System.out.println("3 - Descobrir seu signo");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcao) {
                case 1:
                    Basicas(scanner);
                    break;
                case 2:
                    Raiz(scanner);
                    break;
                case 3:
                    Signo(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }

        } while(opcao != 0);

        scanner.close();
    }

    public static void Basicas(Scanner scanner) {
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha algum dos operadores basicos: +, -, *, /");
        char op = scanner.next().charAt(0);

        double resultado;

        switch(op) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Não se pode dividir por 0.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }
    }

    public static void Raiz(Scanner scanner) {
        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Numero negativo não possui raiz.");
        } else {
            double raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada de " + num + " e " + raiz);
        }
    }

    public static void Signo(Scanner scanner) {
        System.out.print("Digite o dia (de 1 a 31): ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mes (de 1 a 12): ");
        int mes = scanner.nextInt();

        String signo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gemeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cancer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leao";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpiao";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else {
            signo = "Essa data não existe, logo não temos como descobrir seu signo dos zodíaco.";
        }

        System.out.println("Seu signo: " + signo);
    }
}
