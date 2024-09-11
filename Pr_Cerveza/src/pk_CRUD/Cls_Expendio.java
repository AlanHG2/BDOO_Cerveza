/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pk_Conexion.C_Conexion;

/**
 *
 * @author jadey
 */
public class Cls_Expendio {
    private PreparedStatement PS;
    private C_Conexion CN;
    private ResultSet RS;

    public Cls_Expendio() {
        this.PS = null;
        this.CN = new C_Conexion();
    }
    
    public int insertarDatos(String exp_nombre, String exp_rfc, String exp_calle, int exp_postal,
                            String exp_municipio, String exp_estado, int exp_numExterior){
        
        int res = 0;
        String SQL_Insert = "INSERT INTO expendio (exp_nombre, exp_rfc, exp_calle, exp_postal, exp_municipio, exp_estado, exp_numExterior) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PS= CN.getConexion().prepareStatement(SQL_Insert);
            PS.setString(1, exp_nombre);
            PS.setString(2, exp_rfc);
            PS.setString(3, exp_calle);
            PS.setInt(4, exp_postal);
            PS.setString(5, exp_municipio);
            PS.setString(6, exp_estado);
            PS.setInt(7, exp_numExterior);
            res = PS.executeUpdate();
            if (res > 0){
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
    
    
}
