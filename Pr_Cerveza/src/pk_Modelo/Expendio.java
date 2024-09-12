package pk_Modelo;


public class Expendio {
    private int id_Expendio;
    private String exp_Nombre;
    private String exp_RFC;
    private String exp_Calle;
    private int exp_Postal;
    private String exp_Municipio;
    private String exp_Estado;
    private int exp_NumExterior;


    public Expendio(int id_Expendio, String exp_Nombre, String exp_RFC, String exp_Calle, 
                    int exp_Postal, String exp_Municipio, String exp_Estado, int exp_NumExterior) {
        this.id_Expendio = id_Expendio;
        this.exp_Nombre = exp_Nombre;
        this.exp_RFC = exp_RFC;
        this.exp_Calle = exp_Calle;
        this.exp_Postal = exp_Postal;
        this.exp_Municipio = exp_Municipio;
        this.exp_Estado = exp_Estado;
        this.exp_NumExterior = exp_NumExterior;
    }

    public Expendio() {
        this.id_Expendio = 0; // Valor predeterminado
        this.exp_Nombre = "";
        this.exp_RFC = "";
        this.exp_Calle = "";
        this.exp_Postal = 0;
        this.exp_Municipio = "";
        this.exp_Estado = "";
        this.exp_NumExterior = 0;
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

    public String getExp_Calle() {
        return exp_Calle;
    }

    public void setExp_Calle(String exp_Calle) {
        this.exp_Calle = exp_Calle;
    }

    public int getExp_Postal() {
        return exp_Postal;
    }

    public void setExp_Postal(int exp_Postal) {
        this.exp_Postal = exp_Postal;
    }

    public String getExp_Municipio() {
        return exp_Municipio;
    }

    public void setExp_Municipio(String exp_Municipio) {
        this.exp_Municipio = exp_Municipio;
    }

    public String getExp_Estado() {
        return exp_Estado;
    }

    public void setExp_Estado(String exp_Estado) {
        this.exp_Estado = exp_Estado;
    }

    public int getExp_NumExterior() {
        return exp_NumExterior;
    }

    public void setExp_NumExterior(int exp_NumExterior) {
        this.exp_NumExterior = exp_NumExterior;
    }
 
}