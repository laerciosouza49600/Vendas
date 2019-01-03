package prototipo.prototipo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Listando implements VerProdutos{
	
	private Connection connection;
	
	public Listando() {
		
		this.connection = new Conexão().getConnection();
	}
	
	
	public void listando() {
		
		String sql = "select * from produto";
		
		try {
			
			Statement s = connection.createStatement();
			
			
			ResultSet resultado = s.executeQuery(sql);
			
			while(resultado.next()) {
				
				int id_produto = resultado.getInt("id_produto");
				
				idsprodutos.add(id_produto);
				
				String nome = resultado.getString("nome");
				
				double preco = resultado.getDouble("preco");
				
				
				System.out.println("Produto: ID" + "- " + id_produto + "- NOME" +  "- " + nome + "- "+  "PREÇO" + "-" + preco);
			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}


	public int Veridp(int id_produto) {
		
		Listando a = new Listando();
		
		a.listando();
		
		while (true) {
			
			if(idsprodutos.contains(id_produto)) {
				
				JOptionPane.showMessageDialog(null, "Id ja existente tente usar outro");
				
				Scanner o = new Scanner(System.in);
				
				System.out.println("Digite o ID novamente");
				
				id_produto = o.nextInt();
				
				
				
				
			}else {
				
				break;
			}
		}
		
		
		return id_produto;
	}
		
		
	
	
	
}
