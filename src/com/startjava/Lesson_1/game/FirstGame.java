package src.com.startjava.Lesson_1.game;

public class FirstGame {
	public static void main(String[] args) {
		System.out.println("Number in 0-100. Try to get him!");
		int knownNumber = 73; 
		int tryNumber = 45; 
		System.out.println("Try to get number");
		do {
			if (tryNumber < knownNumber) {
				System.out.println("Small number!");
				tryNumber += 6; 
			} else if (tryNumber > knownNumber) {
				System.out.println("Big number!");
				tryNumber -= 5; }
		} while (knownNumber != tryNumber);
		System.out.println("YES! You got it!");
	}
}
