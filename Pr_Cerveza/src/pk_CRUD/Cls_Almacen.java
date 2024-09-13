/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;
import pk_Modelo.Almacen;

/**
 *
 * @author jadey
 */
public class Cls_Almacen {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Almacen(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (int alma_existencia, int alma_capacidad, int id_presentacion, int id_expendio){
        int res = 0;
        String SQL_Insert = "INSERT INTO almacen (alma_existencia, alma_capacidad, id_presentacion, id_expendio) VALUES (?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setInt(1,alma_existencia);
            PS.setInt(2,alma_capacidad);
            PS.setInt(3,id_presentacion);
            PS.setInt(4,id_expendio);
            res = PS.executeUpdate();
            if (res > 0){
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error de inserción");
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int actualizarRegistro(int id_almacen, int alma_existencia, int alma_capacidad, int id_presentacion, int id_expendio){
        int res = 0;
        String sql_update = "UPDATE almacen SET alma_existencia = ?, alma_capacidad + ?, id_presentacion = ?, id_expendio = ? WHERE id_almacen = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setInt(1,alma_existencia);
            PS.setInt(2,alma_capacidad);
            PS.setInt(3,id_presentacion);
            PS.setInt(4,id_expendio);
            PS.setInt(5,id_almacen);
            res = PS.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int eliminarRegistro(int id_almacen) {
        int res = 0;
        String sql_delete = "DELETE FROM sede WHERE id_almacen= ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_almacen);
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
        dtm.addColumn("Existencia");
        dtm.addColumn("Capacidad");
        dtm.addColumn("Presentación");
        dtm.addColumn("Expendio");
        return dtm;
    }
    
    public DefaultTableModel getDatosAlmacenes() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM almacen";
        String[] fila = new String[6];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_almacen"));
                fila[1] = String.valueOf(RS.getInt("alma_existencia"));
                fila[2] = String.valueOf(RS.getInt("alma_capacidadd"));
                fila[3] = String.valueOf(RS.getInt("id_presetacion"));
                fila[3] = String.valueOf(RS.getInt("id_expendio"));
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en almacen: " + e);
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
        String sql_select = "SELECT *FROM almacen WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[6];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_almacen"));
                fila[1] = String.valueOf(RS.getInt("alma_existencia"));
                fila[2] = String.valueOf(RS.getInt("alma_capacidadd"));
                fila[3] = String.valueOf(RS.getInt("id_presetacion"));
                fila[3] = String.valueOf(RS.getInt("id_expendio"));
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
        if (columna.contains("existencia")) {
            nombreCampo = "alma_existencia";
        } else if (columna.contains("capacidad")) {
            nombreCampo = "alma_capacidad";
        } else if (columna.contains("presentacion")) {
            nombreCampo = "id_presentacion";
        } else if (columna.contains("expendio")) {
            nombreCampo = "id_expendio";
        } 
        return nombreCampo;
    }
    
    public ArrayList<Almacen> getAlmacenes() {
        ArrayList<Almacen> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM almacen";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                lista.add(new Almacen(
                        RS.getInt("id_almacen"),
                        RS.getInt("alma_existencia"),
                        RS.getInt("alma_capacidad"),
                        RS.getInt("id_presentacion"),
                        RS.getInt("id_expendioe")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:" + e, "Error", 0);
        } finally {
            RS=null;
            PS=null;
            CN.close();
        }
        return lista;
    }
    
}
