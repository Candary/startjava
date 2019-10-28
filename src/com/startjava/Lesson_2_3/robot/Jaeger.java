package src.com.startjava.Lesson_2_3.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, String mark, String origin,int strength) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.strength = strength;
	}

	public String getModelName(){
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void drift() {

	}

	public void move() {

	}

	public void scanKaiju() {

	}

	public void useVortexCannon() {

	}
}