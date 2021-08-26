import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio {
    public static void main(String[] args) throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        String Nome, Telefone, Email, TipoDeConta, MessageStatus = "";
        int Documento = 0, numCuenta, AccionRealizada;
        double Saldo, Deposito = 0;
        boolean Status;

        System.out.print("Ingrese su nombre: ");
        Nome = input.nextLine();
        System.out.print("Ingrese su número de telefono: ");
        Telefone = input.nextLine();
        System.out.print("Ingrese su email: ");
        Email = input.nextLine();
        System.out.print("Ingrese su tipo de cuenta(Poupança ou Corrente): ");
        TipoDeConta = input.nextLine();

        boolean x = false;

        while (x == false) {
            try {
                System.out.print("introduzca su cédula o RG: ");
                Documento = new Scanner(System.in).nextInt();
                x = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero");
            }
        }
        x = false;
        while (x == false) {
            try {
                System.out.print("Ingrese su deposito inicial: ");
                Deposito = new Scanner(System.in).nextDouble();
                x = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar solamente números");
            }
        }
        x = false;
        while (x == false) {
            try {
                System.out.println("Ingrese true si esta actívo o false si su status es desactivo: ");
                Status = new Scanner(System.in).nextBoolean();
                x = true;
                if (Status) {
                    MessageStatus = "Status Activo";
                } else {
                    MessageStatus = "Status desactivo";
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar true o false");
            }
        }

        System.out.println();

        numCuenta = (int) (Math.random() * 900 + 100);
        System.out.println("Los datos de su cuenta bancaria número " + numCuenta + " son: ");
        System.out.println("Nombre:" + Nome);
        System.out.println("Telefono:" + Telefone);
        System.out.println("Email:" + Email);
        System.out.println("Tipo de cuenta:" + TipoDeConta);
        System.out.println("Documento:" + Documento);
        System.out.println("Deposito inicial: " + Deposito);
        System.out.println("Status:" + MessageStatus);

        System.out.println();

        System.out.println("Que accion quiere realizar? ");
        System.out.println("1- Retirar saldo");
        System.out.println("2- Depositar saldo");
        System.out.println("3- Imprimir saldo");
        System.out.println("4- Transferir saldo");
        System.out.println("5- Realizar pagamiento por boleto");
        System.out.println("6- finalizar programa");
        System.out.println();

        AccionRealizada = input.nextInt();

        while (AccionRealizada != 6) {

            switch (AccionRealizada) {
            case 1:
                x = false;

                while (x == false) {
                    try {
                        System.out.print("Ingrese el saldo a retirar: ");
                        Saldo = new Scanner(System.in).nextDouble();
                        x = true;
                        if (Deposito - Saldo <= 0) {
                            Deposito = 0;
                            System.out.println("No tiene saldo disponible para retirar");
                        } else {
                            Deposito -= Saldo;
                            System.out.println();
                            System.out.println("La accion ha sido realizada con exito!");
                        }

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }

                break;
            case 2:
                x = false;

                while (x == false) {
                    try {
                        System.out.print("Ingrese el saldo a depositar: ");
                        Saldo = new Scanner(System.in).nextDouble();
                        x = true;
                        Deposito += Saldo;
                        System.out.println();
                        System.out.println("La accion ha sido realizada con exito!");
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }
                break;
            case 3:
                System.out.println("Su saldo es: " + Deposito);
                break;

            case 4:
                x = false;

                while (x == false) {
                    try {
                        System.out.println("Ingresar el número de cuenta destinataria: ");
                        int cuentaDestinataria = new Scanner(System.in).nextInt();
                        System.out.println("Ingrese el saldo a depositar en la cuenta: ");
                        Saldo = new Scanner(System.in).nextDouble();
                        x = true;
                        if (Deposito - Saldo <= 0) {
                            Deposito = 0;
                            System.out.println("No tiene saldo disponible para realizar la transacción");
                            System.out.println();
                        } else {
                            Deposito -= Saldo;
                            System.out.println("La accion ha sido realizada con exito!");
                            System.out.println();
                        }

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }
                break;
            case 5:
                x = false;

                while (x == false) {
                    try {
                        System.out.println("Ingrese el numero de boleto: ");
                        Saldo = new Scanner(System.in).nextDouble();
                        x = true;
                        if (Deposito - Saldo <= 0) {
                            Deposito = 0;
                            System.out.println("No tiene saldo disponible para retirar");
                        } else {
                            Deposito -= Saldo;
                            System.out.println("La accion ha sido realizada con exito!");
                        }

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }

                break;

            }

            System.out.println();
            System.out.println("Que accion quiere realizar? ");
            System.out.println("1- Retirar saldo");
            System.out.println("2- Depositar saldo");
            System.out.println("3- Imprimir saldo");
            System.out.println("4- Transferir saldo");
            System.out.println("5- Realizar pagamiento por boleto");
            System.out.println("6- Finalizar programa");
            System.out.println();

            AccionRealizada = input.nextInt();

        }

        System.out.println("El programa ha sido finalizado");

    }
}
