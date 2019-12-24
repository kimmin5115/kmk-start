package kmk1224_3;

public interface remoteControl {
	
	/*
	 * �������̽�(interface)
	 * 1. �������̽��� main�ڵ�� ��ü���� ���� ������ ��.
	 * 2. ��ü�� �������� �����ϴµ� ������.
	 * 3. �������̽��� ���� ���
	 *  3.1  ��� �ʵ常 ������ ������.
	 *  	�Ϲ����� �ʵ�� �����ص� ������ ��������
	 *  	static final�� �ڵ����� ����.
	 *  3.2  �߻�޼ҵ带 ����.
	 *  3.3  ����Ʈ �޼ҵ� ����.
	 *  	�⺻���� ���೻����� ������ �ִ� �޼ҵ�
	 *  3.4  ����(static) �޼ҵ� ����.
	 *  	�������̽��� ��üȭ���� �ʰ� ���� ȣ�� ����.
	 * 
	 */
	
	//�ʵ� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�޼ҵ� ����(�߻� �޼ҵ�)
	void turnon();
	void turnoff();
	void setVolume(int volume);
	
	//default �޼ҵ� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���Ұ� �մϴ�.");
		}else {
			System.out.println("���Ұ� ���� �մϴ�.");
		}
	}
	
	//static �޼ҵ� ����
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ���ּ���.");
	}
	
	
	
	
	
	
	
	
}
