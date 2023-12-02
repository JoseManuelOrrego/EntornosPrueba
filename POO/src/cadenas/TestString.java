package cadenas;

public class TestString 
{
	public static void main (String []args) 
	{
		//métodos útiles de clase String
		String nombre = "Paco";
		String nombre2= new String("Paco");		
		System.out.println(nombre.length());
		System.out.println(nombre.equalsIgnoreCase(nombre2));
		System.out.println(nombre.concat(nombre2));
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(1));
		System.out.println(nombre.charAt(2));
		System.out.println(nombre.charAt(3));
		System.out.println(nombre.substring(2));
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.equals("paco"));
		System.out.println(nombre.equalsIgnoreCase("paco"));
		System.out.println("Hola me llamo pedro ".replace('e','T'));	
	}
}