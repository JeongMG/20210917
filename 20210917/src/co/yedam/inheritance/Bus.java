package co.yedam.inheritance;
import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	public Bus() {
		super();
	}
	@Override
	protected void run() { // ��� ����� protected�� ��Ű�� ������� ��� �����ϴ�.
		System.out.println("������ �޸��ϴ�.");
	}
	
	@Override
	public void stop() {
		super.stop();
	}
}
