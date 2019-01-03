package prototipo.prototipo;


import prototipo.prototipo.ProdutoDAO;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Master {
	
	public static void main(String[]args) {
		
		Scanner o = new Scanner(System.in);
		
		ProdutoDAO go = new ProdutoDAO();
		
		//Produto um = new Produto(1, "biscoito", 3.50);
		
		//go.inserir(um);
		
		int resposta = 0;
		
		int conf;
		
		String reso = null;
		
		System.out.println("APAGAR USUARIO ------> despedir");
		
		System.out.println("NOVO PRODUTO ------> inserir");
		
		System.out.println("RENOMEAR PRODUTO ------> Renomear-Produto");
		
		System.out.println("ADICIONAR USUARIO ------> novo");
		
		System.out.println("VENDER PRODUTOS ------> venda");
		
		System.out.println("LISTAR PRODUTOS ------> liste");
		
		System.out.println("APAGAR USUARIO ------> despedir");
		
		System.out.println("APAGAR PRODUTO ------> Apagar-Produto");
		
		System.out.println("LISTAR USUARIOS ------> Listar-Usuarios");
		
		System.out.println("FAZER COMPRA ------> Fazer-Compra");
		
		String a = JOptionPane.showInputDialog("O que eu devo fazer?");	
		
		
		if(a.equals("novo")) {
			
			try {
				
				UsuarioDAO r = new UsuarioDAO();
				
				int idu = Integer.parseInt(JOptionPane.showInputDialog("Diga o Id do usuario"));
				
				UsuarioDAO s = new UsuarioDAO();
				
				idu = s.VerUsuario(idu);
				
				String nome = JOptionPane.showInputDialog("Diga o nome do usuario");
				
				String cpf = JOptionPane.showInputDialog("Diga o cpf. Não digite mais que 11 digitos!!");
				
				Usuario p = new Usuario(idu,nome,cpf);
				
				r.Coloque(p);
				
				}catch(NumberFormatException e) {
					
					JOptionPane.showMessageDialog(null, "Por favor digite nos campos corretamente");
			}
		}
	
		
		else if(a.equals("inserir")) {
		
		do
			{
			
			try {
				
			try {
				
			JOptionPane.showMessageDialog(null, "Para parar clique em não, ou cancele quando eu perguntar se quiser parar");
						
			int id = Integer.parseInt(JOptionPane.showInputDialog(null,"diga o ID do produto"));
			
			Listando z = new Listando();
			
			id = z.Veridp(id);
				
			String nome = JOptionPane.showInputDialog("Qual o nome do produto?");
			
			double preco = Double.parseDouble(JOptionPane.showInputDialog("diga o preço do produto"));
			
			Produto produto = new Produto(id, nome, preco);
			
			go.inserir(produto);
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			}catch (NumberFormatException q) {
				
				JOptionPane.showMessageDialog(null, "por favor insira os dados corretemante  nos respectivos campos, não coloque virgulas nos preços, apenas separe-os por pontos");
			}
					
			}catch (NullPointerException e) {
				
				JOptionPane.showMessageDialog(null,  "insira os dados corretamente");
			}
			
			}while(resposta == JOptionPane.YES_NO_OPTION);
		
			JOptionPane.showMessageDialog(null,"operação finalizada");
			
		 }
		else if (a.equals("liste")) {
			
			Listando b = new Listando();
			
			b.listando();
			
			JOptionPane.showMessageDialog(null,"exibirei os produtos");
			
		}
		
		else if(a.equals("venda")){
			
			VendaDAO p = new VendaDAO();
			
			//
			
			int pare = 0;
			
			do{
				
			try {
				
			try {
				
			JOptionPane.showMessageDialog(null,"Clique em não quando quiser parar");
			
			Venda v = new Venda();
					
			String produto = JOptionPane.showInputDialog("Diga o produto que deseja");
			
			Venda c = new Venda();
				
			c.Adicione(produto);
		
			int qt = Integer.parseInt(JOptionPane.showInputDialog("Diga a quantidade que deseja"));
			
			v.look(produto);
			
			Venda b = new Venda();
			
			b.soma(produto,qt);
			
			pare = JOptionPane.showConfirmDialog(null, "deseja continuar a venda?");
			
			}catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "insira os dados corretamente");
			}
			
			}catch(NullPointerException e) {
				
				JOptionPane.showMessageDialog(null, "insira os dados corretamente");
				
			}
			
			if(pare == JOptionPane.CANCEL_OPTION) {
				
				JOptionPane.showMessageDialog(null,"Operação cancelada vou reinicia-lá");
			}
			
			else if(pare == JOptionPane.NO_OPTION){
				
				try{
				
				int idv = Integer.parseInt(JOptionPane.showInputDialog("diga o id dessa venda"));
				
				int quant = Integer.parseInt(JOptionPane.showInputDialog("diga a quantidade de produtos desta venda"));
				
				double valorFinal = Double.parseDouble(JOptionPane.showInputDialog("diga o valor final dessa venda"));
				
				Opvenda j = new Opvenda(idv,quant,valorFinal);
				
				p.Vd(j);
				
				}catch(NumberFormatException e){
					
					JOptionPane.showMessageDialog(null, "tente novamente");
				}
			}
			
			
			}while(pare != JOptionPane.NO_OPTION );
			
			
		}else if (a.equals("despedir")) {
			
			try {
			
			DespedidoDAO g = new DespedidoDAO();
			
			int id = Integer.parseInt(JOptionPane.showInputDialog("Diga o id pra apagar"));
			
			Despedido k = new Despedido(id);
			
			g.Demitir(k);
			
			}catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Tente novamente");
				
			}
			
		}
		
		else if(a.equals("Apagar-Produto")) {
			
			ProdutoDAO t = new ProdutoDAO();
			
			int idp = Integer.parseInt(JOptionPane.showInputDialog("Diga o ID do produto"));
			
			Produto g = new Produto(idp, "dd", 9.0);
			
			t.Remover(g);
		}
		
		else if(a.equals("Listar-Usuarios")) {
			
			UsuarioDAO g = new UsuarioDAO();
			
			g.Exibir();
		}
		
		else if(a.equals("Listar-Vendas")) {
			
			VendaDAO b = new VendaDAO();
			
			JOptionPane.showMessageDialog(null, "Exibirei as vendas existentes");
			
			b.ExibirVendas();
		}
		
		else if(a.equals("Apagar-Venda")){
			
			VendaDAO po = new VendaDAO();
			
			int idv = Integer.parseInt(JOptionPane.showInputDialog("Diga o id da venda a ser deletado"));
			
			
			Opvenda i = new Opvenda(idv,4,5);
			
			po.apagarV(i);
		}
		
		else if(a.equals("Fazer-Compra")){
			
			while(true) {
			
			System.out.println("Digite 0 pra parar");	
			
			int permissão = o.nextInt();
			
			CompraDAO c = new CompraDAO();
			
			System.out.println("diga o nome do produto");
			
			String pd = o.next();
			
			System.out.println("diga a quantidade do produto");
			
			int quantidade = o.nextInt();
			
			Venda i = new Venda();
			
			i.soma(pd,quantidade);
			
			if(permissão == 0) {
				
				break;
			}
			
			
			}
			
			CompraDAO q = new CompraDAO();
			
			System.out.println("Diga o id da compra");
			
			int id_compra = o.nextInt();
			
			System.out.println("Diga o id do usuario que fez a compra");
			
			int id_usuario = o.nextInt();
			
			System.out.println("diga a quantidade de produtos");
			
			int quantidade = o.nextInt();
			
			System.out.println("diga o valor desta compra");
			
			double preco = o.nextDouble();
			
			Compra r = new Compra(id_compra,id_usuario,quantidade,preco);
			
			q.NovaCompra(r);
			
		}
		
		else if(a.equals("Renomear-Produto")) {
			
			ProdutoDAO k = new ProdutoDAO();
			
			
			int idp1 = Integer.parseInt(JOptionPane.showInputDialog("Diga o id do produto a ser modificado"));
			
			
			String nop = JOptionPane.showInputDialog("Diga o novo nome do produto");
		
			
			Produto h = new Produto(idp1,nop,0);
			
			k.Atualize(h);
			
			
			
		}
	}
	
	

}
