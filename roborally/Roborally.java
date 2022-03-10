package roborally;

import java.util.Scanner;

public class Roborally {
	public static void main(String args[]) {
		int robotSpeed = 0;
		String command = "";
		Robot robotOne = new Robot();

		try (Scanner keyboard = new Scanner(System.in)) {
			robotOne.initiateRobot("robotOne", 0, 0, "north");

			System.out.println("Welcome to Roborally. Here you can move a virtual robot along an endless grid.");
			System.out.println();

			while (robotSpeed < 1) {
				System.out.println("At what speed should the Robot Move? 1,2, or 3 tiles per command");
				System.out.println();
				robotSpeed = keyboard.nextInt();
				if (robotSpeed > 0 && robotSpeed < 4) {
					robotOne.setSpeed(robotSpeed);
				} else {
					System.out.println(" That is not a valid speed. Pleae try again.");
				}
			}

			System.out.println();
			System.out.println("This is the Robot's starting position.");
			robotOne.display();
			System.out.println();
			System.out.println("You will now get 10 attempts to move the robot.");

			for (int i = 0; i < 10; i++) {
				System.out.println(
						"What should the robot Do? move foreward (f), move backward (b), turn left (l), or turn right (r)?");
				System.out.println();
				command = keyboard.next();

				if (command.equals("f")) {
					robotOne.foreward();
				} else if (command.equals("b")) {
					robotOne.back();
				} else if (command.equals("l")) {
					robotOne.turnLeft();
				} else if (command.equals("r")) {
					robotOne.turnRight();
				} else {
					System.out.println("That is not a valid command. Please Try again.");
				}
			}
		}

		System.out.println("This is the end of the file. To start a new robot please restart the file.");
	}
}
