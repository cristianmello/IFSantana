package funcionarios;

public class Funcionario {
    protected String nome, codigoFuncional, cargo;

    protected int rentaBasica;
    public int gastosEscolaridad;
    protected int comision;

    public Funcionario(String nome, String codigoFuncional, String cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setRentaBasica(int rentaBasica) {
        this.rentaBasica = rentaBasica;
    }

    public int getRentaBasica() {
        return rentaBasica;
    }

    public void setGastosEscolaridad(int gastosEscolaridad) {
        this.gastosEscolaridad = gastosEscolaridad;
    }

    public int getGastosEscolaridad() {
        return gastosEscolaridad;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getComision() {
        return comision;
    }

    public String showData() {
        return null;
    }

}
