package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volvo;
	private static int cantidadCamioneta;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volvo) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volvo =  volvo;
		cantidadCamioneta ++;
	}
	
	public static void setCantidadCamioneta(int cantidadCamioneta) {
		Camioneta.cantidadCamioneta = cantidadCamioneta;
	}
	
	public static int getCantidadCamioneta() {
		return cantidadCamioneta;
	}
	
	public void setVolvo(boolean volvo) {
		this.volvo = volvo;
	}
	
	public boolean isVolvo() {
		return volvo;
	}

}
