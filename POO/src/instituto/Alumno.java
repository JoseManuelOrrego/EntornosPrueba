package instituto;

public class Alumno 
{
	private String nombre;
	private int edad;
	private int numMatriculadas;
	private int nota;
	private Fecha fecha;
	
	public Alumno(String nombre,int edad,int numMatriculadas, Fecha fecha) 
	{
		this.nombre=nombre;
		this.edad=edad;
		this.numMatriculadas = numMatriculadas;
		this.setFecha(fecha);
		nota = 0;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public int getEdad() 
	{
		return edad;
	}
	public int getNumMatriculadas() 
	{
		return numMatriculadas;
	}
	public int getNota()
	{
		return nota;
	}
	public void setNombre(String nombre) 
	{
		this.nombre=nombre;
	}
	public void setEdad(int edad) 
	{
		this.edad=edad;
	}
	public void setNota(int nota)
	{
		this.nota = nota;
	}
	public void setNumMatriculadas(int numMatriculadas) 
	{
		this.numMatriculadas=numMatriculadas;
	}
	public void mostrarInformacion() 
	{
		System.out.println("Me llamo "+nombre+", tengo "+edad
				+" annos, estoy matriculado en "+numMatriculadas+" asignaturas las cuales me matricule en el " + fecha.getDia()
				+ "/" + fecha.getMes() + "/" + fecha.getAnno()+ " y mi nota es " + nota);
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
}