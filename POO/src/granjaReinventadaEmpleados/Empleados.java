package granjaReinventadaEmpleados;

import granjaReinventadaAnimales.Animales;

public class Empleados 
{
	private String nombre;
	private double nomina;
	private Animales animal;
	
	public Empleados(String nombre)
	{
		this.nombre = nombre;
		this.nomina = 1000;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public Animales getAnimal() {
		return animal;
	}

	public void setAnimal(Animales animal) {
		this.animal = animal;
	}
	
	public void aTrabajar()
	{
		System.out.println("Me llamo " + getNombre() + " y he trabajado con " + animal.getNombre());
		setNomina(getNomina()*0.001);
	}
}
