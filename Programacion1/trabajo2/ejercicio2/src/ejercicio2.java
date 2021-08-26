import java.util.*;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorProducto;
        double valorNuevo;

        System.out.println("Ingrese el valor del producto: ");
        valorProducto = input.nextInt();

        while (valorProducto != 0) {
            valorNuevo = valorProducto + 0.12 * valorProducto;
            System.out.println("Valor con acresimo incluido: " + valorNuevo);
            System.out.println("Nuevo valor redondeado: " + Math.round(valorNuevo));

            System.out.println("Ingrese un nuevo valor de producto: ");
            valorProducto = input.nextInt();

        }
        System.out.println("El programa ha sido finalizado");
    }
}
