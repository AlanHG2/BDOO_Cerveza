package pk_Modelo;

public class Sede {
    private int id_Sede;
    private String sed_Nombre;
    private String sed_Telefono;
    private String sed_Tipo;
    private String sed_Calle;
    private int sed_CPostal;
    private String sed_Municipio;
    private String sed_Estado;
    private int sed_NumExt;

    public Sede(int id_Sede, String sed_Nombre, String sed_Telefono, String sed_Tipo, String sed_Calle, int sed_CPostal, String sed_Municipio, String sed_Estado, int sed_NumExt) {
        this.id_Sede = id_Sede;
        this.sed_Nombre = sed_Nombre;
        this.sed_Telefono = sed_Telefono;
        this.sed_Tipo = sed_Tipo;
        this.sed_Calle = sed_Calle;
        this.sed_CPostal = sed_CPostal;
        this.sed_Municipio = sed_Municipio;
        this.sed_Estado = sed_Estado;
        this.sed_NumExt = sed_NumExt;
    }
    public Sede() {
        this.id_Sede = 0;
        this.sed_Nombre = null;
        this.sed_Telefono = null;
        this.sed_Tipo = null;
        this.sed_Calle = null;
        this.sed_CPostal = 0;
        this.sed_Municipio = null;
        this.sed_Estado = null;
        this.sed_NumExt = 0;
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

    public String getSed_Calle() {
        return sed_Calle;
    }

    public void setSed_Calle(String sed_Calle) {
        this.sed_Calle = sed_Calle;
    }

    public int getSed_CPostal() {
        return sed_CPostal;
    }

    public void setSed_CPostal(int sed_CPostal) {
        this.sed_CPostal = sed_CPostal;
    }

    public String getSed_Municipio() {
        return sed_Municipio;
    }

    public void setSed_Municipio(String sed_Municipio) {
        this.sed_Municipio = sed_Municipio;
    }

    public String getSed_Estado() {
        return sed_Estado;
    }

    public void setSed_Estado(String sed_Estado) {
        this.sed_Estado = sed_Estado;
    }

    public int getSed_NumExt() {
        return sed_NumExt;
    }

    public void setSed_NumExt(int sed_NumExt) {
        this.sed_NumExt = sed_NumExt;
    }
    
    
    
}
