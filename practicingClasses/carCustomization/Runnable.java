package randomExercises.practicingClasses.carCustomization;

import java.util.Scanner;

public class Runnable {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner input = new Scanner(System.in);
		menu.chooseColor(input);
		menu.chooseEngine(input);
		menu.chooseWheels(input);
		menu.chooseSeat(input);
		menu.showChosenCar();
		input.close();
	}
}