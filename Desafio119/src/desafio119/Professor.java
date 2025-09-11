package desafio119;

import java.util.Date;

public class Professor extends Pessoa {
    public String disciplina;
    public double salario;

    public Professor (String nome, String cpf, Date datanasc, String disciplina, double salario) {
        super(nome, cpf, datanasc);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * qtd;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }
}