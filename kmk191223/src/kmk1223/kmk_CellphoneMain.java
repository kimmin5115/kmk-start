package kmk1223;

public class kmk_CellphoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * CellPhone 클래스 객체 선언해서
		 *  - 부모클래스 필드값 출력
		 *  - 부모클래스 메소드 호출
		 *  - 자식클래스 필드값 출력
		 *  - 자식클래스 메소드 호출
		 */
		
		kmk_Cellphone cell = new kmk_Cellphone("1번","삼성","흰색");
		
		kmk_Cellphone cell1 = new kmk_Cellphone("Lg","검은색");
		System.out.println(cell.toString());
		System.out.println(cell1.toString());
		System.out.println(cell1.color);
		
		cell.hangOff();
		cell.powerOn();
		cell.sendMessage("보내줘");
	}

}
