import java.util.*;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String frase = "";
        System.out.println("Escriba una frase:");
        frase = input.nextLine();
 
        if (frase.equals("Rivera") || frase.equals("Livramento")){
            System.out.println("Conteúdo impróprio - Informe Fronteira");
        } else {
            System.out.println(frase.toUpperCase());
        }
    }
}
