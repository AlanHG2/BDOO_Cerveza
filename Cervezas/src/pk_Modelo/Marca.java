package pk_Modelo;

public class Marca {
    private int id_Marca;
    private String mar_Nombre;
    private int id_Fabricante;

    public Marca(int id_Marca, String mar_Nombre, int id_Fabricante) {
        this.id_Marca = id_Marca;
        this.mar_Nombre = mar_Nombre;
        this.id_Fabricante = id_Fabricante;
    }
    public Marca() {
        this.id_Marca = 0;
        this.mar_Nombre = null;
        this.id_Fabricante = 0;
    }
}
