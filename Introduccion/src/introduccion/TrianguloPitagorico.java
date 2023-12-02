package introduccion;

import java.util.Scanner;
import java.io.IOException;

// Que visualice en pantalla un triángulo pitagórico. La base tiene que tener igual número de caracteres que la altura.

public class TrianguloPitagorico 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char caracter = (char)System.in.read();
		System.in.skip(2);
		System.out.print("Introduce un número para asignárselo a la base y la altura del triángulo: ");
		int baseAltura = entrada.nextInt();
		System.out.println();
		
		String espacios = " ";
		//Bucles for
		//Altura
		for(int h = 1; h <= baseAltura; h++)
		{
			for(int v = 1; v <= h; v++)
			{
				if(h <= 2 || h == baseAltura)
				{
					System.out.print(caracter);
				}
				else
				{
					System.out.print(caracter + espacios + caracter);
					espacios = espacios + " ";
					v = h;
				}
			}
			System.out.println();
		}
		entrada.close();
	}
}