package code.prueba.model;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	Connection conn = null;

    public Conexion() {
        try { conn = DriverManager.getConnection("jdbc:oracle:thin:@ASUS-K43E:1521:XE", "SYSTEM", "Admin1234"); } 
        catch (Exception e) {
        	System.out.println("====================================================================================");
        	System.out.println("El servicio 'OracleServiceXE' no esta respondiendo, intenta reiniciar el servicio...");
        	System.out.println("====================================================================================");
        }
    }
}