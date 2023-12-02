package programacionmodular;

import java.util.Scanner;

//Calcular las combinaciones de m elementos tomados de n en n. Valide que m no puede ser 
//negativo. Valide que n no puede ser negativo o mayor que m.

public class CombinacionesMN 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int m = introM();
		int n = introN(m);
		long resultado = calculo(m, n);
		verResultado(resultado);
	}
	
	public static int introM()
	{
		boolean valido = false;
		int m = 0;
		System.out.print("Introduce el elemento M: ");
		while(!valido)
		{
			m = sc.nextInt();
			valido = (m >= 0);
			if(!valido)
				System.out.print("Error, no puede ser negativo el elemento m. Vuelve a intentarlo: ");
		}
		return m;
	}
	
	public static int introN(int m)
	{
		boolean valido = false;
		int n = 0;
		System.out.print("Introduce el elemento N: ");
		while(!valido)
		{
			n = sc.nextInt();
			valido = (n >= 0 && n <= m);
			if(!valido)
				System.out.print("Error, no puede ser negativo ni superar a m. Vuelve a intentarlo: ");
		}
		return n;
	}
	
	public static long calculo(int m, int n)
	{
		return factorial(m) / (factorial(n) * factorial(m-n));
	}
	
	public static long factorial(int numero)
	{
		long resultado = 1;
		for(int i = numero; i >= 1; i--)
		{
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void verResultado(long resultado)
	{
		System.out.println("Hay " + resultado + " combinaciones.");
	}
}