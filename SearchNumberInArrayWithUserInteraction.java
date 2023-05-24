package randomExercises;

import java.util.Scanner;

public class SearchNumberInArrayWithUserInteraction {
	public static void main(String[] args) {
		Scanner inputText = new Scanner(System.in);

		int[] arrayNumbers = generateArray(inputText);
		askNumberToSearchInArray(inputText, arrayNumbers);

		inputText.close();
		System.out.println("PROCESSO FINALIZADO!");
	}
	
	public static int[] generateArray(Scanner input) {
		System.out.println("Qual será o tamanho do Array? ");
		int numberSize = input.nextInt();

		int[] arrayNumbers = new int[numberSize];

		System.out.println("Digite os numeros que quer inserir no Array:");
		for (int i = 0; i < numberSize; i++) {
			int numbersOfArray = input.nextInt();
			arrayNumbers[i] = numbersOfArray;
		}

		return arrayNumbers;
	}

	public static void askNumberToSearchInArray(Scanner input, int[] arrayNumbers) {
		String userResponse = "S";
		boolean result;

		while (userResponse.equalsIgnoreCase("S")) {
			result = false;
			System.out.println("Digite o nUmero que quer testar: ");
			int numberTest = input.nextInt();

			result = targetExistsInArray(numberTest, arrayNumbers);

			System.out.println(result);
			System.out.println("Quer testar novamente? S/N");
			userResponse = input.next();
		}
	}

	public static boolean targetExistsInArray(int target, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (target == numbers[i]) {
				return true;
			}
		}
		return false;
	}
}
