package granjaReinventada;

import granjaReinventadaAnimales.*;
import granjaReinventadaEmpleados.*;

public class Aplicacion 
{
	public static void main(String[] args) 
	{
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
		
		
	}
}