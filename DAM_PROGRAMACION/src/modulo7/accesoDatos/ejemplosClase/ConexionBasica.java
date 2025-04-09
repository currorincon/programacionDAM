package modulo7.accesoDatos.ejemplosClase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionBasica {
	/**
	 * 
	 */
	private static void pruebaConsultaBasica () {
		
		
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String nombre ="admin";
			String pass="1234";
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection (
					"jdbc:mysql://currorincon.com:3306/aucorsa?user=laura",
					nombre, pass);
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
		
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select edad, nombre from persona");
		   
			
			
 			System.out.println(rs.getMetaData().getColumnLabel(1) +
 					rs.getMetaData().getColumnLabel(2) + "\t " + 
 					rs.getMetaData().getColumnLabel(3) + "\t " + 
 					rs.getMetaData().getColumnLabel(4) + "\t " + 
 					rs.getMetaData().getColumnLabel(5));
 			
 			System.out.println("----------------------------------------------------------------");
			
 			
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + "\t " + rs.getString (2)+ 
						"\t " + rs.getString(3) + "\t" + rs.getString(4) + 
						"\t " + rs.getString(5)); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	private static void pruebaConsultaPorFicheroDePropiedadesYConnectionManager () {
		

		/**
		 * AÑADIR FICHERO .PROPERTIES
		 * 
		 * # parámetros de conexión a BBDD

			JDBC_DRIVER_CLASS=com.mysql.cj.jdbc.Driver
			JDBC_USER=root
			JDBC_PASSWORD=1234
			JDBC_HOST=localhost:3310
			JDBC_SCHEMA_NAME=tutorialjavacoches
			JDBC_PROPERTIES=?autoReconnect=true&serverTimezone=Europe/Madrid&useSSL=False&allowPublicKeyRetrieval=TRUE
		 * 
		 */
		
		
		try {
			
			
			Connection conexion = ConnectionManagerV1.getConexion();
		   
		   
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from coche");
		   
			
			// Navegaci�n del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString(3)); 
			}
			
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		pruebaConsultaBasica();
		//pruebaConsultaPorFicheroDePropiedadesYConnectionManager();		
		
	}

}
