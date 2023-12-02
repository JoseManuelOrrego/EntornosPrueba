package introduccion;

import java.util.Scanner;

public class MCD 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un primer número: ");
		int numero1 = entrada.nextInt();
		System.out.println("Introduce un segundo número: ");
		int numero2 = entrada.nextInt();
		
		while(numero1 != numero2)
		{
			if(numero1 > numero2)
				numero1 = numero1 - numero2;
			else
				numero2 = numero2 - numero1;
		}
		
		System.out.println("El máximo común divisor de los números es: " + numero1);
		entrada.close();
	}
}