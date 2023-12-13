package ejerciciosTeoriaPoo;

public class Principal 
{
	public static void main(String[] args) 
	{
		Bicicleta miBicicleta = new Bicicleta(1,2,3);
		Bicicleta tuBicicleta = new Bicicleta(3,2,1);
		
		BicicletaMontaña bicimountain = new BicicletaMontaña(5, 2, 4, 9);
		BicicletaTandem bicitandem = new BicicletaTandem(5, 3, 6, 2);
		
		bicimountain.acelerar();
		System.out.println(bicimountain.getVelocidad());
		
		bicitandem.acelerar();
		System.out.println(bicitandem.getVelocidad());
		

		
		Bicicleta[] arraybicis = {miBicicleta, tuBicicleta, bicimountain, bicitandem};
		for(int i = 0; i < arraybicis.length; i++)
		{
			arraybicis[i].acelerar();
			System.out.println(arraybicis[i].getVelocidad());
		}
	}
}