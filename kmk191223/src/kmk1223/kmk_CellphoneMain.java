package kmk1223;

public class kmk_CellphoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * CellPhone Ŭ���� ��ü �����ؼ�
		 *  - �θ�Ŭ���� �ʵ尪 ���
		 *  - �θ�Ŭ���� �޼ҵ� ȣ��
		 *  - �ڽ�Ŭ���� �ʵ尪 ���
		 *  - �ڽ�Ŭ���� �޼ҵ� ȣ��
		 */
		
		kmk_Cellphone cell = new kmk_Cellphone("1��","�Ｚ","���");
		
		kmk_Cellphone cell1 = new kmk_Cellphone("Lg","������");
		System.out.println(cell.toString());
		System.out.println(cell1.toString());
		System.out.println(cell1.color);
		
		cell.hangOff();
		cell.powerOn();
		cell.sendMessage("������");
	}

}
