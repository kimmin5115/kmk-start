package kmk1218;

import java.util.*;

public class minkyu4main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = "ddd";
		System.out.println(str.length());
		
		Map<String, String> map = new HashMap<String, String>();
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map.put("watch","시계");
		map.put("desk","책상");
		map.put("water","물");
		map.put("pencil","연필");
		map.put("chair","의자");
				
		System.out.println(map.size());
		
		Set<String> kmk = map.keySet();
		Iterator<String> iterator = kmk.iterator();
		int i=0;
		
		while (iterator.hasNext()) {
			String key= iterator.next();
			String value = map.get(key);
			System.out.println(key+"무엇입니까?");
			String k= scan.next();
			if(k.equals(value)) {
				System.out.println("정답입니다.");
				i++;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은"+value+"입니다.");
		}
		
		
		}System.out.println("정답갯수는"+i+"입니다.");
		int m= 100/map.size()*i;
		System.out.println("정답확률은"+m+"% 입니다.");
	}
		

	

}
