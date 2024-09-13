package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pk_Conexion.C_Conexion;
import pk_Modelo.Cerveza;

public class Cls_Cerveza {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Cerveza() {
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos(String nombre, float graduacion, int id_marca) {
        int res = 0;
        String sql_Insert = "INSERT INTO cerveza(cer_nombre,cer_graduacion, id_marca) VALUES (?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(sql_Insert);
            PS.setString(1, nombre);
            PS.setFloat(2, graduacion);
            PS.setInt(3, id_marca);
            res = PS.executeUpdate();
            if (res > 0) {
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar los datos en la tabla cervezas:" + e);
        } finally {
            PS = null;
            CN.close();
            return res;
        }
    }
    
    public ArrayList<Cerveza> getCerveza() {
        ArrayList<Cerveza> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM cerveza";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                lista.add(new Cerveza(
                        RS.getInt("id_cerveza"),
                        RS.getString("cer_nombre"),
                        RS.getFloat("cer_graduacion"),
                        RS.getInt("id_marca"),
                        RS.getInt("cer_existencia_total")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        } finally {
            RS=null;
            PS=null;
            CN.close();
        }
        return lista;
    }
}
