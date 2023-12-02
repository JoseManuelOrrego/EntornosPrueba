package examen1;

import java.util.Scanner;

import java.util.Random;

public class PatataCaliente 
{
	public static void main(String[] args) 
	{
		Random generador = new Random();
		int rangoInferior = 1;
		int rangoSuperior = 20;
		int numSecreto = generador.nextInt(rangoSuperior - rangoInferior +
		1) + rangoInferior;
		
		int adivinado = jugar();
		int contador = 1;
		boolean salida = false;
		salida = (adivinado == numSecreto);
		
		while(!salida)
		{
			if(adivinado > numSecreto)
			{
				System.out.println("El numero introducido es mayor que el buscado.");
				contador++;
				adivinado = jugar();
			}
			else if(adivinado < numSecreto)
			{
				System.out.println("El numero introducido es menor que el buscado.");
				contador++;
				adivinado = jugar();
			}
			else
			{
				System.out.println("¡Enhorabuena! Has acertado");
				salida = true;
			}
			
			if(contador >= 6)
			{
				System.out.println("¡La patata ha explotado! Fin del juego");
				salida = true;
			}
		}
	}
	
	public static int jugar()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = 0;
		
		boolean salida = false;
		while(!salida)
		{
			numero = entrada.nextInt();
			salida = (numero >= 1 && numero <= 20);
			if(!salida)
				System.out.print("Incorrecto. El numero tiene que estar entre 1 y 20: ");
		}
		entrada.close();
		
		return numero;
	}
}