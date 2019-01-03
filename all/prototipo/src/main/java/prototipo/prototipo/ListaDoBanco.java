package prototipo.prototipo;

import java.util.ArrayList;

import java.util.List;


public interface ListaDoBanco {
	
	List<String> produtos = new ArrayList<String>();
	
	List<Double> valor = new ArrayList<Double>();
	
	public void Adicione(String p);
	
	
}
