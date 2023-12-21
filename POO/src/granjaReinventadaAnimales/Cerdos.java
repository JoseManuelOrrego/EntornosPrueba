package granjaReinventadaAnimales;

public class Cerdos extends Animales
{
	public Cerdos(String nombre)
	{
		super(50, nombre, "Cerdos", 10);
	}
	
	public void sonido()
	{
		System.out.println("OINK");
	}
}
