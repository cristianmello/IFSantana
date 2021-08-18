import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        salario obj = new salario();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su salario:");
        int n1 = scanner.nextInt();
        obj.setSalario(n1);

    }

}