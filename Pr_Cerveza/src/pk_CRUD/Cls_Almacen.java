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
public class Cls_Almacen {
    
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;
    DefaultTableModel DTM;

    public Cls_Almacen(){
        this.PS = null;
        this.CN = new C_Conexion();
    }

    public int insertarDatos (int alma_existencia, int alma_capacidad, int id_presentacion, int id_expendio){
        int res = 0;
        String SQL_Insert = "INSERT INTO almacen (alma_existencia, alma_capacidad, id_presentacion, id_expendio) VALUES (?,?,?,?)";
        try {
            PS = CN.getConexion().prepareStatement(SQL_Insert);
            PS.setInt(1,alma_existencia);
            PS.setInt(2,alma_capacidad);
            PS.setInt(3,id_presentacion);
            PS.setInt(4,id_expendio);
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
