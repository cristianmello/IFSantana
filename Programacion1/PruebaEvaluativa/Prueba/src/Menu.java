import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean finalizar = false, x = false;

        while (finalizar == false) {

            System.out.println("Menu(Ingrese un numero)");
            System.out.println();
            System.out.println("1-Banco");
            System.out.println("2-Codificador");
            System.out.println("3-Finalizar");

            int option = input.nextInt();
            x = false;
            switch (option) {
            case 1:
                while (x == false) {
                    try {
                        System.out.println("Ingrese el número de clientes: ");
                        int clientes = new Scanner(System.in).nextInt();
                        x = true;
                        Banco obj3 = new Banco(clientes);
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números enteros");
                    }
                }

                break;

            case 2:
                Codificador.codificar();
                break;

            case 3:
                finalizar = true;
                break;
            }
        }
    }
}
