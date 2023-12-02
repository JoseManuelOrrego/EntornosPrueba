package programacionmodular;

import java.util.Scanner;

public class CalculadoraModular 
{
	public static void main(String[] args) 
	{
		boolean salir=false;
		do {
			int opcion=verMenu();
			if(opcion==5) 
			{
				salir=true;
				System.out.println("Fin de programa");
			}
			else
				hacerOperaciones(opcion);
		}while(!salir);
	}
	///////////////////////////////////////////////////////////////
	public static int verMenu()
	{
		Scanner entrada = new Scanner(System.in);
		int opcion;
		System.out.println("MENU DE CALCULADORA");
		System.out.println("[1]-Suma");
		System.out.println("[2]-Resta");
		System.out.println("[3]-Multiplicacion");
		System.out.println("[4]-Division");
		System.out.println("[5]-Salir");
		System.out.println("Elige una opcion:");
		do{		
			opcion = entrada.nextInt();
			if(opcion < 1 || opcion > 5)
			{
				System.out.println("Error,elige una opcion valida:");
			}
		}while (opcion < 1 || opcion > 5);
		entrada.close();
		return opcion;
	}
	//////////////////////////////////////////////////////////////
	public static void hacerOperaciones(int opcion)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime los numeros");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		while (opcion == 4 && num2 ==0) 
		{
			System.out.println("El segundo numero no puede ser 0,prueba otro");
			num2 = entrada.nextDouble();
		}
		double resultado=0;
		switch (opcion)
		{
		case 1:
			resultado=hacerSuma(num1,num2);
			break;                                                                                       
		case 2:
			resultado=hacerResta(num1,num2);
			break;
		case 3:
			resultado=hacerMultiplicacion(num1,num2);
			break;
		case 4:resultado=hacerDivision(num1,num2);
			break;
		}
		entrada.close();
		verResultado(resultado);
	}
	//////////////////////////////////////////////////////
	public static double hacerSuma(double num1,double num2)
	{
		return num1+num2;	
	}
	//////////////////////////////////////////////////////
	public static double hacerResta(double num1,double num2)
	{
		return num1 - num2;
	}
	//////////////////////////////////////////////////////
	public static double hacerMultiplicacion(double num1,double num2)
	{
		return num1 * num2;
	}
	//////////////////////////////////////////////////////
	public static double hacerDivision(double num1,double num2)
	{
		return num1 / num2;
	}
	//////////////////////////////////////////////////////
	public static void verResultado(double resultado)
	{
		System.out.println(resultado);
	}
}
