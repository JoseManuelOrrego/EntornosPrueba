package granjaReinventadaEmpleados;

import granjaReinventadaAnimales.Animales;

public class Veterinarios extends Empleados
{
	private int experiencia;
	public Veterinarios(String nombre)
	{
		super(nombre);
		this.experiencia = 0;
		setNomina(2000);
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void aTrabajar(Animales animal)
	{
		if(experiencia > 10)
		{
			animal.cuidado(true);
		}
		else
		{
			animal.cuidado(false);
		}
		experiencia += 1;
		System.out.println("Me llamo " + getNombre() + " y he trabajado con " + animal.getNombre());
		setNomina(getNomina()*0.001);
	}
}
