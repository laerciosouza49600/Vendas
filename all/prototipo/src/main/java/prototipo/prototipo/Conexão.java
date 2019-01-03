package prototipo.prototipo;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class Conexão {
	
	public Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
			
		}catch (SQLException e) {
			
			System.out.println("algo errado na conexão");
			
		}
		
		return null;
	}

}
