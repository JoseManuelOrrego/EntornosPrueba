package ruleta;

import java.util.Random;

public class Principal 
{
	public static void main(String[]args) 
	{
		Jugador j1 = new Jugador("Steve", 10000);
		Jugador j2 = new Jugador("Pikachu", 10000);
		Ruleta ruleta = new Ruleta();
		
		boolean salida = false;
		int count = 0;
		while(!salida)
		{
			if(j1.getDinero() < 100 || j2.getDinero() < 100)
			{
				salida = true;
				System.out.println("Fin del juego! \nDinero del jugador 1 -> " + j1.getDinero() + "\nDinero del jugador 2 -> " + j2.getDinero());
				if(j1.getDinero() < 100 && j2.getDinero() < 100)
				{
					System.out.println("EMPATE");
				}
				else if(j1.getDinero() < 100)
				{
					System.out.println("Ha ganado el jugador 2!!!!");
				}
				else if(j2.getDinero() < 100)
				{
					System.out.println("Ha ganado el jugador 1!!!!");
				}
			}
			else
			{
				Random rand = new Random();
				System.out.println("Partida Nº " + (count+1));
				System.out.println("Jugador 1");
				//int numero1 = j1.elegirNumero();
				int numero1 = rand.nextInt(36 - 0 + 1) + 1;
				System.out.println("Jugador 2");
				//int numero2 = j2.elegirNumero();
				int numero2 = rand.nextInt(36 - 0 + 1) + 1;
				
				int aleatorio = ruleta.girarRuleta();
				System.out.println("Numero agraciado -> " + aleatorio);
				
				if(numero1 == aleatorio)
				{
					j1.ganar(true);
					System.out.println("Jugador 1 ha ganado!");
				}
				else
					j1.ganar(false);
				if(numero2 == aleatorio)
				{
					j2.ganar(true);
					System.out.println("Jugador 2 ha ganado!");
				}
				else
					j2.ganar(false);
				
				System.out.println("");
				System.out.println("Dinero del jugador 1 -> " + j1.getDinero());
				System.out.println("Dinero del jugador 2 -> " + j2.getDinero());
				System.out.println("");
				
				//if(count == 9)
				//	salida = true;
				count++;
				
				if(j1.getDinero() > 30000 && j2.getDinero() >= 30000)
				{
					System.out.println("EMPATE");
					salida = true;
				}
				else if(j1.getDinero() >= 30000)
				{
					System.out.println("Ha ganado el jugador 1!!!!");
					salida = true;
				}
				else if(j2.getDinero() >= 30000)
				{
					System.out.println("Ha ganado el jugador 2!!!!");
					salida = true;
				}
			}
		}
	}
}