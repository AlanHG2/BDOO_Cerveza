package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pk_Conexion.C_Conexion;
import pk_Modelo.Fabricante;

public class Cls_Fabricante {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    
    public Cls_Fabricante() {
        this.PS = null;
        this.CN = new C_Conexion();
    }
    
    public int insertarDatos(String nombre, int id_sede) {
        int res = 0;
        String SQL_Insert = "INSERT INTO fabricante (fab_nombre, id_sede) VALUES (?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, nombre);
            PS.setInt(2, id_sede);
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
    
    public ArrayList<Fabricante> getFabricantes() {
        ArrayList<Fabricante> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM fabricante";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                lista.add(new Fabricante(
                        RS.getInt("id_fabricante"),
                        RS.getString("fab_nombre"),
                        RS.getInt("id_sede")));
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
