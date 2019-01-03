package prototipo.prototipo;

public class Opvenda {
	

	private int id_venda, quantidade;
	
	private double preco;
	
	public int getId_venda() {
		
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		
		this.id_venda = id_venda;
	}

	public int getQuantidade() {
		
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		this.quantidade = quantidade;
	}

	public double getPreco() {
		
		return preco;
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
	}

	
	public Opvenda(int id_venda, int quantidade, double preco){
		
		this.id_venda = id_venda;
		
		this.quantidade = quantidade;
		
		this.preco = preco;
		
	}
	
}
