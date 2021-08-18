import java.time.LocalDate;

public class CadastroMultas extends CadastroConductor {

    LocalDate dataMulta;
    String tipoMulta, placaMultada, conductorMultado;

    public CadastroMultas(String nomeConductor, String tipoHabilitacao, LocalDate dataNascimiento, String placaMultada,
            String conductorMultado, String tipoMulta, LocalDate dataMulta) {
        super(nomeConductor, tipoHabilitacao, dataNascimiento);

        this.conductorMultado = conductorMultado;
        this.placaMultada = placaMultada;
        this.tipoMulta = tipoMulta;
        this.dataMulta = dataMulta;
    }
    
    public String getPlacaMultada() {
        return placaMultada;
    }

    public String getConductorMultado() { 
        return conductorMultado;
    }

    public String getTipoMulta() {
        return tipoMulta;
    }

    

    public LocalDate getDataMulta() {
        return dataMulta;
    }

    public String consultarInfracoes(String placaMultada, String conductorMultado, String tipoMulta, LocalDate fecha) {
        return "\nEl vehiculo con placa: " + placaMultada + " ha sido multado por el conductor de nombre: " + conductorMultado
                + " con una multa: " + tipoMulta + " en la fecha: " + fecha + "\n";
    }

}
