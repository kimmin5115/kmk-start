package kmk1213;

import java.util.*;

public class a13213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int key= iterator.next();
//		String value = map.get(key);
//		int key1= iterator1.next();
//		String value1 = map.get(key1);
//		case value : 
//		System.out.println(value+"�����Դϱ�?");
//		String k= scan.next();
//		if(k.equals(value)) {
//			System.out.println("�����Դϴ�.");
//			
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������"+value1+"�Դϴ�.");
		Scanner scan = new Scanner(System.in);
		String kmk = null;
		String desk, chair, pencil, mouse;
		System.out.println("�Է��ϼ���");
		kmk = scan.next();

		switch(kmk) {
				case"desk" : System.out.println("å��");
				break;
				case"chair" : System.out.println("����");
				break;
				case"pencil" : System.out.println("����");
				break;
				case"mouse" : System.out.println("���콺");
				break;
				default : System.out.println("�˻��Ҽ� �����ϴ�.");
				break;
		}System.out.println("�Դϴ�.");
	}

}
