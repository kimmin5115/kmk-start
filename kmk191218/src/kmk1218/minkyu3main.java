package kmk1218;

import java.util.*;

public class minkyu3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Map ��ü
		Map<Integer, String> map = new HashMap<Integer, String>();
		//map ��ü�� ������ �����ϱ�
		map.put(1, "sss");
		map.put(2, "dfasd");
		map.put(3, "dfasd");
		
		System.out.println(map.size());
		
		System.out.println(map.get(2));

		//map ��ü�� ��� ������ ����ϱ�
		//key���� set���·� ���� 
		Set<Integer> keyValuse = map.keySet();
		//map�� �ִ� Ű���� keyValuse�� ������ �Ѵ�
		Iterator<Integer> iterator = keyValuse.iterator();
		//keyValuse�� �ִ� Ű ���ڸ� �����Ͽ� return�ϰ� �Ѵ�
		while(iterator.hasNext()) {
			int key=iterator.next();
			//���ĵ� key ���� key��� ���� �ٽ� �ϳ��� ������.
			String value = map.get(key);
			//key�� ���� ���� map���� ã�� String���� �� ���� ã�´�
			System.out.println(key + ":"+value);
			//key�� �´� String ���� ã�� ����� �Ѵ�.
		}
	
		
		
		
	}

}
