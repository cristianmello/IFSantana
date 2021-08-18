package Problema1;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConexionyID.Connexion;
import ConexionyID.idMaximo;

public class RegistrarContacto {

    Connection con;

    public RegistrarContacto(){
        Connexion con = new Connexion();
        try {
            this.con = con.connectBD1();
            System.out.println("Base de datos conectado con exito");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Problema al conectar con la base de datos, verifique!!! ");
        }
    }

    public void Registrar(Persona p) throws SQLException {

        idMaximo obj1 = new idMaximo();
        int id = obj1.idIncrementable();

        String sql = "INSERT INTO agenda(id, nombre, telefono) VALUES (?,?,?)";


        try {
            PreparedStatement insert = con.prepareStatement(sql);
            insert.setInt(1,id);
            insert.setString(2, p.getNombre());
            insert.setInt(3, p.getTelefono());

            insert.execute();
            insert.close();
            System.out.println("Se ha registrado el contacto");
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
