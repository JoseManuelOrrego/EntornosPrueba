package granjaReinventadaAnimales;

public class Gallinas extends Animales
{
	private int numHuevos;
	
	public Gallinas(String nombre, boolean buenaSalud, String nombreEspecie)
	{
		super(1, nombre, buenaSalud, nombreEspecie, 1);
		setNumHuevos(0);
	}
	
	public int getNumHuevos() {
		return numHuevos;
	}

	public void setNumHuevos(int numHuevos) {
		this.numHuevos = numHuevos;
	}

	public void sonido()
	{
		System.out.println("PIO");
	}
	
	public void producir()
	{
		int huevosProducidos;
		if(isBuenaSalud())
		{
			setNumHuevos(getNumHuevos() + 3);
			huevosProducidos = 3;
		}
		else
		{
			setNumHuevos(getNumHuevos() + 1);
			huevosProducidos = 1;
		}
		
		sonido();
		
		System.out.println("La gallina " + getNombre() + " acaba de producir " + huevosProducidos + " huevos.");
	}
}
