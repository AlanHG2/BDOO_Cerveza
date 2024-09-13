package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    
    public int insertarRegistro(String fab_nombre, int id_sede) {
        int res = 0;
        String SQL_Insert = "INSERT INTO fabricante (fab_nombre, id_sede) VALUES (?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, fab_nombre);
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
    
    public int actualizarRegistro(int id_fabricante, String fab_nombre, int id_sede) {
        int res = 0;
        String sql_update = "UPDATE fabricante SET fab_nombre = ?, id_sede = ? WHERE id_fabricante = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1, fab_nombre);
            PS.setInt(2, id_sede);
            PS.setInt(3, id_fabricante);
            res = PS.executeUpdate();           
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int eliminarRegistro(int id_fabricante) {
        int res = 0;
        String sql_delete = "DELETE FROM fabricante WHERE id_fabricante = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_fabricante);
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
        dtm.addColumn("Sede");
        return dtm;
    }
    
    public DefaultTableModel getDatosFabricantes(){
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM fabricante";
        String [] fila = new String [3];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()){
                fila[0] = String.valueOf(RS.getInt("id_fabricante"));
                fila[1] = RS.getString("fab_nombre");
                fila[2] = String.valueOf(RS.getInt("id_sede"));
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en Fabricante: " + e);
        } finally {
            CN.close();
            RS = null;
            PS = null;
        }
        return dtm;
    }
    
//    public DefaultTableModel getDatosFabricantes(){
//        DefaultTableModel dtm = setColumnsDTM();
//        // Modificar la consulta SQL para incluir el JOIN
//        String sql_select = "SELECT fabricante.id_fabricante, fabricante.fab_nombre, sede.sed_nombre " +
//                            "FROM fabricante " +
//                            "JOIN sede ON fabricante.id_sede = sede.id_sede";
//        String [] fila = new String [3];
//        try {
//            PS = CN.getConexion().prepareStatement(sql_select);
//            RS = PS.executeQuery();
//            while (RS.next()){
//                fila[0] = String.valueOf(RS.getInt("id_fabricante"));
//                fila[1] = RS.getString("fab_nombre");
//                fila[2] = RS.getString("sed_nombre"); // Ahora obtenemos el nombre de la sede
//                dtm.addRow(fila);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al hacer la consulta de datos en Fabricante: " + e);
//        } finally {
//            CN.close();
//            RS = null;
//            PS = null;
//        }
//        return dtm;
//    }
    
    public DefaultTableModel getCriterio (String columna, String criterio){
        columna = compararNombresCampos(columna);
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM fabricante WHERE " + columna + " like'%" + criterio + "%'";
        String [] fila = new String[3];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()){
                fila[0] = String.valueOf(RS.getInt("id_fabricante"));
                fila[1] = RS.getString("fab_nombre");
                fila[2] = String.valueOf(RS.getInt("id_sede"));
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
    
//    public DefaultTableModel getCriterio(String columna, String criterio) {
//        columna = compararNombresCampos(columna); // Convertir el nombre de la columna si es necesario
//        DefaultTableModel dtm = setColumnsDTM();
//        // Modificar la consulta para incluir el JOIN con la tabla sede
//        String sql_select = "SELECT fabricante.id_fabricante, fabricante.fab_nombre, sede.sed_nombre " +
//                            "FROM fabricante " +
//                            "JOIN sede ON fabricante.id_sede = sede.id_sede " +
//                            "WHERE " + columna + " like'%" + columna + "%'"; // Uso de un parámetro para evitar SQL Injection
//        String[] fila = new String[3];
//        try {
//            PS = CN.getConexion().prepareStatement(sql_select);
//            RS = PS.executeQuery();
//            while (RS.next()) {
//                fila[0] = String.valueOf(RS.getInt("id_fabricante"));
//                fila[1] = RS.getString("fab_nombre");
//                fila[2] = RS.getString("sed_nombre"); // Obtener el nombre de la sede
//                dtm.addRow(fila);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al recuperar los datos con criterio: " + e);
//        } finally {
//            CN.close();
//            PS = null;
//            RS = null;
//        }
//        return dtm;
//    }
    
    private String compararNombresCampos (String columna){
        String nombreCampo = null;
        if (columna.contains("nombre")) {
            nombreCampo = "fab_nombre";
        } else if (columna.contains("sede")) {
            nombreCampo = "id_sede";
        } 
        return nombreCampo;
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

