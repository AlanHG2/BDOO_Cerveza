package src.pk_Modelo;

public class Grano {

    private int id_grano;
    private String gra_nombre;
    private String gra_procedencia;

    public Grano (int id_grano, String gra_nombre, String gra_procedencia){
        this.id_grano = id_grano;
        this.gra_nombre = gra_nombre;
        this.gra_procedencia = gra_procedencia;
    }

    public Grano (){
        this.id_grano = 0;
        this.gra_nombre = null;
        this.gra_procedencia = null;
    }

    public int getId_grano() {
        return id_grano;
    }

    public void setId_grano(int id_grano) {
        this.id_grano = id_grano;
    }

    public String getGra_nombre() {
        return gra_nombre;
    }

    public void setGra_nombre(String gra_nombre) {
        this.gra_nombre = gra_nombre;
    }

    public String getGra_procedencia() {
        return gra_procedencia;
    }

    public void setGra_procedencia(String gra_procedencia) {
        this.gra_procedencia = gra_procedencia;
    }

}
