import java.util.Scanner;

import ejercicio2.Animal;
import ejercicio2.Cachorro;
import ejercicio2.Cavalo;
import ejercicio2.Preguica;
import ejercicio3.Veterinario;
import ejercicio4.Zoologico;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 1;

        Animal misAnimales[] = new Animal[10];

        while (option != 5) {
            System.out.println("Que ejercicio quiere ejecutar? 2,3,4");
            System.out.println("Ingrese 5 si quiere finalizar el programa");

            int ejercicio = scanner.nextInt();

            switch (ejercicio) {
                case 2:
                    System.out.println("Ingrese nombre del caballo:");
                    String nomCavalo = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese edad del caballo:");
                    int idadeCavalo = new Scanner(System.in).nextInt();

                    misAnimales[0] = new Cavalo("Corriendo", nomCavalo, idadeCavalo);
                    System.out.println(misAnimales[0].emiteSom());
                    // --------------------------------------------------------------------------------------------
                    System.out.println("Ingrese nombre del perro:");
                    String nomCachorro = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese edad del perro:");
                    int idadeCachorro = new Scanner(System.in).nextInt();

                    misAnimales[1] = new Cachorro("Corriendo", nomCachorro, idadeCachorro);
                    System.out.println(misAnimales[1].emiteSom());
                    // --------------------------------------------------------------------------------------------
                    System.out.println("Ingrese nombre del oso peresoso:");
                    String nomPreguica = new Scanner(System.in).nextLine();

                    System.out.println("Ingrese edad del oso perezoso:");
                    int idadePreguica = new Scanner(System.in).nextInt();

                    misAnimales[2] = new Preguica("Escalando Arbol", nomPreguica, idadePreguica);
                    System.out.println(misAnimales[2].emiteSom());
                    // --------------------------------------------------------------------------------------------
                    break;
                case 3:
                    System.out.println("Qué animal quiere examinar? Cachorro, Cavalo, o Preguica");
                    String animal = new Scanner(System.in).nextLine();
                    Veterinario veterinario = new Veterinario();

                    if (animal.equalsIgnoreCase("Cachorro")) {
                        veterinario.examinar(animal);
                    } else if (animal.equalsIgnoreCase("Cavalo")) {
                        veterinario.examinar(animal);
                    } else if (animal.equalsIgnoreCase("Preguiza")) {
                        veterinario.examinar(animal);
                    } else {
                        System.out.println("Debe ingresar un animal válido");
                    }
                    break;
                case 4:
                    Zoologico zoologico = new Zoologico();
                    zoologico.jaula();
                    break;

                case 5:
                    option = 5;
                    break;

                default:
                    System.out.println("Ingrese un ejercicio válido");
                    break;
            }
        }

    }
}
