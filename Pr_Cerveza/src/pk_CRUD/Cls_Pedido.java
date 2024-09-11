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
public class Cls_Pedido {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Pedido(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (int id_presentacion, int id_expendio, int ped_cantidad, String ped_fecha_orden,
                                String ped_fecha_despacho, Double ped_total, Double ped_subtotal, Double ped_iva){
        int res = 0;
        String SQL_Insert = "INSERT INTO pedido (id_presentacion, id_expendio, ped_cantidad, ped_fecha_orden, ped_fecha_despacho, ped_total, ped_subtotal, ped_iva) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setInt(1,id_presentacion);
            PS.setInt(2,id_expendio);
            PS.setInt(3, ped_cantidad);
            PS.setString(4, ped_fecha_orden);
            PS.setString(5, ped_fecha_despacho);
            PS.setDouble(6, ped_total);
            PS.setDouble(7, ped_subtotal);
            PS.setDouble(8, ped_iva);
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
    
}
