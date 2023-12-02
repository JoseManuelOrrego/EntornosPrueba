package introduccion;

import java.io.IOException;

public class ConversorNotas 
{
	public static void main(String[] args) throws IOException 
	{
		//Variables que necesito
		char notaInconvertida;
		int notaFinal = 0;
		
		System.out.print("Introduce la nota del estudiante (I, F, B, N y S): ");
		notaInconvertida = (char)System.in.read();
		
		notaInconvertida = Character.toUpperCase(notaInconvertida);
		
		if(notaInconvertida == 'I' || notaInconvertida == 'F' || notaInconvertida == 'B' || notaInconvertida == 'N' || notaInconvertida == 'S')
		{	
			//Comparamos
			switch(notaInconvertida)
			{
			case 'I':
				notaFinal = 4;
				break;
			case 'F':
				notaFinal = 5;
				break;
			case 'B':
				notaFinal = 6;
				break;
			case 'N':
				notaFinal = 7;
				break;
			case 'S':
				notaFinal = 9;
				break;
			}
			System.out.println("La nota final del alumno es: " + notaFinal);
		}
		else
			System.out.println("No has introducido una nota válida");
	}
}
