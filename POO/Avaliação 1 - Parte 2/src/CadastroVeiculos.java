public class CadastroVeiculos extends CadastroPropietarios {

    protected String placa, cor;
    protected int ano;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String consultaMultasPlaca(String placa, String multa) {
        return "\nPlaca: " + placa + " a cometido una multa " + multa + "\n";

    }
}