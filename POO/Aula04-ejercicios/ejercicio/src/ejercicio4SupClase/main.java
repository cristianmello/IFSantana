package ejercicio4SupClase;

import ejercicio4SupClase.buildLamp2;
import ejercicio4SupClase.lampara2;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            System.out.println("Qual tipo de lâmpada você deseja construir?\n");
            System.out.println("1 - Incandescente");
            System.out.println("2 - Fluorescente\n");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option==1)) {
                buildLamp2 obj1 = new buildLamp2();
                buildLamp2.incandescente obj2 = obj1.new incandescente();
                System.out.println(obj1.construir(obj2));
                b.ligar();
                b.desligar();
            } else if (option==2) {
                buildLamp2 a = new buildLamp2();
                buildLamp2.fluorescente b = a.new fluorescente();
                System.out.println(a.consturir(b));
                b.turnOn();
                b.turnOff();
            } else
                System.out.println("Debe ingresar 1 o 2");
        }

    }

}
