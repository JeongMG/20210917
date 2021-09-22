package co.yedam.friend;

import java.util.Scanner;

// 1. 친구 추가, 2. 조회(이름), 3. 친구 목록, 4. 친구 수정, 5. 친구 삭제, 9. 종료
public class FriendPractice {
	static Scanner scn = new Scanner(System.in);
	private static Friend[] friend = new Friend[100];

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.친구추가 | 2.조회 | 3.목록 | 4.수정 | 5.삭제 | 9.종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("선택 >> ");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				creatFriend();
			} else if (selectNo == 2) {
				searchFriend();
			} else if (selectNo == 3) {
				friednList();
			} else if (selectNo == 4) {
				friendModifie();
			} else if (selectNo == 5) {
				deleteFriend();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	private static void creatFriend() {
		String name = readStr("친구 이름 : ");
		String phone = readStr("연락처 : ");
		String mail = readStr("메일 : ");
		double height = readDouble("키 : ");
		double weight = readDouble("몸무게 : ");

		Friend frd = new Friend(name, phone, mail, height, weight);

		for (int i = 0; i < friend.length; i++) {
			if (friend[i] == null) {
				friend[i] = frd;
				break;
			}
		}

		System.out.println("친구가 추가되었습니다.");
	}

	private static void searchFriend() {
		String searchName = readStr("조회할 친구의 이름을 입력하세요 : ");

		for (int i = 0; i < friend.length; i++) {
			if (friend[i] != null && searchName.equals(friend[i].getName())) {
				friend[i].showInfo();
			}
		}
	}

	private static void friednList() {
		for (Friend frd : friend) {
			if (frd != null) {
				frd.showInfo();
			}
		}
	}

	private static void friendModifie() {
		String name = readStr("수정할 친구의 이름을 입력하세요 : ");
		String phone = readStr("수정할 연락처를 입력하세요 : ");
		String mail = readStr("수정할 메일을 입력하세요 : ");
		double height = readDouble("수정할 키를 입력하세요 : ");
		double weight = readDouble("수정할 몸무게를 입력하세요 : ");
		
		for(int i = 0; i < friend.length; i++) {
			if(friend[i] != null && name.equals(friend[i].getName())) {
				friend[i].setPhone(phone);
				friend[i].setMail(mail);
				friend[i].setHeight(height);
				friend[i].setWeight(weight);
				break;
			}
		}
	}
	
	private static void deleteFriend() {
		String name = readStr("삭제할 친구의 이름을 입력하세요 : ");
		for(int i = 0; i < friend.length; i++) {
			if(friend[i] != null && name.equals(friend[i].getName())) {
				System.out.println(friend[i].getName() + "의 정보를 삭제하시겠습니까?(y/n)");
				String yorn = scn.nextLine();
				if(yorn.equals("y")) {
					friend[i] = null;
					break;
				} else if (yorn.equals("n")) {
					System.out.println("삭제가 취소되었습니다.");
					break;
				} else {
					System.out.println("입력이 잘못되었습니다.");
					break;
				}
			}
		}
	}

	private static String readStr(String msg) {
		System.out.print(msg);
		String result = scn.nextLine();
		return result;
	}

	private static double readDouble(String msg) {
		System.out.println(msg);
		double result = 0;

		while (true) {
			String val = scn.nextLine();
			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
			}
		}
		return result;
	}
}
