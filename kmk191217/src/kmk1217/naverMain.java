package kmk1217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class naverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		naverMember car = new naverMember("bb","ddd","��α�","����","0112","��","kmk5115@naver.com","010");
		System.out.println(car.getId());
		car.setid("kk");
		System.out.println(car.getId());
		car.setid("mm");
		System.out.println(car.getId());
		naverMember car1 = new naverMember();
		System.out.println(car1.toString());
		
		/*
		 * naverMember Ŭ������ �⺻ �����ڸ� �����Ͽ�
		 * �⺻ �����ڸ� �̿��� member1 ��ü�� ������ �� ��� �ʵ� ���� ���� �������
		 * ������ �����غ�����
		 */
		naverMember Member1 = new naverMember();
		Member1.setid("jung");
		Member1.setPassword("1234");
		Member1.setName("âȣ");
		Member1.setNickName("jung");
		Member1.setGender("��");
		Member1.setBirth("12.1");
		Member1.setEmail("jung@naver.com");
		Member1.setPhone("01053215154");
		System.out.println(Member1.toString());
		
		naverMember Member2 = new naverMember();
		Member2.setid("jung");
		Member2.setPassword("1234");
		Member2.setName("âȣ");
		Member2.setNickName("jung");
		Member2.setGender("��");
		Member2.setBirth("12.18");
		Member2.setEmail("jung@naver.com");
		Member2.setPhone("01053215154");
		System.out.println(Member2.toString());
		
		
		
		
		naverMember[] members = new naverMember[100];		
		members[0]= car;
		members[1]= Member1;
		members[2]= Member2;
		//members �迵�� 0�� �ε����� ����� id �ʵ尪�� ���
		System.out.println(members[0]);
		System.out.println(members[0].getId());
		
		//ArrayList�� �����Ͽ� member ��ü���� �����ϰ�
		//�� ��ü�� id �ʵ尪�� ����غ�����
		
		List<naverMember> members1 = new ArrayList<naverMember>();
		members1.add(car);
		members1.add(Member1);
		members1.add(Member2);
		
		for(int i=0; i<members1.size(); i++) {
			System.  out.println(members1.get(i).getId());
		}
		
	}

}
