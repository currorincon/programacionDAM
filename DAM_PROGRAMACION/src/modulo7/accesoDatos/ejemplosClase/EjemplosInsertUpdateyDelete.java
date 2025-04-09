package modulo7.accesoDatos.ejemplosClase;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class EjemplosInsertUpdateyDelete {


	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private static Connection getConexion() 
			throws ClassNotFoundException, SQLException {
		/**
		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");
		
		Class.forName(driver);

		return (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);
		*/
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		   
		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
		// le tenemos que pasar los parámetros de conexión.
		Connection conexion = (Connection) DriverManager.getConnection (
				"jdbc:mysql://127.0.0.1:3306/tutorialjavacoches?user=root",
				"root", "1234");
		return conexion;
	}
	
	
	
	/**
	 * 
	 * @return
	 * @throws SQLException 
	 */
	private static int getSiguienteIdValidoConcesionario(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from tutorialjavacoches.concesionario");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}
	
	
	
	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaInsert (Connection conn) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 

		int filasAfectadas = s.executeUpdate(
				"insert into tutorialjavacoches.concesionario "
				+ "(id, cif, nombre, localidad) values ("
				+ getSiguienteIdValidoConcesionario(conn) 
				+ ", '111111A', 'Concesionario nuevo', 'Rute')");
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	

	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaUpdate (Connection conn, String nombreMod,
			String localidadMod, int id) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.concesionario "
				+ "set nombre = '" + nombreMod + "', "
				+ "localidad = '" + localidadMod + "'\r\n"
				+ "where id = " + id);
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	
	

	/**
	 * @throws SQLException 
	 * 
	 */
	private static void realizaDelete (Connection conn, int id) throws SQLException {
				
		Statement s = (Statement) conn.createStatement(); 

		int filasAfectadas = s.executeUpdate("Delete from "
				+ "tutorialjavacoches.concesionario "
				+ "where id = " + id);
	   
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	
	

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Connection conn = getConexion();

//			realizaInsert(conn);
			realizaUpdate(conn, "Concesionario José María", "Lucena", 21);
//			realizaDelete(conn, 22);
			
			conn.close();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
}
