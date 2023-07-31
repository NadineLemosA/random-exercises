package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueMenu {
	final int CREATES_PERSON = 1;
	final int ADD_PERSON = 2;
	final int CALL_NEXT_PERSON = 3;
	final int REMOVE_PERSON = 4;
	final int SHOW_QUEUE = 5;
	final int CLOSE = 6;
	LineOfPeople lineOfPeople = new LineOfPeople();
	ArrayList<Person> listOfPeopleCreated = new ArrayList<>();

	void showMenu() {
		System.out.println("_________________________");
		System.out.println("           MENU          ");
		System.out.println("_________________________");
		System.out.println("1- CRIAR PESSOA");
		System.out.println("2- ADICIONAR PESSOA NA FILA");
		System.out.println("3- CHAMAR PRÓXIMO DA FILA");
		System.out.println("4- RETIRAR PESSOA NA FILA");
		System.out.println("5- MOSTRAR A FILA");
		System.out.println("6- SAIR");
		System.out.println("_________________________");
	}

	Scanner input = new Scanner(System.in);

	void checkTheChosenOptionAndExecute() {
		int userResponse;

		do {
			showMenu();
			userResponse = input.nextInt();

			switch (userResponse) {
			case CREATES_PERSON:
				System.out.println("Digite o nome da pessoa:");
				Person person = new Person(input.next());
				listOfPeopleCreated.add(person);
				break;
			case ADD_PERSON:
				showListOfCreatedPeople();
				checkAndAddPersonToQueue();
				break;
			case CALL_NEXT_PERSON:
				lineOfPeople.callNextInLine();
				break;
			case REMOVE_PERSON:
				lineOfPeople.showQueue();
				checkAndRemovePersonToQueue();
				break;
			case SHOW_QUEUE:
				lineOfPeople.showQueue();
				break;
			}
		} while (userResponse != 6);

		System.out.println("SISTEMA ENCERRADO!");

		input.close();
	}

	void showListOfCreatedPeople() {
		for (Person p : listOfPeopleCreated) {
			System.out.println(p.id + " " + p.name);
		}
	}

	void checkAndAddPersonToQueue() {
		System.out.println("Digite o id da pessoa que quer adicionar a fila:");
		int idInformed = input.nextInt();
		boolean personWasFound = false;

		if (lineOfPeople.checkQueueMembers(idInformed)) {
			System.out.println("Essa pessoa já está na fila.");

		} else {
			for (int i = 0; i < listOfPeopleCreated.size(); i++) {
				int idFound = listOfPeopleCreated.get(i).id;

				if (idInformed == idFound) {
					personWasFound = true;
					lineOfPeople.addPeopleToQueue(listOfPeopleCreated.get(i));
				}
			}

			if (!personWasFound) {
				System.out.println("Está pessoa ainda não foi criada.");
			}
		}
	}

	void checkAndRemovePersonToQueue() {
		if (listOfPeopleCreated.isEmpty()) {
			System.out.println("A fila está vazia!");
		} else {
			System.out.println("Digite o id da pessoa que quer retirar da fila:");
			int idInformed = input.nextInt();
			boolean personWasFound = false;

			for (int i = 0; i < listOfPeopleCreated.size(); i++) {
				int idFound = listOfPeopleCreated.get(i).id;

				if (idInformed == idFound) {
					personWasFound = true;
					lineOfPeople.removePersonOfLine(listOfPeopleCreated.get(i));
				}
			}

			if (!personWasFound) {
				System.out.println("Está pessoa não está na fila.");
			}
		}
	}
}
