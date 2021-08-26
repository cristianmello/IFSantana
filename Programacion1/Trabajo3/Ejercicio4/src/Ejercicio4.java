import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String vagaPosicion[] = new String[10];
        int numero=0;


        while (numero != 4) {

            System.out.println("Elija una opcion: ");
            System.out.println("1 - Entrada");
            System.out.println("2 - Salida");
            System.out.println("3 - Listar situación actual");
            System.out.println("4 - salir");
            System.out.println("");
            numero = input.nextInt();

            switch (numero) {
            case 1:

                System.out.println("Ingrese número de vaga:");
                int posicion = input.nextInt();
                System.out.println("Número de placa:");
                input.nextLine();
                String placa = input.nextLine();
                vagaPosicion[posicion] = placa;

                break;

            case 2:

                System.out.println("Ingrese número de vaga:");
                 posicion = input.nextInt();
                if (vagaPosicion[posicion] != null) {
                    vagaPosicion[posicion] = null;
                    System.out.println("La vaga en la "+posicion+" ha sido desocupada");
                    System.out.println("");
                }else{
                    System.out.println("La vaga ya estaba vacia");
                }
                break;

            case 3:

                for (posicion = 0; posicion <10; posicion++) {
                    System.out.println("Vaga " +posicion+ " - " +vagaPosicion[posicion]);

                }
            }

            System.out.println("");

        }

    }
}