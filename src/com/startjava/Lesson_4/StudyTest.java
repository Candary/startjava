package src.com.startjava.Lesson_4;

import java.util.Scanner;

public class StudyTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] questions = {
				"Как вас зовут?",
				"Сколько вам лет?",
				"Изучаете ли вы Java?",
				"Сколько уроков вы уже прошли?"
		};

		String[] titles = {
				"Имя",
				"Возраст",
				"Изучает Java",
				"Прогресс в уроках",
		};

		String[] answers = new String[questions.length];

		System.out.println("Программа - опросник студента изучающего Java.");
		System.out.println();
		System.out.println("Пожалуйста, ответьте на несколько вопросов.");

		System.out.println("Нажмите интер, когда будете готовы.");
		scanner.nextLine();

		for (int i = 0; i < questions.length; i++) {
			String quest = questions[i];
			System.out.println(quest);
			String answer = scanner.nextLine();
			answers[i] = answer;
		}

		System.out.println();
		System.out.println("Результат опроса:");
		for (int i= 0; i < answers.length; i ++){
			System.out.printf("%s : %s \n", titles[i], answers[i]);
		}
	}
}