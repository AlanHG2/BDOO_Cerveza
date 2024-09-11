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
public class Cls_Lote {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Lote(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (int id_cerveza, String lot_fecha_prod, String lot_fecha_cadu, int lot_cantidad){
        int res = 0;
        String SQL_Insert = "INSERT INTO lote (id_cerveza, lot_fecha_prod, lot_fecha_cadu, lot_cantidad) VALUES (?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setInt(1,id_cerveza);
            PS.setString(2,lot_fecha_prod);
            PS.setString(3,lot_fecha_cadu);
            PS.setInt(4,lot_cantidad);
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
