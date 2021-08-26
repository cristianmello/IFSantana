import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String frase = "";
		String aux;
		char auxc;
		String fin = "exit";
		System.out.println("ingrese frase ");
		frase = input.nextLine();
		while (!frase.equalsIgnoreCase(fin)) {
			aux = frase.substring(1);
			auxc = frase.charAt(0);
			System.out.println("frase modificada :" + aux + auxc + "ay");
			System.out.println("ingrese nueva frase ");
			frase = input.nextLine();
		}
		System.out.println("su pograma a finalizado");
	}
}