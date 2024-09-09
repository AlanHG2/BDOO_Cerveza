/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;
import pk_Modelo.Expendio;
/**
 *
 * @author obeth
 */
public class Cls_Expendio {
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Expendio() {
        this.PS = null;
        this.CN = new C_Conexion();
    }
    
    public int insertarDatos(String exp_nombre, String exp_rfc, String exp_calle,
            int exp_postal, String exp_municipio, String exp_estado, int exp_numExterior) {
        int res = 0;
        String SQL_Insert = "INSERT INTO expendio (sed_nombre, sed_telefono, sed_tipo, sed_calle, sed_postal, sed_municipio, sed_estado, sed_numExterior) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, exp_nombre);
            PS.setString(2, exp_rfc);
            PS.setString(3, exp_calle);
            PS.setInt(4, exp_postal);
            PS.setString(5, exp_municipio);
            PS.setString(6, exp_estado);
            PS.setInt(7, exp_numExterior);
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
    
     public ArrayList<Expendio> getExpendio() {
        ArrayList<Expendio> lista = new ArrayList();
        String SQL_Select = "SELECT *FROM expendio";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
//            por cada elemento en RS, se crea un objeto en el arraylist con cada una de los atributos de la entidad Sede
            while (RS.next()) {
                lista.add(new Expendio(
                        RS.getInt("id_expendio"),
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
