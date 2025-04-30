package modulo7.accesoDatos.ejemplosClase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Aucorsa {

	Connection c = null;
	
	public Aucorsa() throws SQLException{
		
		c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Aucorsa", "root", "12341234");

			
	}
	        
	
	public ArrayList<String> mostrarDatosAutobuses() throws SQLException {
		
		Statement stmt = c.createStatement(); 
		
		ArrayList<String> listaBuses = new ArrayList<String>();
		
    	ResultSet rs = stmt.executeQuery("SELECT * FROM Bus");
    	
            while (rs.next()) {
            	listaBuses.add(rs.getString(1)); 
            }
			return listaBuses;
		
		
	}
	
	public String mostrarDatosAutobusesPorLicencia(String licencia) throws SQLException {
		
		Statement stmt = c.createStatement(); 
		
		//SELECT * FROM Aucorsa.Bus where license = 'LIC0001';
		
		String sql = "SELECT * FROM Bus Where license = '" +  licencia + "'";
		
		
    	ResultSet rs = stmt.executeQuery(sql);
    	
            while (rs.next()) {
               System.out.println("Registros: " + rs.getString(1) 
               		+ "\n Tipo: "  + rs.getString(2)
               		+ "\n Licencia: "  + rs.getString(3) );
               return rs.getString(2);
            }
		
           return "";    
		
	}
	
	public void insertarDatosAutobuses(String registro, String tipo, String licencia) throws SQLException {
		
		Statement stmt = c.createStatement(); 
				
		String sql = "INSERT INTO Bus (register, type, license) VALUES (?, ?, ?)";
			 
		PreparedStatement ps = c.prepareStatement(sql);
	   
		ps.setString(1, registro);
	    ps.setString(2, tipo);
	    ps.setString(3, licencia);
	    
	    int columnasAfectadas =ps.executeUpdate();
	    
	    if (columnasAfectadas > 0)
	    {
	    	System.out.println("Columnas afectadas: "+ columnasAfectadas + "Añadido con éxito");
	    }else System.out.println("Error, no se puede actualizar");

	      
		
	}
	
	public void eliminarDatosAutobuses(String registro) throws SQLException {
		
				
		 String sql = "DELETE FROM Bus WHERE register = ?";
	   
		 PreparedStatement ps = c.prepareStatement(sql);
	     ps.setString(1, registro);
	        		
	    
	    int columnasAfectadas =ps.executeUpdate();
	    
	    if (columnasAfectadas > 0)
	    {
	    	System.out.println("Columnas afectadas: "+ columnasAfectadas + "Añadido con éxito");
	    }else System.out.println("Error, no se puede eliminar");

	      
		
	}
		 
}
	
	

