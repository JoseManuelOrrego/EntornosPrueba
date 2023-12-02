package programacionmodular;

import java.util.Scanner;

public class PotenciaRecursiva 
{
	public static void main(String[] args) 
	{
		int contador = 0;
		int base = introDatos(contador);
		contador = contador + 1;
		int exponente = introDatos(contador);
		int resultado = potencia(base, exponente);
		verResultado(resultado);
	}
	
	public static int introDatos(int contador)
	{
		Scanner entrada = new Scanner(System.in);
		if(contador == 0)
		{
			System.out.print("Introduce la base de la potencia: ");
			int base = entrada.nextInt();
			entrada.close();
			return base;
		}
		else
		{
			System.out.print("Introduce el exponente de la potencia: ");
			int exponente = entrada.nextInt();
			entrada.close();
			return exponente;
		}
	}
	
	public static int potencia(int base, int exponente)
	{
		if(exponente == 0)
			return 1;
		return base*potencia(base,exponente-1);
	}
	
	public static void verResultado(int resultado)
	{
		System.out.println("EL resultado de la potencia es: " + resultado);
	}
}