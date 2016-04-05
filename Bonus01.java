import java.util.Scanner;

public class Bonus01 {

	public static String GradeCalc(int gradeValue) {
		String returnGrade = "a F";

		if (gradeValue >= 100) {
			returnGrade = "an A+";
		} else if (gradeValue <= 99 && gradeValue >= 95) {
			returnGrade = "an A";
		} else if (gradeValue <= 94 && gradeValue >= 90) {
			returnGrade = "an A-";
		} else if (gradeValue <= 89 && gradeValue >= 87) {
			returnGrade = "a B+";
		} else if (gradeValue <= 86 && gradeValue >= 84) {
			returnGrade = "a B";
		} else if (gradeValue <= 83 && gradeValue >= 80) {
			returnGrade = "a B-";
		} else if (gradeValue <= 79 && gradeValue >= 76) {
			returnGrade = "a C+";
		} else if (gradeValue <= 75 && gradeValue >= 72) {
			returnGrade = "a C";
		} else if (gradeValue <= 71 && gradeValue >= 69) {
			returnGrade = "a C-";
		} else if (gradeValue <= 68 && gradeValue >= 65) {
			returnGrade = "a D+";
		} else if (gradeValue <= 64 && gradeValue >= 61) {
			returnGrade = "a D";
		} else if (gradeValue <= 60 && gradeValue >= 57) {
			returnGrade = "a D-";
		}

		return returnGrade;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String grade;
		String quit;
		 
			System.out.println("Welcome to the Grade Calculator.");
			
		do {
			System.out.println("\nPlease enter the student's score");
			grade = sc.next();
			int gradeNo = Integer.parseInt(grade);
			System.out.println("\nWith a score of " + gradeNo + " the student recived " + GradeCalc(gradeNo) + ".");

			do {
				System.out.println("\nWould you like to continue? (Y/N)");
				quit = sc.next();

				if (!quit.equalsIgnoreCase("Y") && !quit.equalsIgnoreCase("N")) {
					System.out.println("Invaild response, please select (Y/N)");
					quit = sc.next();
				}

			} while (!quit.equalsIgnoreCase("Y") && !quit.equalsIgnoreCase("N"));

		} while (quit.equalsIgnoreCase("Y"));

		System.out.println("Thank you for using the Grade Calculator.");

		sc.close();
	}

}
