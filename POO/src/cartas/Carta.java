package cartas;

public class Carta 
{
	private String palo;
	private String color;
	private int numero;
	
	public Carta()
	{
		palo = " ";
		color = " ";
		numero = -1;
	}
	
	public Carta(String palo, String color)
	{
		this.palo = palo;
		this.color = color;
	}
	
	public Carta(String palo, String color, int numero)
	{
		this.palo = palo;
		this.color = color;
		this.numero = numero;
	}

	public String getPalo() 
	{
		return palo;
	}

	public void setPalo(String palo) 
	{
		this.palo = palo;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public int getNumero() 
	{
		return numero;
	}

	public boolean setNumero(int numero) 
	{
		if(numero > 13 || numero < 1)
			return false;
		else
			this.numero = numero;
		return true;
	}
	
}