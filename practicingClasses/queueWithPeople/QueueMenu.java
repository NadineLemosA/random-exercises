package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueMenu {
	LineOfPeople lineOfPeople;
	ArrayList<String> pessoas = new ArrayList<>();

	void escreveMenuNaTela() {
		System.out.println("_________________________");
		System.out.println("           MENU          ");
		System.out.println("_________________________");
		System.out.println("1- CRIAR PESSOA");
		System.out.println("2- ADICIONAR PESSOA NA FILA");
		System.out.println("3- CHAMAR PRÓX DA FILA");
		System.out.println("4- RETIRAR PESSOA NA FILA");
		System.out.println("5- MOSTRAR A FILA");
		System.out.println("6- SAIR");
		System.out.println("_________________________");
	}

	void verificaOpcaoEscolhida() {
		Scanner input = new Scanner(System.in);

		switch (input.nextInt()) {
		case 1:
			System.out.println("Digite o nome da pessoa:");
			new Person(input.next());
			break;
		case 2:
			System.out.println("Digite o nome de quem quer adicionar:");
			lineOfPeople.addPeopleToQueue(input.next());
			break;
		case 3:

			break;
		case 4:

			break;
		}
		input.close();
	}
//	for(Person p:pessoas){
//		System.out.println(p.name);
//	}
	
	//System.out.println(Arrays.toString(arrayToBeShown));
}
