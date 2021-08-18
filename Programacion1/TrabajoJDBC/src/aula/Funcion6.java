package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion6 {

	public void eliminarProduto(int id) throws SQLException {

		String sql = "Select * FROM produtos";

		persona objConexion = new persona();
		Connection conexao = objConexion.getConection();

		try {
			PreparedStatement delete = (PreparedStatement) conexao
					.prepareStatement("delete from produtos" + " where Id='" + id + "';");

			int retorno = delete.executeUpdate();

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
			delete.close();
			select.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
