package aleatorio;

import java.util.Random;

public class Dado 
{
	private Random generador;
	private final int superior;
	private final int inferior;
	
	//public Dado()
	{
		generador = new Random();
		superior = 6;
		inferior = 1;
	}
	
	public int tirada()
	{
		return generador.nextInt(superior - inferior + 1) + inferior;
	}
}