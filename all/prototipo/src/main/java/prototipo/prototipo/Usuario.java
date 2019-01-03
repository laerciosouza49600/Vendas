package prototipo.prototipo;

public class Usuario {
	
	private int id_usuario;
	
	private String nome, cpf;
	
	public int getId_usuario() {
		
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getCpf() {
		
		return cpf;
	}

	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}
	
	public Usuario (int id_usuario, String nome, String cpf) {
		
		this.id_usuario = id_usuario;
		
		this.nome = nome;
		
		this.cpf = cpf;
	}


	
}
