package src.com.startjava.Lesson_4.game;

import java.util.Arrays;

// описывает игроков (один экземпляр класса соответствует одному игроку)
public class Player {	

	private String name;
	private int[] enteredNumbers;
	private int number;

	public Player(String name) {
		this.name = name;
		enteredNumbers = new int[10];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public void setNumber(int number) {
		this.number = number;	
	}

	public int getEnteredNumber(int index) {
		return enteredNumbers[index];
	}

	public void setEnteredNumber(int index, int number) {
		this.enteredNumbers[index] = number;
	}

	public int[] getNumbers(int index) {
		return Arrays.copyOf(enteredNumbers, index);
	}

}