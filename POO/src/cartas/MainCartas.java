package cartas;

public class MainCartas 
{
	public static void main(String[] args) 
	{
		String colorRojo = "Rojo";
		String colorNegro = "Negro";
		
		new Carta();
		new Carta("Diamantes", colorRojo);
		new Carta("Corazones", colorRojo, 10);
		new Carta("Picas", colorNegro, 8);
		new Carta("Trebol", colorNegro, 4);
		new Carta("Corazones", colorRojo, 13);
		
		
	}
}