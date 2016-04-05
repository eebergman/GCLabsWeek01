import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String choice;

		do {

			System.out.println("Welcome to the Grand Circus Room Detail Calculator\n");

			System.out.println("Please enter the length of the room.");
			String roomLength = scanner.nextLine();

			float length = Float.parseFloat(roomLength);

			System.out.println("Please enter the width of the room.");
			String roomWidth = scanner.nextLine();

			float width = Float.parseFloat(roomWidth);

			System.out.println("Please enter the height of the room.");
			String roomHeight = scanner.nextLine();

			float height = Float.parseFloat(roomHeight);

			float roomArea = length * width;
			float roomPerimeter = 2 * (length + width);
			float roomVolume = length * width * height;

			System.out.println("For that room: \n	Area: " + roomArea + "\n	Perimeter: " + roomPerimeter
					+ "\n	Volume:" + roomVolume);
			System.out.println("\nWould you like to continue? (Y or N)");

			choice = scanner.nextLine();

		} while (choice.equalsIgnoreCase("Y"));

		scanner.close();

		System.out.println("\nThank you for using the Grand Circus Room Detail Calculator");

	}

}