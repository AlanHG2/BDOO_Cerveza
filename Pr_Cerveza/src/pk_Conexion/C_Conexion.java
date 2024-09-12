package pk_Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C_Conexion {
    private static Connection cnx;
    private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static final String BD = "cervezas";
    private static final String USER = "root";
    private static final String PASS = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD +
            "?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConexion(){
        cnx=null;
        try{
            Class.forName(DRIVER);
            cnx=(Connection)DriverManager.getConnection(URL, USER, PASS);
        } catch(ClassNotFoundException e){
            System.out.println("Error, no se pudo realizar la conversion de la clase"
                    + e.getMessage());
        } catch (SQLException e){
            System.out.println("Error de conexion" + e.getMessage());
        }
        return cnx;
    }

    public void close(){
        if(cnx!=null){
            try {
                cnx.close();
            } catch (SQLException e) {
                System.out.println("Error, no se puede cerrar la conexion"
                        + e.getMessage());
            }
        }
    }

    public static void main (String[] args){
        C_Conexion con = new C_Conexion();
        if(con.getConexion()!= null){
            System.out.println("Conexion exitosa");
        } else{
            System.out.println("No se pudo realizar la conexion con la BD");
        }
    }
}
