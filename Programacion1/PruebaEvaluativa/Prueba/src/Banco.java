import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    public Banco(int clientes) {

        Scanner input = new Scanner(System.in);

        int cuenta[] = new int[clientes];
        String nombreCuenta[] = new String[clientes];
        int numCuenta, valorSaldo, cuentaDest, saldoCuenta[] = new int[clientes];
        boolean x = false;

        for (int i = 0; i < clientes; i++) {

            System.out.println("Cuenta " + i + ":");
            cuenta[i] = i;

            System.out.print("Ingrese su nombre: ");
            nombreCuenta[i] = input.nextLine();
            x = false;
            while (x == false) {
                try {
                    System.out.print("Ingrese su saldo: ");
                    saldoCuenta[i] = new Scanner(System.in).nextInt();
                    x = true;
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar un número entero");
                }
            }
            System.out.println();

        }

        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Transferir");
        System.out.println("4 - Imprimir 1 cuenta");
        System.out.println("5 - Imprimir todas las cuentas");
        System.out.println("6 - Finalizar");

        int opcion = input.nextInt();

        while (opcion != 6) {

            switch (opcion) {

            case 1:
                System.out.println("Ingrese el número de la cuenta a depositar: ");
                numCuenta = input.nextInt();
                System.out.println("Informe el valor:");
                valorSaldo = input.nextInt();
                saldoCuenta[numCuenta] += valorSaldo;
                System.out.println("Depositado!");

                break;

            case 2:
                System.out.println("Ingrese el número de la cuenta a retirar: ");
                numCuenta = input.nextInt();
                System.out.print("Ingrese el saldo a retirar: ");
                valorSaldo = input.nextInt();
                if (saldoCuenta[numCuenta] >= valorSaldo) {
                    saldoCuenta[numCuenta] -= valorSaldo;
                    System.out.println("Retirado!");
                } else {
                    System.out.println("El valor a retirar supera el saldo disponible de la cuenta");
                }

                break;

            case 3:
                if (clientes > 1) {

                    System.out.println("Ingrese el número de cuenta a retirar: ");
                    numCuenta = input.nextInt();
                    System.out.println("Ingrese el numero de cuenta a depositar:");
                    cuentaDest = input.nextInt();
                    if (numCuenta != cuentaDest) {
                        System.out.println("Ingrese el valor a transferir:");
                        valorSaldo = input.nextInt();

                        if (saldoCuenta[numCuenta] >= valorSaldo) {
                            saldoCuenta[numCuenta] -= valorSaldo;
                            saldoCuenta[cuentaDest] += valorSaldo;
                            System.out.println("Transferencia realizada con exito!!");
                        } else {
                            System.out.println("El valor a depositar supera el saldo disponible de la cuenta");
                        }
                    } else {
                        System.out.println("Los números de cuentas no pueden ser iguales");
                    }

                } else{
                    System.out.println("No se puede realizar una transferencia(Cantidad de cuentas menor a 2)");
                }
                break;

            case 4:
                System.out.println("Ingrese el número de cuenta:");
                numCuenta = input.nextInt();
                System.out.println("Cuenta " + cuenta[numCuenta] + ": " + nombreCuenta[numCuenta] + " - "
                        + saldoCuenta[numCuenta]);

                break;

            case 5:
                for (int i = 0; i < clientes; i++) {
                    System.out.println("Cuenta " + cuenta[i] + ": " + nombreCuenta[i] + " - " + saldoCuenta[i]);
                }
                break;

            }

            System.out.println();
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Imprimir 1 cuenta");
            System.out.println("5 - Imprimir todas las cuentas");
            System.out.println("6 - Finalizar");
            System.out.println();

            opcion = input.nextInt();
        }

        System.out.println("Programa finalizado");

    }
}
