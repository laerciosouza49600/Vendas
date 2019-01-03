package prototipo.prototipo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Venda implements ListaDoBanco{

	private Connection connection;
	
	double soma = 0;
	
	double s1 = 0;
	
	public Venda() {
		
		this.connection = new Conexão().getConnection();
		
	}
	

	public void Adicione(String p) {
		
		
		String sql = "select nome from produto";
		
		try{
			
			Statement s = connection.createStatement();
			
			ResultSet resultado = s.executeQuery(sql);
			
			while(resultado.next()){
				
			String nome = resultado.getString("nome");
				
			produtos.add(resultado.getString("nome"));
			
			
				
			}
					
			}catch (SQLException e){
				
				e.printStackTrace();
			
				}
			
			}

			public void soma(String produto, int qt) {
				
				
				//Venda b = new Venda();
				
				//b.Adicione();
				
				String mysql = "select nome,preco from produto";
				
				try {
					
					Statement s = connection.createStatement();
					
					ResultSet resultado = s.executeQuery(mysql);
					
				
					while(resultado.next()) {
						
						String nome = resultado.getString("nome");
						
						double preco = resultado.getDouble("preco");
						
						if(produto.equals(nome)) {
								
							soma = soma + preco * qt;
								
							valor.add(soma);
							
							for(int i = 0; i < valor.size();i++) {
								
								s1 = s1 + valor.get(i);
							}
							
						//	System.out.println("valor é " + s1);
							
							JOptionPane.showMessageDialog(null, "A venda está dando" + " "+ s1);
							
							System.out.println("A venda está dando" + " " + s1);
							
							System.out.println("Quantidade é" + " " + qt);
							
							
						}
						
			
					}
	
							
				}catch(SQLException e) {
					
					e.printStackTrace();
				}
				
			}
			
			public void look(String produto) {
				
				Venda i = new Venda();
				
				i.Adicione(produto);
				
				if(produtos.contains(produto)) {
					
					//ook
				}else {
					
					JOptionPane.showMessageDialog(null, "Esse produto não está disponivel");
					
					int to = JOptionPane.showConfirmDialog(null, "Deseja ver os produtos disponiveis?");
					
					if(to == JOptionPane.YES_NO_OPTION) {
						
						Listando a = new Listando();
						
						a.listando();
						
					}else {
						
						JOptionPane.showMessageDialog(null, "ok tente novamente");
					}
					
					
				}
			}
			
			
			
	}
