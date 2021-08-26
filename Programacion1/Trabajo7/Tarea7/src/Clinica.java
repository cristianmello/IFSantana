import java.util.Scanner;

public class Clinica {

    public Clinica(int numPacientes) {
        String bajitaNombre = "", mayorNombre = "", Pacientes[][] = new String[numPacientes][6];
        int contHombres = 0, contMujeres = 0, contEdad = 0, media = 0, mayorEdad = 0;
        float menorTamaño = 10;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numPacientes; i++) {

            System.out.println("Paciente número: " + (i + 1));

            System.out.print("Ingrese el nombre del paciente: ");
            Pacientes[i][1] = input.nextLine();

            System.out.print("Ingrese el sexo del paciente: ");
            Pacientes[i][2] = input.nextLine();

            System.out.print("Ingrese el peso en (Kg) del paciente: ");
            Pacientes[i][3] = input.nextLine();

            System.out.print("Ingrese la edad del paciente: ");
            Pacientes[i][4] = input.nextLine();

            System.out.print("Ingrese la altura en (m) del paciente: ");
            Pacientes[i][5] = input.nextLine();

            if (Pacientes[i][2].equalsIgnoreCase("Hombre")) {
                contHombres++;
                media += Integer.parseInt(Pacientes[i][4]);
            }

            if (Float.parseFloat(Pacientes[i][5]) < menorTamaño && !Pacientes[i][2].equalsIgnoreCase("Hombre")) {
                bajitaNombre = Pacientes[i][1];
                menorTamaño = Float.parseFloat(Pacientes[i][5]);
            }

            if (Pacientes[i][2].equalsIgnoreCase("Mujer") && Float.parseFloat(Pacientes[i][5]) >= 1.60
                    && Float.parseFloat(Pacientes[i][5]) <= 1.70) {
                contMujeres++;
            }

            if (Integer.parseInt(Pacientes[i][4]) >= 18 && Integer.parseInt(Pacientes[i][4]) <= 25) {
                contEdad++;
            }

            if (Integer.parseInt(Pacientes[i][4]) > mayorEdad) {
                mayorNombre = Pacientes[i][1];
                mayorEdad = Integer.parseInt(Pacientes[i][4]);
            }

        }
        if (contHombres > 0) {
            media = media / contHombres;
        }

        System.out.println();
        System.out.println("Cantidad de pacientes: " + numPacientes);
        System.out.println("Media de edad de los hombres: " + media);
        System.out.println("Cantidad de mujeres com altura entre 1,60m y 1,70m: " + contMujeres);
        System.out.println("Cantidad de personas con edad entre 18 y 25: " + contEdad);
        System.out.println("Nombre del paciente más viejo: " + mayorNombre);
        System.out.println("Nombre de la mujer más baja: " + bajitaNombre);

    }

}
