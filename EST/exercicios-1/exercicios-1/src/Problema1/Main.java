package Problema1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList<Persona> contactos= new ArrayList<Persona>();
        int numTelefono=0;
        String nombre = null;
        boolean x = true;
        while (x) {
            System.out.println("Menu:\n" +
                    "1-Registrar contacto\n" +
                    "2-Consultar contacto\n\n" +
                    "Ingrese un valor:"
            );
            int opcion = input.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese cantidad de contactos a registrar:");
                    int cantidad = new Scanner(System.in).nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Ingrese nombre y apellido:");
                        nombre = new Scanner(System.in).nextLine();
                        nombre = nombre.toLowerCase();

                    boolean condition = true;
                        while (condition) {
                            System.out.println("Ingrese un telefono de 8 cifras:");
                            numTelefono = new Scanner(System.in).nextInt();
                            if (Integer.toString(numTelefono).length() != 8){
                                System.out.println("Debe ingresar un telefono con 8 cifras");
                            } else {

                            condition = false;
                            }
                        }
                        Persona persona = new Persona(nombre, numTelefono);
                        contactos.add(persona);

                        RegistrarContacto conection = new RegistrarContacto();
                        conection.Registrar(persona);
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre a buscar: ");
                    nombre = new Scanner(System.in).nextLine();
                    nombre = nombre.toLowerCase();

                    BuscarContacto objBuscar = new BuscarContacto();
                    objBuscar.listarContactos(nombre);

                    break;
            }
        }
    }
}
