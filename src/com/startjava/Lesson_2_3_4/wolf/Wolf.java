package src.com.startjava.Lesson_2_3_4.wolf;

public class Wolf {
	
	private char sex = 'M';
	private String name = "Rex";
	private int weight = 20;
	private int age = 5;
	private String color = "silver";
	private int speed = 15;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age!");			
		} else {
		this.age = age;			
		}
	}	

	public void wolfGo() {
	}

	public void wolfSit() {
		 System.out.println("Wofl is sits!");
	}

	public int wolfRun() {
		speed = 30;
		return speed;
	}

	public boolean wolfHowling() {
		boolean isHowling = true;
		return isHowling; 
	}

	public boolean wolfHaunted() {
		boolean isHaunted = false;
		return isHaunted;
	} 
}
