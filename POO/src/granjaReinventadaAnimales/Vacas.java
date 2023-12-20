package granjaReinventadaAnimales;

import java.util.Random;

public class Vacas extends Animales
{
	private boolean estaPreñada;
	
	public Vacas(String nombre, boolean buenaSalud, String nombreEspecie)
	{
		super(150, nombre, buenaSalud, nombreEspecie, 15);
		setPreñada(false);
	}
	
	public boolean isPreñada()
	{
		return this.estaPreñada;
	}
	
	public void setPreñada(boolean estaPreñada)
	{
		this.estaPreñada = estaPreñada;
	}
	
	public void sonido()
	{
		System.out.println("MUU");
	}
	
	public void producir()
	{
		int litrosLeche = 0;
		if(isPreñada())
		{
			if(isBuenaSalud())
			{
				litrosLeche = 10;
			}
			else
			{
				litrosLeche = 2;
			}
			sonido();
		}
		System.out.println("La vaca " + getNombre() + " ha producido " + litrosLeche + " litros de leche.");
		
		Random ra = new Random();
		if(ra.nextBoolean())
		{
			setPreñada(true);
		}
		else
		{
			setPreñada(false);
		}
	}
}
