/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;

/**
 *
 * @author jadey
 */
public class Cls_Receta {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Receta(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (String rec_procedimiento, int id_grano, int id_cerveza ){
        int res = 0;
        String SQL_Insert = "INSERT INTO receta (rec_procedimiento, id_grano, id_cerveza) VALUES (?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1,rec_procedimiento);
            PS.setInt(2,id_grano);
            PS.setInt(3,id_cerveza);
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
    
    public int actualizarRegistro(int id_receta, String rec_procedimiento, int id_grano, int id_cerveza ){
        int res = 0;
        String sql_update = "UPDATE receta SET rec_procedimiento = ?, id_grano = ?, id_cerveza = ? WHERE id_receta = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1,rec_procedimiento);
            PS.setInt(2,id_grano);
            PS.setInt(3,id_cerveza);
            PS.setInt(4, id_receta);
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
    
    public int eliminarRegistro(int id_receta) {
        int res = 0;
        String sql_delete = "DELETE FROM receta WHERE id_receta = ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_receta);
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
        dtm.addColumn("Procedimiento");
        dtm.addColumn("Grano");
        dtm.addColumn("Cerveza");
        return dtm;
    }
    
    public DefaultTableModel getDatosRecetas() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM receta";
        String[] fila = new String[4];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_receta"));
                fila[1] = RS.getString("rec_procedimiento");
                fila[2] = String.valueOf(RS.getInt("id_grano"));
                fila[3] = String.valueOf(RS.getInt("id_cerveza"));
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
        String sql_select = "SELECT *FROM receta WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[4];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_receta"));
                fila[1] = RS.getString("rec_procedimiento");
                fila[2] = String.valueOf(RS.getInt("id_grano"));
                fila[3] = String.valueOf(RS.getInt("id_cerveza"));
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
        if (columna.contains("procedimiento")) {
            nombreCampo = "gra_procedimiento";
        } else if (columna.contains("grano")) {
            nombreCampo = "id_grano";
        } else if (columna.contains("cerveza")) {
            nombreCampo = "id_cerveza";
        }
        return nombreCampo;
    }
    
    
    
}
