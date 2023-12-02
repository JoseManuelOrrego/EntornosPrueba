package aleatorio;

import java.util.Random;

public class Aleatorio {
	public static void main (String []args) {
		
		Random generador = new Random();
		
		//genera un numero aleatorio entre 0 y 4
		int numAleatorio = generador.nextInt(5);
		
		//genera un decimal aleatorio entre 0 y 156 excluido
		double decimalAleatorio = generador.nextDouble(156);
		
		System.out.println(numAleatorio);
		System.out.println(decimalAleatorio);
		
		//genera y muestra 10 numeros aleatorios entre 0 y 10
		for(int i = 0; i < 10; i++) {
			System.out.print(generador.nextInt(11)+" ");
			
		}
		
		//genera numeros aleatorios dado un rango (5-15)
		int rangoInferior = 5;
		int rangoSuperior = 15;
		numAleatorio = generador.nextInt(rangoSuperior - rangoInferior + 1) + rangoInferior;
		System.out.println(numAleatorio);		
		
	}

}