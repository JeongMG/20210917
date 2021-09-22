package co.yedam.friend;

public class Friend {
	private String name;
	private String phone;
	private String mail;
	private double height;
	private double weight;
	
	public Friend(String name, String phone, String mail, double height, double weight) {
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}	
	
	public void showInfo() {
		System.out.printf("[이름: %s, 연락처: %s, 이메일: %s, 키: %f, 몸무게: %f]\n", name, phone, mail, height, weight);
	}
}
