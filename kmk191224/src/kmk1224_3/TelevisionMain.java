package kmk1224_3;

public class TelevisionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Television tv = new Television();
		tv.turnon();
		tv.turnoff();
		tv.setVolume(5);
		tv.setMute(true);
		//AudioŬ������ remoteControl�� ����Ŭ������ �����Ͽ�
		//�޼ҵ� ���� �����ϰ�
		//main Ŭ�������� �������� �����Ͽ�
		//tv, Aidio ��ü�� ����� �޼ҵ带 ȣ���غ�����.
		
		
		remoteControl ao = new Audio();
		ao.setVolume(5);
		ao = new Audio();
		ao.setVolume(4);
		
		remoteControl TV= new Television();
		TV.setMute(false);
		remoteControl.changeBattery();
		System.out.println(remoteControl.MAX_VOLUME);
		System.out.println(remoteControl.MIN_VOLUME);
		
		
		remoteControl smart= new SmartTelevision();
		smart.setMute(false);
		smart.turnoff();
		smart.turnon();
		SmartTelevision st = new SmartTelevision();
		st.setVolume(5);
		st.search("������");
		InternetSearch is = new SmartTelevision();
		is.search("11");
	}

}
