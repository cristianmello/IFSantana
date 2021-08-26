package aula;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion1 {

	public static final String obrigatorio = "?autoReconnect=true&useSSL=false&&serverTimezone=UTC";
	public static final String url = "jdbc:mysql://127.0.0.1/trabJDBC" + obrigatorio;

	public void ListarContacto() {

		String sql = "Select * FROM produtos";

		persona obj = new persona();

		try (Statement statement = obj.getConection().createStatement();

				ResultSet resultSet = statement.executeQuery(sql)) {

			ResultSetMetaData metaData = resultSet.getMetaData();

			// retorna o número de colunas
			int numeroColunas = metaData.getColumnCount();

			// gera o cabeçalho de uma tabela com o nome das colunas vindas do banco
			for (int i = 1; i <= numeroColunas; i++) {
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			}
			System.out.println();

			// imprime os conteúdos dos objetos vindos do banco
			while (resultSet.next()) {
				for (int i = 1; i <= numeroColunas; i++) {
					System.out.printf("%-8s\t", resultSet.getObject(i));
				}
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
