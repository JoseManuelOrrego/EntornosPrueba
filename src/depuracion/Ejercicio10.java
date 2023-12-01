package depuracion;

public class Ejercicio10
{
	public static void main(String[] args) 
	{
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int target = 60;
	
		int result = binarySearch(array, target);
	
		if (result != -1) 
		{
			System.out.println("El elemento " + target + " se encuentra en la posición " + result);
		} 
		else 
		{
			System.out.println("El elemento " + target + " no se encontró en el array.");
		}
	}

	// Implementa la búsqueda binaria en el array
	public static int binarySearch(int[] array, int target) 
	{
		int low = 0;
		int high = array.length - 1;
	
		while (low <= high) 
		{
			int mid = (low + high) / 2;
		
			if (array[mid] == target) 
			{
				return mid;
			} 
			else if (array[mid] < target) 
			{
				low = mid + 1;
			} 
			else 
			{
				high = mid - 1;
			}
		}
	
		return -1; // Elemento no encontrado
	}
}