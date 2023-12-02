package granjita;

public class Cerdo {
	private int peso;
	private int edad;
	private String nombre;
	private Fecha fechaNacimiento;
	
	public Cerdo() {
		peso=0;
		edad=0;
		nombre = "cerdo";
	}
	
	public Cerdo(int peso,int edad,boolean esBellota, String nombre) {
		this.peso=peso;
		this.edad=edad;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPeso() {
		return peso;
	}
	
	public Fecha getFecha() {
		return fechaNacimiento;
	}
	public void setFecha(Fecha fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public void comer() {
		peso++;
	}	
	
	public void comer(int cantidad) {
		if(cantidad > 3) {
			peso+=4;
		}else {
			peso = peso + cantidad;
		}
	}
	
	
	
	
	
	
	

	public void mostrarInformacion() {
		System.out.println("Hola, me llamo "+nombre+
				" y peso "+peso+" kg.");
	}
	public void mostrarInformacion(boolean quieroEdad) {
		
		System.out.println("Hola, me llamo "+nombre+
				" y peso "+peso+" kg.");
		if(quieroEdad) {
			System.out.println("Tengo "+edad+" años.");
		}
	}
}
