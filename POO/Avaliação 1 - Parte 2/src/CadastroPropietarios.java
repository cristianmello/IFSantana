import java.util.ArrayList;

public class CadastroPropietarios {

    protected String tipo, nomePropietario, cpf, cnpj, placaProp;
    protected static ArrayList<CadastroPropietarios> listaVehiculos = new ArrayList<CadastroPropietarios>();

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setNome(String nomePropietario) {
        this.nomePropietario = nomePropietario;
    }

    public String getNome() {
        return nomePropietario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setPlacaProp(String placaProp) {
        this.placaProp = placaProp;
    }

    public String getPlacaProp() {
        return placaProp;
    }
    public String comprarVeiculo(String nomePropietario, String placaVehiculo){
        return "\n" + nomePropietario + ", usted a comprado con exito el vehiculo de placa: " + placaVehiculo + "\n";
    }

    public String venderVehiculo(String nomePropietario, String placaVehiculo){
        return nomePropietario + ", usted a vendido con exito el vehiculo de placa: " + placaVehiculo;
    }
}
