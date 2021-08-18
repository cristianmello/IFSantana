package Problema2;

import ConexionyID.Connexion;

import java.sql.*;
import java.util.ArrayList;

public class ordenarLista {

    static ArrayList <Estudiante> listaEst= new ArrayList<Estudiante>();

    public void listar() throws  SQLException{

        Connexion objConexion = new Connexion();
        Connection conexion = objConexion.connectBD2();

        //Obtener numero de estudiantes
            String sql = "SELECT COUNT(codigo) FROM datosEst";
            String sql2 = "SELECT * FROM datosEst  ORDER BY nombre DESC";
        try {
            //Obtener numero de estudiantes
            Statement select = conexion.createStatement();
            ResultSet resultSet = select.executeQuery(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numColumnas = metaData.getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= numColumnas; i++) {
                    System.out.println("cantidad de Estudiantes:" + resultSet.getObject(i));
                }
            }

            //Obtiene los datos, los ordena y los agrega a un arrayList
            Statement select2 = conexion.createStatement();
            ResultSet resultSet2 = select2.executeQuery(sql2);

            Estudiante objEst = null;
            while(resultSet2.next()){
                objEst = new Estudiante(resultSet2.getInt("codigo"),resultSet2.getString("Nombre"), resultSet2.getDouble("media"));
                listaEst.add(objEst);
            }

            conexion.close();

            select.close();
            select2.close();

            for (int i = 0; i < listaEst.size() ; i++) {
                objEst = listaEst.get(i);
                System.out.println(objEst.getCodigo() + " " + objEst.getNombre() + " " + objEst.getMediaEscolar());
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}