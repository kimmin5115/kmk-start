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
		map.put("watch","�ð�");
		map.put("desk","å��");
		map.put("water","��");
		map.put("pencil","����");
		map.put("chair","����");
				
		System.out.println(map.size());
		
		Set<String> kmk = map.keySet();
		Iterator<String> iterator = kmk.iterator();
		int i=0;
		
		while (iterator.hasNext()) {
			String key= iterator.next();
			String value = map.get(key);
			System.out.println(key+"�����Դϱ�?");
			String k= scan.next();
			if(k.equals(value)) {
				System.out.println("�����Դϴ�.");
				i++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("������"+value+"�Դϴ�.");
		}
		
		
		}System.out.println("���䰹����"+i+"�Դϴ�.");
		int m= 100/map.size()*i;
		System.out.println("����Ȯ����"+m+"% �Դϴ�.");
	}
		

	

}
