package instituto;

public class Profesor 
{
	private String nombre;
	private String departamento;
	private Alumno a;
	
	
	public Profesor(String nombre, String departamento, Alumno a)
	{
		this.nombre = nombre;
		this.departamento = departamento;
		this.a = a;
	}
	
	public void asignaNota(int nota)
	{
		this.a.setNota(nota);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Alumno getAlumno() {
		return a;
	}

	public void setAlumno(Alumno a) {
		this.a = a;
	}

	public void verInfo()
	{
		System.out.println("Nombre de mi alumno: " + a.getNombre());
		System.out.println("Nota de mi alumno: " + a.getNota());
	}
	
	public static void main(String[] args) 
	{
		Alumno a1 = new Alumno("Loco", 24, 4, new Fecha(6,8,1999));
		Alumno a2 = new Alumno("Loca", 25, 6, new Fecha(19,2,2005));
		
		Profesor profe1 = new Profesor("Manzana", "Matematicas", a1);
		Profesor profe2 = new Profesor("Naranja", "Lengua", a2);
		
		profe1.asignaNota(10);
		profe2.asignaNota(8);
		
		profe1.verInfo();
		profe2.verInfo();
		
		profe1.getAlumno().mostrarInformacion();
		profe2.getAlumno().mostrarInformacion();
	}
}