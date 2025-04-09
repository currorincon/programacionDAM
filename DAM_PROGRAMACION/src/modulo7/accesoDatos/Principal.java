package modulo7.accesoDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {

		AccesoDatos ac = new AccesoDatos();
		Connection con  =null;
		
		try {
		ac.comprobarDriver();
		con = ac.crearConexion();
		ac.crearEcosistema(con);
		
		
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver no encontrado. Revisa libreria");
		}catch (Exception ex) {
			System.out.println("Consulta con tu administrador de sistemas");
			ex.printStackTrace();
		}finally {
			
			try {
				
				con.close();
			} catch (SQLException e) {
				System.out.println("Programa Abortado. Revisa codigo");
				e.printStackTrace();
			}

		}
		
	}

}
