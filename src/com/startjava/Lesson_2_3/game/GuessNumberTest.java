package src.com.startjava.Lesson_2_3.game;

import java.util.Scanner;
//предназначен для запуска игры; создания объектов; инициализации объектов с помощью конструкторов

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first player name: ");
		Player playerOne = new Player(scan.next());

		System.out.print("Enter second player name: ");
		Player playerTwo = new Player(scan.next());


		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		String answer = "yes"; 			
		do {	
			game.startGame();
			do {
				System.out.print("Want to continue? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (answer.equals("yes"));
		System.out.println("You tried .... Good luck");
	}
}
