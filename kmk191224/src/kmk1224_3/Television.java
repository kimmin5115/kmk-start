package kmk1224_3;

//���� Ŭ����
public class Television implements remoteControl {

	private int volume;
	
	@Override
	public void turnon() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("TV�� ���ϴ�.");
		
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
	      System.out.println("���� TV���� : " + volume);
		
	}
	
//	@Override
//	public void setMute(boolean mute) {
//		System.out.println("TV ���Ұ�");
//	}
	
	
}
