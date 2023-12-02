package programacionmodular;

import java.util.Scanner;

public class MCD 
{
	public static void main(String[] args) 
	{
		int contador = 0;
		int numero1 = introDatos(contador);
		int numero2 = introDatos(contador);
		int mcd = calcMCD(numero1, numero2);
		verResultado(mcd);
	}
	
	public static int introDatos(int contador)
	{
		Scanner entrada = new Scanner(System.in);
		if(contador == 0)
		{
			System.out.print("Introduce el primer número: ");
			int numero1 = entrada.nextInt();
			entrada.close();
			return numero1;
		}
		else
		{
			System.out.print("Introduce el segundo número: ");
			int numero2 = entrada.nextInt();
			entrada.close();
			return numero2;
		}
	}
	
	public static int calcMCD(int numero1,int numero2)
	{
		while(numero1 != numero2)
		{
			if(numero1 > numero2)
			{
				numero1 = numero1 - numero2;
			}
			else
			{
				numero2 = numero2 - numero1;
			}
		}
		
		return numero1;
	}
	
	public static void verResultado(int mcd)
	{
		System.out.println("El máximo común divisor de los números es " + mcd);
	}
}