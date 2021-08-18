package funcionarios;

public class EnsinoMedio extends EnsinoBasico {

    public EnsinoMedio(String nome, String codigoFuncional, String cargo, String escola) {
        super(nome, codigoFuncional, cargo, escola);
    }

    @Override
    public String showData() {
        return "Nombre: " + nome + ", codigo funcional: " + codigoFuncional + ", escuela: " + escola + ", renta total:"
                + ((int) (getRentaBasica() + 0.5 * getRentaBasica() + getComision())) + " \n";
    }
}
