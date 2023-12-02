package aleatorio;

public class JuegoDados {

	public static void main(String[] args) 
	{
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		int numero1;
		int numero2;
		
		int contador = 1;
		
		for(int i = 0; i < 3; i++)
		{
			do
			{
				numero1 = dado1.tirada();
				numero2 = dado2.tirada();
				
				if(numero1 != 6 || numero2 != 6)
				{
					contador++;
				}
			}while(numero1 != 6 || numero2 != 6);
			
			if(contador == 1)
				System.out.println("En la jugada " + (i+1) + " se han tirado los dados " + contador + " vez, hasta conseguir dos seis.");
			else
				System.out.println("En la jugada " + (i+1) + " se han tirado los dados " + contador + " veces, hasta conseguir dos seis.");
			
			contador = 1;
		}
	}
}