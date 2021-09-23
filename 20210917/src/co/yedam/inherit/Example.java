package co.yedam.inherit;

public class Example {
	public static void main(String[] args) {
		People p1 = new People("홍길동", "20200101-1234567");

		System.out.println("이름: " + p1.getName());
		System.out.println("번호: " + p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());

		Student s1 = new Student("Park", "20210101-1234567");
		System.out.println("이름: " + s1.getName());
		System.out.println("번호: " + s1.getSsn());
		s1.showInfo();
		System.out.println(s1.toString());

		Student s2 = new Student("Choi", "20210202-1234567", 110);
		System.out.println("이름: " + s2.getName());
		System.out.println("번호: " + s2.getSsn());
		System.out.println("학번: " + s2.getStudentNo());
		s2.showInfo();

		People p2 = new Student("Hwang", "20210303-1234567", 120);
//		p1 = new Student("Hwang", "20210303-1234567", 120);

//		Student s3 = new People();

//		p2.getStudentNo(); 부모클래스의 변수에는 자식 클래스의 메소드 호출 불가능
		if (p2 instanceof Student) {
			Student s3 = (Student) p2;
			s3.getStudentNo();
		}
		if (p1 instanceof Student) {
			Student s4 = (Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("형변환할 수 없습니다.");
		}
	}
}
