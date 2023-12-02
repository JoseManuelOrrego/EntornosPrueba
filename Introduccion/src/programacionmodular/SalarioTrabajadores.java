package programacionmodular;

import java.util.Scanner;

public class SalarioTrabajadores 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		final int tarifa = pedirTarifa();
		final int numTrabajadores = pedirTrabajadores();
		calculoSalario(tarifa, numTrabajadores);
		System.out.println("FIN");
	}
	
	public static int pedirTarifa()
	{
		System.out.print("Introduce la tarifa ordinaria general para todos los trabajadores: ");
		int tarifa = entrada.nextInt();
		
		boolean salida = false;
		salida = (tarifa > 0);
		while(!salida)
		{
			System.out.println("Error. La tarifa ordinaria no puede ser menor o igual que 0");
			System.out.print("Vuelve a introducir la tarifa: ");
			tarifa = entrada.nextInt();
			salida = (tarifa > 0);
		}
		return tarifa;
	}
	
	public static int pedirTrabajadores()
	{
		System.out.print("Introduce el numero de trabajadores de la empresa: ");
		int numTrabajadores = entrada.nextInt();
		
		boolean salida = false;
		salida = (numTrabajadores > 0);
		while(!salida)
		{
			System.out.println("Error. Los trabajadores tienen que ser mayor que 0.");
			System.out.print("Vuelve a introducir el numero: ");
			numTrabajadores = entrada.nextInt();
			salida = (numTrabajadores > 0);
		}
		return numTrabajadores;
	}
	
	public static void calculoSalario(int tarifa, int numTrabajadores)
	{
		int horasTotales;
		double bruto;
		double impuestos;
		double neto;
		
		for(int i = 1; i <= numTrabajadores; i++)
		{
			System.out.println("Empleado Nº" + i);
			horasTotales = pedirHoras();
			bruto = calculoBruto(horasTotales, tarifa);
			impuestos = calculoImpuestos(bruto);
			
			neto = bruto - impuestos;
			verSalario(neto);
			System.out.println();
		}
	}
	
	public static int pedirHoras()
	{
		System.out.print("Introduce las horas que ha hecho el empleado: ");
		int horasTotales = entrada.nextInt();
		
		boolean salida = false;
		salida = (horasTotales >= 38);
		while(!salida)
		{
			System.out.println("Error. Las horas que ha trabajado tienen que ser mayor que 38.");
			System.out.print("Vuelve a introducir el numero: ");
			horasTotales = entrada.nextInt();
			salida = (horasTotales >= 38);
		}
		return horasTotales;
	}
	
	public static double calculoBruto(int horasTotales, int tarifa)
	{
		int horasExtra = 0;
		final double tarifaExtraordinaria = 1.5*tarifa;
		
		if(horasTotales > 38)
			horasExtra = horasTotales - 38;
		
		double bruto = (horasExtra * tarifaExtraordinaria) + (38 * tarifa);
		return bruto;
	}
	
	public static double calculoImpuestos(double bruto)
	{
		double tramo1 = 0;
		double tramo2 = 0;
		
		if(bruto <= 600)
		{
			return 0;
		}
		else if(bruto <= 1200)
		{
			tramo2 = (bruto -1200) * 0.45;
			tramo1 = 600 * 0.25;
		}
		else
			tramo1 = (bruto - 600) * 0.25;
		
		return tramo1 + tramo2;
	}
	
	public static void verSalario(double neto)
	{
		System.err.print("El salario de este trabajador es de " + neto + " euros.");
	}
}