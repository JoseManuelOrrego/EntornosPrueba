package introduccion;

import java.util.Scanner;

/**
 *  @author josemanuelorrego
 *
 *	Que introduzca dos n�meros por teclado y mediante un men�, calcule y visualice su suma, resta,
    multiplicaci�n y divisi�n. Utilice un interruptor que valide la opci�n. En caso
    de que hay elegido la opci�n de dividir, visualice en pantalla un mensaje
    indicando que no se puede dividir por cero cuando el operando2 sea 0 que,
    as� mismo y mediante otro interruptor denominado imprimir evite la
    visualizaci�n del resultado si se da este hecho.
 */

public class Calculadora 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		//Variables que necesito
		double numero1 = 0;
		double numero2 = 0;
		int opcion;
		boolean salida = false;
		boolean imprimir = true;
		
		System.out.print("Calculadora -> " + "\n" + "Introduce un n�mero: ");
		numero1 = entrada.nextInt();
		System.out.print("Introduce un segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		while (!salida)
		{
			System.out.print("Men� de operaciones\n1- Suma\n2- Resta\n3- Multiplicaci�n\n4- Divisi�n\n5- Salir\nRespuesta: ");
			opcion = entrada.nextInt();
			System.out.println();
			
			switch(opcion) 
			{
			case 1:
				System.out.println("La suma de los n�meros es " + (numero1 + numero2) + "\n");
				break;
			case 2:
				System.out.println("La resta de los n�meros es " + (numero1 - numero2) + "\n");
				break;
			case 3:
				System.out.println("La multiplicaci�n de los n�meros es " + (numero1 * numero2) + "\n");
				break;
			case 4:
				if (numero2 == 0)
				{
					System.out.println("Error, no puedes dividir por 0");
					imprimir = false;
				}
				if(imprimir)
					System.out.println("La divisi�n de los n�meros es " + (numero1 / numero2) + "\n");
				break;
			case 5:
				salida = true;
				System.out.println("Chaote");
				break;
			default:
				System.out.println("La opci�n escogida no corresponde con ninguna opci�n");
			}
		}
	}
}