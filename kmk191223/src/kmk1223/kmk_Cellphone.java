package kmk1223;

public class kmk_Cellphone extends kmk_Phone {

	/*
	 * phone : 부모클래스
	 * cellphone : 자식 클래스
	 */
	
	
	
	String button;
	String message;
	
	//생성자
	//button, model, cololr를 매개변수로 하는 생성자 선언
	kmk_Cellphone(String button, String model, String color ) {
		this.button = button;
		this.model = model;
		this.color = color;
	}
	kmk_Cellphone(String model, String color){
		this.model = model;
		this.color = color;
	}
	kmk_Cellphone(){
		
	}
	//메소드
	void sendMessage(String message) {
		System.out.println("메세지 전송 : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("메세지 수신 : " + message);
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	@Override
	public String toString() {
		return "kmk_Cellphone [button=" + button + ", model=" + model + ", color=" + color + "]";
	}
	
	
 }
