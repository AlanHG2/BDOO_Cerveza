package pk_Modelo;

public class Fabricante {
    private int id_Fabricante;
    private String fab_Nombre;
    private int id_Sede;

    public Fabricante(int id_Fabricante, String fab_Nombre, int id_Sede) {
        this.id_Fabricante = id_Fabricante;
        this.fab_Nombre = fab_Nombre;
        this.id_Sede = id_Sede;
    }
    public Fabricante() {
        this.id_Fabricante = 0;
        this.fab_Nombre = null;
        this.id_Sede = 0;
    }

    public int getId_Fabricante() {
        return id_Fabricante;
    }

    public void setId_Fabricante(int id_Fabricante) {
        this.id_Fabricante = id_Fabricante;
    }

    public String getFab_Nombre() {
        return fab_Nombre;
    }

    public void setFab_Nombre(String fab_Nombre) {
        this.fab_Nombre = fab_Nombre;
    }

    public int getId_Sede() {
        return id_Sede;
    }

    public void setId_Sede(int id_Sede) {
        this.id_Sede = id_Sede;
    }
}
