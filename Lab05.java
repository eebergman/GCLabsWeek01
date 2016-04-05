
import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello and welcome to the Random Dice Generator!");
		System.out.println("\nPlease select the number sides you wish to load on your dice." + "\n4, 6, 8, 10, 12, 20");
		String sides = sc.nextLine();

		IsItANumber(sides);
		sc.close();
	}

	public static void IsItANumber(String isItANumberC) {
		Scanner sc = new Scanner(System.in);
		int sidesD = 0;

		try {
			sidesD = Integer.parseInt(isItANumberC);
		} catch (Exception InputMismatchException) {
			System.out.println("Invaild Response \n\nRestarting Application.");

			FailRestart(null);
		}

		CorrectNumber(sidesD);
		sc.close();
	}

	public static void CorrectNumber(int sidesD) {
		switch (sidesD) {
		case 4:
			break;
		case 6:
			break;
		case 8:
			break;
		case 10:
			break;
		case 12:
			break;
		case 20:
			break;
		default:
			FailRestart(null);
		}

		RollReady(sidesD);
	}

	public static void RollReady(int rollReady) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you ready to roll? (Y/N)");
		String rollReadyA = sc.nextLine();

		if (rollReadyA.equalsIgnoreCase("y")) {
			GetRoll(rollReady);
		} else if (rollReadyA.equalsIgnoreCase("n")) {
			RollReady(rollReady);
		} else {
			System.out.println("Invaild Response\n");
			RollReady(rollReady);
		}

		sc.close();
	}

	public static void GetRoll(int getRoll) {

		Scanner sc = new Scanner(System.in);

		int rollOne = (int) (Math.random() * getRoll) + 1;
		int rollTwo = (int) (Math.random() * getRoll) + 1;
		int rollTotal = rollOne + rollTwo;

		System.out.println("\nThe first " + getRoll + "-sided die rolled a " + rollOne + ", the second " + getRoll
				+ "-sided die " + " rolled a " + rollTwo + ". In total you rolled " + rollTotal + ". "
						+ "\n\nWonderful! Would you like try rolling the dice again? (Y/N)");
		String goAgain = sc.nextLine();

		GoAgain(goAgain);
		sc.close();
	}

	public static void GoAgain(String goAgainC) {

		System.out.println("");

		if (goAgainC.equalsIgnoreCase("y")) {
			FailRestart(null);
		} else if (goAgainC.equalsIgnoreCase("n")) {
			System.out.println("Thanks for playing!");
		} else {
			System.out.println("Invaild Response.");

			FailRestart(null);
		}
	}

	public static void FailRestart(String failRestart) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\nHello and welcome to the Random Dice Generator!");
		System.out.println("\nPlease enter the number sides you wish to load on your dice." + "\n4, 6, 8, 10, 12, 20");
		String sides = sc.nextLine();

		IsItANumber(sides);
		sc.close();
	}
}
