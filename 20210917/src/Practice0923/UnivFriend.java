package Practice0923;

public class UnivFriend extends Friend {
	private String major;
	
	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "대학 친구 [이름: " + this.getName() + ", 전화 번호: " + this.getPhone() + ", 전공: " + major + "]";  
	}
}
