package src.com.startjava.Lesson_2_3_4.game;

// описывает игроков (один экземпляр класса соответствует одному игроку)
public class Player {	

	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
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
	
	public int getNumber() {
		return number;
	}
}