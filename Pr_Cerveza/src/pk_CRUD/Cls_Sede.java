package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;
import pk_Modelo.Sede;

public class Cls_Sede {

    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Sede() {
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarRegistro(String nombre, String telefono, String tipo, String calle, int postal, String municipio, String estado, int numExterior) {
        int res = 0;
        String SQL_Insert = "INSERT INTO sede (sed_nombre, sed_telefono, sed_tipo, sed_calle, sed_postal, sed_municipio, sed_estado, sed_numExterior) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, nombre);
            PS.setString(2, telefono);
            PS.setString(3, tipo);
            PS.setString(4, calle);
            PS.setInt(5, postal);
            PS.setString(6, municipio);
            PS.setString(7, estado);
            PS.setInt(8, numExterior);
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

    public int actualizarRegistro(int id_sede, String nombre, String telefono, String tipo, String calle, int postal, String municipio, String estado, int numExterior) {
        int res = 0;
        String sql_update = "UPDATE sede SET sed_nombre = ?, sed_telefono = ?, sed_tipo = ?, sed_calle = ?, sed_postal = ?, sed_municipio = ?, sed_estado = ?, sed_numExterior = ? WHERE id_sede = ?";
        try {
            PS = CN.getConexion().prepareStatement(sql_update);
            PS.setString(1, nombre);
            PS.setString(2, telefono);
            PS.setString(3, tipo);
            PS.setString(4, calle);
            PS.setInt(5, postal);
            PS.setString(6, municipio);
            PS.setString(7, estado);
            PS.setInt(8, numExterior);
            PS.setInt(9, id_sede);
            res = PS.executeUpdate();  // Devuelve el número de filas afectadas
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }

    public int eliminarRegistro(int id_sede) {
        int res = 0;
        String sql_delete = "DELETE FROM sede WHERE id_sede= ?";

        try {
            PS = CN.getConexion().prepareStatement(sql_delete);
            PS.setInt(1, id_sede);
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
//Crea las columnas para la tabla --> es usado en getDatosSedes()
    private DefaultTableModel setColumnsDTM() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Tipo");
        dtm.addColumn("Estado");
        dtm.addColumn("Municipio");
        dtm.addColumn("C. Postal");
        dtm.addColumn("Calle");
        dtm.addColumn("Núm ext.");
        dtm.addColumn("Teléfono");
        return dtm;
    }
//Devuelve un objeto DefaultTableModel para listar los datos en la tabla
    public DefaultTableModel getDatosSedes() {
        DefaultTableModel dtm = setColumnsDTM();
        String sql_select = "SELECT *FROM sede";
        String[] fila = new String[9];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_sede"));
                fila[1] = RS.getString("sed_nombre");
                fila[2] = RS.getString("sed_tipo");
                fila[3] = RS.getString("sed_estado");
                fila[4] = RS.getString("sed_municipio");
                fila[5] = String.valueOf(RS.getInt("sed_postal"));
                fila[6] = RS.getString("sed_calle");
                fila[7] = String.valueOf(RS.getInt("sed_numExterior"));
                fila[8] = RS.getString("sed_telefono");
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error al hacer la consulta de datos en sede: " + e);
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
        String sql_select = "SELECT *FROM sede WHERE " + columna + " like'%" + criterio + "%'";
        String[] fila = new String[9];
        try {
            PS = CN.getConexion().prepareStatement(sql_select);
            RS = PS.executeQuery();
            while (RS.next()) {
                fila[0] = String.valueOf(RS.getInt("id_sede"));
                fila[1] = RS.getString("sed_nombre");
                fila[2] = RS.getString("sed_tipo");
                fila[3] = RS.getString("sed_estado");
                fila[4] = RS.getString("sed_municipio");
                fila[5] = String.valueOf(RS.getInt("sed_postal"));
                fila[6] = RS.getString("sed_calle");
                fila[7] = String.valueOf(RS.getInt("sed_numExterior"));
                fila[8] = RS.getString("sed_telefono");
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

//    Compara los nombres de los campos de la columna recibida (cb_Columna) y asigna el nombre de la columna correspondiente de la BD
    private String compararNombresCampos(String columna) {
        String nombreCampo = null;
        if (columna.contains("nombre")) {
            nombreCampo = "sed_nombre";
        } else if (columna.contains("tipo")) {
            nombreCampo = "sed_tipo";
        } else if (columna.contains("estado")) {
            nombreCampo = "sed_estado";
        } else if (columna.contains("municipio")) {
            nombreCampo = "sed_municipio";
        } else if (columna.contains("postal")) {
            nombreCampo = "sed_postal";
        } else if (columna.contains("calle")) {
            nombreCampo = "sed_calle";
        } else if (columna.contains("num")) {
            nombreCampo = "sed_numExterior";
        } else if (columna.contains("tel")) {
            nombreCampo = "sed_telefono";
        }
        return nombreCampo;
    }

//   ArrayList Utilizado para mostrar las sedes existentes en Fabricante
    public ArrayList<Sede> getSedes() {
        ArrayList<Sede> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM sede";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
//            por cada elemento en RS, se crea un objeto en el arraylist con cada una de los atributos de la entidad Sede
            while (RS.next()) {
                lista.add(new Sede(RS.getInt("id_sede"),
                        RS.getString("sed_nombre"),
                        RS.getString("sed_telefono"),
                        RS.getString("sed_tipo"),
                        RS.getString("sed_calle"),
                        RS.getInt("sed_postal"),
                        RS.getString("sed_municipio"),
                        RS.getString("sed_estado"),
                        RS.getInt("sed_numExterior")));
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
