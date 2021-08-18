import java.util.Scanner;

public class ej2 {

    public void ejercicio2() {

        Scanner scanner = new Scanner(System.in);
        int result;
        boolean x = true;
        int option;

        while (x) {

            System.out.println("Ingrese el primer número:");
            int n1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número:");
            int n2 = scanner.nextInt();

            while (x) {
                System.out.println("Qué operación quiere realizar: 1.Suma; 2.Resta; 3.Multiplicación; 4.Division");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        result = n1 + n2;
                        System.out.println("El resultado es: " + result);

                        System.out.println("Desea realizar otra operación aritmética con los mismos datos? 1.Si;2.No");
                        option = new Scanner(System.in).nextInt();
                        if (option == 1)
                            x = true;
                        else if (option == 2)
                            x = false;
                        break;

                    case 2:
                        result = n1 - n2;
                        System.out.println("El resultado es: " + result);

                        System.out.println("Desea realizar otra operación aritmética con los mismos datos? 1.Si;2.No");
                        option = new Scanner(System.in).nextInt();
                        if (option == 1)
                            x = true;
                        else if (option == 2)
                            x = false;
                        break;

                    case 3:
                        result = n1 * n2;
                        System.out.println("El resultado es: " + result);

                        System.out.println("Desea realizar otra operación aritmética con los mismos datos? 1.Si;2.No");
                        option = new Scanner(System.in).nextInt();
                        if (option == 1)
                            x = true;
                        else if (option == 2)
                            x = false;
                        break;
                        
                    case 4:
                        result = n1 / n2;
                        System.out.println("El resultado es: " + result);

                        System.out.println("Desea realizar otra operación aritmética con los mismos datos? 1.Si;2.No");
                        option = new Scanner(System.in).nextInt();
                        if (option == 1)
                            x = true;
                        else if (option == 2)
                            x = false;
                        break;

                }
            }

            System.out.println("Quiere realizar una operacion con otros datos? 1.Si;2.No");
            option = new Scanner(System.in).nextInt();
            if (option == 1)
                x = true;
            else if (option == 2)
                x = false;

        }
    }
}
