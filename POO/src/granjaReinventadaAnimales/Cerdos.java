package granjaReinventadaAnimales;

public class Cerdos extends Animales
{
	public Cerdos(String nombre, boolean buenaSalud, String nombreEspecie)
	{
		super(50, nombre, buenaSalud, nombreEspecie, 10);
	}
	
	public void sonido()
	{
		System.out.println("OINK");
	}
}
