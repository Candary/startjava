package src.com.startjava.Lesson_2_3_4.wolf;

public class WolfTest {
	
	public static void main(String[] args) {
		Wolf Wolfie = new Wolf();

		Wolfie.setAge(50);
		System.out.println("Now wolf age is " + Wolfie.getAge());

		Wolfie.setName("Wolfie");
		System.out.println("Wolf name changed to " + Wolfie.getName());
		System.out.println("Wolf run speed is... " + Wolfie.wolfRun());
		System.out.println("Wolf voice is " + Wolfie.wolfHowling());
		System.out.println("Wolf haunted is " + Wolfie.wolfHaunted());  
	}
}
