package ConexionyID;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connexion {
    public Connection connectBD1() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica" , "root", "CrisRafa100%");
    }

    public Connection connectBD2() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1/estudiantes" , "root", "CrisRafa100%");
    }


}
