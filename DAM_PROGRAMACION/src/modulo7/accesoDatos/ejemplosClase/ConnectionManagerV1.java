package modulo7.accesoDatos.ejemplosClase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManagerV1 {
	
	private static Connection conexion = null;
	
	
	public static Connection getConexion () throws SQLException {
		// Si es la primera vez que accedemos a la conexi�n, debemos instanciarla
		if (conexion == null) {
			conectar();
		}
		// Compruebo si la conexi�n sigue estando activa
		while (!conexion.isValid(5)) {
			conectar();
		}
		
		return conexion;
	}
	
	
	
	private static void conectar () throws SQLException {
		

		
		try {
			Class.forName("JDBC_DRIVER_CLASS");
		   
			conexion = (Connection) DriverManager.getConnection (
					"jdbc:mysql://127.0.0.1:3306/tutorialjavacoches?user=root",
					"root", "1234");
		   		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		}
	}
}
