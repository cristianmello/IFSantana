package aula;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class idMaximo {

	public int idIncrementableProduto() throws SQLException {
		int id = 1;
		PreparedStatement ps = null;
		ResultSet rs = null;
		persona obj = new persona();

		try {
			ps = obj.getConection().prepareStatement("SELECT MAX(Id) FROM produtos;");
			rs = ps.executeQuery();
			while (rs.next())
				id = rs.getInt(1)+1;
		} catch (Exception e) {
			System.err.print(e);
		}
		ps.close();
		rs.close();
		
		return id;
	}
	
	public int idIncrementableUsuario() throws SQLException {
		int id = 1;
		PreparedStatement ps = null;
		ResultSet rs = null;
		persona obj = new persona();

		try {
			ps = obj.getConection().prepareStatement("SELECT MAX(Id) FROM usuario;");
			rs = ps.executeQuery();
			while (rs.next())
				id = rs.getInt(1)+1;
		} catch (Exception e) {
			System.err.print(e);
		}
		ps.close();
		rs.close();
		
		return id;
	}

}
