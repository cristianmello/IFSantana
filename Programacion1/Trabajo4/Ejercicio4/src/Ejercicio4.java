import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String[] letrasDigitos = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el código morse aqui: ");
        String morseInput = input.nextLine();
        String[] morseRoto = morseInput.split(" ");

        for (String x : morseRoto) {
            if (x.equals("/")) {
                System.out.print(" ");
            } else {
                for (int i = 0; i < morse.length; i++) {
                    if (morse[i].eq(x)) {
                        System.out.print(letrasDigitos[i]);
                    }

                }
            }
        }

    }

}
