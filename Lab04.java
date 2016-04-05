import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		do {
			System.out.println("Please enter a number to factor.");
			String a = sc.nextLine();
			long n = Long.parseLong(a);
			long result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			System.out.println("Your result is " + result);
			
			System.out.println("\nWould you like to continue? (Y/N)");
			choice = sc.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
