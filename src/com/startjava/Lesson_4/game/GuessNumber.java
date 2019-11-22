package src.com.startjava.Lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// отвечает за сам процесс игры и логику ее работы

public class GuessNumber {

	private Player playerOne;
	private Player playerTwo;
	private int rnd;
	private Scanner scan = new Scanner(System.in);

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
		Random random = new Random();
		rnd = random.nextInt(101);
		System.out.println("HINT: Number is... " + rnd);

		System.out.println("You have 10 tries");

		for(int i = 0; i < 11; i++) {
			if(i > 9) {
				System.out.println(playerOne.getName() + " end tryes: " + Arrays.toString(playerOne.getNumbers(i)));
				System.out.println(playerTwo.getName() + " end tryes: " + Arrays.toString(playerTwo.getNumbers(i)));
				Arrays.fill(playerOne.getNumbers(i), 0, i, 0);
				Arrays.fill(playerTwo.getNumbers(i), 0, i, 0);
				break;
			}

			if(makeMove(playerOne, i)) {
				break;
			}
			if(makeMove(playerTwo, i)) {
				break;
			}
		}
	}

	private boolean makeMove(Player player, int index) {
		enterNumber(player, index);
		return checkNumber(player, index);
	}

	private void enterNumber(Player player, int index) {
		System.out.println(player.getName() + " input number");
		player.setEnteredNumber(index, scan.nextInt());
	}

	private boolean checkNumber(Player player, int index) {
		if(rnd == player.getEnteredNumber(index)) {
			System.out.println("Player " + player.getName() + " take a number " + player.getEnteredNumber(index) + " with " + (index + 1) + " attempts");
			System.out.println(playerOne.getName() + " " + Arrays.toString(playerOne.getNumbers(index + 1)));
			System.out.println(playerTwo.getName() + " " + Arrays.toString(playerTwo.getNumbers(index + 1)));
			return true;
		} else if(rnd <  player.getEnteredNumber(index)) {
			System.out.println("You input number _less_ if generated");
		} else {
			System.out.println("You input number MORE if generated");
		}
		return false;
	}
}