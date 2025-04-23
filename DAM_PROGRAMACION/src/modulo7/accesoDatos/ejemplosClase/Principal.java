package modulo7.accesoDatos.ejemplosClase;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {

		try {
			Aucorsa aucorsa = new Aucorsa();
			
			//aucorsa.mostrarDatosAutobuses();
			//aucorsa.mostrarDatosAutobusesPorLicencia("LIC0001");
			aucorsa.insertarDatosAutobuses("PR999","RUrbano","RLIC999");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
