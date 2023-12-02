package examen1;

import java.util.Random;

public class Granja 
{
	public static void main(String[] args) 
	{
		Random generador = new Random();
		
		Vaca cow1 = new Vaca();
		Vaca cow2 = new Vaca("Pedrita");
		Vaca cow3 = new Vaca("Teresita");
		Vaca cow4 = new Vaca("Pepita",300);
		Vaca cow5 = new Vaca("Juanita",400);
		Vaca cow6 = new Vaca("Marinita",500);
		
		int cantidad = 10;
		for(int i = 0; i < 7; i++)
		{
			cow1.pastar(generador.nextInt(21));
			cow1.comer(cantidad);
			cow2.pastar(generador.nextInt(21));
			cow2.comer(cantidad);
			cow3.pastar(generador.nextInt(21));
			cow3.comer(cantidad);
			cow4.pastar(generador.nextInt(21));
			cow4.comer(cantidad);
			cow5.pastar(generador.nextInt(21));
			cow5.comer(cantidad);
			cow6.pastar(generador.nextInt(21));
			cow6.comer(cantidad);
			cantidad += 10;
		}
		
		boolean salida = false;
		
		while(!salida)
		{
			if(cow1.getPeso() > 400)
			{
				cow1.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		salida = false;
		while(!salida)
		{
			if(cow2.getPeso() > 400)
			{
				cow2.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		salida = false;
		while(!salida)
		{
			if(cow3.getPeso() > 400)
			{
				cow3.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		salida = false;
		while(!salida)
		{
			if(cow4.getPeso() > 400)
			{
				cow4.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		salida = false;
		while(!salida)
		{
			if(cow5.getPeso() > 400)
			{
				cow5.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		salida = false;
		while(!salida)
		{
			if(cow6.getPeso() > 400)
			{
				cow6.adelgazar(generador.nextInt(38));
			}
			else
			{
				salida = true;
			}
		}
		
		System.out.println("\nInfo de las vacas -> ");
		
		System.out.println("Vaca 1");
		System.out.println("Nombre: " + cow1.getNombre());
		System.out.println("Peso: " + cow1.getPeso() + " kg");
		
		System.out.println("Vaca 2");
		System.out.println("Nombre: " + cow2.getNombre());
		System.out.println("Peso: " + cow2.getPeso() + " kg");
		
		System.out.println("Vaca 3");
		System.out.println("Nombre: " + cow3.getNombre());
		System.out.println("Peso: " + cow3.getPeso() + " kg");
		
		System.out.println("Vaca 4");
		System.out.println("Nombre: " + cow4.getNombre());
		System.out.println("Peso: " + cow4.getPeso() + " kg");
		
		System.out.println("Vaca 5");
		System.out.println("Nombre: " + cow5.getNombre());
		System.out.println("Peso: " + cow5.getPeso() + " kg");
		
		System.out.println("Vaca 6");
		System.out.println("Nombre: " + cow6.getNombre());
		System.out.println("Peso: " + cow6.getPeso() + " kg");
	}
}