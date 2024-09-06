package pk_Modelo;

public class Almacen {
    private int id_Almacen;
    private int alm_Existencia;
    private int alm_Capacidad;
    private int id_Presentacion;
    private int id_Expendio;

    public Almacen(int id_Almacen, int alm_Existencia, int alm_Capacidad, int id_Presentacion, int id_Expendio) {
        this.id_Almacen = id_Almacen;
        this.alm_Existencia = alm_Existencia;
        this.alm_Capacidad = alm_Capacidad;
        this.id_Presentacion = id_Presentacion;
        this.id_Expendio = id_Expendio;
    }
    public Almacen() {
        this.id_Almacen = 0;
        this.alm_Existencia = 0;
        this.alm_Capacidad = 0;
        this.id_Presentacion = 0;
        this.id_Expendio = 0;
    }

    public int getId_Almacen() {
        return id_Almacen;
    }

    public void setId_Almacen(int id_Almacen) {
        this.id_Almacen = id_Almacen;
    }

    public int getAlm_Existencia() {
        return alm_Existencia;
    }

    public void setAlm_Existencia(int alm_Existencia) {
        this.alm_Existencia = alm_Existencia;
    }

    public int getAlm_Capacidad() {
        return alm_Capacidad;
    }

    public void setAlm_Capacidad(int alm_Capacidad) {
        this.alm_Capacidad = alm_Capacidad;
    }

    public int getId_Presentacion() {
        return id_Presentacion;
    }

    public void setId_Presentacion(int id_Presentacion) {
        this.id_Presentacion = id_Presentacion;
    }

    public int getId_Expendio() {
        return id_Expendio;
    }

    public void setId_Expendio(int id_Expendio) {
        this.id_Expendio = id_Expendio;
    }
}
