package ejerciciosTeoriaPoo;

public class BicicletaMontanna extends Bicicleta
{
	protected int suspension;
	
	public BicicletaMontanna(int velocidadActual, int platoActual, int pinnonActual, int suspension)
	{
		super(velocidadActual, platoActual, pinnonActual);
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