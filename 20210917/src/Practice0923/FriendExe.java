package Practice0923;

import co.yedam.inherit.CompFriend;
import co.yedam.inherit.Friend;
import co.yedam.inherit.UnivFriend;
import yedam.ScanUtil;

public class FriendExe {
	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "1111-1211");
		friends[5] = new Friend("홍길동", "1111-1234");
		friends[1] = new Friend("김길동", "2222-1211");
		friends[2] = new Friend("홍수아", "2222-1311");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void excute() {
		while (true) {
			System.out.println("-------------------------");
			System.out.println("1. 친구등록 2. 조회 3. 수정 4. 삭제 5. 종료.");
			System.out.println("-------------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요.");

			if (menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				delete();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("끝.");
	}

	private void addFriend() {
		System.out.println("1.친구 2.대학친구 3.회사친구");
		int select = ScanUtil.readInt("메뉴 선택: ");
		String name = ScanUtil.readStr("친구 이름 입력: ");
		String phone = ScanUtil.readStr("전화 번호 입력: ");
		Friend friend = null;
		if (select == 1) {
			friend = new Friend(name, phone);
		} else if (select == 2) {
			String major = ScanUtil.readStr("학과 입력 : ");
			friend = new UnivFriend(name, phone, major);
		} else if (select == 3) {
			String depart = ScanUtil.readStr("부서 입력: ");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("등록 성공!");
	}

	private void showList() {
		String name = ScanUtil.readStr("조회할 이름 입력: ");
		String phone = ScanUtil.readStr("조회할 전화 번호 입력");
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
					System.out.println(friends[i].toString());
				}
			}
		}
	}

	private void modify() {
		System.out.println("--- 친구 목록 ---");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "] " + friends[i].toString());
			}
		}
		
		int select = ScanUtil.readInt("수정할 친구의 번호를 입력하세요: ");
		String phone = ScanUtil.readStr("바꿀 전화번호를 입력하세요: ");
		
		if(!phone.equals("")) {
			friends[select].setPhone(phone);
		} 
		if (friends[select] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요: ");
			if(!major.equals("")) {
				((UnivFriend)friends[select]).setMajor(major);
			}
		} else if(friends[select] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요: ");
			if(!depart.equals("")) {
				((CompFriend)friends[select]).setDepart(depart);
			}
		}
	}
	
	private void delete() {
		System.out.println("--- 친구 목록 ---");
		for(int i = 0; i < friends.length; i++) {
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		int select = ScanUtil.readInt("삭제할 친구의 번호를 입력하세요: ");
		
		if (friends[select] != null) {
			friends[select] = null;
			System.out.println("삭제 완료.");	
		} else {
			System.out.println("삭제할 정보가 없습니다.");
		}
	}
}
