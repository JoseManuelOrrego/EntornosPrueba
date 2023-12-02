package introduccion;

import java.util.Scanner;

public class ImpuestoRenta 
{
	public static void main(String[] args) 
	{
		//Variables que necesito
		int rentaAnual;
		int tipoImpositivo = 0;
		
		//Objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Preguntamos al usuario e introducimos el dato
		System.out.print("Introduce tu renta anual para saber el tipo impositivo que te corresponde: ");
		rentaAnual = entrada.nextInt();
		
		//Comprobamos
		if(rentaAnual > 0)
		{
			if (rentaAnual < 10000)
				tipoImpositivo = 5;
			else if(rentaAnual <= 20000)
				tipoImpositivo = 15;
			else if(rentaAnual <= 35000)
				tipoImpositivo = 20;
			else if(rentaAnual <= 60000)
				tipoImpositivo = 30;
			else
				tipoImpositivo = 45;
			
			System.out.println("El tipo impositivo que te corresponde es del " + tipoImpositivo + "%.");
		}
		else
			System.out.println("Error, la renta anual no puede ser negativa");
		
		entrada.close();
	}
}