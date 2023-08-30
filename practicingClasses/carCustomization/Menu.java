package randomExercises.practicingClasses.carCustomization;

import java.util.Scanner;

public class Menu {
	Malibu malibu;
	Aventador aventador;
	Huracan huracan;
	Cayenne cayenne;
	int userResponseTemplate;
	Car chosenCar;

	void showTemplateChoiceMenu() {
		System.out.println(" ___________________________");
		System.out.println("|           MENU            |");
		System.out.println(" ---------------------------");
		System.out.println("|      ESCOLHA O CARRO:     |");
		System.out.println(" ---------------------------");
		System.out.println("|1 - Malibu                 |");
		System.out.println("|2 - Aventador              |");
		System.out.println("|3 - Huracan                |");
		System.out.println("|4 - Cayenne                |");
		System.out.println("|___________________________|");
	}

	void chooseCar(Scanner input) {
		showTemplateChoiceMenu();
		userResponseTemplate = input.nextInt();

		switch (userResponseTemplate) {
		case 1:
			malibu = new Malibu();
			chosenCar = malibu;
			break;
		case 2:
			aventador = new Aventador();
			chosenCar = aventador;
			break;
		case 3:
			huracan = new Huracan();
			chosenCar = huracan;
			break;
		case 4:
			cayenne = new Cayenne();
			chosenCar = cayenne;
			break;
		}
	}

	void showColorChoiceMenu() {
		System.out.println(" ---------------------------");
		System.out.println("|      ESCOLHA A COR:       |");
		System.out.println(" ---------------------------");
		System.out.println("|1 - Preto                  |");
		System.out.println("|2 - Vermelho               |");
		System.out.println("|3 - Prata                  |");
		System.out.println("|4 - Dourado                |");
		System.out.println("|___________________________|");
	}

	void chooseColor(Scanner input) {
		chooseCar(input);
		showColorChoiceMenu();
		int userResponse = input.nextInt();

		switch (userResponse) {
		case 1:
			chosenCar.color = "Preto";
			break;
		case 2:
			chosenCar.color = "Vermelho";
			break;
		case 3:
			chosenCar.color = "Prata";
			break;
		case 4:
			chosenCar.color = "Dourado";
			break;
		}
	}

	void showEngineChoiceMenu() {
		System.out.println(" ---------------------------");
		System.out.println("|      ESCOLHA O MOTOR:     |");
		System.out.println(" ---------------------------");
		System.out.println("|1 - V8/ 4.8                |");
		System.out.println("|2 - V12                    |");
		System.out.println("|3 - V8/ 4.0                |");
		System.out.println("|4 - V6                     |");
		System.out.println("|___________________________|");
	}

	void chooseEngine(Scanner input) {
		showEngineChoiceMenu();
		int userResponse = input.nextInt();

		switch (userResponse) {
		case 1:
			chosenCar.motor = "V8/ 4.8";
			break;
		case 2:
			chosenCar.motor = "V12";
			break;
		case 3:
			chosenCar.motor = "V8/ 4.0";
			break;
		case 4:
			chosenCar.motor = "V6";
			break;
		}
	}

	void showWheelsTypesMenu() {
		System.out.println(" ---------------------------");
		System.out.println("|      ESCOLHA A RODA:      |");
		System.out.println(" ---------------------------");
		System.out.println("|1 - " + WheelsTypes.ARO12 + "                  |");
		System.out.println("|2 - " + WheelsTypes.ARO13 + "                  |");
		System.out.println("|3 - " + WheelsTypes.ARO16 + "                  |");
		System.out.println("|4 - " + WheelsTypes.ARO17 + "                  |");
		System.out.println("|___________________________|");
	}

	void chooseWheels(Scanner input) {
		showWheelsTypesMenu();
		int userResponse = input.nextInt();

		switch (userResponse) {
		case 1:
			chosenCar.wheels = WheelsTypes.ARO12;
			break;
		case 2:
			chosenCar.wheels = WheelsTypes.ARO13;
			break;
		case 3:
			chosenCar.wheels = WheelsTypes.ARO16;
			break;
		case 4:
			chosenCar.wheels = WheelsTypes.ARO17;
			break;
		}
	}

	void showSeatTypesMenu() {
		System.out.println(" ---------------------------");
		System.out.println("|  ESCOLHA O TIPO DE BANCO: |");
		System.out.println(" ---------------------------");
		System.out.println("|1 - " + SeatTypes.COURO_ANIMAL + "           |");
		System.out.println("|2 - " + SeatTypes.COURO_SINTETICO + "        |");
		System.out.println("|3 - " + SeatTypes.TECIDO + "                 |");
		System.out.println("|___________________________|");
	}

	void chooseSeat(Scanner input) {
		showSeatTypesMenu();
		int userResponse = input.nextInt();

		switch (userResponse) {
		case 1:
			chosenCar.seat = SeatTypes.COURO_ANIMAL;
			break;
		case 2:
			chosenCar.seat = SeatTypes.COURO_SINTETICO;
			break;
		case 3:
			chosenCar.seat = SeatTypes.TECIDO;
			break;
		}
	}

	void showChosenCar() {
		System.out.println(chosenCar.model + " " + chosenCar.color);
		System.out.println("Motor: " + chosenCar.motor);
		System.out.println("Rodas: " + chosenCar.wheels);
		System.out.println("Bancos: " + chosenCar.seat);
	}
}
