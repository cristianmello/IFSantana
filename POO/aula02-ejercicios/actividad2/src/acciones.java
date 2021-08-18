import java.util.ArrayList;
import java.util.Scanner;

public class acciones {

    Scanner scanner = new Scanner(System.in);
    private String placa;
    private String chassi;
    private String cor;
    private String defeito;

    static ArrayList<vehiculos> vehiculo = new ArrayList<vehiculos>();

    public void adicionarVehiculo() {
        int i, n;
        vehiculos aux;

        do {
            System.out.print("Cuántos vehiculos quiere ingresar? ");
            n = scanner.nextInt();
        } while (n < 0);
        scanner.nextLine();
        for (i = 1; i <= n; i++) {
            // leer datos de cada coche
            System.out.println("Coche " + i);
            System.out.print("Placa: ");
            placa = scanner.nextLine();
            System.out.print("Chassi: ");
            chassi = scanner.nextLine();
            System.out.print("Cor: ");
            cor = scanner.nextLine();
            System.out.print("Defeito: ");
            defeito = scanner.nextLine();

            aux = new vehiculos();

            aux.setPlaca(placa);
            aux.setChassi(chassi);
            aux.setCor(cor);
            aux.setDefeito(defeito);

            vehiculo.add(aux);
        }
    }


    public void mostrarVehiculos() {
        for (int i = 0; i < vehiculo.size(); i++)
            System.out.println(vehiculo.get(i));
    }

    public void removerVehiculo(String placa) {
        String placaBus = placa;
        int pos = -1; // No lo encuentra
        for (int i = 0; i < vehiculo.size(); i++) {
            if (vehiculo.get(i).getPlaca().equals(placaBus)) {
                pos = i;
            }
        }
        if (pos != -1) {
            vehiculo.remove(pos);
            System.out.println("El vehiculo con la placa: " + placa + "se ha retirado");
        } else {
            System.out.println("El vehiculo con la placa: " + placa + "no ha ingresado");
        }
    }

}

