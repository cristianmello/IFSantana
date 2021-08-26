import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroRandom;
        int contraseña;

        
        numeroRandom = (int) (Math.random()*6 + 5);

       
            System.out.println("Ingrese una contraseña con una cantidad de digitos igual a " + numeroRandom + ":");
            contraseña = input.nextInt();

            if (Integer.toString(contraseña).length() == numeroRandom) {
                System.out.println("Su contraseña es: " + contraseña);
            } else {

                System.out.println("Su contraseña deberia tener una cantidad de digitos igual a " + numeroRandom);
            }

        
    }
}
