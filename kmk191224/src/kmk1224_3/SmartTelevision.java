package kmk1224_3;

// 두개의 interfatce를 구현하는 클래스
public class SmartTelevision implements remoteControl, InternetSearch {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

	@Override
	public void turnon() {
		System.out.println("스마트 TV를 켭니다.");
		
	}

	@Override
	public void turnoff() {
		System.out.println("스마트 TV를 끕니다.");
		
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
	      System.out.println("현재 스마트TV 볼륨 : " + volume);
		
	}

}
