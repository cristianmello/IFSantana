import java.time.LocalDate;

public class CadastroConductor extends CadastroVeiculos {

    protected String nomeConductor, tipoHabilitacao;
    protected LocalDate dataNascimiento;

    public CadastroConductor(String nomeConductor, String tipoHabilitacao, LocalDate dataNascimiento) {
        this.nomeConductor = nomeConductor;
        this.tipoHabilitacao = tipoHabilitacao;
        this.dataNascimiento = dataNascimiento;
    }

    public String getNome() {
        return nomeConductor;
    }

    public String getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public LocalDate getDataNascimineto() {
        return dataNascimiento;
    }

    public String consultaPuntuacaoMulta(String nombrePunt, String placaPunt, int puntuacion) {
        return "El conductor de nombre: " + nombrePunt + " ha sido multado con el vehiculo de placa:" + placaPunt + ""
                + ", con una puntuacion de multa de:" + puntuacion;
    }
}
