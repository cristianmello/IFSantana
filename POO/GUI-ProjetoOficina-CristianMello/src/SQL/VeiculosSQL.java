/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Atributos.AtributosVeiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import Funciones.idMaximo;



/**
 *
 * @author Radaelli
 */
public class VeiculosSQL {
    Connection con;

    public VeiculosSQL(){
        Conexao con = new Conexao();
        try {
            this.con = con.conectaBD();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar no banco de dados, verifique!!!");
        }
    }
    
    public void cadastrar(AtributosVeiculos v) throws SQLException{
        
        idMaximo obj1 = new idMaximo();
        int id = obj1.idIncrementable();
        
        String sql = "insert into veiculo (id, placa, tipo, defeito, proprietario) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, id);
        stmt.setString(2, v.getPlaca());
        
        if(v.getMoto() == false)
            stmt.setInt(3, 0);
        else
            stmt.setInt(3, 1);
        
        stmt.setString(4, v.getDefeito());
        stmt.setInt(5, v.getProprietário());
        
        stmt.execute();
        stmt.close();
    }
    
    
    
    
}
