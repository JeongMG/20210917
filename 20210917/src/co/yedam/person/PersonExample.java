package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("���α�", 182.4, 98.0, "B��", 26);
		Person p2 = new Person("ö��", 176.2, 78.4, "A��", 31);
		Person p3 = new Person("����", 162.1, 51.1, "O��", 25);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println("�̸�: " + family[i].getName());
			System.out.println("������: " + family[i].getBloodType());
			System.out.println("����: " + family[i].getAge());
			System.out.println("==================");
		}

		System.out.println("��1.");
		System.out.println();

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() >= 165) {
				System.out.println(family[i].getName() + "�� Ű�� 165�̻�(" + family[i].getHeight() + "cm)�Դϴ�.");
			}
		}
		System.out.println("��2.");
		System.out.println();

		p3.setBloodType("AB��");
		for (int i = 0; i < family.length; i++) {
			if (family[i].getBloodType().equals("AB��")) {
				System.out.println(family[i].getName() + "�� �������� AB���� �½��ϴ�.");
			} else {
				System.out.println(family[i].getName() + "�� �������� AB���� �ƴմϴ�.(" + family[i].getBloodType() + ")");
			}
		}
		System.out.println("��3.");
		
		
	}
}
