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
public class Cls_Receta {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Receta(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (String rec_procedimiento, int id_grano, int id_cerveza ){
        int res = 0;
        String SQL_Insert = "INSERT INTO receta (rec_procedimiento, id_grano, id_cerveza) VALUES (?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1,rec_procedimiento);
            PS.setInt(2,id_grano);
            PS.setInt(3,id_cerveza);
            res = PS.executeUpdate();
            if (res > 0){
                System.out.println("Registro exitoso");
            }
        } catch (SQLException e) {
            System.out.println("Error de inserción "+e);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
}
