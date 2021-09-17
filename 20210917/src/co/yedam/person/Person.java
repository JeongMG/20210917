package co.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class Person {
	private String name;
	private double height;
	private double weight;
	private String bloodType;
	private int age;
	
	// 생성자
	public Person(String name, double height, double weight, String bloodType, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.age = age;
	}
	
	// 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getBloodType() {
		return this.bloodType;
	}
	
	public int getAge() {
		return this.age;
	}
}
