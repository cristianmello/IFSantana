package funcionarios;

import java.util.Scanner;

public class Empresa extends Funcionario {

    public Empresa(String nome, String codigoFuncional, String cargo) {
        super(nome, codigoFuncional, cargo);
    }

    Funcionario[] cicloBasico = new Funcionario[7]; // 70% son vendedores, 
    Funcionario[] cicloMedio = new Funcionario[2]; // 20% supervisores
    Funcionario[] cicloSuperior = new Funcionario[1]; // 10% gerentes

    public int gastoBasico, gastoMedio, gastoSuperior;

    public void listaFuncionarios() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cicloBasico.length; i++) {
            cicloBasico[i] = new EnsinoBasico("nombre" + (i + 1), "codigo funcional" + (i + 1), "escuela" + (i + 1),
                    "cargo: vendedor");
            gastoBasico += 1100+250; // por ciclo basico se le agrega 10% (1000+100) a la renta basica y 250 por comision de cargo vendedor
        }
        for (int i = 0; i < cicloMedio.length; i++) {
            cicloMedio[i] = new EnsinoMedio("nombre" + (i + 1), "codigo funcional" + (i + 1), "escuela" + (i + 1),
                    "cargo:supervisor");
            gastoMedio += 1500+600; // por ciclo medio se le agrega un 50% a la renta basica(1000+500) y 600 por comision de cargo supervisor
        }
        for (int i = 0; i < cicloSuperior.length; i++) {
            cicloSuperior[i] = new EnsinoSuperior("nombre" + (i + 1), "codigo funcional" + (i + 1), "escuela" + (i + 1),
                    "universidad" + (i + 1), "cargo:gerente");
            gastoSuperior += 2000+1500; // por ciclo superior se le agrega un 100% a la renta basica(1000 +1000) y 1500 por cmision de cargo gerente
        }

        boolean x = true;
        while (x) {
            System.out.println("Menu, Ingrese una Opcion numérica");
            System.out.println(
                    "1.Concluyo ciclo básico\n2.Concluyo ciclo medio\n3.Concluyo ciclo Superior\n4.Ver gastos de la empresa\n5.No quiero realizar ninguna operación");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (Funcionario funcionarios : cicloBasico) {
                        funcionarios.setComision(250);
                        funcionarios.setRentaBasica(1000);
                        System.out.println(funcionarios.showData());
                    }
                    break;
                case 2:
                    for (Funcionario funcionarios : cicloMedio) {
                        funcionarios.setComision(600);
                        funcionarios.setRentaBasica(1000);
                        System.out.println(funcionarios.showData());
                    }
                    break;
                case 3:
                    for (Funcionario funcionarios : cicloSuperior) {
                        funcionarios.setComision(1500);
                        funcionarios.setRentaBasica(1000);
                        System.out.println(funcionarios.showData());
                    }
                    break;
                case 4:
                    System.out.println("Quiere ver los gastos totales de la empresa? 1.Si,2.No");
                    opcion = scanner.nextInt();
                    if (opcion == 1) {
                        setGastosEscolaridad((gastoBasico) + gastoMedio + gastoSuperior);
                        System.out.println("gastos totales:" + getGastosEscolaridad());
                    }
                    System.out.println("Quiere ver los gastos para cada escolaridad? 1.Si,2.No");
                    opcion = scanner.nextInt();
                    if (opcion == 1) {
                        setGastosEscolaridad(gastoBasico);
                        System.out.println("Gastos ciclo basico: " + getGastosEscolaridad());
                        setGastosEscolaridad(gastoMedio);
                        System.out.println("Gastos ciclo medio: " + getGastosEscolaridad());
                        setGastosEscolaridad(gastoSuperior);
                        System.out.println("Gastos ciclo Superior " + getGastosEscolaridad());
                    }
                    break;
                case 5:
                    x = false;
                    break;

                default:
                    System.out.println("Debe ingresar un número válido");
                    break;
            }
        }
    }
}
