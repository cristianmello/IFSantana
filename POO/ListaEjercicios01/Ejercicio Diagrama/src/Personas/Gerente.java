package Personas;

import java.util.Date;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Date nascimiento, int salario, String area) {
        super(nome, nascimiento, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public int calcularImposto() {
        int impuesto = (int) 0.05 * salario;
        return impuesto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nombre del Funcionario:" + nome + "\nNascimiento del cliente:" + nascimiento
                + "\nSalario del funcionario:" + (salario - calcularImposto()) + "R$\nArea de trabajo: "+ area);
    }

}
