package src.com.startjava.Lesson_4.game;

import java.util.Scanner;

// отвечает за сам процесс игры и логику ее работы

public class GuessNumber {
	 private Player playerOne;
	 private Player playerTwo;	
	 private Scanner scan = new Scanner(System.in);
	 int[] plOneArray = new int[10];



	 public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

//	public void showArrayList(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}

	public void startGame() {

		int rnd = (int) (Math.random() * 101);
		System.out.println("HINT: Number is... " + rnd);
		int i = 0;

		do {

			System.out.println(playerOne.getName() + " input number:");

			int plTest = (scan.nextInt());
			playerOne.setNumber(plTest);
				plOneArray[i] = plTest;

			if (playerOne.getNumber() > rnd) {
				System.out.println( "You input number MORE if generated, try next: " );
			} else if (playerOne.getNumber() < rnd) {
				System.out.println( "You input number _less_ if generated, try next: " );
			} else {
				System.out.println( "You win! " + playerOne.getName() );
				break;
			}
			i++;

			System.out.println("Результат опроса:");
			for (int y= 0; y < (plOneArray.length - 1); y ++) {
				System.out.printf(plOneArray[y] + " " );
				playerOne.setArrnumbers(plOneArray[y] + " " );
			}

			System.out.println(playerOne.getArrnumbers());

			/* TODO выводит в строку все номера массива*/

			System.out.println('\n' + playerTwo.getName() + " input number:");
			playerTwo.setNumber(scan.nextInt());
			if (playerTwo.getNumber() < rnd) {
				System.out.println("You input number _less_ if generated, try next: ");
			} else if (playerTwo.getNumber() > rnd) {
				System.out.println("You input number MORE if generated, try next: ");
			} else {
				System.out.println("You win! " + playerTwo.getName());
				break;
			} 
		} while (true);
	}

}