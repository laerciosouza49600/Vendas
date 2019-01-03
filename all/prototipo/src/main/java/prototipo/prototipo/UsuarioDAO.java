package prototipo.prototipo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsuarioDAO implements UsuarioE{
	
	private Connection connection;
	
	public UsuarioDAO() {
		
		this.connection = new Conexão().getConnection();
	}
	
	public void Coloque(Usuario usuario) {
		
		String sql = "insert into usuarios (id_usuario,nome,cpf) values (?,?,?)";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, usuario.getId_usuario());
			
			stmt.setString(2,usuario.getNome());
			
			stmt.setString(3,usuario.getCpf());
			
			stmt.execute();
			
			JOptionPane.showMessageDialog(null, "Feito");
			
			stmt.close();
			
		}catch (SQLException e) {
			
			System.out.println("erro ao cadastro");
			
			e.printStackTrace();
		}
	}
	
	public void Exibir() {
		
		
		String sql = "select * from usuarios";
		
		try {
			
			Statement s = connection.createStatement();
			
			ResultSet resultado = s.executeQuery(sql);
			
			while(resultado.next()) {
				
				int id_usuario = resultado.getInt("id_usuario");
				
				idusuarios.add(id_usuario);
				
				String nome = resultado.getString("nome");
				
				String cpf = resultado.getString("cpf");
				
				System.out.println("Nome do Usuario:" + " " + id_usuario + " " + "Nome:" + " " + nome + " " + "Cpf:" + " " + cpf);
			}
			
						
		}catch (SQLException e) {
			
			System.out.println("algo errado");
			
			e.printStackTrace();
		}
	}

	public int VerUsuario(int id_usuario) {
		
		UsuarioDAO d = new UsuarioDAO();
	
		d.Exibir();
			
		while(true) {
			
			if(idusuarios.contains(id_usuario)) {
			
			JOptionPane.showMessageDialog(null, "Id ja existente tente usar outro");
			
			Scanner o = new Scanner(System.in);
			
			System.out.println("Digite o ID novamente");
			
			id_usuario = o.nextInt();
			
			
			
			}else {
				
				break;
			}
			
	
		}
		
		
		return id_usuario;
		
		
	}
	
}
