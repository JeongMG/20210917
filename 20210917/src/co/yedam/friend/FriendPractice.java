package co.yedam.friend;

import java.util.Scanner;

// 1. ģ�� �߰�, 2. ��ȸ(�̸�), 3. ģ�� ���, 4. ģ�� ����, 5. ģ�� ����, 9. ����
public class FriendPractice {
	static Scanner scn = new Scanner(System.in);
	private static Friend[] friend = new Friend[100];

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.ģ���߰� | 2.��ȸ | 3.��� | 4.���� | 5.���� | 9.���� ");
			System.out.println("-------------------------------------------");
			System.out.print("���� >> ");

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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}

	}

	private static void creatFriend() {
		String name = readStr("ģ�� �̸� : ");
		String phone = readStr("����ó : ");
		String mail = readStr("���� : ");
		double height = readDouble("Ű : ");
		double weight = readDouble("������ : ");

		Friend frd = new Friend(name, phone, mail, height, weight);

		for (int i = 0; i < friend.length; i++) {
			if (friend[i] == null) {
				friend[i] = frd;
				break;
			}
		}

		System.out.println("ģ���� �߰��Ǿ����ϴ�.");
	}

	private static void searchFriend() {
		String searchName = readStr("��ȸ�� ģ���� �̸��� �Է��ϼ��� : ");

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
		String name = readStr("������ ģ���� �̸��� �Է��ϼ��� : ");
		String phone = readStr("������ ����ó�� �Է��ϼ��� : ");
		String mail = readStr("������ ������ �Է��ϼ��� : ");
		double height = readDouble("������ Ű�� �Է��ϼ��� : ");
		double weight = readDouble("������ �����Ը� �Է��ϼ��� : ");
		
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
		String name = readStr("������ ģ���� �̸��� �Է��ϼ��� : ");
		for(int i = 0; i < friend.length; i++) {
			if(friend[i] != null && name.equals(friend[i].getName())) {
				System.out.println(friend[i].getName() + "�� ������ �����Ͻðڽ��ϱ�?(y/n)");
				String yorn = scn.nextLine();
				if(yorn.equals("y")) {
					friend[i] = null;
					break;
				} else if (yorn.equals("n")) {
					System.out.println("������ ��ҵǾ����ϴ�.");
					break;
				} else {
					System.out.println("�Է��� �߸��Ǿ����ϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		return result;
	}
}
