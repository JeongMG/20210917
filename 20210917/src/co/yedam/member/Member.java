package co.yedam.member;

public class Member {
	// user1(id), 홍길동(이름), 대구중구신당동(주소)

	private String memberId;
	private String name;
	private String address;
	
	// 생성자 : 필드에 값을 초기화
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
		return memberId; // 반환해주는 필드 : 아이디
	}
	
	public String getName() {
		return name; // 반환해주는 필드 : 이름
	}
	
	public String getAddress() {
		return address; // 반환해주는 필드 : 주소
	}

	// 메소드
	public void showInfo() {
		System.out.println("ID: " + memberId + ", 이름: " + name + ", 주소: " + address);
	}

	public void showMemberId() {
		System.out.println("ID: " + memberId);
	}

	public void showMemberName() {
		System.out.println("이름: " + name);
	}

	public void showMemberAddress() {
		System.out.println("주소: " + address);
	}
}
