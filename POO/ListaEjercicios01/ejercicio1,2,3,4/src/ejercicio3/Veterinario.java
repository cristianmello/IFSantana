package ejercicio3;

import java.util.Scanner;

import ejercicio2.Animal;
import ejercicio2.Cachorro;
import ejercicio2.Cavalo;
import ejercicio2.Preguica;

public class Veterinario {
    public void examinar(String animal) {
        Scanner scanner = new Scanner(System.in);

        if (animal.equalsIgnoreCase("Cavalo")) {
            System.out.println("Ingrese nombre del caballo a examinar:");
            String nomCavalo = scanner.nextLine();

            System.out.println("Ingrese la edad del caballo a examinar:");
            int idadeCavalo = scanner.nextInt();

            System.out.println("Seu " + animal + " fue examinado\n");

            Animal cavalo = new Cavalo("Corriendo", nomCavalo, idadeCavalo);
            System.out.println(cavalo.emiteSom());
        }

        if (animal.equalsIgnoreCase("Cachorro")) {

            System.out.println("Ingrese nombre del perro a examinar:");
            String nomCachorro = scanner.nextLine();

            System.out.println("Ingrese la edad del perro a examinar:");
            int idadeCachorro = scanner.nextInt();

            System.out.println("Seu " + animal + " fue examinado\n");

            Animal cachorro = new Cachorro("Corriendo", nomCachorro, idadeCachorro);
            System.out.println(cachorro.emiteSom());
        }

        if (animal.equalsIgnoreCase("Preguica")) {
            System.out.println("Ingrese nombre del oso perezoso a examinar:");
            String nomPreguica = scanner.nextLine();

            System.out.println("Ingrese la edad del oso perezoso a examinar:");
            int idadePreguica = scanner.nextInt();

            System.out.print("Seu " + animal + " fue examinado\n");

            Animal preguica = new Preguica("Escalando Arbol", nomPreguica, idadePreguica);
            System.out.println(preguica.emiteSom());
        }

    }
}
