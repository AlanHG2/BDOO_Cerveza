/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_Modelo;

/**
 *
 * @author jadey
 */
public class Presentacion {
    
    public int id_presentacion;
    public int id_cerveza;
    public String pre_descripcion;
    public String pre_tipo_envase;
    public int pre_capacidad;

    public Presentacion(int id_presentacion, int id_cerveza, String pre_descripcion, String pre_tipo_envase, int pre_capacidad) {
        this.id_presentacion = id_presentacion;
        this.id_cerveza = id_cerveza;
        this.pre_descripcion = pre_descripcion;
        this.pre_tipo_envase = pre_tipo_envase;
        this.pre_capacidad = pre_capacidad;
    }

    public Presentacion() {      
        this.id_presentacion = 0;
        this.id_cerveza = 0;
        this.pre_descripcion = null;
        this.pre_tipo_envase = null;
        this.pre_capacidad = 0;        
    }

    public int getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public int getId_cerveza() {
        return id_cerveza;
    }

    public void setId_cerveza(int id_cerveza) {
        this.id_cerveza = id_cerveza;
    }

    public String getPre_descripcion() {
        return pre_descripcion;
    }

    public void setPre_descripcion(String pre_descripcion) {
        this.pre_descripcion = pre_descripcion;
    }

    public String getPre_tipo_envase() {
        return pre_tipo_envase;
    }

    public void setPre_tipo_envase(String pre_tipo_envase) {
        this.pre_tipo_envase = pre_tipo_envase;
    }

    public int getPre_capacidad() {
        return pre_capacidad;
    }

    public void setPre_capacidad(int pre_capacidad) {
        this.pre_capacidad = pre_capacidad;
    }
    
        
    
}
