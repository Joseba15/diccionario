package diccio.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {

	private Map <String,List<String>> diccionario= new HashMap<>();

	public Diccionario () {}
	
	
	public void addPalabra(String palabra,String significado) {
		List<String>definiciones=new ArrayList<>();
		if (diccionario.containsKey(palabra)) {
			diccionario.get(palabra).add(significado);

		}else {
			definiciones.add(significado);
			diccionario.put(palabra,definiciones);
		}
	}
	
	
	public List<String> buscarPalabra(String palabra) {
		List<String> result =null;
		if (diccionario.containsKey(palabra)) {
			result = diccionario.get(palabra);
		}
		return result;
	}
	
	public void delPalabra(String palabra) {
		if (diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
		}
	}
	
	public List<String> listarPalabras(String letra) {
		diccionario.keySet();
		for (int i = 0; i < diccionario.size(); i++) {
			//diccionario[i];
			
		}
		
		return null;
	}
	
	
	
	
}













