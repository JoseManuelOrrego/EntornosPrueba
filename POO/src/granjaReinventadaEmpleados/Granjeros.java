package granjaReinventadaEmpleados;

import granjaReinventadaAnimales.Animales;

public class Granjeros extends Empleados
{
	private final String especialidad;
	
	public Granjeros(String nombre, String especialidad)
	{
		super(nombre);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
	public void aTrabajar(Animales animal)
	{
		if(getEspecialidad() == animal.getNombreEspecie())
		{
			animal.comer(true);
		}
		else
		{
			animal.comer(false);
		}
		animal.producir();
		System.out.println("Me llamo " + getNombre() + " y he trabajado con " + animal.getNombre());
		setNomina(getNomina()*0.001);
	}
}
