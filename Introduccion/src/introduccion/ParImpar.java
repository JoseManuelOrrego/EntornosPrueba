package introduccion;

import java.util.Scanner;

/**
 * Introducimos un entero por teclado y visualizamos si es par o impar
 * @author josemanuelorrego
 *
 */

public class ParImpar 
{
	public static void main(String[] args) 
	{
		//Variables que necesito
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número para comprobar si es par o impar: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0)
		{
			System.out.println("El número es par");
		}
		else
		{
			System.out.println("El número es impar");
		}
		
		entrada.close();
	}
}
