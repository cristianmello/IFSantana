package Personas;

import java.util.Date;

public abstract class Pessoa {

    protected String nome;
    protected Date nascimiento;

    public Pessoa(String nome, Date nascimiento) {
        this.nome = nome;
        this.nascimiento = nascimiento;
    }

    public String getNome() {
        return nome;
    }

    public Date getNascimiento() {
        return nascimiento;
    }

    public abstract void imprimeDados();

}
