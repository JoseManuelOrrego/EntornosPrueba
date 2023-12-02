package institutoHerencia;

public class Persona 
{
	protected String nombre;
	protected int edad;
	protected String dni;
	
	public Persona(String nombre, int edad, String dni) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public String getDNI()
	{
		return dni;
	}
	public void setDNI(String dni)
	{
		this.dni = dni;
	}
	
	public String toString()
	{
		return "Mi nombre es " + nombre + ", tengo " + edad + " años y mi DNI es " + dni;
	}
}