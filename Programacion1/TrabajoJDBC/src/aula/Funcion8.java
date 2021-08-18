package aula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class Funcion8 {
	
	public void cadastrarUsuario(String nomeUsuario, String emailUsuario, String SenhaUsuario) throws SQLException {
		String sql = "Select * FROM usuario";

		persona objConexion = new persona();
		Connection conexao = objConexion.getConection();
		idMaximo obj1 = new idMaximo();
		int id = obj1.idIncrementableUsuario();


		try {
			PreparedStatement insert = (PreparedStatement) conexao.prepareStatement("INSERT INTO usuario (Id, Nome, Email, Senha) VALUES (? ,?, ?, ?)");

			insert.setInt(1, id);
			insert.setString(2, nomeUsuario);
			insert.setString(3, emailUsuario);
			insert.setString(4, SenhaUsuario);

			
			int retorno = insert.executeUpdate();

			
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
