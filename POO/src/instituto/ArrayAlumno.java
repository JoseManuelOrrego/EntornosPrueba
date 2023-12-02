package instituto;

public class ArrayAlumno 
{
	public static void main(String[] args) 
	{
		Alumno [] listAlumnos = new Alumno[5];
		Alumno a1 = new Alumno("Yoshi", 24, 6, new Fecha(15,9,2020));
		Alumno a2 = new Alumno("Carly", 55, 3, new Fecha(12,4,2022));
		Alumno a3 = new Alumno("Pikachu", 12, 1, new Fecha(8,4,2011));
		Alumno a4 = new Alumno("Ash", 20, 3, new Fecha(23,6,2000));
		Alumno a5 = new Alumno("Tyler", 33, 4, new Fecha(30,1,1999));
		
		listAlumnos[0] = a1;
		listAlumnos[1] = a2;
		listAlumnos[2] = a3;
		listAlumnos[3] = a4;
		listAlumnos[4] = a5;
		
		for(int i = 0; i < listAlumnos.length; i++)
		{
			listAlumnos[i].mostrarInformacion();
		}
		System.out.println();
		
		int ultimo = listAlumnos.length-1;
		for(int i = 0; i < listAlumnos.length/2; i++)
		{
			Alumno aux = listAlumnos[i];
			listAlumnos[i] = listAlumnos[ultimo];
			listAlumnos[ultimo] = aux;
			ultimo--;
		}
		
		for(int i = 0; i < listAlumnos.length; i++)
		{
			listAlumnos[i].mostrarInformacion();
		}
		System.out.println();
		
		int [] arrayEnteros = new int [5];
		int contenido = 7;
		for(int i = 0; i < arrayEnteros.length; i++)
		{
			if(i == 0)
			{
				arrayEnteros[i] = contenido;
			}
			else
			{
				arrayEnteros[i] = contenido*2;
				contenido *= 2;
			}
			if(i < arrayEnteros.length-1)
				System.out.print(arrayEnteros[i] + ",");
			else
				System.out.print(arrayEnteros[i]);
		}
	}
}