package introduccion;

public class ABCconEnteros 
{
	public static void main(String[] args) 
	{
		for (char i = 'A'; i <= 'Z'; i++)
		{
			System.out.print(i);
			System.out.print(" -> ");
			System.out.println((int)i);
		}
	}
}