package institutoHerencia;

public class Instituto 
{
	public static void main(String[] args) 
	{
		Persona p1 = new Persona("Sancho", 45, "50552774Q");
		Alumno a1 = new Alumno("Francisco", 24, "02423774A", 326599);
		Profesor pf1 = new Profesor("Luis", 35, "12345678P", "Programacion");
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		System.out.println(p1.getDNI());
		System.out.println(p1.toString());
		
		System.out.println(a1.getNombre());
		System.out.println(a1.getEdad());
		System.out.println(a1.getDNI());
		System.out.println(a1.getNumMatricula());
		System.out.println(a1.toString());
		
		System.out.println(pf1.getNombre());
		System.out.println(pf1.getEdad());
		System.out.println(pf1.getDNI());
		System.out.println(pf1.getEspecialidad());
		System.out.println(pf1.toString());
		System.out.println("Solo comprobar que funciona bien");
	}
}
