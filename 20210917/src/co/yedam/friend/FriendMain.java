package co.yedam.friend;
/*
 * 친구 목록관리.
 * 이름, 연락처, email, 키, 몸무게.
 * 1. 등록, 2. 조회(이름), 3. 목록, 4. 수정, 5. 삭제, 9. 종료
 */
import java.util.Scanner;

public class FriendMain {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Friend[] friend = new Friend[100];
		friend[0] = new Friend("정민규", "010-1111-2222", "yyeedd@gmail.com", 181.2, 95.1);
		friend[1] = new Friend("김철수", "010-1234-5678", "cjftn123@naver.com", 172.5, 68.0);
		friend[2] = new Friend("이영희", "010-3232-2323", "lyh958@nate.com", 181.2, 95.1);
		
		
		while (true) {
			System.out.println("1. 친구 추가, 2. 조회(이름), 3. 친구 목록, 4. 친구 수정, 5. 친구 삭제, 9. 종료");
			int menu = readInt("메뉴를 선택하세요(번호 입력): ");
			
			if(menu == 1) {
				System.out.println("친구 추가 메뉴입니다.");
				String name = readStr("친구 이름을 입력하세요: ");
				String phone = readStr("친구 연락처를 입력하세요: ");
				String mail = readStr("친구 이메일을 입력하세요: ");
				double height = readDouble("친구 키를 입력하세요: ");
				double weight = readDouble("친구 몸무게를 입력하세요: ");
				
				Friend frd = new Friend(name, phone, mail, height, weight);
				for (int i = 0; i <friend.length;i++) {
					if(friend[i] == null) {
						friend[i] = frd;
						break;
					}
				}
				System.out.println("추가 완료.");
			} else if (menu == 2) {
				System.out.println("친구 조회(이름) 메뉴입니다.");
				String search = readStr("조회할 친구의 이름을 입력하세요: ");
				for(Friend frd : friend) {
					if (frd != null && frd.getName().indexOf(search) != -1) {
						frd.showInfo();
					}
				}
			} else if (menu == 3) {
				System.out.println("친구 목록 메뉴 입니다.");
				for (Friend frd : friend) {
					if(frd != null) {
						frd.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("등록된 친구를 수정하는 메뉴입니다.");
				String search = readStr("수정할 친구의 이름을 입력하세요: ");
				String phone = readStr("수정할 친구의 연락처를 입력하세요: ");
				String mail = readStr("수정할 친구의 이메일을 입력하세요: ");
				String height = readStr("수정할 친구의 키를 입력하세요: ");
				String weight = readStr("수정할 친구의 몸무게를 입력하세요: ");
				
				boolean isExist = false;
				for (int i = 0; i < friend.length; i++) {
					if (friend[i] != null && friend[i].getName().equals(search)) {
						if(!phone.equals("")) {
							friend[i].setPhone(phone);
						}
						if(!mail.equals("")) {
							friend[i].setMail(mail);
						}
						if(!height.equals("")) {
							friend[i].setHeight(Double.parseDouble(height));
						}
						if(!weight.equals("")) {
							friend[i].setWeight(Double.parseDouble(weight));
						}
						isExist = true;
					}
				}
				if(isExist) {
					System.out.println("수정되었습니다!");
				} else {
					System.out.println("수정되지 않았습니다.");
				}
			} else if (menu == 5) {
				System.out.println("친구 삭제 메뉴입니다.");
				String search = readStr("삭제할 친구의 이름을 입력하세요: ");
				System.out.println("정말로 삭제하시겠습니까? (y/n): ");
				String yn = scn.nextLine();
				if(yn.equals("y")) {
					for (int i = 0; i < friend.length; i++) {
						if(friend[i] != null && friend[i].getName().indexOf(search) != -1) {
							friend[i] = null;
						}
					}
					System.out.println("친구가 삭제되었습니다.");
				} else if (yn.equals("n")) {
					System.out.println("취소되었습니다.");
				} else {
					System.out.println("잘못된 입력입니다. 첫 화면으로 돌아갑니다.");
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}
	
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;

		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주십시오.");
			}
		}
		return result;
	}
	
	public static double readDouble(String msg) {
		System.out.println(msg);
		double result = 0;

		while (true) {
			String val = scn.nextLine();
			try {
				result = Double.parseDouble(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력해주십시오.");
			}
		}
		return result;
	}
}
