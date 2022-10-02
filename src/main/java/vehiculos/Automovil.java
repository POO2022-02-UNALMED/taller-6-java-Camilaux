package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAuto;
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAuto ++;
	}
	
	public static void setCantidadAuto(int cantidadAuto) {
		Automovil.cantidadAuto = cantidadAuto;
	}
	
	public static int getCantidadAuto() {
		return cantidadAuto;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
}
