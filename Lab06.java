
import java.util.Arrays;
import java.util.Scanner;

public class Lab06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		System.out.println("Welcome to the Pig Latin Translator!!");
		System.out.println("Please enter the word you wish to translate to Pig Latin!");
		String gotWord = sc.nextLine();
		StringBuilder sb = new StringBuilder(gotWord);
		char firstLetter = sb.charAt(0);
		int isItInArray = Arrays.binarySearch(vowels, Character.toLowerCase(firstLetter));
		
		if (isItInArray > -1) {
			System.out.println("Your word is " + sb.append("way") + " in Pig Latin!");
			
		} else {

			ChangeConsonant(gotWord);

		}
		sc.close();
	}

	public static void ChangeConsonant(String consonant) {
		StringBuilder sb = new StringBuilder(consonant);
		Boolean flag = false;
		char firstLetter = sb.charAt(0);
		
		if (Character.isUpperCase(firstLetter)) {
			flag = true;
		} 
		
		firstLetter = Character.toLowerCase(firstLetter);
		sb = sb.deleteCharAt(0);
		sb = sb.append(firstLetter);
		
		if (flag) {
			sb = sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
		}

		String sendToCheck = sb.toString();
		Recheck(sendToCheck);
	}

	public static void Recheck(String rechecking) {
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder(rechecking);

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char firstLetter = sb.charAt(0);
		int isItInArray = Arrays.binarySearch(vowels, Character.toLowerCase(firstLetter));

		if (isItInArray > -1) {
			System.out.println("Your word is " + sb.append("ay") + " in Pig Latin!");

			WillRestart(null);

		} else {

			ChangeConsonant(rechecking);
		}
		sc.close();
	}

	public static void WillRestart(String restart) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n\nWould you like to try again? (Y/N)");
		String againAgain = sc.nextLine();

		if (againAgain.equalsIgnoreCase("y")) {

			char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

			System.out.println("Welcome to the Pig Latin Translator!!");
			System.out.println("Please enter the word you wish to translate to Pig Latin!");
			String gotWord = sc.nextLine().toLowerCase();
			StringBuilder sb = new StringBuilder(gotWord);
			char firstLetter = sb.charAt(0);
			int isItInArray = Arrays.binarySearch(vowels, firstLetter);

			if (isItInArray > -1) {
				System.out.println("Your word is " + sb.append("way") + " in Pig Latin!");
			} else {

				ChangeConsonant(gotWord);

			}
			sc.close();
		} else if (againAgain.equals("n")) {
			System.out.println("Thank you for using the Igpay Atinlay Anslatortray!!");
		} else {

			WillRestart(null);
		}

	}
}
