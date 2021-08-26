public class Piramide {

    public Piramide(int lineas) {
        int contador = 1;

        for (int fila = 1; fila <= lineas; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.printf("  %02d", contador);
            }
            System.out.println();
            contador = contador + 1;

        }
    }

}
