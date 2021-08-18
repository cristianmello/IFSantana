import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        int option = 0;
        acciones obj1 = new acciones();

        while (x) {
            System.out.println();
            System.out.println("1.Ingresar vechiculo");
            System.out.println("2.Retirar vechiculo");
            System.out.println("3.Listar vehiculos");
            System.out.println("4.Existe placa?");
            System.out.println("5.Finzalizar programa");
            System.out.println();
            while (x) {
                try {
                    System.out.println("Ingrese un valor: ");
                    option = new Scanner(System.in).nextInt();
                    x = false;
                } catch (Exception e) {
                    System.out.println("Debe ingresar una numero");
                }

            }

            x = true;
            switch (option) {
                case 1:
                    obj1.adicionarVehiculo();
                    break;
                case 2:
                    System.out.println("Ingrese la placa para retirar su vehiculo:");
                    String placa = new Scanner(System.in).nextLine();
                    obj1.removerVehiculo(placa);
                    break;
                case 3:
                    obj1.mostrarVehiculos();
                    break;
                case 4:
                    System.out.println("Ingrese la placa para verificar si se encuentra:");
                    placa = new Scanner(System.in).nextLine();
                    existePlaca obj2 = new existePlaca(placa);

                    break;
                case 5:
                    x = false;
                    break;
            }
        }

    }
}
