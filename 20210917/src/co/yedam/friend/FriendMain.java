package co.yedam.friend;
/*
 * ģ�� ��ϰ���.
 * �̸�, ����ó, email, Ű, ������.
 * 1. ���, 2. ��ȸ(�̸�), 3. ���, 4. ����, 5. ����, 9. ����
 */
import java.util.Scanner;

public class FriendMain {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Friend[] friend = new Friend[100];
		friend[0] = new Friend("���α�", "010-1111-2222", "yyeedd@gmail.com", 181.2, 95.1);
		friend[1] = new Friend("��ö��", "010-1234-5678", "cjftn123@naver.com", 172.5, 68.0);
		friend[2] = new Friend("�̿���", "010-3232-2323", "lyh958@nate.com", 181.2, 95.1);
		
		
		while (true) {
			System.out.println("1. ģ�� �߰�, 2. ��ȸ(�̸�), 3. ģ�� ���, 4. ģ�� ����, 5. ģ�� ����, 9. ����");
			int menu = readInt("�޴��� �����ϼ���(��ȣ �Է�): ");
			
			if(menu == 1) {
				System.out.println("ģ�� �߰� �޴��Դϴ�.");
				String name = readStr("ģ�� �̸��� �Է��ϼ���: ");
				String phone = readStr("ģ�� ����ó�� �Է��ϼ���: ");
				String mail = readStr("ģ�� �̸����� �Է��ϼ���: ");
				double height = readDouble("ģ�� Ű�� �Է��ϼ���: ");
				double weight = readDouble("ģ�� �����Ը� �Է��ϼ���: ");
				
				Friend frd = new Friend(name, phone, mail, height, weight);
				for (int i = 0; i <friend.length;i++) {
					if(friend[i] == null) {
						friend[i] = frd;
						break;
					}
				}
				System.out.println("�߰� �Ϸ�.");
			} else if (menu == 2) {
				System.out.println("ģ�� ��ȸ(�̸�) �޴��Դϴ�.");
				String search = readStr("��ȸ�� ģ���� �̸��� �Է��ϼ���: ");
				for(Friend frd : friend) {
					if (frd != null && frd.getName().indexOf(search) != -1) {
						frd.showInfo();
					}
				}
			} else if (menu == 3) {
				System.out.println("ģ�� ��� �޴� �Դϴ�.");
				for (Friend frd : friend) {
					if(frd != null) {
						frd.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("��ϵ� ģ���� �����ϴ� �޴��Դϴ�.");
				String search = readStr("������ ģ���� �̸��� �Է��ϼ���: ");
				String phone = readStr("������ ģ���� ����ó�� �Է��ϼ���: ");
				String mail = readStr("������ ģ���� �̸����� �Է��ϼ���: ");
				String height = readStr("������ ģ���� Ű�� �Է��ϼ���: ");
				String weight = readStr("������ ģ���� �����Ը� �Է��ϼ���: ");
				
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
					System.out.println("�����Ǿ����ϴ�!");
				} else {
					System.out.println("�������� �ʾҽ��ϴ�.");
				}
			} else if (menu == 5) {
				System.out.println("ģ�� ���� �޴��Դϴ�.");
				String search = readStr("������ ģ���� �̸��� �Է��ϼ���: ");
				System.out.println("������ �����Ͻðڽ��ϱ�? (y/n): ");
				String yn = scn.nextLine();
				if(yn.equals("y")) {
					for (int i = 0; i < friend.length; i++) {
						if(friend[i] != null && friend[i].getName().indexOf(search) != -1) {
							friend[i] = null;
						}
					}
					System.out.println("ģ���� �����Ǿ����ϴ�.");
				} else if (yn.equals("n")) {
					System.out.println("��ҵǾ����ϴ�.");
				} else {
					System.out.println("�߸��� �Է��Դϴ�. ù ȭ������ ���ư��ϴ�.");
				}
			} else if (menu == 9) {
				System.out.println("���α׷��� �����մϴ�.");
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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է����ֽʽÿ�.");
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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է����ֽʽÿ�.");
			}
		}
		return result;
	}
}
