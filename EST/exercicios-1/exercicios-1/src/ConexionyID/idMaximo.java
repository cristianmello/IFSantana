package ConexionyID;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class idMaximo {

    public int idIncrementable() throws SQLException {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connexion obj = new Connexion();

        try {
            ps = obj.connectBD1().prepareStatement("SELECT MAX(Id) FROM agenda;");
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
