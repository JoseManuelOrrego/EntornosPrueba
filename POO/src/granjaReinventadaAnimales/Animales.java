package granjaReinventadaAnimales;

public class Animales 
{
	private double peso;
	private String nombre;
	private boolean buenaSalud;
	private final String nombreEspecie;
	private final int dosisComida;
	
	public Animales(double peso, String nombre, String nombreEspecie, int dosisComida)
	{
		this.peso = peso;
		this.nombre = nombre;
		this.nombreEspecie = nombreEspecie;
		this.dosisComida = dosisComida;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBuenaSalud() {
		return buenaSalud;
	}

	public void setBuenaSalud(boolean buenaSalud) {
		this.buenaSalud = buenaSalud;
	}

	public String getNombreEspecie() {
		return nombreEspecie;
	}

	public int getDosisComida() {
		return dosisComida;
	}


	//Métodos de un animal: hacerSonido, comer, cuidados, producir
	public void sonido()
	{
		System.out.println("MMM");
	}
	
	public void comer(boolean esEficiente)
	{
		if(esEficiente && buenaSalud)
		{
			peso *= 0.1*dosisComida;
		}
		else
		{
			peso *= 0.01*dosisComida;
		}
	}
	
	public void cuidado(boolean esExperimentado)
	{
		if(esExperimentado)
		{
			buenaSalud = true;
			sonido();
		}
		else
		{
			buenaSalud = false;
		}
	}
	
	public void producir()
	{
		sonido();
	}
}