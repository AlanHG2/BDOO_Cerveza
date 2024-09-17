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
import pk_Modelo.Presentacion;

/**
 *
 * @author jadey
 */
public class Cls_Presentacion {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Presentacion(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (int id_cerveza, String pre_descripcion, String pre_tipo_envase, int pre_capacidad){
        int res = 0;
        String SQL_Insert = "INSERT INTO presentacion (id_cerveza, pre_descripcion, pre_tipo_envase, pre_capacidad) VALUES (?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setInt(1,id_cerveza);
            PS.setString(2,pre_descripcion);
            PS.setString(3, pre_tipo_envase);
            PS.setInt(4, pre_capacidad);
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
    
    public ArrayList<Presentacion> getPresentaciones(int id_cerveza) {
        ArrayList<Presentacion> lista = new ArrayList();
        String SQL_Select = "SELECT * FROM presentacion WHERE id_cerveza = "+id_cerveza;
        try {
            PS = CN.getConexion().prepareStatement(SQL_Select);
            RS = PS.executeQuery();
            while (RS.next()) {
                lista.add(new Presentacion(
                        RS.getInt("id_presentacion"),
                        RS.getInt("id_cerveza"),
                        RS.getString("pre_descripcion"),
                        RS.getString("pre_tipo_envase"),
                        RS.getInt("pre_capacidad")));
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
