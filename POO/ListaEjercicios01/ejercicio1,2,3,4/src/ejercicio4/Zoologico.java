package ejercicio4;

import java.util.Arrays;

import ejercicio2.Animal;
import ejercicio2.Cachorro;
import ejercicio2.Cavalo;
import ejercicio2.Preguica;

public class Zoologico {
    public void jaula() {

        Animal misAnimales[] = new Animal[10];

        misAnimales[0] = new Cachorro("Correr", "Cachorro 1", 7);
        misAnimales[1] = new Cavalo("Correr", "Cavalo 1", 8);
        misAnimales[2] = new Preguica("Escalar Arbol", "Preguica1 ", 9);
        misAnimales[3] = new Cachorro("Correr", "Cachorro 2", 10);
        misAnimales[4] = new Cavalo("Correr", "Cavalo 2", 11);
        misAnimales[5] = new Preguica("Escalar Arbol", "Preguica 2", 12);
        misAnimales[6] = new Cachorro("Correr", "Cachorro 3", 13);
        misAnimales[7] = new Cavalo("Correr", "Cavalo 3", 14);
        misAnimales[8] = new Preguica("Escalar Arbol", "Preguica 3", 15);
        misAnimales[9] = new Cachorro("Correr", "Cachorro 4", 16);

        for (Animal animal : misAnimales) {
            System.out.print(animal.emiteSom());
            if (animal.getNome().contains("Cachorro")) {
                    System.out.println("Perro corriendo!!!\n");
            }
            if (animal.getNome().contains("Cavalo")) {
                System.out.println("Cavalo corriendo!!!\n");
            } else {
                System.out.println("");
            }
        }
    }

}
