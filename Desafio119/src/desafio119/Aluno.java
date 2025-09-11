package desafio119;

import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date datanasc, String matricula) {
        super(nome, cpf, datanasc);
        this.matricula = matricula;
    }

    public double tirarCopias(int qtd) {
        return 0.07 * qtd;
    }

    public String getMatricula() {
        return matricula;
    }
}

