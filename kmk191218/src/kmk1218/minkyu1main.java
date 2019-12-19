package kmk1218;

import java.util.ArrayList;
import java.util.List;

public class minkyu1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Collection Framework
		 * 1.List
		 *  - 순서(index와 비슷)를 유지하고 저장할 수 있음.
		 *  - 중복저장 가능
		 * 2.set
		 *  - 저장데이터의 순서가 없음.
		 *  - 중복저장 불가능.
		 * 3.map
		 * 	- key, value의 쌍으로 저장.
		 *  - key값은 중복 불가능
		 */
		//List 선언
		List<String> list = new ArrayList<String>();
		/*
		 *<> : Generic
		 *타입변환을 하지 않고도 데이터를 사용할 수 있게 해줌
		 */
		//list 객체에 데이터 저장
		list.add("밥");
		list.add("뭐먹지");
		list.add("편의점");
		list.add(1, "라라라");
		list.add(1, "마마마");
		list.add(2, "nt");
		list.add("dddd");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		// list의 크기 출력
		System.out.println(list.size());
		
		
		//list 데이터 삭제
		list.remove(1);
		list.remove("dddd");
		list.clear();
		
		
		//for문을 이용하여 list값 출력
		int j=list.size();
		for(int i=0; i<j; i++) {
			System.out.println(list.get(i));
		}

		
//		List list1 = new ArrayList();
//		//이렇게 사용해도 상관은 없지만
//		//ArrayList 객체에 데이터 저장
//		//Object타입으로 담김
//		list1.add("집에 가자 졸리다");
//		
//		Object objValue = list1.get(0);
//		String value = (String) objValue;
//		System.out.println(value);
//		//이 과정을 거쳐야 하는데 이러한 과정을
//		//생략해주는게 <>을 써줌으로써서 생략을 해줄수 있음. 
//		
//		System.out.println(list1.get(0));
		
		
		
	}

}
