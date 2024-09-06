package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pk_Conexion.C_Conexion;
import pk_Modelo.Marca;

public class Cls_Marca {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Marca() {
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos(String nombre, int id_Fabricante) {
        int res = 0;
        String SQL_Insert = "INSERT INTO marca (mar_nombre, id_fabricante) VALUES (?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, nombre);
            PS.setInt(2, id_Fabricante);
            res = PS.executeUpdate();
            if (res > 0) {
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }

    public ArrayList<Marca> getMarcas() {
        ArrayList<Marca> list = new ArrayList();
        String SQL_Select = "SELECT *FROM marca";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                list.add(new Marca(RS.getInt("id_marca"),
                        RS.getString("mar_nombre"),
                        RS.getInt("id_Fabricante")));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        } finally {
            PS=null;
            RS=null;
            CN.close();
        }
        return list;
    }
}
