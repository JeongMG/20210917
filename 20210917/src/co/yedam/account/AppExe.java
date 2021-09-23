package co.yedam.account;

public class AppExe {
	public static void main(String[] args) {
		AppMain main = AppMain.getInstance();
		// main.execute();
		
		AppMain main2 = AppMain.getInstance();
		
		if (main == main2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
