package kmk1218;

import java.util.*;

public class minkyu2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set =  new HashSet<String>();
		//set객체에 데이터 저장
		set.add("ddd");
		set.add("aaa");
		set.add("ccc");
		set.add("ccc");
		
		// set 크기 확인
		System.out.println(set.size());
		
		//set에 저장된 데이터 출력하기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set에 담긴 데이터 삭제
		set.remove("ddd");
		
		Iterator<String> iterator1 = set.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
		
		
		
	}

}
