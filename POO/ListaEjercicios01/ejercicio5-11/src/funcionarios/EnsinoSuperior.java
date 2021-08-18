package funcionarios;

public class EnsinoSuperior extends EnsinoMedio {

    private String universidade;

    public EnsinoSuperior(String nome, String codigoFuncional, String cargo, String escola, String universidade) {
        super(nome, codigoFuncional, cargo, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String showData() {
        return "Nombre: " + nome + " codigo funcional: " + codigoFuncional + " Escuela: " + escola + " universidad: "
                + universidade + ", renta total:" + ((int) (getRentaBasica() * 2) + getComision()) + "\n";
    }
}
