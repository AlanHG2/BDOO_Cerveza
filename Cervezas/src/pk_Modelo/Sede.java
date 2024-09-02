package src.pk_Modelo;

public class Sede {
    private int id_Sede;
    private String sed_Nombre;
    private String sed_Telefono;
    private String sed_Tipo;
    private String sed_Estado;
    private String sed_Ubicacion;

    public Sede(int id_Sede, String sed_Nombre, String sed_Telefono, String sed_Tipo, String sed_Estado, String sed_Ubicacion) {
        this.id_Sede = id_Sede;
        this.sed_Nombre = sed_Nombre;
        this.sed_Telefono = sed_Telefono;
        this.sed_Tipo = sed_Tipo;
        this.sed_Estado = sed_Estado;
        this.sed_Ubicacion = sed_Ubicacion;
    }

    public Sede() {
        this.id_Sede = 0;
        this.sed_Nombre = null;
        this.sed_Telefono = null;
        this.sed_Tipo = null;
        this.sed_Estado = null;
        this.sed_Ubicacion = null;
    }

    public int getId_Sede() {
        return id_Sede;
    }

    public void setId_Sede(int id_Sede) {
        this.id_Sede = id_Sede;
    }

    public String getSed_Nombre() {
        return sed_Nombre;
    }

    public void setSed_Nombre(String sed_Nombre) {
        this.sed_Nombre = sed_Nombre;
    }

    public String getSed_Telefono() {
        return sed_Telefono;
    }

    public void setSed_Telefono(String sed_Telefono) {
        this.sed_Telefono = sed_Telefono;
    }

    public String getSed_Tipo() {
        return sed_Tipo;
    }

    public void setSed_Tipo(String sed_Tipo) {
        this.sed_Tipo = sed_Tipo;
    }

    public String getSed_Estado() {
        return sed_Estado;
    }

    public void setSed_Estado(String sed_Estado) {
        this.sed_Estado = sed_Estado;
    }

    public String getSed_Ubicacion() {
        return sed_Ubicacion;
    }

    public void setSed_Ubicacion(String sed_Ubicacion) {
        this.sed_Ubicacion = sed_Ubicacion;
    }
}
