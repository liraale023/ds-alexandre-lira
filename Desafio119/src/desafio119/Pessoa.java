package desafio119;

import java.util.Date;

public class Pessoa{
    public String nome;
    public String cpf;
    public Date datanasc;

    public Pessoa(String nome, String cpf, Date datanasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
    }

    public double tirarCopias(int qtd) {
        return 0.10 * qtd;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDatanasc() {
        return datanasc;
    }
}

