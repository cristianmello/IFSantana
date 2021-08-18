package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion7 {

	public void buscarUsuario(String nome) throws SQLException {

		String sql = "Select * FROM usuario where Nome ='" + nome + "';";

		persona objConexion = new persona();
		Connection conexao = objConexion.getConection();

		try {
			PreparedStatement search = (PreparedStatement) conexao
					.prepareStatement("select * from usuario where Nome = '" + nome + "';");

			Statement select = conexao.createStatement();
			ResultSet resultSet = select.executeQuery(sql);
			ResultSetMetaData metaData = resultSet.getMetaData();

			int numeroColunas = metaData.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= numeroColunas; i++) {
					System.out.printf("%-8s\t", resultSet.getObject(i));
				}
				System.out.println();
			}
			// encerra as conexões o objetos
			conexao.close();
			search.close();
			select.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
