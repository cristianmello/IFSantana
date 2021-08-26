import java.util.*;
public class ejercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String cadena = "";
        String cadenaInvertida = "";

        System.out.println("Ingrese una frase cualquiera: ");
        cadena = input.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {

            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida.replaceAll("\\s",""));

    }
}
