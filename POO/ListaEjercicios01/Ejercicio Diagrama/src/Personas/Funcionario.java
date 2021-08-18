package Personas;

import java.util.Date;

public class Funcionario extends Pessoa {
    protected int salario;

    public Funcionario(String nome, Date nascimiento, int salario) {
        super(nome, nascimiento);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public int calcularImposto() {
        int impuesto = (int) (0.03 * getSalario());
        return impuesto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nombre del Funcionario:" + nome + "\nNascimiento del cliente:" + nascimiento
                + "\nSalario del funcionario:" + (salario - calcularImposto()) + "R$");
    }

}
