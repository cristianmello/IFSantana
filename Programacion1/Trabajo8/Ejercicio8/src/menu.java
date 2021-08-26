import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class menu {
    public static void main(String[] args) throws IOException {

        // Variable que se usara paar finalizar el programa cuando sea true en el caso
        // 5.
        boolean finalizar = false;

        while (finalizar == false) {

            System.out.println();
            System.out.println("Menu(Ingrese un numero)");
            System.out.println();
            System.out.println("1-Novo Contato");
            System.out.println("2-Listar contatos");
            System.out.println("3-Acessar contato");
            System.out.println("4-Buscar contato");
            System.out.println("5-Salir");
            System.out.println();

            int option = new Scanner(System.in).nextInt();

            switch (option) {
            case 1:
                System.out.println("Ingrese nombre del cliente: ");
                String nombre = new Scanner(System.in).nextLine();

                System.out.println("Ingrese telefono del cliente: ");
                String telefono = new Scanner(System.in).nextLine();

                System.out.println("Ingrese email del cliente: ");
                String email = new Scanner(System.in).nextLine();

                crearContacto obj1 = new crearContacto();
                obj1.nuevoContacto(nombre, telefono, email);
                break;

            case 2:
                listarContacto obj2 = new listarContacto();
                obj2.listaDeContactos();

                break;
            case 3:
                acessarContacto obj3 = new acessarContacto();
                System.out.println("Ingrese el nombre del archivo que quiere acceder: ");
                String nameFile = new Scanner(System.in).nextLine();

                // Obtenemos directorio del proyecto
                File miDir = new File("");
                try {
                    System.out.println("Directorio actual: " + miDir.getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Se accede a la variable que se aloja la direccion del proyecto
                String direccion = obj3.infoContact(miDir.getAbsolutePath() + "\\" + nameFile);
                System.out.println(direccion);
                break;

            case 4:
                buscarContacto obj4 = new buscarContacto();
                System.out.println("Ingrese algún dato para filtar los contactos que la contiene:");
                String fileData = new Scanner(System.in).nextLine();
                obj4.filtrarContactos(fileData);

                break;

            case 5:
                finalizar = true;
                break;

            default:
                System.out.println("Dato invalido, ingrese una cifra entre 1 y 5");
            }

        }
    }

}
