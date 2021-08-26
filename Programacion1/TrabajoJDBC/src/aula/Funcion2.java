package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion2 {
	
	public void cadastrarProduto(String nomeProd, int precoProd, int quantidadeProd) throws SQLException {
		String sql = "Select * FROM produtos";

		persona objConexion = new persona();
		Connection conexao = objConexion.getConection();
		idMaximo obj1 = new idMaximo();
		int id = obj1.idIncrementableProduto();


		try {
			PreparedStatement insert = (PreparedStatement) conexao.prepareStatement("INSERT INTO produtos (Id,Nome, Preco, Quantidade) VALUES (? ,?, ?, ?)");

			insert.setInt(1, id);
			insert.setString(2, nomeProd);
			insert.setInt(3, precoProd);
			insert.setInt(4, quantidadeProd);

			// retorna numero de linhas atualizadas
			int retorno = insert.executeUpdate();

			
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
			insert.close();
			select.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
