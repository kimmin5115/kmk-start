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
//		System.out.println(value+"무엇입니까?");
//		String k= scan.next();
//		if(k.equals(value)) {
//			System.out.println("정답입니다.");
//			
//		}else {
//			System.out.println("틀렸습니다.");
//			System.out.println("정답은"+value1+"입니다.");
		Scanner scan = new Scanner(System.in);
		String kmk = null;
		String desk, chair, pencil, mouse;
		System.out.println("입력하세요");
		kmk = scan.next();

		switch(kmk) {
				case"desk" : System.out.println("책상");
				break;
				case"chair" : System.out.println("의자");
				break;
				case"pencil" : System.out.println("연필");
				break;
				case"mouse" : System.out.println("마우스");
				break;
				default : System.out.println("검색할수 없습니다.");
				break;
		}System.out.println("입니다.");
	}

}
