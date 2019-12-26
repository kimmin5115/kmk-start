package kmk191226;

public interface Mobilephone extends phone{

	@Override
	public default void callon() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public default void calloff() {
		System.out.println("전화를 끊습니다.");
		
	}

	static void messageon() {
		System.out.println("메세지를 보냅니다.");
	}
	static void messageoff() {
		System.out.println("메세지를 받습니다.");
	}
}
