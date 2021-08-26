/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import SQL.Conexao;


/**
 *
 * @author Usuario
 */
public class idMaximo {
    
    public int idIncrementable() throws SQLException {
        int id = 1;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexao obj = new Conexao();

        try {
            ps = obj.conectaBD().prepareStatement("SELECT MAX(Id) FROM veiculo;");
            rs = ps.executeQuery();
            while (rs.next())
                id = rs.getInt(1)+1;
        } catch (SQLException e) {
            System.err.print(e);
        }
        ps.close();
        rs.close();

        return id;
    }
}
