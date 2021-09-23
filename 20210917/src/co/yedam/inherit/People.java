package co.yedam.inherit;

public class People {
	private String name;
	private String ssn;
	
	public People() {
		
	}
	
	public People (String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name + ", 주민번호는 " + ssn);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}
