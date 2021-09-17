package co.yedam;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.memberId = 10;
		m1.name = "¹Ú¹Ì¸²";
		m1.phone = "010-1111-2222";

		Member m2 = new Member();
		m2.memberId = 20;
		m2.name = "È«±æµ¿";
		m2.phone = "010-3333-4444";

		Member[] members = { m1, m2 };
		for(Member member : members ) {
			System.out.println("ID: " + member.memberId);
			System.out.println("¸â¹ö ÀÌ¸§: " + member.name);
			System.out.println("¿¬¶ôÃ³: " + member.phone);
		}
		
		// m1 ==> member[0]
		m1.name = "±è¹Ì¸²";
		members[0].phone = "010-5555-6666";
		
		for (Member member : members) {
			member.showInfo();
		}
	}
}
