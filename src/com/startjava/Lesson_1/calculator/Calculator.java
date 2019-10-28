package src.com.startjava.Lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		char sign = '*'; // +, -, *, /, ^, %

		if (sign == '+') {
			System.out.println(a + b);
		} else if (sign == '-') {
			System.out.println(a - b);
		} else if (sign == '*') {
			System.out.println(a * b);
		} else if (sign == '%') {
			System.out.println(a % b);
		} else if (sign == '/') {
			System.out.println(a / b);
		} else if (sign == '^') {
			int degree = 1;
			for (int i = 0; i < b; i++) {
				degree *= a;
			}
			System.out.println(degree);
		}
	}
}
