package pk_Modelo;

public class Pedido {
    private int id_Pedido;
    private int id_Presentacion;
    private int id_Expendio;
    private int ped_Cantidad;
    private String ped_FechaOrden;
    private String ped_FechaDesp;
    private double ped_Total;
    private double ped_Subtotal;
    private double ped_IVA;

    public Pedido(int id_Pedido, int id_Presentacion, int id_Expendio, int ped_Cantidad, String ped_FechaOrden, String ped_FechaDesp, double ped_Total, double ped_Subtotal, double ped_IVA) {
        this.id_Pedido = id_Pedido;
        this.id_Presentacion = id_Presentacion;
        this.id_Expendio = id_Expendio;
        this.ped_Cantidad = ped_Cantidad;
        this.ped_FechaOrden = ped_FechaOrden;
        this.ped_FechaDesp = ped_FechaDesp;
        this.ped_Total = ped_Total;
        this.ped_Subtotal = ped_Subtotal;
        this.ped_IVA = ped_IVA;
    }
    public Pedido() {
        this.id_Pedido = 0;
        this.id_Presentacion = 0;
        this.id_Expendio = 0;
        this.ped_Cantidad = 0;
        this.ped_FechaOrden = null;
        this.ped_FechaDesp = null;
        this.ped_Total = 0;
        this.ped_Subtotal = 0;
        this.ped_IVA = 0;
    }

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
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

    public int getPed_Cantidad() {
        return ped_Cantidad;
    }

    public void setPed_Cantidad(int ped_Cantidad) {
        this.ped_Cantidad = ped_Cantidad;
    }

    public String getPed_FechaOrden() {
        return ped_FechaOrden;
    }

    public void setPed_FechaOrden(String ped_FechaOrden) {
        this.ped_FechaOrden = ped_FechaOrden;
    }

    public String getPed_FechaDesp() {
        return ped_FechaDesp;
    }

    public void setPed_FechaDesp(String ped_FechaDesp) {
        this.ped_FechaDesp = ped_FechaDesp;
    }

    public double getPed_Total() {
        return ped_Total;
    }

    public void setPed_Total(double ped_Total) {
        this.ped_Total = ped_Total;
    }

    public double getPed_Subtotal() {
        return ped_Subtotal;
    }

    public void setPed_Subtotal(double ped_Subtotal) {
        this.ped_Subtotal = ped_Subtotal;
    }

    public double getPed_IVA() {
        return ped_IVA;
    }

    public void setPed_IVA(double ped_IVA) {
        this.ped_IVA = ped_IVA;
    }
}
