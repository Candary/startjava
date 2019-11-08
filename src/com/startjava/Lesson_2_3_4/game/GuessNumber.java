package src.com.startjava.Lesson_2_3_4.game;

import java.util.Scanner;
// отвечает за сам процесс игры и логику ее работы

public class GuessNumber {
	 private Player playerOne;
	 private Player playerTwo;	
	 private Scanner scan = new Scanner(System.in);

	 public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}	

	public void startGame() {
		int rnd = (int) (Math.random() * 101);
		System.out.println("HINT: Number is... " + rnd);

		do {
			System.out.println(playerOne.getName() + " input number:");
			playerOne.setNumber(scan.nextInt());
			if (playerOne.getNumber() > rnd) {
				System.out.println("You input number MORE if generated, try next: ");
			} else if (playerOne.getNumber() < rnd) {
				System.out.println("You input number _less_ if generated, try next: ");
			} else {
				System.out.println("You win! " + playerOne.getName());
				break;
			}
			
			System.out.println(playerTwo.getName() + " input number:");
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