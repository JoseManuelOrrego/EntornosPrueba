package granjaReinventadaAnimales;

public class Animales 
{
	private double peso;
	private String nombre;
	private boolean buenaSalud;
	private String nombreEspecie; //constante cuando se inicialice
	private int dosisComida;  //constante cuando se inicialice
	
	public Animales(double peso, String nombre, boolean buenaSalud, String nombreEspecie, int dosisComida)
	{
		this.peso = peso;
		this.nombre = nombre;
		this.buenaSalud = buenaSalud;
		this.nombreEspecie = nombreEspecie;
		this.dosisComida = dosisComida;
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