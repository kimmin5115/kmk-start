package kmk1224_3;

//구현 클래스
public class Television implements remoteControl {

	private int volume;
	
	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다.");
		
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
	      System.out.println("현재 TV볼륨 : " + volume);
		
	}
	
//	@Override
//	public void setMute(boolean mute) {
//		System.out.println("TV 음소거");
//	}
	
	
}
