package examen1;

public class Vaca 
{
	private String nombre;
	private int peso;
	private boolean esFeliz;
	
	public Vaca()
	{
		nombre = "Vaca";
		peso = 100;
		esFeliz = true;
	}
	
	public Vaca(String nombre)
	{
		this.nombre = nombre;
		peso = 150;
		esFeliz = true;
	}
	
	public Vaca(String nombre, int peso)
	{
		this.nombre = nombre;
		this.peso = peso;
		esFeliz = true;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getPeso()
	{
		return peso;
	}
	
	public void pastar(int horas)
	{
		if(horas >= 12)
		{
			esFeliz = true;
		}
		else
		{
			esFeliz = false;
		}
	}
	
	public void comer(int cantidad)
	{
		if(esFeliz)
		{
			peso += (cantidad/2);
			System.out.println("MUUUUUUUUU");
		}
		else
		{
			peso += (cantidad/10);
			System.out.println("muu");
		}
	}
	
	public void adelgazar(int cantidad)
	{
		peso -= cantidad;
	}
}