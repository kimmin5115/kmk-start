package kmk1223;

public class kmk_Cellphone extends kmk_Phone {

	/*
	 * phone : �θ�Ŭ����
	 * cellphone : �ڽ� Ŭ����
	 */
	
	
	
	String button;
	String message;
	
	//������
	//button, model, cololr�� �Ű������� �ϴ� ������ ����
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
	//�޼ҵ�
	void sendMessage(String message) {
		System.out.println("�޼��� ���� : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("�޼��� ���� : " + message);
	}
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	@Override
	public String toString() {
		return "kmk_Cellphone [button=" + button + ", model=" + model + ", color=" + color + "]";
	}
	
	
 }
