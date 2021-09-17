package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("정민규", 182.4, 98.0, "B형", 26);
		Person p2 = new Person("철수", 176.2, 78.4, "A형", 31);
		Person p3 = new Person("영희", 162.1, 51.1, "O형", 25);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println("이름: " + family[i].getName());
			System.out.println("혈액형: " + family[i].getBloodType());
			System.out.println("나이: " + family[i].getAge());
			System.out.println("==================");
		}

		System.out.println("끝1.");
		System.out.println();

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() >= 165) {
				System.out.println(family[i].getName() + "의 키는 165이상(" + family[i].getHeight() + "cm)입니다.");
			}
		}
		System.out.println("끝2.");
		System.out.println();

		p3.setBloodType("AB형");
		for (int i = 0; i < family.length; i++) {
			if (family[i].getBloodType().equals("AB형")) {
				System.out.println(family[i].getName() + "의 혈액형은 AB형이 맞습니다.");
			} else {
				System.out.println(family[i].getName() + "의 혈액형은 AB형이 아닙니다.(" + family[i].getBloodType() + ")");
			}
		}
		System.out.println("끝3.");
		
		
	}
}
