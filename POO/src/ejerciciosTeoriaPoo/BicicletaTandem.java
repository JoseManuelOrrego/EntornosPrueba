package ejerciciosTeoriaPoo;

public class BicicletaTandem extends Bicicleta
{
protected int numAsientos;
	
	public BicicletaTandem(int velocidadActual, int platoActual, int pinnonActual, int numAsientos)
	{
		super(velocidadActual, platoActual, pinnonActual);
		this.numAsientos = numAsientos;
	}
	
	public void acelerar()
	{
		this.velocidadActual*= 4;
	}
}