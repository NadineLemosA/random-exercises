package randomExercises;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbersInArray {
	public static void main(String[] args) {
		int ARRAY_SIZE = 10;
		int[] arrayCreated = createArray(ARRAY_SIZE);

		showTexts("NUMEROS INFORMADOS:", arrayCreated);
		showTexts("NUMEROS ORDENADOS:", sortTheArray(arrayCreated));
	}

	public static int[] createArray(int arraySize) {
		Scanner textInput = new Scanner(System.in);
		int[] numbersArray = new int[arraySize];

		System.out.println("Informe os " + arraySize + " numeros que farão parte do array:");
		for (int i = 0; i < arraySize; i++) {
			int informedNumber = textInput.nextInt();
			numbersArray[i] = informedNumber;
		}

		textInput.close();

		return numbersArray;
	}

	public static void showTexts(String textToShow, int[] arrayToBeShown) {
		System.out.println(textToShow);
		System.out.println(Arrays.toString(arrayToBeShown));
	}

	public static int[] sortTheArray(int[] numbersArray) {
		while (checkOrderOfArray(numbersArray) == false) {
			for (int i = 0; i < numbersArray.length - 1; i++) {
				for (int j = 0; j < numbersArray.length - 1; j++) {
					if (numbersArray[i] > numbersArray[j]) {
						int higherNumber = numbersArray[i];
						numbersArray[i] = numbersArray[i + 1];
						numbersArray[i + 1] = higherNumber;
					}
				}
			}
		}

		return numbersArray;
	}

	public static boolean checkOrderOfArray(int[] numberToBeVerified) {
		for (int i = 0; i < numberToBeVerified.length - 1; i++) {
			if (numberToBeVerified[i] > numberToBeVerified[i + 1]) {
				return false;
			}
		}

		return true;
	}
}