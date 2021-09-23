package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	// �̱��� : new ������ => ���ο� �ν��Ͻ�.
	private static AppMain singleton = new AppMain();
	// ������ private
	private AppMain() {
		
	}
	
	// method getInsteance()
	public static AppMain getInstance() {
		return singleton;
	}
	
	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	static int num = 0;

	public void createAccount() {
		System.out.println("------");
		System.out.println("���� ����");
		System.out.println("------");

		String ano = readStr("���¹�ȣ : ");
		String owner = readStr("������ : ");
		int balance = readInt("�ʱ��Աݾ� : ");
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}

	public void accountList() {
		int cnt = 0;

		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.printf("%s %s     %d\n", accountArray[cnt].getAno(), accountArray[cnt].getOwner(),
						accountArray[cnt].getBalance());
				cnt++;
			}
		}
	}

	public void deposit() {
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");

		String searchAccountNo = readStr("���¹�ȣ : ");
		int credit = readInt("���ݾ� : ");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && searchAccountNo.equals(accountArray[i].getAno())) {
				int AmountToDeposit = accountArray[i].getBalance() + credit;
				accountArray[i].setBalance(AmountToDeposit);
				System.out.println("��� : ������ �����Ǿ����ϴ�.");
			}
		}
	}

	public void withdraw() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");

		String searchAccountNo = readStr("���¹�ȣ : ");
		int credit = readInt("��ݾ� : ");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && searchAccountNo.equals(accountArray[i].getAno())) {
				if (accountArray[i].getBalance() >= credit) {
					int AmountToWithdrawal = accountArray[i].getBalance() - credit;
					accountArray[i].setBalance(AmountToWithdrawal);
					System.out.println("��� : ����� �����Ǿ����ϴ�.");
				} else if (accountArray[i].getBalance() < credit) {
					System.out.println("��� : ��� ���ɾ��� �ʰ��Ͽ����ϴ�.");
				} else {
					System.out.println("�߸��� �Է��� �Ͽ����ϴ�.");
				}
			}
		}
	}

	public Account findAccount(String ano) {
		return null;
	}

	static Scanner scn = new Scanner(System.in);

	public String readStr(String msg) {
		System.out.print(msg);
		return scn.nextLine();
	}

	public int readInt(String msg) {
		System.out.print(msg);
		int result = 0;

		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ֽʽÿ�.");
			}
		}
		return result;
	}

	public void execute() {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------------------------");
			System.out.print("���� >> ");
			
			int selectNo1 = scanner.nextInt();
			
			if (selectNo1 == 1) {
				createAccount();
			} else if (selectNo1 == 2) {
				accountList();
			} else if (selectNo1 == 3) {
				deposit();
			} else if (selectNo1 == 4) {
				withdraw();
			} else if (selectNo1 == 5) {
				run = false;
			} else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			}
		}
		

	}
}
