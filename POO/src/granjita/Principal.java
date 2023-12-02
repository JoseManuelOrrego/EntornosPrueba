package granjita;

public class Principal {
	public static void main (String[]args) {
		new Cerdo();
		new Cerdo();
		new Cerdo();
		Cerdo c3,c4;		
		c3 = new Cerdo(400,3,true,"Pepapig");
		c4 = new Cerdo(650,6,true,"Babe");
		
		/*
		c1.mostrarInformacion();
		c2.mostrarInformacion();
		c3.mostrarInformacion(true);
		c4.mostrarInformacion();
		*/
		
		c3.getNombre();
		
		c3.getPeso();
		
		//System.out.println("El cerdo pesa "+pesoCerdo);		
		c3.comer(6);
		//System.out.println("El cerdo pesa "+c3.getPeso());
		
		
		
		for (int i = 0;i<15;i++) {
			c3.comer();
		}	
		
		//System.out.println("El cerdo pesa "+c3.getPeso());
		
		System.out.println("Voy a alimentar a dos cerdos durante 30 días.");
		System.out.println("El cerdo "+c3.getNombre()+" pesa "+c3.getPeso());
		System.out.println("El cerdo "+c4.getNombre()+" pesa "+c4.getPeso());
		
		
		for (int i = 0;i<30;i++) {
			c3.comer();
		}
		for (int i = 0;i<30;i++) {
			c4.comer();
		}
		System.out.println("Fin de la alimentación");
		System.out.println("El cerdo "+c3.getNombre()+" pesa "+c3.getPeso());
		System.out.println("El cerdo "+c4.getNombre()+" pesa "+c4.getPeso());
		
		for (int i = 0;i<20000;i++) {
			new Cerdo().comer();
		}
		
		Fecha f1 = new Fecha(8,11,2023);
		c4.setFecha(f1);
		
		
	}

}
