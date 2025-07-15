package aula2;

public class Rpg {

	String nome;
	String classe;
	int level;
	int forca;
	int intelecto;
	int vontade;
	int agilidade;
	
	public void Ficha () {
		System.out.println("");
		System.out.println("====FICHA====");
		System.out.println("Nome: "+nome);
		System.out.println("Clase: "+classe);
		System.out.println("Level: "+level);
		System.out.println("Força: "+forca);
		System.out.println("Intelecto: "+intelecto);
		System.out.println("Vontade: "+vontade);
		System.out.println("Agilidade: "+agilidade);
	}
}
