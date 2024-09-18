/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import pk_Conexion.C_Conexion;

/**
 *
 * @author jadey
 */
public class Cls_Venta {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Venta(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (Double vent_precioU, int vent_cantidad, String vent_fecha,
            int id_expendio, int id_presentacion){
        int res = 0;
        String SQL_Insert = "INSERT INTO venta (vent_precioU, vent_cantidad, vent_fecha, id_expendio, id_presentacion) VALUES (?,?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setDouble(1,vent_precioU);
            PS.setInt(2,vent_cantidad);
            PS.setString(3,vent_fecha);
            PS.setInt(4,id_expendio);
            PS.setInt(5,id_presentacion);
            res = PS.executeUpdate();
            if (res > 0){
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error de inserción"+e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
}
