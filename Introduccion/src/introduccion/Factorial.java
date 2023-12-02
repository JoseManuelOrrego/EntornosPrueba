package introduccion;

import java.util.Scanner;

//Que visualice en pantalla el factorial de un nÃºmero.

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce un número para calcular su factorial: ");
		int numero = entrada.nextInt();
		
		int resultado = 1;
		for (int i = 1; i <= numero; i++)
		{
			resultado = resultado * i;
		}
		System.out.println("El factorial es: " + resultado);
		entrada.close();
	}
}