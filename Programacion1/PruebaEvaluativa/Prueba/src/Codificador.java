import java.util.Scanner;

public class Codificador {
    public static void codificar() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = input.nextLine();

        char aux = frase.charAt(0), primerCaracter, segundoCaracter;
        String vocal = Character.toString(aux), stringVocal = "", cadenaModificada = "", fraseModificada = "",
                fraccionFrase = "";
        ;

        while (!frase.equalsIgnoreCase("Exit")) {
            aux = frase.charAt(0);
            vocal = Character.toString(aux);

            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i")
                    || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {

                StringBuilder cadena = new StringBuilder();
                for (int i = (frase.length() - 1); i >= 0; i--) {
                    cadena.append(frase.charAt(i));

                }
                String parts[] = cadena.toString().split(" ");
                for (String string : parts) {
                    System.out.print("iay" + string);
                    stringVocal = string;
                }

            } else {
                fraccionFrase = frase.substring(2);
                primerCaracter = frase.charAt(0);
                segundoCaracter = frase.charAt(1);
                cadenaModificada = "uai" + fraccionFrase + primerCaracter + segundoCaracter;

                String parts[] = cadenaModificada.split(" ");
                for (String string : parts) {
                    System.out.print(string);
                }

            }
            System.out.println("ingrese una frase para codificar o decodificar");
            frase = input.nextLine();

            StringBuilder cadena = new StringBuilder();
            if (frase.equalsIgnoreCase("iay" + stringVocal)) {
                for (int i = (stringVocal.length() - 1); i >= 0; i--) {
                    cadena.append(stringVocal.charAt(i));
                }
                System.out.println(cadena);
            } else if (frase.equalsIgnoreCase(cadenaModificada)) {

                char lastChar = frase.charAt(frase.length() - 1);
                String segundo = Character.toString(lastChar);
                char AnteChar = frase.charAt(frase.length() - 2);
                String primer = Character.toString(AnteChar);
                System.out.println(primer + segundo + fraccionFrase);
            }
            frase = input.nextLine();
        }

    }
}
