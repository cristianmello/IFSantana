import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que ejercicio quiere ejecutar: 1 o 2? ");
        int ejercicio = scanner.nextInt();
        if (ejercicio == 1) {
            ej1 ej1 = new ej1();
            ej1.getNome();
            ej1.getEmail();
            ej1.getTelefone();
            ej1.exibeDatos();

        } else if (ejercicio == 2) {
            ej2 ej2 = new ej2();
            ej2.ejercicio2();
        }
    }
}
