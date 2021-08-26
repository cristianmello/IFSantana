import java.util.Arrays;

public class meusArrays {

    public static int metodo1(int[] array1, int[] array2, int valor) {

        Arrays.sort(array1);
        Arrays.sort(array2);
        int contador = 0;

        if (Arrays.binarySearch(array1, valor) >= 0) {
            contador++;
        }
        if (Arrays.binarySearch(array2, valor) >= 0) {
            contador++;
        }
        return contador;
    }

    public static int[] metodo2(int valor) {

        int[] array = new int[valor];
        for (int i = 0; i < valor; i++) {
            array[i] = (int) (Math.random() * 1001);
        }

        return array;
    }

}
