package kmk1224_3;

public class Audio implements remoteControl {
	
	private int volume;

	@Override
	public void turnon() {
		System.out.println("������� �մϴ�");
		
	}

	@Override
	public void turnoff() {
		System.out.println("������� ���ϴ�.");
		
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
	      System.out.println("���� Audio���� : " + volume);
	};

}
