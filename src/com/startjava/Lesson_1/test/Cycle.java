package src.com.startjava.Lesson_1.test;

public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println("i = " + i);		 
		}
		System.out.println();	

		int counter = -6;
		while (counter <= 6) {
			System.out.println("y = " + counter);
			counter += 2;
		}
		System.out.println();	

		counter = 10;
		int sumOdd = 0;
		do {
			if (counter % 2 != 0) {
				System.out.println(counter + " "); 
				sumOdd += counter; 
			}	
			counter++;	
		} while (counter <= 20);
		System.out.println("Summary - " + sumOdd);
	}
}
