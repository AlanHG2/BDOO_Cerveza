package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;
import pk_Modelo.Marca;

public class Cls_Marca {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Marca() {
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos(String nombre, int id_Fabricante) {
        int res = 0;
        String SQL_Insert = "INSERT INTO marca (mar_nombre, id_fabricante) VALUES (?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, nombre);
            PS.setInt(2, id_Fabricante);
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
    
    public int actualizarRegistro(int id_marca, String nombre, int id_Fabricante) {
        int res = 0;
        String sql_update = "UPDATE marca SET mar_nombre = ?, id_fabricante = ? WHERE id_marca = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1, nombre);
            PS.setInt(2, id_Fabricante);
            PS.setInt(3, id_marca);
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
    
    public int eliminarRegistro(int id_marca) {
        int res = 0;
        String sql_delete = "DELETE FROM marca WHERE id_marca = ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_marca);
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
        dtm.addColumn("Fabricante");
        return dtm;
    }
    
    public DefaultTableModel getDatosMarcas() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM marca";
        String[] fila = new String[3];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_marca"));
                fila[1] = RS.getString("mar_nombre");
                fila[2] = String.valueOf(RS.getInt("id_fabricante"));
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en marca: " + e);
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
        String sql_select = "SELECT *FROM marca WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[3];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_marca"));
                fila[1] = RS.getString("mar_nombre");
                fila[2] = String.valueOf(RS.getInt("id_fabricante"));
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
            nombreCampo = "mar_nombre";
        } else if (columna.contains("fabricante")) {
            nombreCampo = "id_fabricante";
        }
        return nombreCampo;
    }

    public ArrayList<Marca> getMarcas() {
        ArrayList<Marca> list = new ArrayList();
        String SQL_Select = "SELECT *FROM marca";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                list.add(new Marca(RS.getInt("id_marca"),
                        RS.getString("mar_nombre"),
                        RS.getInt("id_Fabricante")));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        } finally {
            PS=null;
            RS=null;
            CN.close();
        }
        return list;
    }
}
