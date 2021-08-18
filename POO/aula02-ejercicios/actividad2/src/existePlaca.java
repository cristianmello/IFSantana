public class existePlaca {
    String placa;

    public existePlaca(String placa) {

        String placaBus = placa;
        int pos = -1; // No lo encuentra
        for (int i = 0; i < acciones.vehiculo.size(); i++) {
            if (acciones.vehiculo.get(i).getPlaca().equals(placaBus)) {
                pos = i;
            }
        }
        if (pos != -1) {
            System.out.println("El vehiculo con la placa: " + placa + " existe");
        } else {
            System.out.println("El vehiculo con la placa: " + placa + " no existe");
        }
    }
}
