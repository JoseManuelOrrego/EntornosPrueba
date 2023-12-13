package ejerciciosTeoriaPoo;

public class BicicletaTandem extends Bicicleta
{
protected int numAsientos;
	
	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos)
	{
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}
	
	public void acelerar()
	{
		this.velocidadActual*= 4;
	}
}