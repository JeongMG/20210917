package co.yedam.member;

public class Member {
	// user1(id), ȫ�浿(�̸�), �뱸�߱��Ŵ絿(�ּ�)

	private String memberId;
	private String name;
	private String address;
	
	// ������ : �ʵ忡 ���� �ʱ�ȭ
	public Member() {
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String mName, String mAddr) {
		memberId = mId;
		name = mName;
		address = mAddr;
	}
	
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId; // ��ȯ���ִ� �ʵ� : ���̵�
	}
	
	public String getName() {
		return name; // ��ȯ���ִ� �ʵ� : �̸�
	}
	
	public String getAddress() {
		return address; // ��ȯ���ִ� �ʵ� : �ּ�
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("ID: " + memberId + ", �̸�: " + name + ", �ּ�: " + address);
	}

	public void showMemberId() {
		System.out.println("ID: " + memberId);
	}

	public void showMemberName() {
		System.out.println("�̸�: " + name);
	}

	public void showMemberAddress() {
		System.out.println("�ּ�: " + address);
	}
}
