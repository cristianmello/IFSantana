package Personas;

import java.util.Date;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Date nascimiento, int codigo) {
        super(nome, nascimiento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nombre del cliente:" + nome + "\nNascimiento del cliente:" + nascimiento
                + "\nCódigo del cliente: #" + codigo);
    }

}
