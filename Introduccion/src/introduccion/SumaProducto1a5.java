package introduccion;

public class SumaProducto1a5 
{
	public static void main(String[] args) 
	{
		//Variables que necesito
		int suma = 0;
		int producto = 1;
		
		for (int i = 1; i < 6; i++)
		{
			suma = suma + i;
			producto = producto * i;
		}
		System.out.println("La suma de los números del 1 al 5 es " + suma + " y el producto es " + producto);
	}
}