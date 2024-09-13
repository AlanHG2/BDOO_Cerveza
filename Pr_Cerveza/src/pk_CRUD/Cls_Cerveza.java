package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
        }
        return res;
    }
    
    public int actualizarRegistro(int id_cerveza,  String nombre, float graduacion, int id_marca) {
        int res = 0;
        String sql_update = "UPDATE cerveza SET cer_nombre = ?, cer_graduacion = ?, id_marca = ? WHERE id_cervreza = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1, nombre);
            PS.setFloat(2, graduacion);
            PS.setInt(3, id_marca);
            res = PS.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int eliminarRegistro(int id_cerveza) {
        int res = 0;
        String sql_delete = "DELETE FROM cerveza WHERE id_cerveza = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_cerveza);
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
        dtm.addColumn("Graduación");
        dtm.addColumn("Marca");
        return dtm;
    }
    
    public DefaultTableModel getDatosCervezas(){
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM cerveza";
        String [] fila = new String [5];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()){
                fila[0] = String.valueOf(RS.getInt("id_cerveza"));
                fila[1] = RS.getString("cer_nombre");
                fila[2] = String.valueOf(RS.getFloat("cer_graduacion"));               
                fila[3] = String.valueOf(RS.getInt("id_marca"));
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en cerveza: " + e);
        } finally {
            CN.close();
            RS = null;
            PS = null;
        }
        return dtm;
    }
    
    public DefaultTableModel getCriterio (String columna, String criterio){
        columna = compararNombresCampos(columna);
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM cerveza WHERE " + columna + " like'%" + criterio + "%'";
        String [] fila = new String[5];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()){
                fila[0] = String.valueOf(RS.getInt("id_cerveza"));
                fila[1] = RS.getString("cer_nombre");
                fila[2] = String.valueOf(RS.getFloat("cer_graduacion"));               
                fila[3] = String.valueOf(RS.getInt("id_marca"));
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
    
    private String compararNombresCampos (String columna){
        String nombreCampo = null;
        if (columna.contains("nombre")) {
            nombreCampo = "cer_nombre";
        } else if (columna.contains("graduación")) {
            nombreCampo = "cer_graduacion";
        } else if (columna.contains("marca")) {
            nombreCampo = "id_marca";
        }
        return nombreCampo;
    }
    
    
    public ArrayList<Cerveza> getCervezas() {
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
