import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x = false;

        System.out.println("Menu(Ingrese un numero)");
        System.out.println();
        System.out.println("1-Piramide");
        System.out.println("2-Adivine el número");
        System.out.println("3-Clínica");
        System.out.println("4-Palíndromo");

        int opcion = input.nextInt();

        switch (opcion) {

        case 1:
            x = false;
            while (x == false) {
                try {
                    System.out.println("Ingrese el número de lineas de su piramide: ");
                    int lineas = new Scanner(System.in).nextInt();
                    Piramide obj = new Piramide(lineas);
                    x = true;

                    System.out.println();

                } catch (Exception e) {
                    System.out.println("Debe ingresar solamente números enteros");
                }
            }
            break;

        case 2:
            AdivineElNumero obj2 = new AdivineElNumero();
            break;

        case 3:
            x = false;
            while (x == false) {
                try {
                    System.out.println("Ingrese el número de pacientes: ");
                    int pacientes = new Scanner(System.in).nextInt();
                    x = true;
                    Clinica obj3 = new Clinica(pacientes);
                    System.out.println();

                } catch (Exception e) {
                    System.out.println("Debe ingresar solamente números enteros");
                }
            }

            break;

        case 4:
            Scanner teclado = new Scanner(System.in);
            String nuevo;
            Palindromo objclass = new Palindromo();
            System.out.println("Ingresa la palabra");
            nuevo = teclado.nextLine();
            if (objclass.palindromo(nuevo)) {
                System.out.println("Palindromo");
            } else {
                System.out.println("No Palindromo");
            }
            break;
        }
    }
}
