package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static Map<Fabricante, Integer> cantidadPorFabri = new HashMap<Fabricante,Integer>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int maxi = -1;
		Fabricante eseFabricante=null;
		for(Fabricante clave:cantidadPorFabri.keySet()) {
			if(cantidadPorFabri.get(clave) > maxi) {
				maxi = cantidadPorFabri.get(clave);
				eseFabricante = clave;
			}
		}
		return eseFabricante;
	}
	
	public static Map<Fabricante, Integer> getCantidadPorFabri() {
		return cantidadPorFabri;
	}
	
}
