package modulo7.accesoDatos;

import java.sql.*;

public class AccesoDatos {
	
	AccesoDatos(){
		
	}
	
	void comprobarDriver() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	Connection crearConexion() throws SQLException {
				
		Connection conexion = (Connection) DriverManager.getConnection (
				"jdbc:mysql://127.0.0.1:3306/aucorsa?user=laura",
				"admin", "1234");
		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
		// le tenemos que pasar los parámetros de conexión.
		return conexion;
		
	}
	
	void crearEcosistema(Connection con) throws SQLException {

		// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
		Statement s = (Statement) con.createStatement(); 
		
		ResultSet rs = s.executeQuery("select * from XXX");
		
		while (rs.next()) {
			System.out.println(rs.getInt(2));
		}
		
		
		s.close();
		rs.close();
		

	}

}
