package randomExercises.practicingClasses.queueWithPeople;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueMenu {
	LineOfPeople lineOfPeople = new LineOfPeople();
	ArrayList<Person> listOfPeopleCreated = new ArrayList<>();

	void writeMenuOnScreen() {
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

	Scanner input = new Scanner(System.in);

	void checkTheChosenOptionAndExecute() {
		int userResponse;

		do {
			writeMenuOnScreen();
			userResponse = input.nextInt();

			switch (userResponse) {
			case 1:
				System.out.println("Digite o nome da pessoa:");
				Person newPerson = new Person(input.next());
				listOfPeopleCreated.add(newPerson);
				break;
			case 2:
				showListOfCreatedPeople();
				checkAndAddPersonToQueue();
				break;
			case 3:
				lineOfPeople.callNextInLine();
				break;
			case 4:
				lineOfPeople.showTheQueue();
				checkAndRemovePersonToQueue();
				break;
			case 5:
				lineOfPeople.showTheQueue();
				break;
			}
		} while (userResponse != 6);

		System.out.println("SISTEMA ENCERRADO!");

		input.close();
	}

	void showListOfCreatedPeople() {
		for (Person p : listOfPeopleCreated) {
			System.out.print(p.id + " ");
			System.out.println(p.name);
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
