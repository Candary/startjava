package src.com.startjava.Lesson_2_3.calculator

import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		String answer = "yes";

		while(answer.equals("yes")) {
			System.out.print("Enter first number: ");
			calc.setFirstNumber(scan.nextInt());

			System.out.print("Enter operation: ");
			calc.setsign(scan.next().charAt(0));

			System.out.print("Enter second number: ");
			calc.setSecondNumber(scan.nextInt());

			calc.calculateResult();
			
			do {
				System.out.print("Contiune? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} 
	}
}