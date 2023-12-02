package pruebas;

import java.util.Scanner;

public class ConversorUnidades 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int valor;
		System.out.print("Menu de operaciones \n1- De metros a kilometros \n2- De metros a yardas o viceversa \n3- De m/s a km/h o viceversa "
				+ "\n4- De km a millas o vicerversa \nOpcion: ");
		int opcion = entrada.nextInt();
		
		switch(opcion)
		{
		case 1:
			valor = introValor();
			System.out.println("El resultado es: " + (valor/1000) + " kms");
		case 2:
			System.out.print("¿De metros a yardas (1) o de yardas a metros (2)?");
			opcion = entrada.nextInt();
			valor = introValor();
			if(opcion == 1)
			{
				System.out.println("El resultado es: " + (valor * 1.0936133) + " yardas");
			}
			if(opcion == 2)
			{
				System.out.println("El resultado es: " + (valor / 1.0936133) + " metros");
			}
		case 3:
			System.out.print("¿De m/s a km/h (1) o de km/h a m/s (2)?");
			opcion = entrada.nextInt();
			valor = introValor();
			if(opcion == 1)
			{
				System.out.println("El resultado es: " + (valor * 3.6) + " km/h");
			}
			if(opcion == 2)
			{
				System.out.println("El resultado es: " + (valor / 3.6) + " m/s");
			}
		case 5:
			System.out.print("¿De km a millas (1) o de millas a km (2)?");
			opcion = entrada.nextInt();
			valor = introValor();
			if(opcion == 1)
			{
				System.out.println("El resultado es: " + (valor * 1.609344) + " millas");
			}
			if(opcion == 2)
			{
				System.out.println("El resultado es: " + (valor / 1.609344) + " kms");
			}
		}
	}
	
	public static int introValor()
	{
		int numero;
		do
		{
			System.out.print("Introduce un valor para transformarlo: ");
			numero = entrada.nextInt();
			if(numero <= 0)
				System.err.println("Solo se puede convertir numeros");
		}while(numero <= 0);
		return numero;
	}
}