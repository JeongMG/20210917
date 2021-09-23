package Practice0923;

public class CompFriend extends Friend {
	private String depart;
	
	public CompFriend (String name, String phone, String depart) {
		super(name, phone);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	@Override
	public String toString() {
		return "회사 친구 [이름: " + this.getName() + ", 전화 번호: " + this.getPhone() + ", 부서: " + depart + "]";
	}
}
