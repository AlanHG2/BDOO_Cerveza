package pk_Modelo;

public class Venta {
    private int id_Venta;
    private double ven_PrecioU;
    private int ven_Cantidad;
    private String ven_Fecha;
    private int id_Expendio;
    private int id_Presentacion;

    public Venta(int id_Venta, double ven_PrecioU, int ven_Cantidad, String ven_Fecha, int id_Expendio, int id_Presentacion) {
        this.id_Venta = id_Venta;
        this.ven_PrecioU = ven_PrecioU;
        this.ven_Cantidad = ven_Cantidad;
        this.ven_Fecha = ven_Fecha;
        this.id_Expendio = id_Expendio;
        this.id_Presentacion = id_Presentacion;
    }
    public Venta() {
        this.id_Venta = 0;
        this.ven_PrecioU = 0;
        this.ven_Cantidad = 0;
        this.ven_Fecha = null;
        this.id_Expendio = 0;
        this.id_Presentacion = 0;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public double getVen_PrecioU() {
        return ven_PrecioU;
    }

    public void setVen_PrecioU(double ven_PrecioU) {
        this.ven_PrecioU = ven_PrecioU;
    }

    public int getVen_Cantidad() {
        return ven_Cantidad;
    }

    public void setVen_Cantidad(int ven_Cantidad) {
        this.ven_Cantidad = ven_Cantidad;
    }

    public String getVen_Fecha() {
        return ven_Fecha;
    }

    public void setVen_Fecha(String ven_Fecha) {
        this.ven_Fecha = ven_Fecha;
    }

    public int getId_Expendio() {
        return id_Expendio;
    }

    public void setId_Expendio(int id_Expendio) {
        this.id_Expendio = id_Expendio;
    }

    public int getId_Presentacion() {
        return id_Presentacion;
    }

    public void setId_Presentacion(int id_Presentacion) {
        this.id_Presentacion = id_Presentacion;
    }
}
