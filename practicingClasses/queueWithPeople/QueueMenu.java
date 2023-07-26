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
	void verificaEEditaAFila() {
		System.out.println("Digite o nome da pessoa que quer retirar da fila:");
		String informedPerson = input.next();
		boolean personWasFound = false;
		
		for (int i = 0; i < listOfPeopleCreated.size(); i++) {
			Person personFound = listOfPeopleCreated.get(i);
			
			if (informedPerson.equalsIgnoreCase(personFound.name)) {
				personWasFound = true;
				lineOfPeople.removePersonOfLine(personFound);
			}
		}
		if (!personWasFound) {
			System.out.println("Está pessoa ainda não foi criada ou não está na fila.");
		}
	}
	
	void checkChosenOption() {
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
				for (Person p : listOfPeopleCreated) {
					System.out.print(p.id + " ");
					System.out.println(p.name);
				}

				System.out.println("Digite o nome de quem quer adicionar:");
				String informedPerson = input.next();
				boolean personAddedToQueue = false;

				for (int i = 0; i < listOfPeopleCreated.size(); i++) {
					Person personFound = listOfPeopleCreated.get(i);

					if (informedPerson.equalsIgnoreCase(personFound.name)) {
						personAddedToQueue = true;
						lineOfPeople.addPeopleToQueue(personFound);
					}
				}

				if (!personAddedToQueue) {
					System.out.println("Está pessoa ainda não foi criada.");
				}
				break;
			case 3:
				lineOfPeople.callNextInLine();
				break;
			case 4:
				lineOfPeople.showTheQueue();

				System.out.println("Digite o nome da pessoa que quer retirar da fila:");
				String informedPerson2 = input.next();
				boolean personRemovedFromQueue = false;
				
				for (int i = 0; i < listOfPeopleCreated.size(); i++) {
					Person personFound = listOfPeopleCreated.get(i);

					if (informedPerson2.equalsIgnoreCase(personFound.name)) {
						personRemovedFromQueue = true;
						lineOfPeople.removePersonOfLine(personFound);
					}
				}

				if (!personRemovedFromQueue) {
					System.out.println("Está pessoa não está na fila.");
				}
				break;
			case 5:
				lineOfPeople.showTheQueue();
				break;
			}
		} while (userResponse != 6);

		System.out.println("SISTEMA ENCERRADO!");

		input.close();
	}
}
