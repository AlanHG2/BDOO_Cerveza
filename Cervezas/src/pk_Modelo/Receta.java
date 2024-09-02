package pk_Modelo;

public class Receta {
    private int id_Receta;
    private String rec_Procedimiento;
    private int id_Grano;
    private int id_Cerveza;

    public Receta(int id_Receta, String rec_Procedimiento, int id_Grano, int id_Cerveza) {
        this.id_Receta = id_Receta;
        this.rec_Procedimiento = rec_Procedimiento;
        this.id_Grano = id_Grano;
        this.id_Cerveza = id_Cerveza;
    }
    public Receta() {
        this.id_Receta = 0;
        this.rec_Procedimiento = null;
        this.id_Grano = 0;
        this.id_Cerveza = 0;
    }

    public int getId_Receta() {
        return id_Receta;
    }

    public void setId_Receta(int id_Receta) {
        this.id_Receta = id_Receta;
    }

    public String getRec_Procedimiento() {
        return rec_Procedimiento;
    }

    public void setRec_Procedimiento(String rec_Procedimiento) {
        this.rec_Procedimiento = rec_Procedimiento;
    }

    public int getId_Grano() {
        return id_Grano;
    }

    public void setId_Grano(int id_Grano) {
        this.id_Grano = id_Grano;
    }

    public int getId_Cerveza() {
        return id_Cerveza;
    }

    public void setId_Cerveza(int id_Cerveza) {
        this.id_Cerveza = id_Cerveza;
    }
}
