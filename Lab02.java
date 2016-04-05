import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Beginning of game
		System.out.println("Hello and Welcome to (a fairly mediocore) Choose Your Own Adventure Game!!\n");
		System.out.println("Press 'S' to start a new game! \nPress literally anything else to save your time!");
		String startGame = sc.nextLine();

		StartOpt(startGame); // A: GOTO LN 25; Else: GOTO LN 33
		sc.close();
	}

	// Beyond here there be methods.

	public static void StartOpt(String startGameC) {

		Scanner sc = new Scanner(System.in);

		// Checks if users wants to play
		if (startGameC.equalsIgnoreCase("S")) {
			System.out.println("Really? You're gonna play? Okay, well I'm not exactly prepared..."
					+ "\n\n...okay, um. Oh yeah, what's your name?");
			String personName = sc.next();

			PersonName(personName); // GoTo Ln 45

		} else {
			System.out.println("Oh yeah, I'm not surprised. Have a lovely day!!");
			System.exit(0); // Quit --- Change to a clean quit method
		}

		sc.close();
	}

	public static void PersonName(String personNameC) {

		Scanner sc = new Scanner(System.in);

		// Offers 3(4) classes for user to choose
		System.out.println("\nIf you say so. " + personNameC + " it is then.\nOkay " + personNameC
				+ " would you like to pick a class? \nI've only got three; select the letter for that class.");
		System.out.println("     A: Adventurer \n     R: Rogue \n     W: Wizard");
		String choice = sc.next();

		ChooseClass(choice); // A: GoTo Ln 62; R: GoTo Ln 72; W: GoTo Ln 79;
								// Else; GoTo Ln 74.

		sc.close();
	}

	public static void ChooseClass(String classChoiceC) {

		Scanner sc = new Scanner(System.in);

		if (classChoiceC.equalsIgnoreCase("a")) {

			System.out.println("How original! Well, I guess we've all got our parts to play."
					+ "\n\nOk. It's morning, like _early_ morning, you're leaving a village."
					+ "\n\nSuddenly you see a wooden chest lying abandoned on the side of the road." + "\nDo you..."
					+ "\n\tOpen it? (Press A)" //
					+ "\n\tTake it back to town and give it to the Peacekeeper? (Press B)");
			String advenOne = sc.nextLine();

			AdvenOne(advenOne); // A: GoTo Ln 83; else: GoTo Ln 89

		} else if (classChoiceC.equalsIgnoreCase("r")) {
			System.out.println("Are you seriously trying to pickpocket me right now? Stop it, lets go. \n"
					+ "\nAlright, it is night, you're sneaking through your neighbor's garden when you trip over a "
					+ "garden gnome. You notice the gnome is cracked and something catches your eye inside. \nDo you..."
					+ "\n\tBash open the gnome with a rock? (Press A)"
					+ "\n\tLeave the gnome and continue creeping around your neighbor's yard? (Press B)");
			String rogOne = sc.nextLine();

			RogOne(rogOne);

		} else if (classChoiceC.equals("w")) {
			System.out.println("Oh yeah, I assumed you were going to pick wizard."
					+ "\n\n Oh you the love of...stop screaming 'Magic Missle'. No, you cannot have that spell. Now, "
					+ "seriously. "
					+ "'\n You're leaving the College of Magic and you notice a weird stick laying under the tree in "
					+ "the courtyard. Do you..." + "\n\tGo check it out. (Press A)"
					+ "'Honestly I'm far to busy to even notice sticks on the ground. (Press B)");
			String wizOne = sc.nextLine();

			WizOne(wizOne);

		} else {
			System.out.println("What are you doing? Just slapping at the keyboard? Fine, you get to be a bum.");
		}

		sc.close();
	}

	public static void AdvenOne(String advenOneC) {

		Scanner sc = new Scanner(System.in);

		if (advenOneC.equalsIgnoreCase("a")) {
			System.out.println("\nInside the chest you find the Master Sword! \nDo you..."
					+ "\n\tLook around, if no one saw you open the chest it's yours!! (Press A)"
					+ "\n\tHurriedly close the chest and continue on your way (Press B)");
			String advenTwo = sc.nextLine();

			AdvenTwo(advenTwo);
		} else {
			System.out.println("The PeaceKeeper is so relived to see the chest. It was due to be "
					+ "delivered yesterday but the courier never arrived. The Peacekeeper "
					+ "awards you a heft sum of gold. Now go, go enjoy it.");
			RestartGame(null);
		}
		sc.close();
	}

	public static void AdvenTwo(String advenTwoC) {

		Scanner sc = new Scanner(System.in);

		if (advenTwoC.equalsIgnoreCase("A")) {
			System.out.println("While you're admiring your new sword the local Peacekeeper aproches you."
					+ "\nIt apears that he has mistaken you for stealing the sword. Since they don't have much in the "
					+ "way of a legal system he locks you up for the rest of your life.");
			RestartGame(null);
		} else if (advenTwoC.equalsIgnoreCase("n")) {
			System.out.println("As you set back on your way you, brielfy wonder what it would have been like to "
					+ "be the master of such a sword, but really, nothing good comes from such legendary objects.");
			RestartGame(null);
		} else {
			System.out.println("Would you like to try pressing the correct option?");
			String fatFinger = sc.nextLine();

			AdvenTwo(fatFinger);
		}
		sc.close();
	}

	public static void RogOne(String rogOneA) {

		Scanner sc = new Scanner(System.in);

		if (rogOneA.equalsIgnoreCase("a")) {

			System.out.println("Holy crap, your neighbor was hiding The One Ring in his garden!? That explains why "
					+ "he is so grumpy all the time! Do you..."
					+ "\n\tTry on the ring! (Come on it's a once in a life time experience!) (Press A)"
					+ "\n\tDrop the ring with the broken gnome, run back home, pack your belongings, and leave before "
					+ "your neighbor notices anything. (Press B)");
			String rogOneB = sc.nextLine();

			RogTwo(rogOneB); 

		} else {
			System.out.println("You finish your nightly adventure without thinking of the gnome again. The next day "
					+ "you look out into your neighbor's garden and the gnome is missing. A week later you find out your "
					+ "neighbor has left in the dead of night. As curious as that is nothing is more so than the large sum "
					+ "of gold that appeared in your mailbox; with a little note saying 'for your silence'.");

			RestartGame(null);
			
		}
		sc.close();
	}

	public static void RogTwo(String rogTwoA) {

		Scanner sc = new Scanner(System.in);

		if (rogTwoA.equals("a")) {
			System.out.println("Oh my goodness! The Ring Wraiths were waiting for someone of put the ring on! "
					+ "You've been horribly killed!!");

			RestartGame(null);

		} else if (rogTwoA.equalsIgnoreCase("n")) {
			System.out.println("You often look back to that night in your neighbor's garden and wonder what could have "
					+ "happened if you hadn't gotten away then. A shudder runs through you as you go back to work.");

			RestartGame(null);

		} else {
			System.out.println("Would you like to try pressing the correct option?");
			String fatFinger = sc.nextLine();

			RogTwo(fatFinger);
		}
		sc.close();
	}

	public static void WizOne(String wizOneA) {
		Scanner sc = new Scanner(System.in);

		if (wizOneA.equalsIgnoreCase("a")) {
			System.out.println("As you approch the stick you realize it is the fabled Elder Wand. The wand said to "
					+ "never lose a duel! What a boon, do you..."
					+ "\n\tPocket the wand, no one would notice anyway. (Press A)"
					+ "Turn the wand in to the Dean of Physical Wizardry. (Press B)");
			String wizTwo = sc.nextLine();

			WizTwo(wizTwo);

		} else if (wizOneA.equalsIgnoreCase("n")) {
			System.out.println("It isn't long before you hear of students getting badly hurt in duels. Fortunatly "
					+ "you've never felt the need to partake in such things. Eventually you are the only student who "
					+ "hasnt' been caught dueling. You are offered a job at the college, how awesome!");

			RestartGame(null);

		} else {
			System.out.println("Would you like to try pressing the correct option?");
			String fatFinger = sc.nextLine();

			WizOne(fatFinger);
		}
		sc.close();
	}

	public static void WizTwo(String WizTwoA) {

	}
	
	public static void RestartGame(String newGame) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\nWell!? How fun was that! Oh boy. What, you don't want to do that again do you? (Y/N)");
		String playNewGame = sc.next();

		if (playNewGame.equalsIgnoreCase("y")) {
			System.out.println("Oh, wow. Okay, pick a new name then.");
			String newName = sc.nextLine();

			PersonName(newName);
		} else if (playNewGame.equalsIgnoreCase("n")) {
			System.out.println(
					"Yeah, that's what I thought. Go ahead, leave. It's not like I wanted to keep playing either.");

			EndTheGame(null);

		} else {

			RestartGame(null);

		}
		sc.close();
	}

	public static void EndTheGame(String itsOver) {
		System.out.println("So, this is it. Goodbye");
	}

}