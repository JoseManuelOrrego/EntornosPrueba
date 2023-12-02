package introduccion;

import java.util.Scanner;

public class CuentaPalabras 
{
	public static void main(String[] args) 
	{
		int palabras = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase acabada en un punto: ");
		String frase = entrada.nextLine();
		
		for(int i = 0; i < frase.length(); i++)
		{
			if(frase.charAt(i) == ' ' || frase.charAt(i) == '.')
			{
				palabras++;
			}
		}
		String [] array = frase.split(" ");
		for(int i = 0; i <= array.length-1; i++)
			System.out.println(array[i]);
		
		System.out.println("La frase que has introducido tiene en total " + palabras + " palabras");
		entrada.close();
	}
}