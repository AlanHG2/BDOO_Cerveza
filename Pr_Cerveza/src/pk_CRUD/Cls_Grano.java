package pk_CRUD;
import pk_Conexion.C_Conexion;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pk_Modelo.Grano;

public class Cls_Grano {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Grano(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (String gra_nombre, String gra_procedencia){
        int res = 0;
        String SQL_Insert = "INSERT INTO grano (gra_nombre, gra_procedencia) VALUES (?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1,gra_nombre);
            PS.setString(2,gra_procedencia);
            res = PS.executeUpdate();
            if (res > 0){
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error de inserción "+e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }

    public ArrayList<Grano> getGrano() {
        ArrayList<Grano> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM grano";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                lista.add(new Grano(
                        RS.getInt("id_grano"),
                        RS.getString("gra_nombre"),
                        RS.getString("gra_procedencia")
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
