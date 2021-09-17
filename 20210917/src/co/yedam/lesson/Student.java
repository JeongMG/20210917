package co.yedam.lesson;

/*
 * 학생 이름, 연락처, 학생 주소
 */
public class Student {
	private String studentName;
	private String phone;
	private String address;
	
	public Student(String name, String phone, String address) {
		this.studentName = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getStudentPhone() {
		return this.phone;
	}
	
	public String getStudentAddress() {
		return this.address;
	}
}
