public class Contagem {

    public static void contar() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void contar(int fin) {
        for (int i = 1; i <= fin; i++) {
            System.out.println(i);
        }
    }

    public static void contar(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i + " ");
            System.out.println("");
        }

    }

    public static void contar(int inicio, int fin, int pausa) {
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
