package co.yedam.kyobo;

import java.util.Scanner;

/*
 *  1. 도서 등록, 2. 도서 수정, 3. 도서 목록, 4. 도서 조회, 5. 도서 삭제, 9. 종료
 *  도서 정보 : 도서 제목 / 저자 / 출판사 / 가격
 */
public class BookLibrary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("혼자 공부하는 자바", "신용권", "한빛출판사", 25000);
		kyoboLib[1] = new Book("이것이 자바다", "신용권", "한빛출판사", 20000);
		kyoboLib[2] = new Book("혼자 공부하는", "홍길동", "우리출판사", 35000);

		while (true) {
			System.out.println("1. 도서 등록, 2. 도서 수정, 3. 도서 목록, 4. 도서 조회, 5. 도서 삭제, 9. 종료");
			int menu = readInt("메뉴를 선택하세요: ");
			if (menu == 1) {
				System.out.println("도서 등록 메뉴입니다.");
				// 도서 등록 : 제목, 저자, 출판사, 가격.
				String title = readStr("책 제목을 입력하세요: ");
				String auth = readStr("저자를 입력하세요: ");
				String press = readStr("출판사를 입력하세요: ");
				int price = readInt("가격을 입력하세요. ");
				// 생성자를 호출 => book 변수 저장
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) { // 배열의 비어있는 위치에 저장.
					if (kyoboLib[i] == null) {
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장 완료.");
			} else if (menu == 2) {
				System.out.println("도서 수정 메뉴입니다.");
				// 도서명으로 찾아와서 => 도서명(키)
				// 저자, 출판사, 가격 => 항목 변경.
				String search = readStr("수정할 도서명을 입력하세요: ");
				String author = readStr("변경할 저자를 입력하세요.[값을 입력하지 않으면 변경하지 않습니다.]: ");
				String press = readStr("변경할 출판사를 입력하세요.[값을 입력하지 않으면 변경하지 않습니다.]: ");
				String price = readStr("변경할 금액을 입력하세요.[값을 입력하지 않으면 변경하지 않습니다.]: ");
				boolean isExist = false;
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if (!author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if (!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						if (!price.equals("")) {
							kyoboLib[i].setPrice(Integer.parseInt(price));
						}
						isExist = true;
					}
				}
				if(isExist) {
					System.out.println("정상적으로 수정.");
				} else {
					System.out.println("g");
				}
			} else if (menu == 3) {
				System.out.println("도서 목록 메뉴입니다.");
				for (Book book : kyoboLib) {
					if (book != null) {
						book.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("도서 조회 메뉴입니다.");
				String search = readStr("조회할 도서명을 입력하세요: ");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1) {
						book.showInfo();
					}
				}
			} else if (menu == 5) {
				System.out.println("도서 삭제 메뉴입니다.");
				String search = readStr("삭제할 도서명을 입력하세요: ");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1) {
						kyoboLib[i] = null;
					}
				}
				System.out.println("삭제 완료.");
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while
		System.out.println("끝.");
	} // end of main

	// 사용자 입력값을 반환해주는 메소드
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	// 사용자 입력값을 반환해주는 메소드(int)
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
}
