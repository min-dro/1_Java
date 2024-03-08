package practice3.model.vo;

public class Dog extends Animal{
	public static final String PLACE = "�ְ�ī��";
	private int weight;
	public Dog() {}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	@Override
	public void speak() {
		System.out.println(super.toString() + " �����Դ� " + weight  + "kg �Դϴ�.");
	}
	
}