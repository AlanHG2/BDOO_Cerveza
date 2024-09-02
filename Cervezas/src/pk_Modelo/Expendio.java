package pk_Modelo;

public class Expendio {
    private int id_Expendio;
    private String exp_Nombre;
    private String exp_RFC;
    private String exp_Ubicacion;

    public Expendio(int id_Expendio, String exp_Nombre, String exp_RFC, String exp_Ubicacion) {
        this.id_Expendio = id_Expendio;
        this.exp_Nombre = exp_Nombre;
        this.exp_RFC = exp_RFC;
        this.exp_Ubicacion = exp_Ubicacion;
    }

    public int getId_Expendio() {
        return id_Expendio;
    }

    public void setId_Expendio(int id_Expendio) {
        this.id_Expendio = id_Expendio;
    }

    public String getExp_Nombre() {
        return exp_Nombre;
    }

    public void setExp_Nombre(String exp_Nombre) {
        this.exp_Nombre = exp_Nombre;
    }

    public String getExp_RFC() {
        return exp_RFC;
    }

    public void setExp_RFC(String exp_RFC) {
        this.exp_RFC = exp_RFC;
    }

    public String getExp_Ubicacion() {
        return exp_Ubicacion;
    }

    public void setExp_Ubicacion(String exp_Ubicacion) {
        this.exp_Ubicacion = exp_Ubicacion;
    }
}
