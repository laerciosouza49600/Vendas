package prototipo.prototipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DespedidoDAO {
	
	private Connection connection;
	
	public DespedidoDAO() {
		
		this.connection = new Conexão().getConnection();
	}
	
	public void Demitir(Despedido despedido) {
		
		String sql = "delete from usuarios where id_usuario = (?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, despedido.getId());
			
			stmt.execute();
			
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "usuario apagado");
			
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "algo deu errado");
			
			e.printStackTrace();
		}
	}
	
}
