package prototipo.prototipo;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ProdutoDAO {
	
	private Connection connection;
	
	public ProdutoDAO() {
		
		this.connection = new Conexão().getConnection();
	}
	
	public void inserir(Produto produto) {
		
		String sql = "insert into produto (id_produto, nome, preco) values (?,?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, produto.getId_produto());
			
			stmt.setString(2, produto.getNome());
			
			stmt.setDouble(3, produto.getPreco());
			
			stmt.execute();
			
			stmt.close();
				
		}catch (SQLException e) {
			
			System.out.println("error no cadastro");
			
			e.printStackTrace();
			
		}
		
			
	}
	
	public void Remover(Produto produto) {
		
		String sql = "delete from produto where id_produto = (?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, produto.getId_produto());
			
			stmt.execute();
			
			stmt.close();
			
			JOptionPane.showMessageDialog(null,"Produto Removido");
			
			
		}catch(SQLException e) {
			
			JOptionPane.showMessageDialog(null,"Produto Não Removido!");
			
			e.printStackTrace();
		}
	}
	
	public void Atualize(Produto produto) {
		
		String sql = "update produto set nome = (?) where id_produto = (?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,produto.getNome());
			
			stmt.setInt(2, produto.getId_produto());
			
			stmt.execute();
			
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Nome alterado!");
			
		}catch(SQLException e) {
			
			System.out.println("algo errado");
			
		}
	}
	
}
