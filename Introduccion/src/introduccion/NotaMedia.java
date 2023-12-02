package introduccion;

import java.util.Scanner;

public class NotaMedia 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		double nota = 0;
		int numeroNotas = 0;
		double media = 0;
		
		do
		{
			System.out.print("Introduce una nota y calcular la media, si no, introduce el -99: ");
			nota = entrada.nextInt();
			
			if(nota != -99)
			{
				media = media + nota;
				numeroNotas ++;
			}
		} while (nota != -99);
		
		media = media / numeroNotas;
		
		System.out.println("La nota media de todas las notas es: " + media);
		entrada.close();
	}
}