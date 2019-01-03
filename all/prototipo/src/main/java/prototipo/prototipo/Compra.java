package prototipo.prototipo;

public class Compra {
	
	private int id_compra, id_usuario,quantidade;

	private double preco;
	
	public int getId_compra() {
		
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		
		this.id_compra = id_compra;
	}

	public int getId_usuario() {
		
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		
		this.id_usuario = id_usuario;
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
	
	public Compra(int id_compra,int id_usuario,int quantidade,double preco) {
		
		this.id_compra = id_compra;
		
		this.id_usuario = id_usuario;
		
		this.quantidade = quantidade;
		
		this.preco = preco;
	}
}
