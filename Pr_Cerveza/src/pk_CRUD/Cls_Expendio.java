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
import pk_Modelo.Expendio;
import pk_Modelo.Sede;

/**
 *
 * @author jadey
 */
public class Cls_Expendio {
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Expendio() {
        this.PS = null;
        this.CN = new C_Conexion();
    }
    
    public int insertarDatos(String exp_nombre, String exp_rfc, String exp_calle, int exp_postal,
                            String exp_municipio, String exp_estado, int exp_numExterior){
        
        int res = 0;
        String SQL_Insert = "INSERT INTO expendio (exp_nombre, exp_rfc, exp_calle, exp_postal, exp_municipio, exp_estado, exp_numExterior) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PS= CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, exp_nombre);
            PS.setString(2, exp_rfc);
            PS.setString(3, exp_calle);
            PS.setInt(4, exp_postal);
            PS.setString(5, exp_municipio);
            PS.setString(6, exp_estado);
            PS.setInt(7, exp_numExterior);
            res = PS.executeUpdate();
            if (res > 0){
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
    
    public int actualizarRegistro(int id_expendio, String exp_nombre, String exp_rfc, String exp_calle, int exp_postal,
                            String exp_municipio, String exp_estado, int exp_numExterior){
        
        int res = 0;
        String sql_update = "UPDATE expendio SET exp_nombre = ?, exp_rfc = ?, exp_calle = ?, exp_postal = ?, exp_municipio = ?, exp_estado = ?, exp_numExterior = ? WHERE id_expendio = ?";       
        try {
            PS= CN.getConexion().prepareStatement(sql_update);
            PS.setString(1, exp_nombre);
            PS.setString(2, exp_rfc);
            PS.setString(3, exp_calle);
            PS.setInt(4, exp_postal);
            PS.setString(5, exp_municipio);
            PS.setString(6, exp_estado);
            PS.setInt(7, exp_numExterior);
            PS.setInt(8, id_expendio);
            res = PS.executeUpdate();           
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;    
    }
    
    public int eliminarRegistro(int id_expendio) {
        int res = 0;
        String sql_delete = "DELETE FROM expendio WHERE id_expendio = ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_expendio);
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
        dtm.addColumn("RFC");
        dtm.addColumn("Calle");
        dtm.addColumn("C. Postal");
        dtm.addColumn("Municipio");
        dtm.addColumn("Estado");
        dtm.addColumn("Núm ext.");
        return dtm;
    }
    
    public DefaultTableModel getDatosExpendios() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM expendio";
        String[] fila = new String[9];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_expendio"));
                fila[1] = RS.getString("exp_nombre");
                fila[2] = RS.getString("exp_rfc");
                fila[3] = RS.getString("exp_calle");
                fila[5] = String.valueOf(RS.getInt("exp_postal"));
                fila[6] = RS.getString("exp_municipio");
                fila[7] = RS.getString("exp_estado");
                fila[8] = String.valueOf(RS.getInt("exp_numExterior"));
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en expendio: " + e);
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
        String sql_select = "SELECT *FROM expendio WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[9];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_expendio"));
                fila[1] = RS.getString("exp_nombre");
                fila[2] = RS.getString("exp_rfc");
                fila[3] = RS.getString("exp_calle");
                fila[5] = String.valueOf(RS.getInt("exp_postal"));
                fila[6] = RS.getString("exp_municipio");
                fila[7] = RS.getString("exp_estado");
                fila[8] = String.valueOf(RS.getInt("exp_numExterior"));
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
        if (columna.contains("expendio")) {
            nombreCampo = "exp_nombre";
        }  else if (columna.contains("rfc")) {
            nombreCampo = "exp_rfc";
        }  else if (columna.contains("calle")) {
            nombreCampo = "exp_calle";
        } else if (columna.contains("postal")) {
            nombreCampo = "exp_postal";
        } else if (columna.contains("municipio")) {
            nombreCampo = "exp_municipio";
        } else if (columna.contains("estado")) {
            nombreCampo = "exp_estado";
        } else if (columna.contains("num")) {
            nombreCampo = "exp_numExterior";
        } 
        return nombreCampo;
    }
    
    public ArrayList<Expendio> getExpendios() {
        ArrayList<Expendio> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM expendio";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
//            por cada elemento en RS, se crea un objeto en el arraylist con cada una de los atributos de la entidad Sede
            while (RS.next()) {
                lista.add(new Expendio(RS.getInt("id_expendio"),
                RS.getString("exp_nombre"),
                RS.getString("exp_rfc"),
                RS.getString("exp_calle"),
                RS.getInt("exp_postal"),
                RS.getString("exp_municipio"),
                RS.getString("exp_estado"),
                RS.getInt("exp_numExterior")));
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
