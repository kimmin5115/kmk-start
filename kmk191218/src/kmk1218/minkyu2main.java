package kmk1218;

import java.util.*;

public class minkyu2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set =  new HashSet<String>();
		//set��ü�� ������ ����
		set.add("ddd");
		set.add("aaa");
		set.add("ccc");
		set.add("ccc");
		
		// set ũ�� Ȯ��
		System.out.println(set.size());
		
		//set�� ����� ������ ����ϱ�
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// set�� ��� ������ ����
		set.remove("ddd");
		
		Iterator<String> iterator1 = set.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		
		
		
		
	}

}
