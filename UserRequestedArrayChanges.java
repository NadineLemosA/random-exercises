package randomExercises;

import java.util.Arrays;
import java.util.Scanner;

public class UserRequestedArrayChanges {
	public static void main(String[] args) {
		int ARRAY_SIZE = 3;

		Scanner textInput = new Scanner(System.in);
		int[] arrayFilledWithData = fillArrayWithData(textInput, ARRAY_SIZE);

		showArray(arrayFilledWithData);
		sortTheArray(ARRAY_SIZE, arrayFilledWithData, textInput);

		textInput.close();
	}

	public static int[] fillArrayWithData(Scanner textInput, int arraySize) {
		int[] arrayToBeFilled = new int[arraySize];
		System.out.println("Informe os " + arraySize + " números que deseja armazenar: ");
		for (int i = 0; i < arraySize; i++) {
			arrayToBeFilled[i] = textInput.nextInt();
		}

		return arrayToBeFilled;
	}

	public static void showArray(int[] informedNumbers) {
		System.out.println(Arrays.toString(informedNumbers));
	}

	public static void sortTheArray(int arraySize, int[] informedNumbers, Scanner textInput) {
		String userResponse = "S";

		while (userResponse.equalsIgnoreCase("S")) {
			System.out.println("Deseja alterar a posição de algum número? (S/N)");
			userResponse = textInput.next();

			if (userResponse.equalsIgnoreCase("S")) {
				System.out.println("Qual o número deve ser alterado? ");
				int userResponseNumber = textInput.nextInt();

				System.out.println("Para qual posição deve ser alterado? (0,1 ou 2)");
				int userResponseRequestedPosition = textInput.nextInt();

				for (int i = 0; i < arraySize; i++) {
					if (informedNumbers[i] == userResponseNumber) {
						int previousNumber = informedNumbers[userResponseRequestedPosition];
						informedNumbers[userResponseRequestedPosition] = userResponseNumber;
						informedNumbers[i] = previousNumber;
					}
				}
			}

			showArray(informedNumbers);
		}
	}
}