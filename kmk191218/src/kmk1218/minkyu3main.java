package kmk1218;

import java.util.*;

public class minkyu3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Map 객체
		Map<Integer, String> map = new HashMap<Integer, String>();
		//map 객체에 데이터 저장하기
		map.put(1, "sss");
		map.put(2, "dfasd");
		map.put(3, "dfasd");
		
		System.out.println(map.size());
		
		System.out.println(map.get(2));

		//map 객체의 모든 데이터 출력하기
		//key값을 set형태로 만들어서 
		Set<Integer> keyValuse = map.keySet();
		//map에 있는 키값을 keyValuse에 저장을 한다
		Iterator<Integer> iterator = keyValuse.iterator();
		//keyValuse에 있는 키 숫자를 정렬하여 return하게 한다
		while(iterator.hasNext()) {
			int key=iterator.next();
			//정렬된 key 값을 key라는 곳에 다시 하나씩 보낸다.
			String value = map.get(key);
			//key에 보낸 값을 map에서 찾아 String으로 된 값을 찾는다
			System.out.println(key + ":"+value);
			//key에 맞는 String 값을 찾고 출력을 한다.
		}
	
		
		
		
	}

}
