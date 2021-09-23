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
		friends[0] = new Friend("ȫ�浿", "1111-1211");
		friends[5] = new Friend("ȫ�浿", "1111-1234");
		friends[1] = new Friend("��浿", "2222-1211");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void excute() {
		while (true) {
			System.out.println("-------------------------");
			System.out.println("1. ģ����� 2. ��ȸ 3. ���� 4. ���� 5. ����.");
			System.out.println("-------------------------");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���.");

			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				delete();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("��.");
	}

	private void addFriend() {
		System.out.println("1.ģ�� 2.����ģ�� 3.ȸ��ģ��");
		int select = ScanUtil.readInt("�޴� ����: ");
		String name = ScanUtil.readStr("ģ�� �̸� �Է�: ");
		String phone = ScanUtil.readStr("��ȭ ��ȣ �Է�: ");
		Friend friend = null;
		if (select == 1) {
			friend = new Friend(name, phone);
		} else if (select == 2) {
			String major = ScanUtil.readStr("�а� �Է� : ");
			friend = new UnivFriend(name, phone, major);
		} else if (select == 3) {
			String depart = ScanUtil.readStr("�μ� �Է�: ");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

		System.out.println("��� ����!");
	}

	private void showList() {
		String name = ScanUtil.readStr("��ȸ�� �̸� �Է�: ");
		String phone = ScanUtil.readStr("��ȸ�� ��ȭ ��ȣ �Է�");
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null) {
				if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1) {
					System.out.println(friends[i].toString());
				}
			}
		}
	}

	private void modify() {
		System.out.println("--- ģ�� ��� ---");
		for(int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println("[" + i + "] " + friends[i].toString());
			}
		}
		
		int select = ScanUtil.readInt("������ ģ���� ��ȣ�� �Է��ϼ���: ");
		String phone = ScanUtil.readStr("�ٲ� ��ȭ��ȣ�� �Է��ϼ���: ");
		
		if(!phone.equals("")) {
			friends[select].setPhone(phone);
		} 
		if (friends[select] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���: ");
			if(!major.equals("")) {
				((UnivFriend)friends[select]).setMajor(major);
			}
		} else if(friends[select] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���: ");
			if(!depart.equals("")) {
				((CompFriend)friends[select]).setDepart(depart);
			}
		}
	}
	
	private void delete() {
		System.out.println("--- ģ�� ��� ---");
		for(int i = 0; i < friends.length; i++) {
			System.out.println("[" + i + "] " + friends[i].toString());
		}
		int select = ScanUtil.readInt("������ ģ���� ��ȣ�� �Է��ϼ���: ");
		
		if (friends[select] != null) {
			friends[select] = null;
			System.out.println("���� �Ϸ�.");	
		} else {
			System.out.println("������ ������ �����ϴ�.");
		}
	}
}
