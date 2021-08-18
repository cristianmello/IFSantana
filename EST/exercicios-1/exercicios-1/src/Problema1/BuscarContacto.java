package Problema1;

import ConexionyID.Connexion;

import java.sql.*;

public class BuscarContacto {

    public void listarContactos(String nombre) throws SQLException {
        String sql = "SELECT COUNT(nombre) FROM agenda WHERE nombre LIKE '"+ nombre +"%'";
        String sql2 = "SELECT nombre, telefono FROM agenda WHERE nombre LIKE '"+ nombre +"%'";
        String sql3 = "SELECT nombre FROM agenda WHERE nombre LIKE '"+ nombre +"%'";

        Connexion objConexion = new Connexion();
        Connection conexion = objConexion.connectBD1();

        try {
            //Cantidad de entradas de nombre ingresado
            Statement select = conexion.createStatement();
            ResultSet resultSet = select.executeQuery(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();

            //Lista con nombres y telefonos
            Statement select2 = conexion.createStatement();
            ResultSet resultSet2 = select2.executeQuery(sql2);
            ResultSetMetaData metaData2 = resultSet2.getMetaData();


            //Lista de nombres con nombre ingresado
            Statement select3 = conexion.createStatement();
            ResultSet resultSet3 = select3.executeQuery(sql3);
            ResultSetMetaData metaData3 = resultSet3.getMetaData();

            int numColumnas = metaData.getColumnCount();
            int numColumnas2 = metaData2.getColumnCount();
            int numColumnas3 = metaData3.getColumnCount();


            while (resultSet.next()) {
                for (int i = 1; i <= numColumnas; i++) {
                    System.out.println("cantidad de entradas por nombre consultado:" + resultSet.getObject(i));
                }
            }
            while (resultSet2.next()) {
                for (int i = 1; i <= numColumnas2; i++) {
                    System.out.println("nombre y telefono:" + resultSet2.getObject(i));
                }
                        System.out.println();
            }
            while (resultSet3.next()) {
                for (int i = 1; i <= numColumnas3; i++) {
                    System.out.print("nombres encontrados:" + resultSet3.getObject(i));
                }
                System.out.println();
            }

            conexion.close();

            select.close();
            select2.close();
            select3.close();

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
