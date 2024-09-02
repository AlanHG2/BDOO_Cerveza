package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;
import pk_Modelo.Sede;
public class Cls_Sede {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Sede() {
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos(String sed_nombre, String sed_telefono, String sed_tipo, String sed_estado, String sed_ubicacion) {
        int res = 0;
        String SQL_Insert = "INSERT INTO sede (sed_nombre, sed_telefono, sed_tipo, sed_estado, sed_ubicacion) VALUES (?,?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, sed_nombre);
            PS.setString(2, sed_telefono);
            PS.setString(3, sed_tipo);
            PS.setString(4, sed_estado);
            PS.setString(5, sed_ubicacion);
            res = PS.executeUpdate();
            if (res > 0) {
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error de inserción: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }

    public ArrayList<Sede> getSedes() {
        ArrayList<Sede> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM sede";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
//            por cada elemento en RS, se crea un objeto en el arraylist con cada una de los atributos de la entidad Sede
            while(RS.next()){
                lista.add(new Sede(RS.getInt("id_Sede"),
                        RS.getString("sed_nombre"),
                        RS.getString("sed_telefono"),
                        RS.getString("sed_tipo"),
                        RS.getString("sed_estado"),
                        RS.getString("sed_ubicacion")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e, "Error", 0);
        } finally {
            RS = null;
            PS = null;
            CN.close();
        }
        return lista;
    }

}
