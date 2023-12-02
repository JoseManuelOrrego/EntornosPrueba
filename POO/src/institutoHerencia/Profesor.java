package institutoHerencia;

public class Profesor extends Persona
{
	protected String especialidad;
	
	public Profesor(String nombre, int edad, String dni, String especialidad)
	{
		super(nombre, edad, dni);
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad()
	{
		return especialidad;
	}
	public void setEspecialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}
	
	public String toString()
	{
		return "Mi nombre es " + nombre + " y soy un profesor, tengo " + edad + " años, mi DNI es " + dni + " y mi especialidad es " + especialidad;
	}
}