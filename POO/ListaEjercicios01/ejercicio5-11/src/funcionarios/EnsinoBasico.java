package funcionarios;

public class EnsinoBasico extends Funcionario {

    protected String escola;

    public EnsinoBasico(String nome, String codigoFuncional, String cargo, String escola) {
        super(nome, codigoFuncional, cargo);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String showData() {
        return "Nombre: " + nome + ", codigo funcional: " + codigoFuncional + ", escuela: " + escola + ", renta total:"
                + ((int) (getRentaBasica() + 0.1 * getRentaBasica() + getComision()) + "\n");
    }

}
