package programacionmodular;

import java.util.Scanner;

public class CambioBase {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Introduce un número decimal:");
		int numero = entrada.nextInt();
		System.out.println("Introduce la base inferior a 10: ");
		int base = entrada.nextInt();
		cambioBase(numero, base);
	}
	//////////////////////////////////////////////////////
	public static void cambioBase(int numero, int base)
	{
		if (numero < base)
			System.out.print(numero);
		else 
		{
			cambioBase(numero/base, base);
			System.out.print(numero%base);
		}
	}
}
