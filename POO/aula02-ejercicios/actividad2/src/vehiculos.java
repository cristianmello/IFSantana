public class vehiculos {
    private String placa;
    private String chassi;
    private String cor;
    private String defeito;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getdefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPlaca: ");
        sb.append(placa);
        sb.append("\nChassi: ");
        sb.append(chassi);
        sb.append("\nCor: ");   
        sb.append(cor);
        sb.append("\nDefeito: ");
        sb.append(defeito);
        return sb.toString();
    }

}
