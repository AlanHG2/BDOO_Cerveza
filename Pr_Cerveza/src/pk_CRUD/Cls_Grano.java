package pk_CRUD;
import pk_Conexion.C_Conexion;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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
    
    public int actualizarRegistro (int id_grano, String gra_nombre, String gra_procedencia){
        int res = 0;
        String sql_update = "UPDATE grano SET gra_nombre = ?, gra_procedencia = ? WHERE id_grano = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1,gra_nombre);
            PS.setString(2,gra_procedencia);
            PS.setInt(3, id_grano);
            res = PS.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int eliminarRegistro(int id_grano) {
        int res = 0;
        String sql_delete = "DELETE FROM grano WHERE id_grano= ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_grano);
            res = PS.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException ex) {
            res=-1;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el registro: " + e);
        } finally {
            CN.close();
            PS = null;
        }
        return res;
    }
    
    private DefaultTableModel setColumnsDTM() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Procedencia");
        return dtm;
    }
    
    public DefaultTableModel getDatosGranos() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM grano";
        String[] fila = new String[3];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_sede"));
                fila[1] = RS.getString("gran_nombre");
                fila[2] = RS.getString("gran_procedencia");
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en grano: " + e);
        } finally {
            CN.close();
            RS = null;
            PS = null;
        }
        return dtm;
    }
    
    public DefaultTableModel getCriterio(String columna, String criterio) {
        columna = compararNombresCampos(columna);
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM grano WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[9];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_sede"));
                fila[1] = RS.getString("gran_nombre");
                fila[2] = RS.getString("gran_procedencia");
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar los datos con criterio: " + e);
        } finally {
            CN.close();
            PS = null;
            RS = null;
        }
        return dtm;
    }
    
    private String compararNombresCampos(String columna) {
        String nombreCampo = null;
        if (columna.contains("nombre")) {
            nombreCampo = "gra_nombre";
        } else if (columna.contains("procedencia")) {
            nombreCampo = "gra_procedencia";
        }
        return nombreCampo;
    }

    public ArrayList<Grano> getGranos() {
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
