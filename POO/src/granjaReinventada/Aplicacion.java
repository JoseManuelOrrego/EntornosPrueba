package granjaReinventada;

import java.util.Random;

import granjaReinventadaAnimales.*;
import granjaReinventadaEmpleados.*;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
		Random generador = new Random();
		
		Granjeros granjero1 = new Granjeros("David", "Vacas");
		Granjeros granjero2 = new Granjeros("Tomas", "Cerdos");
		Granjeros granjero3 = new Granjeros("Maria", "Gallinas");
		
		Veterinarios vet1 = new Veterinarios("Jorge");
		Veterinarios vet2 = new Veterinarios("Sofia");
		
		Empleados [] arrayEmpleados = new Empleados[5];
		arrayEmpleados[0] = granjero1;
		arrayEmpleados[1] = granjero2;
		arrayEmpleados[2] = granjero3;
		arrayEmpleados[3] = vet1;
		arrayEmpleados[4] = vet2;
		
		Vacas aux1;
		Cerdos aux2;
		Gallinas aux3;
		String[] nombres = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Isabella"
				, "Jack", "Kate", "Liam", "Mia", "Nathan", "Olivia", "Peter", "Quinn", "Rachel", "Samantha"
				, "Tom", "Ursula", "Victoria", "Wendy", "Xavier", "Yvonne", "Zachary"};
		Animales [] arrayAnimales = new Animales[1000];
		for(int i = 0; i < 1000; i++)
		{
			int variable = generador.nextInt(2);
			String nombre = nombres[generador.nextInt(nombres.length)];
			if(variable == 0)
			{
				aux1 = new Vacas(nombre);
				arrayAnimales[i] = aux1;
			}
			else if(variable == 1)
			{
				aux3 = new Gallinas(nombre);
				arrayAnimales[i] = aux3;
			}
			else
			{
				aux2 = new Cerdos(nombre);
				arrayAnimales[i] = aux2;
			}
		}
		
		for(int i = 0; i < 10000; i++)
		{
			arrayEmpleados[generador.nextInt(5)].aTrabajar(arrayAnimales[generador.nextInt(1000)]);;
		}
		
		for(int i = 0; i < arrayAnimales.length; i++)
		{
			System.out.println(arrayAnimales[i].getNombre() + " : " + arrayAnimales[i].getPeso());
		}
	}
}