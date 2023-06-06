package randomExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnsFetchedNumberIndex {
	public static void main(String[] args) {
		Scanner textInput = new Scanner(System.in);

		int arraySize = returnsArraySize(textInput);
		int[] informedArraySave = createArrayOfNumbers(textInput, arraySize);
		ArrayList<Integer> indexOfTheNumberFound = returnsIndexesOfSearchedNumbers(textInput, arraySize,
				informedArraySave);

		showIndexesFound(indexOfTheNumberFound);
		textInput.close();
	}

	public static int returnsArraySize(Scanner textInput) {
		System.out.println("Quantos números serão informados? ");
		int arraySize = textInput.nextInt();
		
		return arraySize;
	}

	public static int[] createArrayOfNumbers(Scanner textInput, int arraySize) {
		int[] informedArray = new int[arraySize];

		System.out.println("Informe os números: ");
		for (int i = 0; i < arraySize; i++) {
			informedArray[i] = textInput.nextInt();
		}

		return informedArray;
	}

	public static ArrayList<Integer> returnsIndexesOfSearchedNumbers(Scanner textInput, int arraySize,
			int[] informedArraySave) {
		System.out.println("Qual número quer buscar? ");
		int numberToBeSearched = textInput.nextInt();
		ArrayList<Integer> indexOfTheNumberFound = new ArrayList<>();

		for (int i = 0; i < arraySize; i++) {
			if (numberToBeSearched == informedArraySave[i]) {
				indexOfTheNumberFound.add(i);
			}
		}

		return indexOfTheNumberFound;
	}

	public static void showIndexesFound(ArrayList<Integer> indexOfTheNumberFound) {
		System.out.println("O número buscado está no(s) indice(s): ");
		for (Integer s : indexOfTheNumberFound) {
			System.out.println(s);
		}
	}
}