package examen1;

import java.util.Scanner;

public class Recursividad 
{
	public static void main(String[] args) 
	{
		int valorEntrada = 0,resultadoFactorial;
		Scanner sc = new Scanner(System.in);
		
		boolean resultadoValido = false;
		while(!resultadoValido)
		{
			System.out.print("Introduce un valor, por favor: ");
			valorEntrada = sc.nextInt();
			resultadoValido = (valorEntrada >= 0 && valorEntrada <= 9);
			if(!resultadoValido)
				System.out.println("Vuelve a intentarlo. Introduce un número entre 0 y 9");
		}
		resultadoFactorial = calcFactorial(valorEntrada);
		System.out.println(valorEntrada+"! = "+resultadoFactorial);
		sc.close();
	}
	
	public static int calcFactorial(int valorEntrada)
	{
		if(valorEntrada == 0)
			return 1;
		else
		{
			return valorEntrada * calcFactorial(valorEntrada - 1);
		}
	}
}