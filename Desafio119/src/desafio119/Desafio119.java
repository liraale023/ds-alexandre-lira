package desafio119;
import java.util.Date;
public class Desafio119 {

    public static void main(String[] args) {

    Aluno aluno = new Aluno("Ana Luiza Marques", "335.990.000.31", new Date(), "A001");
    Professor professor = new Professor("Najara Gabriela", "900.023.321-88", new Date(), 7250.00, "Desenvolvimento de Sistemas");
    Funcionario funcionario = new Funcionario("Carolina Lopes", "431.222.387-00", new Date(), 1500.00, "Tia da Limpeza", new Date());
        
    System.out.println("Aluno: " + aluno.getNome() + " ; Valor gasto: " + aluno.tirarCopias(100));
    System.out.println("Professor: " + professor.getNome() + " ; Valor gasto: " + professor.tirarCopias(100));
    System.out.println("Funcionario: " + funcionario.getNome() + " ; Valor gasto: " + funcionario.tirarCopias(100));
    }

}


