package kmk1218;

import java.util.ArrayList;
import java.util.List;

public class minkyu1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Collection Framework
		 * 1.List
		 *  - ����(index�� ���)�� �����ϰ� ������ �� ����.
		 *  - �ߺ����� ����
		 * 2.set
		 *  - ���嵥������ ������ ����.
		 *  - �ߺ����� �Ұ���.
		 * 3.map
		 * 	- key, value�� ������ ����.
		 *  - key���� �ߺ� �Ұ���
		 */
		//List ����
		List<String> list = new ArrayList<String>();
		/*
		 *<> : Generic
		 *Ÿ�Ժ�ȯ�� ���� �ʰ� �����͸� ����� �� �ְ� ����
		 */
		//list ��ü�� ������ ����
		list.add("��");
		list.add("������");
		list.add("������");
		list.add(1, "����");
		list.add(1, "������");
		list.add(2, "nt");
		list.add("dddd");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		// list�� ũ�� ���
		System.out.println(list.size());
		
		
		//list ������ ����
		list.remove(1);
		list.remove("dddd");
		list.clear();
		
		
		//for���� �̿��Ͽ� list�� ���
		int j=list.size();
		for(int i=0; i<j; i++) {
			System.out.println(list.get(i));
		}

		
//		List list1 = new ArrayList();
//		//�̷��� ����ص� ����� ������
//		//ArrayList ��ü�� ������ ����
//		//ObjectŸ������ ���
//		list1.add("���� ���� ������");
//		
//		Object objValue = list1.get(0);
//		String value = (String) objValue;
//		System.out.println(value);
//		//�� ������ ���ľ� �ϴµ� �̷��� ������
//		//�������ִ°� <>�� �������νἭ ������ ���ټ� ����. 
//		
//		System.out.println(list1.get(0));
		
		
		
	}

}
