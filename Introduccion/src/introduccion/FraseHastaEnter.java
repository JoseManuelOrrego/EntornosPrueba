package introduccion;

import java.io.IOException;

public class FraseHastaEnter 
{
	public static void main(String[] args) throws IOException 
	{
		//Variables que necesito
		char letra;
		String frase = "";
		
		System.out.println("Introduce caracteres individuales para formar una frase. Pulsa Enter para terminar el proceso: ");
		letra = (char)System.in.read();
		System.in.skip(2);
		
		while(letra != '\n')
		{
			frase = frase + letra;
			System.out.println("Introduce otro caracter o solo pulsa Enter para terminar: ");
			letra = (char)System.in.read();
			if(letra != '\n')
				System.in.skip(2);
		}

		System.out.print("Frase final: " + frase);
	}
}
