package kmk1224_3;

// �ΰ��� interfatce�� �����ϴ� Ŭ����
public class SmartTelevision implements remoteControl, InternetSearch {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
		
	}

	@Override
	public void turnon() {
		System.out.println("����Ʈ TV�� �մϴ�.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("����Ʈ TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume> remoteControl.MAX_VOLUME) {
	         this.volume = remoteControl.MAX_VOLUME;
	      }else if (volume < remoteControl.MIN_VOLUME) {
	         this.volume = remoteControl.MIN_VOLUME;
	      }else {
	         this.volume = volume;
	      }
	      System.out.println("���� ����ƮTV ���� : " + volume);
		
	}

}
