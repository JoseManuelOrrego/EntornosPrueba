package pruebas;

import java.util.Scanner;

public class Nacimientos 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.err.println("Registro de nacimientos");
		
		String usuario = getUser();
		int contrasenna = getPassword();
		
		System.out.println();
		System.out.println("Inicio de registro");
		int mes = pedirMes();
		int anno = pedirAnno();
		int dia;
		boolean diaValido;
		do {
			dia = pedirDia();
			diaValido = validarDia(dia, mes, anno);
		}while(!diaValido);
		
		int nacimientos = pedirNacimientos();
		System.out.println();
		System.out.println("El " + dia + " del mes " + mes + " del año " + anno + " se registraron " + nacimientos + " nacimientos.");
		System.out.println();
		
		autentificacion(usuario, contrasenna);
		
		System.out.println();
		System.out.print("¿Quieres buscar una fecha concreta o finalizar la aplicación? \n1- SI\n2- NO\nOpcion: ");
		int opcion = entrada.nextInt();
		boolean opcionValida;
		opcionValida = (opcion == 1 || opcion == 2);
		while(!opcionValida)
		{
			System.out.print("Error. Solo admite las opciones 1 o 2: ");
			opcion = entrada.nextInt();
			opcionValida = (opcion == 1 || opcion == 2);
		}
		switch(opcion)
		{
		case 1:
			boolean encontrado = false;
			while(!encontrado)
			{
				int dia2 = pedirDia();
				int mes2 = pedirMes();
				int anno2 = pedirAnno();
				if(dia2 != dia)
				{
					System.out.println("Error. El día buscado no está en el registro. Vuelve a introducir la fecha.");
				}
				else if(mes2 != mes)
				{
					System.out.println("Error. El mes buscado no está en el registro. Vuelve a introducir la fecha.");
				}
				else if(anno2 != anno)
				{
					System.out.println("Error. El año buscado no está en el registro. Vuelve a introducir la fecha.");
				}
				else
				{
					encontrado = true;
				}
			}
			System.out.println("En esta fecha hubo " + nacimientos + " nacimientos.");
			break;
		case 2:
			System.out.println("¡Adios!");
			break;
		}
	}
	
	public static int pedirMes()
	{
		boolean mesValido = false;
		int mes;
		System.out.print("Introduce el mes: ");
		do {
			mes = entrada.nextInt();
			mesValido = (mes>=1 && mes<=12);
			if(!mesValido) {
				System.out.println("ERROR. Introduce un mes correcto (entre 1 y 12)");
			}
		}while(!mesValido);
		return mes;
	}
	
	public static int pedirAnno()
	{
		boolean annoValido;
		int anno;
		System.out.print("Introduce un año: ");
		do {
			anno = entrada.nextInt();
			annoValido = (anno >= 1582);
			if(!annoValido) {
				System.out.println("ERROR. Introduce un año correcto (mayor o igual que 1582)");
			}
		}while(!annoValido);
		return anno;
	}
	
	public static int pedirDia()
	{
		System.out.print("Introduce el día: ");
		return entrada.nextInt();
		
	}
	
	public static boolean validarDia(int dia, int mes, int anno)
	{
		boolean diaValido = false;
		switch(mes)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				diaValido = (dia>=1 && dia<=30);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 30");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diaValido = (dia>=1 && dia<=31);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 31");
				}
				break;
			case 2:
				if(esBisiesto(anno)) {
					diaValido = (dia>=1 && dia<=29);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 29");
					}
				}else {
					diaValido = (dia>=1 && dia<=28);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 28");
					}
				}
				
		}
		return diaValido;
	}
	
	public static boolean esBisiesto(int anno) 
	{
		return ((anno%4 == 0)&&(anno%100!=0)||(anno%400==0));
	}
	
	public static int pedirNacimientos()
	{
		System.out.print("Introduce los nacimientos de esta fecha: ");
		int nacimientos = entrada.nextInt();
		boolean naciValido = false;
		naciValido = (nacimientos >= 0 && nacimientos <= 10000);
		while(!naciValido)
		{
			System.out.print("Error. Los nacimientos solo son válidos entre 10000 y 0. Vuelve a introducir el número: ");
			nacimientos = entrada.nextInt();
			naciValido = (nacimientos >= 0 && nacimientos <= 10000);
		}
		return nacimientos;
	}
	
	public static void autentificacion(String usuario, int contrasenna)
	{
		String usuario2;
		int contrasenna2;
		System.err.println("Login para la aplicación");
		System.out.print("Introduce el usuario: ");
		usuario2 = entrada.next();
		System.out.print("Introduce la contraseña: ");
		contrasenna2 = entrada.nextInt();
		
		boolean autentificacionCorrecta = false;
		autentificacionCorrecta = (usuario.equals(usuario2) && contrasenna == contrasenna2);
		while(!autentificacionCorrecta)
		{
			if(!usuario.equals(usuario2) || contrasenna != contrasenna2)
			{
				System.out.println("El usuario o la contraseña no es correcta. Vuelve a intentarlo: ");
				System.out.print("Introduce el usuario: ");
				usuario2 = entrada.next();
				System.out.print("Introduce la contraseña: ");
				contrasenna2 = entrada.nextInt();
				autentificacionCorrecta = (usuario.equals(usuario2) && contrasenna == contrasenna2);
			}
			else
			{
				autentificacionCorrecta = true;
				System.err.println("Autentificación correcta");
			}
		}
	}
	
	public static String getUser()
	{
		System.out.print("Introduce el usuario nuevo: ");
		String usuario = entrada.nextLine();
		boolean usuarioValido = false;
		usuarioValido = (usuario != "" && !usuario.contains("."));
		while(!usuarioValido)
		{
			System.out.print("El usuario no puede estar vacío o contener puntos. Vuelve a intentarlo: ");
			usuario = entrada.nextLine();
			usuarioValido = (usuario != "" && !usuario.contains("."));
		}
		return usuario;
	}
	
	public static int getPassword()
	{
		System.out.print("Introduce la contraseña nueva(numérica): ");
		int contrasenna = entrada.nextInt();
		int digitos = (int)(Math. log10(contrasenna)+1);
		boolean contrasennaValida = false;
		contrasennaValida = (contrasenna >= 0 && digitos == 4);
		while(!contrasennaValida)
		{
			System.out.print("La contraseña solo puede ser positiva y constar de 4 dígitos. Vuelve a intentarlo: ");
			contrasenna = entrada.nextInt();
			digitos = (int)(Math. log10(contrasenna)+1);
			contrasennaValida = (contrasenna >= 0 && digitos == 4);
		}
		return contrasenna;
	}
}