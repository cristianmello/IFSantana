import java.util.Scanner;

public class ej1 {
    private String Nome;
    private String Email;
    private int Telefone;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        System.out.println("Ingrese su nombre: ");
        Nome = scanner.nextLine();

        return Nome;
    }

    public String getEmail() {
        System.out.println("Ingrese su Email: ");
        Email = scanner.nextLine();

        return Email;
    }

    public int getTelefone() {

        boolean x = true;
        while (x) {
            try {
                System.out.println("Ingrese su Telefono: ");
                Telefone = new Scanner(System.in).nextInt();
                x = false;
            } catch (Exception e) {
                System.out.println("Debe ingresar solamente números");
            }
        }

        return Telefone;
    }

    public void exibeDatos() {

        System.out.println("Nombre:" + Nome);
        System.out.println("Email:" + Email);
        System.out.println("Telefone:" + Telefone);
    }

}
