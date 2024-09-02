package pk_Modelo;

public class Cerveza {
    private int id_Cerveza;
    private String cer_Nombre;
    private float cer_Graduacion;
    private int id_Marca;

    public Cerveza(int id_Cerveza, String cer_Nombre, float cer_Graduacion, int id_Marca) {
        this.id_Cerveza = id_Cerveza;
        this.cer_Nombre = cer_Nombre;
        this.cer_Graduacion = cer_Graduacion;
        this.id_Marca = id_Marca;
    }
    public Cerveza() {
        this.id_Cerveza = 0;
        this.cer_Nombre = null;
        this.cer_Graduacion = 0;
        this.id_Marca = 0;
    }
}
