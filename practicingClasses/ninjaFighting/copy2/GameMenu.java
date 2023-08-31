package randomExercises.practicingClasses.ninjaFighting.copy2;

import java.util.Scanner;

public class GameMenu {
	int players = 1;
	Ninja ninja1;
	Ninja ninja2;

	void headerShow() {
		System.out.println("______________________________________________");
		System.out.println("                 INICIO DO JOGO               ");
	}

	void showMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("Selecione o elemento do " + players + " jogador:");
		System.out.println("1- ÁGUA ");
		System.out.println("2- FOGO ");
		System.out.println("3- AR ");
		System.out.println("4- RAIO ");
		System.out.println("5- TERRA");
		System.out.println("6- Sair");
		System.out.println("______________________________________________");
		players++;
	}

	void checkOption() {
		headerShow();
		Scanner input = new Scanner(System.in);

		ninja1 = selectNinjaElement(input);
		ninja2 = selectNinjaElement(input);

		input.close();
	}
	
	Ninja selectNinjaElement(Scanner input) {
		showMenu();

		int userResponse = input.nextInt();

		switch (userResponse) {
		case 1:
			return new Ninja(new WaterElement());
		case 2:
			return new Ninja(new FireElement());
		case 3:
			return new Ninja(new AirElement());
		case 4:
			return new Ninja(new RayElement());
		default:
			return new Ninja(new ElementEarth());
		}
	}
	
	void executeFights() {
		int contador = 1;
		int dano = 0;
		
		while (ninja1.life > 0 && ninja2.life > 0) {
			if(contador % 2 != 0) {
				dano = ninja1.attack(ninja2.elemento);
				System.out.println(ninja1.elemento + " deu " + dano + " de dano");	
				ninja2.life -= dano;
			}
			
			if(contador % 2 == 0) {
				dano = ninja2.attack(ninja1.elemento);
				System.out.println(ninja2.elemento + " deu " + dano + " de dano");
				ninja1.life -= dano;
			}
			
			System.out.println("Ninja1(" + ninja1.elemento + ") | Vida: " + ninja1.life);
			System.out.println("Ninja2(" + ninja2.elemento + ") | Vida: " + ninja2.life);
			System.out.println();
			contador += 1;
		}
	}
}
