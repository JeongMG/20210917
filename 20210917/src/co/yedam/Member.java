package co.yedam;

public class Member {
		// �ʵ�
		int memberId;
		String name;
		String phone;
		
		// �޼ҵ�(���)
		public void showInfo() {
			System.out.println("���̵�: " + memberId 
					+ ", �̸�: " + name 
					+ ", ����ó: " + phone);
		}
}
