package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private float peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
			Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos ++;
		
		if(Pais.getCantidadPorPais().containsKey(fabricante.getPais())) {
			Pais.getCantidadPorPais().put(fabricante.getPais(),Pais.getCantidadPorPais().get(fabricante.getPais())+1);
		}
		else {
			Pais.getCantidadPorPais().put(fabricante.getPais(), 1);
		}
		
		if(Fabricante.getCantidadPorFabri().containsKey(fabricante)){
			Fabricante.getCantidadPorFabri().put(fabricante,Fabricante.getCantidadPorFabri().get(fabricante)+1);
		}
		else {
			Fabricante.getCantidadPorFabri().put(fabricante,1);
		}
	}
	
	public static String vehiculosPorTipo() {
		String cadena = "Automoviles: " + Automovil.getCantidadAuto() + "\nCamionetas: " + Camioneta.getCantidadCamioneta() + "\nCamiones: " + Camion.getCantidadCamion();
		return cadena;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

}
