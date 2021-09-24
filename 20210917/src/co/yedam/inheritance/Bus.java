package co.yedam.inheritance;
import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	public Bus() {
		super();
	}
	@Override
	protected void run() { // 상속 관계면 protected를 패키지 상관없이 사용 가능하다.
		System.out.println("버스가 달립니다.");
	}
	
	@Override
	public void stop() {
		super.stop();
	}
}
