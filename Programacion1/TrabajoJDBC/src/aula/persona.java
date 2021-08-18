package aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class persona {

	public static final String obrigatorio = "?autoReconnect=true&useSSL=false&&serverTimezone=UTC";

	// define a url de banco de dados
	public static final String url = "jdbc:mysql://127.0.0.1/trabJDBC" + obrigatorio;
	public String sql = "Select * FROM usuario";

	// Funcion de conexion con base de datos
	public static Connection getConection() {
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			System.err.print(e);
		}
		return conexao;
	}

	// Funcion que verifica si extiste el email y la contraseña para acceder al menu.
	public void ifExist(String email, String pass) {

		Connection conexao = null;
		Menu objMenu = new Menu();

		try {
			conexao = getConection();

			PreparedStatement ps = conexao.prepareStatement(
					"Select * from usuario where Email = '" + email + "' AND Senha = '" + pass + "';");
			ResultSet res = ps.executeQuery();

			if (res.next()) {
				objMenu.menu();
			} else {
				System.out.print("Su combinacion de Email y contraseña no se encuentran registrados");
			}

			conexao.close();
			res.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}


	public static void main(String[] args) throws Exception {

		System.out.print("Ingrese su Email: ");
		String email = new Scanner(System.in).nextLine();

		System.out.print("Ingrese su Contraseña: ");
		String pass = new Scanner(System.in).nextLine();

		persona obj = new persona();
		obj.ifExist(email, pass);

	}
}
