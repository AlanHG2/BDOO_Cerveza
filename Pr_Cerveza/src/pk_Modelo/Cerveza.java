package pk_Modelo;

public class Cerveza {
    private int id_Cerveza;
    private String cer_Nombre;
    private float cer_Graduacion;
    private int id_Marca;
    private int cer_existencia_total;

    public Cerveza(int id_Cerveza, String cer_Nombre, float cer_Graduacion, int id_Marca
    , int cer_existencia_total) {
        this.id_Cerveza = id_Cerveza;
        this.cer_Nombre = cer_Nombre;
        this.cer_Graduacion = cer_Graduacion;
        this.id_Marca = id_Marca;
        this.cer_existencia_total = cer_existencia_total;
    }
    public Cerveza() {
        this.id_Cerveza = 0;
        this.cer_Nombre = null;
        this.cer_Graduacion = 0;
        this.id_Marca = 0;
    }

    public int getId_Cerveza() {
        return id_Cerveza;
    }

    public void setId_Cerveza(int id_Cerveza) {
        this.id_Cerveza = id_Cerveza;
    }

    public String getCer_Nombre() {
        return cer_Nombre;
    }

    public void setCer_Nombre(String cer_Nombre) {
        this.cer_Nombre = cer_Nombre;
    }

    public float getCer_Graduacion() {
        return cer_Graduacion;
    }

    public void setCer_Graduacion(float cer_Graduacion) {
        this.cer_Graduacion = cer_Graduacion;
    }

    public int getId_Marca() {
        return id_Marca;
    }

    public void setId_Marca(int id_Marca) {
        this.id_Marca = id_Marca;
    }

    public int getCer_existencia_total() {
        return cer_existencia_total;
    }

    public void setCer_existencia_total(int cer_existencia_total) {
        this.cer_existencia_total = cer_existencia_total;
    }
}
