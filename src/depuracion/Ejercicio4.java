package depuracion;

import java.util.Scanner;

//Utilizar el depurador para asegurarse de que los datos se leen y escriben 
//correctamente. Hacer una tabla para varios casos de prueba.

public class Ejercicio4
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int number = scanner.nextInt();
		System.out.println("Has introducido: " + number);
		scanner.close();
	}
}