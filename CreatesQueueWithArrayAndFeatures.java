package randomExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatesQueueWithArrayAndFeatures {
	public static void main(String[] args) {
		Scanner textInput = new Scanner(System.in);

		ArrayList<String> queueOfPeople = new ArrayList<>();
		int answer = 0;

		while (answer != 5) {
			showMenu();
			answer = textInput.nextInt();

			switch (answer) {
			case 1:
				queueOfPeople = addPersonToQueue(textInput, queueOfPeople);
				break;
			case 2:
				queueOfPeople = jumpSomeoneInTheLine(textInput, queueOfPeople);
				break;
			case 3:
				queueOfPeople.remove(0);
				break;
			case 4:
				System.out.println(queueOfPeople);
				break;
			}
		}

		textInput.close();
	}

	public static void showMenu() {
		System.out.println("----------------MENU-------------------");
		System.out.println("Escolha o que quer fazer com a fila:");
		System.out.println("Digite: 1 - ADICIONAR PESSOA ");
		System.out.println("Digite: 2 - ADICIONAR PESSOA COM FURO ");
		System.out.println("Digite: 3 - RETIRAR PESSOA ");
		System.out.println("Digite: 4 - MOSTRAR FILA ");
		System.out.println("Digite: 5 - SAIR ");
		System.out.println("---------------------------------------");
	}

	public static ArrayList<String> addPersonToQueue(Scanner textInput, ArrayList<String> queueOfPeople) {
		System.out.println("Informe o nome da pessoa que será adicionada: ");
		String addedPersonName = textInput.next();
 
		queueOfPeople.add(addedPersonName);
		
		return queueOfPeople;
	}

	public static ArrayList<String> jumpSomeoneInTheLine(Scanner textInput, ArrayList<String> queueOfPeople) {
		System.out.println("Informe quem vai ceder o lugar: ");
		String nameOfAssignee = textInput.next();
		int cededPlace = 0;

		for (int i = 0; i < queueOfPeople.size(); i++) {
			if (queueOfPeople.get(i).equalsIgnoreCase(nameOfAssignee)) {
				cededPlace = i;
			}
		}

		System.out.println("Informe o nome da pessoa que será adicionada: ");
		String nameFuro = textInput.next();

		queueOfPeople.add(cededPlace + 1, nameFuro);
		
		return queueOfPeople;
	}
}