package kmk1224_3;

public class Audio implements remoteControl {
	
	private int volume;

	@Override
	public void turnon() {
		System.out.println("오디오를 켭니다");
		
	}

	@Override
	public void turnoff() {
		System.out.println("오디오를 끕니다.");
		
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
	      System.out.println("현재 Audio볼륨 : " + volume);
	};

}
