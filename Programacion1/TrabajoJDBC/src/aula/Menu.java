package aula;

import java.sql.SQLException;
import java.util.Scanner;

class Menu {

	public void menu() throws SQLException {

		boolean finalizar = false;

		while (finalizar == false) {

			System.out.println();
			System.out.println("Menu(Ingrese un numero)");
			System.out.println();
			System.out.println("1-Listar produtos");
			System.out.println("2-Cadastrar produto");
			System.out.println("3-Saída de produto");
			System.out.println("4-Entrada de Produto");
			System.out.println("5-Buscar produtos");
			System.out.println("6-Excluir produto");
			System.out.println("7-Buscar usuario");
			System.out.println("8-Cadastrar usuario");
			System.out.println("9-Sair");

			int option = new Scanner(System.in).nextInt();

			switch (option) {
			case 1:
				Funcion1 objFunc = new Funcion1();
				objFunc.ListarContacto();
				break;
			case 2:

				System.out.print("Ingrese el nombre del producto: ");
				String nombre = new Scanner(System.in).nextLine();
				System.out.print("Ingrese el precio del producto: ");
				int precio = new Scanner(System.in).nextInt();
				System.out.print("Ingrese la cantidad del producto: ");
				int cantidad = new Scanner(System.in).nextInt();

				Funcion2 objFunc2 = new Funcion2();
				objFunc2.cadastrarProduto(nombre, precio, cantidad);

				break;
			case 3:

				System.out.print("Ingrese Id del producto: ");
				int id = new Scanner(System.in).nextInt();
				System.out.print("Ingrese cantidad de producto: ");
				cantidad = new Scanner(System.in).nextInt();

				Funcion3 objFunc3 = new Funcion3();
				objFunc3.saidaProduto(id, cantidad);

				break;

			case 4:

				System.out.print("Ingrese Id del producto: ");
				id = new Scanner(System.in).nextInt();
				System.out.print("Ingrese cantidad de producto: ");
				cantidad = new Scanner(System.in).nextInt();

				Funcion4 objFunc4 = new Funcion4();
				objFunc4.entradaProduto(id, cantidad);

				break;

			case 5:
				System.out.print("Ingrese el nombre del producto a buscar: ");
				nombre = new Scanner(System.in).nextLine();

				Funcion5 objFunc5 = new Funcion5();
				objFunc5.buscarProduto(nombre);

				break;

			case 6:
				System.out.print("Ingrese la Id del producto a eliminar: ");
				int numId = new Scanner(System.in).nextInt();

				Funcion6 objFunc6 = new Funcion6();
				objFunc6.eliminarProduto(numId);

				break;

			case 7:
				System.out.print("Ingrese el nombre del usuario a buscar: ");
				nombre = new Scanner(System.in).nextLine();

				Funcion7 objFunc7 = new Funcion7();
				objFunc7.buscarUsuario(nombre);
				break;

			case 8:
				System.out.print("Ingrese el nombre del usuario: ");
				String usuario = new Scanner(System.in).nextLine();
				
				System.out.print("Ingrese el email del usuario: ");
				String email = new Scanner(System.in).nextLine();
				
				System.out.print("Ingrese la contraseña del usuario: ");
				String contraseña = new Scanner(System.in).nextLine();

				Funcion8 objFunc8 = new Funcion8();
				objFunc8.cadastrarUsuario(usuario, email, contraseña);

				break;
			
			case 9:
				finalizar = true;
				break;

			default:
				System.out.println("Cifra invalido, ingrese una cifra entre 1 y 9");
				
			}

		}
	}
}
