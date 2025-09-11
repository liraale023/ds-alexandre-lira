package desafio119;

import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;
    public String cargo;
    public Date dataadmissao;

    public Funcionario (String nome, String cpf, Date datanasc, double salario, String cargo, Date dataadmissao) {
        super(nome, cpf, datanasc);
        this.salario = salario;
        this.cargo = cargo;
        this.dataadmissao = dataadmissao;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * qtd;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getDataadmissao() {
        return dataadmissao;
    }
}
