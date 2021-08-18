import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Personas.Cliente;
import Personas.Funcionario;
import Personas.Gerente;

public class CadastroPessoas {

    int qtdAtual = 3;

    public void cadastraPessoas() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        Cliente Clientes[] = new Cliente[qtdAtual];
        Funcionario Funcionario[] = new Funcionario[qtdAtual];
        Gerente Gerentes[] = new Gerente[qtdAtual];
        int i = 0;
        boolean condition = true;
        while (condition) {

            for (i = i + 0; i < qtdAtual - 2; i++) {
                System.out.println("Ingrese su nombre(Cliente):");
                String nome = new Scanner(System.in).nextLine();

                System.out.println("Ingrese su fecha de nacimiento(DD/MM/YYYY):");
                String nascimiento = new Scanner(System.in).nextLine();
                DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
                Date fecha = format.parse(nascimiento);

                Clientes[i] = new Cliente(nome, fecha, (i + 100));
                // ------------------------------------------------------------------------------------------------
                System.out.println("Ingrese su Nombre(Funcionario):");
                nome = new Scanner(System.in).nextLine();

                System.out.println("Ingrese su fecha de nacimiento(DD/MM/YYYY):");
                nascimiento = new Scanner(System.in).nextLine();
                fecha = format.parse(nascimiento);

                System.out.println("Ingrese su salario:");
                int salario = new Scanner(System.in).nextInt();

                Funcionario[i] = new Funcionario(nome, fecha, salario);
                // ------------------------------------------------------------------------------------------------
                System.out.println("Ingrese su Nombre(Gerente):");
                nome = new Scanner(System.in).nextLine();

                System.out.println("Ingrese su fecha de nacimiento(DD/MM/YYYY):");
                nascimiento = new Scanner(System.in).nextLine();
                fecha = format.parse(nascimiento);

                System.out.println("Ingrese su salario:");
                salario = new Scanner(System.in).nextInt();

                System.out.println("Ingrese su area de trabajo: ");
                String area = new Scanner(System.in).nextLine();
                Gerentes[i] = new Gerente(nome, fecha, salario, area);
            }

            for (Cliente cliente : Clientes) {
                cliente.imprimeDados();
            }

            for (Funcionario funcionario : Funcionario) {
                funcionario.imprimeDados();
            }

            for (Gerente gerente : Gerentes) {
                gerente.imprimeDados();
            }

            System.out.println("Quiere cadastrar nuevamente?1.Si,2.No");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                condition = true;
                i++;
            } else if (opcion == 2) {
                condition = false;
            }

        }

    }

}
