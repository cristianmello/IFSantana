import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        int impar[] = new int[10];
        int par[] = new int[10];
        int numAleat1;

       for (int i=0; i<10; i++){

            numAleat1 = (int) (Math.random() * 19 + 1);
            
            if (numAleat1 % 2 == 0) {

                par[i] = numAleat1;

            } else {
                impar[i] = numAleat1;
            }
            
        }

        System.out.println("Array con valores pares: " + Arrays.toString(par));
        System.out.println("Array con valores impares: " + Arrays.toString(impar));

    }
}
