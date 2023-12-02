package introduccion;

import java.util.Scanner;

public class ConjuntoNumeros 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Variables que necesito
		int numero;
		int cont15 = 0;
		int cont55 = 0;
		int cont4555 = 0;
		
		//Loop m√°s correcto
		for(int i = 0; i < 6; i++)
		{
			System.out.print("Introduce un n˙mero: ");
			numero = entrada.nextInt();
			
			if(numero < 15)
				cont15++;
			else if(numero > 55)
				cont55++;
			else if(numero > 45 && numero < 55)
				cont4555++;
		}
		
		//Imprimimos en pantalla el resultado
		System.out.print("De los n˙meros introducidos, " + cont15 + " son menores que 15, " + cont4555 + " est·n comprendidos entre"
				+ " 45 y 55, y " + cont55 + " son mayores que 55.");
	}
}
