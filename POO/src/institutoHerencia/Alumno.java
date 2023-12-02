package institutoHerencia;

public class Alumno extends Persona
{
	protected int numMatricula;
	
	public Alumno(String nombre, int edad, String dni, int numMatricula)
	{
		super(nombre, edad, dni);
		this.numMatricula = numMatricula;
	}
	
	public int getNumMatricula()
	{
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula)
	{
		this.numMatricula = numMatricula;
	}
	
	public String toString()
	{
		return "Mi nombre es " + nombre + " y soy un alumno, tengo " + edad + " años, mi DNI es " + dni + " y mi numero de matricula es " + numMatricula;
	}
}