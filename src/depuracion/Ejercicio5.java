package depuracion;

// Utilizar el depurador para identificar y corregir el error lógico (en caso de que lo
// haya) para que el bucle funcione correctamente. Hacer una tabla.

public class Ejercicio5 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) 
		{
			sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}