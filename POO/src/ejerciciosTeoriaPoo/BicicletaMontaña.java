package ejerciciosTeoriaPoo;

public class BicicletaMontaña extends Bicicleta
{
	protected int suspension;
	
	public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension)
	{
		super(velocidadActual, platoActual, piñonActual);
		this.suspension = suspension;
	}
	
	public void cambiarSuspension(int suspension)
	{
		this.suspension = suspension;
	}
	
	public void acelerar()
	{
		this.velocidadActual*= 3;
	}
	
	public void acelerarNormal()
	{
		super.acelerar();
	}

}