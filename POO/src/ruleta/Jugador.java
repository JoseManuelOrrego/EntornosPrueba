package ruleta;

import java.util.Scanner;

public class Jugador 
{	
	private String nombre;
	private int dinero;
	
	public Jugador(String nombre,int dinero) 
	{
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public String getNombre() 
	{
		return nombre;
    }

    public int getDinero() 
    {
    	return dinero;
    }
    
    public int elegirNumero() 
    {
    	Scanner entrada = new Scanner(System.in);
    	System.out.print("Elige un número: ");
    	entrada.close();
    	return entrada.nextInt();
    }
    
    public void ganar(boolean partida) 
    {
    	if(partida)
    		dinero += 3500;
    	else
    		dinero -= 100;
    }
   
}