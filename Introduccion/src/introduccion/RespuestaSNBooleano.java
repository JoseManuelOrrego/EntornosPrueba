package introduccion;

import java.io.IOException;

public class RespuestaSNBooleano 
{
	public static void main(String[] args) throws IOException 
	{
		//Variables que necesito
		boolean respValida = false;
		char respuesta;
		
		System.out.print("¿Quieres terminar el proceso? (s/n): ");
		
		while (!respValida)
		{
			respuesta = (char)System.in.read();
			System.in.skip(2);
			
			//respValida = (respuesta == 's') || (respValida == 'n');
			
			if(respuesta == 's' || respuesta == 'n')
				respValida = true;
			else
				System.out.print("Error, vuelve a intentarlo: ");
		}
		System.out.println("Proceso finalizado");
	}
}
