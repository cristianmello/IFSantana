package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion3 {

	public void saidaProduto(int id, int cantidad) throws SQLException {

		String sql = "Select * FROM produtos";

		persona objConexion = new persona();
		Connection conexao = objConexion.getConection();

		try {
			PreparedStatement update = (PreparedStatement) conexao
					.prepareStatement("update produtos set Quantidade = Quantidade - '" + cantidad + "'"
							+ "where Quantidade >= '"+ cantidad +"' AND Id = '" + id + "' ;");

			int retorno = update.executeUpdate();

			// seleciona todos os produtos do banco e imprime.

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
			update.close();
			select.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
