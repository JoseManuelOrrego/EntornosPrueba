package introduccion;

import java.io.IOException;

public class RespuestaSN 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.print("¿Quieres terminar el proceso? (s/n): ");
		char respuesta = (char)System.in.read();
		System.in.skip(2);
		
		while (respuesta != 's' && respuesta != 'n')
		{
			System.out.print("Error, solo admite 's' o 'n'. Vuelve a intentarlo: ");
			respuesta = (char)System.in.read();
			System.in.skip(2);
		}
		
		System.out.println("Finalización del programa");
	}
}