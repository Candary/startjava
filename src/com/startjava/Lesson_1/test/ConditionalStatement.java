package src.com.startjava.Lesson_1.test;

public class ConditionalStatement {
	public static void main(String[] args) {		
		int age = 30;	
		if (age > 20) { 
			System.out.println("Young man");
		}

		boolean isMan = true;	
		if (!isMan) {
			System.out.println("Woman");
		} 
		if (isMan) {
			System.out.println("Man");
		}

		float height = 1.90f;	
		if (height < 1.80f) {
			System.out.println("Shortie!");
		} else {
			System.out.println("Larch!");
		    System.out.println("test");
		}

		char capitalinName = 'I';	
		if (capitalinName == 'M') {
			System.out.println("M");
		} else if (capitalinName == 'I') {
			System.out.println("I");
		} else {
			System.out.println("No!");
		}
	}
}
