

import java.util.Scanner;

public class Bonus03 {

	public static void main(String[] args) {
		WelcomeToTheGame(null);
	}
	
	public static void WelcomeToTheGame(String welcome) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Welcome to the Number Guessing Game!!" + "\nYou're going to try to guess a randomly generated number!"
						+ "\n\nPlease input a whole number between 1 and 100.");
		String userGuessA = sc.nextLine();

		IsItANumber(userGuessA);
		sc.close();
	}

	public static void IsItANumber(String isItANumberA) {
		Scanner sc = new Scanner(System.in);
		int userGuessB = 0;

		try {
			userGuessB = Integer.parseInt(isItANumberA);
		} catch (Exception InputMismatchException) {
			System.out.println("Invaild Response \n\nRestarting Application.\n\n");

			WelcomeToTheGame(null);
		}

	//	GetRandNo(userGuessB);
		sc.close();
	}
	
}
