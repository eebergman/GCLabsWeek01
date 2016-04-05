import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		// Jessica + Erin
		Scanner sc = new Scanner(System.in);
		String userNo;
		int i;
		String opt;

		
		do {
			System.out.println("Learn your squares and cubes!!\n");
			System.out.println("What number would you like to go up to?");
			userNo = sc.nextLine();
			int userNumber = Integer.parseInt(userNo);
			System.out.println("Your number is: " + userNumber);

			System.out.println("Number\t\t Squared\t\t Cubed");
			System.out.println("======\t\t =======\t\t =====");

			for (i = 1; i <= userNumber; i++) {
				int no = i;
				int sq = (int) Math.pow(no, 2);
				int cu = (int) Math.pow(no, 3);

				System.out.println("  " + no + "\t\t  " + sq + "\t\t\t  " + cu + "\n");

			}

			System.out.println("Would you like to go again? (Y/N)");
			opt = sc.nextLine();

		} while (opt.equalsIgnoreCase("y"));
		
	sc.close();
	}

}
