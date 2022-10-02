package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;
	private static Map<Pais, Integer> cantidadPorPais = new HashMap<Pais,Integer>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int maxi = -1;
		Pais esePais=null;
		for(Pais clave:cantidadPorPais.keySet()) {
			if(cantidadPorPais.get(clave) > maxi) {
				maxi = cantidadPorPais.get(clave);
				esePais = clave;
			}
		}
		return esePais;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static Map<Pais, Integer> getCantidadPorPais() {
		return cantidadPorPais;
	}
	
}
