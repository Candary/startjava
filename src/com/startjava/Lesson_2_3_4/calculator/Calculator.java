package src.com.startjava.Lesson_2_3_4.calculator;

public class Calculator {	
	private int firstNumber; 
	private char sign;
	private int secondNumber;
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setsign(char sign) {
		this.sign = sign;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void calculateResult() {		
		switch (sign) {
			case '+': 
				System.out.println(firstNumber + secondNumber);
				break;		
			case '-': 
				System.out.println(firstNumber - secondNumber);
				break;
			case '*': 
				System.out.println(firstNumber * secondNumber);
				break;
			case '%': 
				System.out.println(firstNumber % secondNumber);
				break;
			case '/': 
				System.out.println(firstNumber / secondNumber);
				break;
			case '^': 
				int degree = 1;
				for (int i = 0; i < secondNumber; i++) {
					degree *= firstNumber;
				}
				System.out.println(degree);	
				break;
			default:
				System.out.println("Operation not supported!");		
		}

	}	
}
