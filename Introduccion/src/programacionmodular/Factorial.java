package programacionmodular;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int numero = introDato();
		int resultado = calculo(numero);
		verResultado(resultado);
	}
	
	public static int introDato()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial: ");
		int numero = entrada.nextInt();
		entrada.close();
		return numero;
	}
	
	public static int calculo(int numero)
	{
		int resultado = 1;
		for(int i = numero; i >= 1; i--)
		{
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void verResultado(int resultado)
	{
		System.out.println("El factorial del número es " + resultado);
	}
}