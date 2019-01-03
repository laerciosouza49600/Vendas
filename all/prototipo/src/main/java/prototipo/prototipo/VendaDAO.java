package prototipo.prototipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class VendaDAO {
	
	private Connection connection;
	
	public VendaDAO(){
		
		this.connection = new Conexão().getConnection();
	}
	
	
	public void Vd(Opvenda venda){
		
		String sql = "insert into venda (id_venda,quantidade,preco) values (?,?,?)";
		
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, venda.getId_venda());
			
			stmt.setInt(2, venda.getQuantidade());
			
			stmt.setDouble(3,venda.getPreco());
			
			stmt.execute();
			
			stmt.close();
			
			
			
		}catch (SQLException e){
			
			System.out.print("erro");
			
			e.printStackTrace();
		}
	}
	
	public void ExibirVendas() {
		
		String sql = "select * from venda";
		
		try {
			
			Statement s = connection.createStatement();
				
			ResultSet resultado = s.executeQuery(sql);
			
			while(resultado.next()) {
				
				int id_venda = resultado.getInt("id_venda");
				
				int quantidade = resultado.getInt("quantidade");
				
				double preco = resultado.getDouble("preco");
				
				System.out.println("ID da venda:" + " " + id_venda + " " + "Quantidade de produtos:" + " " + quantidade + " " + "Valor da venda:" + " " + preco);
			}
			
		}	catch(SQLException e) {
			
			System.out.println("algo errado");
			
			e.printStackTrace();
		}
		
	}
	
	public void apagarV(Opvenda venda) {
		
		String sql = "delete from venda where id_venda = (?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, venda.getId_venda());
			
			stmt.execute();
			
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Venda deletada!");
			
		} catch(SQLException e) {
			
			JOptionPane.showConfirmDialog(null, "algo deu errado");
			
			e.printStackTrace();
		}
		
	}
	
}	
