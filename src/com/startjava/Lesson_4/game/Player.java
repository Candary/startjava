package src.com.startjava.Lesson_4.game;

// описывает игроков (один экземпляр класса соответствует одному игроку)
public class Player {	

	private String name;
	private String arrnumbers;
	private int number;

	public Player(String name, String arrnumbers) {
		this.name = name;
		this.arrnumbers = arrnumbers;
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

	public String getArrnumbers() {
		return arrnumbers;
	}

	public void setArrnumbers(String arrnumbers) {
		this.arrnumbers = arrnumbers;
	}
}