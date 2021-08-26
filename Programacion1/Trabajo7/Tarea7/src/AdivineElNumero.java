import java.util.Scanner;

public class AdivineElNumero {

    public AdivineElNumero() {
        Scanner input = new Scanner(System.in);
        int num = 0, i = 0, contador = 1, aletorio = (int) (1 + Math.random() * 99 + 1);
        boolean x = false;
        System.out.println("Número sorteado: " + aletorio);

        while (num != aletorio) {
            if (i == 0) {
                i++;
                while (x == false) {
                    try {
                        System.out.println("Entre con un número de 1 á 100:");
                        num = new Scanner(System.in).nextInt();
                        x = true;

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }

            }
            x = false;
            if (num < aletorio) {
                while (x == false) {
                    try {

                        System.out.println("El número sorteado es mayor que: " + num);
                        System.out.println("\nEntre con otro número:");
                        num = new Scanner(System.in).nextInt();
                        x = true;

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }
                x = false;
            } else if (num > aletorio) {
                while (x == false) {
                    try {
                        System.out.println("El número sorteado es menor que " + num);
                        System.out.println("\nEntre con otro número:");
                        num = new Scanner(System.in).nextInt();
                        x = true;

                    } catch (Exception e) {
                        System.out.println("Debe ingresar solamente números");
                    }
                }
            }
            contador++;
            if (num == aletorio) {
                System.out.println("Felitaciones usted acerto");
                System.out.println("Tentativas: " + contador);
            }

        }
    }
}
