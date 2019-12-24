package kmk1224_3;

public class TelevisionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Television tv = new Television();
		tv.turnon();
		tv.turnoff();
		tv.setVolume(5);
		tv.setMute(true);
		//Audio클래스를 remoteControl의 구현클래스로 정의하여
		//메소드 등을 정의하고
		//main 클래스에서 다형성을 적용하여
		//tv, Aidio 객체를 만들어 메소드를 호출해보세요.
		
		
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
		st.search("김진우");
		InternetSearch is = new SmartTelevision();
		is.search("11");
	}

}
