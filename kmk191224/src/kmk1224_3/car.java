package kmk1224_3;

public abstract class car {
	
	String handling;
	
	void startup() {
		System.out.println("시동을 걸고 출발을 합니다.");
	}
	
	abstract void speed();
}
