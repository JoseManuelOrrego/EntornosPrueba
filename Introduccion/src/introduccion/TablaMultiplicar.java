package introduccion;

public class TablaMultiplicar 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			for(int e = 1; e <= 10; e++)
			{
				System.out.print(e + " x " + i + " = " + (e*i) + "\t");
			}
			System.out.println();
		}
	}
}