package introduccion;

import java.util.Scanner;

/**
 * Que visualice en pantalla la potencia de un una base elevada al un exponente.
 * @author josemanuelorrego
 *
 */

public class Potencia 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce la base de la potencia: ");
		int base = entrada.nextInt();
		System.out.print("Introduce el exponente de la potencia: ");
		int exponente = entrada.nextInt();
		
		int resultado = 1;
		for(int i = 1; i <= exponente; i++)
		{
			resultado = resultado * base;
		}
		System.out.println("El resultado de la potencia es: " + resultado);
		entrada.close();
	}
}