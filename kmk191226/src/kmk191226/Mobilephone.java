package kmk191226;

public interface Mobilephone extends phone{

	@Override
	public default void callon() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}

	@Override
	public default void calloff() {
		System.out.println("��ȭ�� �����ϴ�.");
		
	}

	static void messageon() {
		System.out.println("�޼����� �����ϴ�.");
	}
	static void messageoff() {
		System.out.println("�޼����� �޽��ϴ�.");
	}
}
