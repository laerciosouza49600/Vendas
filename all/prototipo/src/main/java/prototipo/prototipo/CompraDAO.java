package prototipo.prototipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompraDAO {
	
	private Connection connection;
	
	public CompraDAO() {
		
		this.connection = new Conexão().getConnection();
	}
	
	public void NovaCompra(Compra compra) {
		
		String sql = "insert into compra (id_compra,id_usuario,quantidade,preco) values (?,?,?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, compra.getId_compra());
			
			stmt.setInt(2, compra.getId_usuario());
			
			stmt.setInt(3, compra.getQuantidade());
			
			stmt.setDouble(4, compra.getPreco());
			
			System.out.println("feito");
			
			stmt.execute();
			
			stmt.close();
			
		}catch (SQLException e) {
			
			System.out.println("algo errado");
			
		}
	}
	
}
