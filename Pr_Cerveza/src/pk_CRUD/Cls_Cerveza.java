package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pk_Conexion.C_Conexion;

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
}
