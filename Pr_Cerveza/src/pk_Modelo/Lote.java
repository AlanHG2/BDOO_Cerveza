/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk_Modelo;

public class Lote {
    
    public int id_lote;
    public int id_cerveza;
    public String lot_fecha_prod;
    public String lot_fecha_cadu;
    public int lot_cantidad;

    public Lote(int id_lote, int id_cerveza, String lot_fecha_prod, String lot_fecha_cadu, int lot_cantidad) {
        this.id_lote = id_lote;
        this.id_cerveza = id_cerveza;
        this.lot_fecha_prod = lot_fecha_prod;
        this.lot_fecha_cadu = lot_fecha_cadu;
        this.lot_cantidad = lot_cantidad;
    }

    public Lote() {
        this.id_lote = 0;
        this.id_cerveza = 0;
        this.lot_fecha_prod = null;
        this.lot_fecha_cadu = null;
        this.lot_cantidad = 0;
    }

    public int getId_lote() {
        return id_lote;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }

    public int getId_cerveza() {
        return id_cerveza;
    }

    public void setId_cerveza(int id_cerveza) {
        this.id_cerveza = id_cerveza;
    }

    public String getLot_fecha_prod() {
        return lot_fecha_prod;
    }

    public void setLot_fecha_prod(String lot_fecha_prod) {
        this.lot_fecha_prod = lot_fecha_prod;
    }

    public String getLot_fecha_cadu() {
        return lot_fecha_cadu;
    }

    public void setLot_fecha_cadu(String lot_fecha_cadu) {
        this.lot_fecha_cadu = lot_fecha_cadu;
    }

    public int getLot_cantidad() {
        return lot_cantidad;
    }

    public void setLot_cantidad(int lot_cantidad) {
        this.lot_cantidad = lot_cantidad;
    }
        
    
}
