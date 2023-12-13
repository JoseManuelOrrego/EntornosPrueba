package ejerciciosTeoriaPoo;

public class Bicicleta 
{
	protected int velocidadActual;
	protected int platoActual;
	protected int piñonActual;
	
	public Bicicleta(int velocidadActual, int platoActual, int piñonActual)
	{
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	
	public Bicicleta()
	{
		velocidadActual = 0;
		platoActual = 1;
		piñonActual = 1;
	}

	public int getVelocidad()
	{
		return velocidadActual;
	}
	public void setVelocidad(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}

	public int getPlato()
	{
		return platoActual;
	}
	public void set(int platoActual)
	{
		this.platoActual = platoActual;
	}
	
	public int getPiñon()
	{
		return piñonActual;
	}
	public void setPiñon(int piñonActual)
	{
		this.piñonActual = piñonActual;
	}
	
	public void acelerar()
	{
		this.velocidadActual*=2;
	}
	
	public void frenar()
	{
		this.velocidadActual/=2;
	}
	
	public void cambiarPlato(int plato)
	{
		this.platoActual = plato;
	}
	
	public void cambiarPiñon(int piñon)
	{
		this.piñonActual = piñon;
	}
	
	public void cambiarPlato()
	{
		this.platoActual = 1;
	}
	
	public void cambiarPiñon()
	{
		this.piñonActual = 1;
	}
}