package aula2;

public class main {

	public static void main(String[] args) {
		
		Rpg personagem = new Rpg();
		personagem.nome = "Zé Flecha";
		personagem.classe = "Ladino";
		personagem.level = 5;
		personagem.forca = 2;
		personagem.intelecto = 1;
		personagem.vontade = 2;
		personagem.agilidade = 4;
		
		Rpg personagem2 = new Rpg();
		personagem2.nome = "Hilda";
		personagem2.classe = "Cleriga";
		personagem2.level = 4;
		personagem2.forca = 1;
		personagem2.intelecto = 3;
		personagem2.vontade = 4;
		personagem2.agilidade = 1;
		
		Rpg personagem3 = new Rpg();
		personagem3.nome = "Mordor";
		personagem3.classe = "Juggernaut";
		personagem3.level = 5;
		personagem3.forca = 4;
		personagem3.intelecto = 1;
		personagem3.vontade = 4;
		personagem3.agilidade = 1;
		
		
		personagem.Ficha();
		personagem2.Ficha();
		personagem3.Ficha();
	}

}
