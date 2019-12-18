package kmk1217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class naverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		naverMember car = new naverMember("bb","ddd","김민규","어쩜","0112","남","kmk5115@naver.com","010");
		System.out.println(car.getId());
		car.setid("kk");
		System.out.println(car.getId());
		car.setid("mm");
		System.out.println(car.getId());
		naverMember car1 = new naverMember();
		System.out.println(car1.toString());
		
		/*
		 * naverMember 클래스에 기본 생성자를 선언하여
		 * 기본 생성자를 이용해 member1 객체를 선언한 뒤 모든 필드 값을 본인 옆사람의
		 * 정보로 지정해보세요
		 */
		naverMember Member1 = new naverMember();
		Member1.setid("jung");
		Member1.setPassword("1234");
		Member1.setName("창호");
		Member1.setNickName("jung");
		Member1.setGender("남");
		Member1.setBirth("12.1");
		Member1.setEmail("jung@naver.com");
		Member1.setPhone("01053215154");
		System.out.println(Member1.toString());
		
		naverMember Member2 = new naverMember();
		Member2.setid("jung");
		Member2.setPassword("1234");
		Member2.setName("창호");
		Member2.setNickName("jung");
		Member2.setGender("남");
		Member2.setBirth("12.18");
		Member2.setEmail("jung@naver.com");
		Member2.setPhone("01053215154");
		System.out.println(Member2.toString());
		
		
		
		
		naverMember[] members = new naverMember[100];		
		members[0]= car;
		members[1]= Member1;
		members[2]= Member2;
		//members 배영의 0번 인덱스에 저장된 id 필드값을 출력
		System.out.println(members[0]);
		System.out.println(members[0].getId());
		
		//ArrayList를 선언하여 member 객체들을 저장하고
		//각 객체의 id 필드값을 출력해보세요
		
		List<naverMember> members1 = new ArrayList<naverMember>();
		members1.add(car);
		members1.add(Member1);
		members1.add(Member2);
		
		for(int i=0; i<members1.size(); i++) {
			System.  out.println(members1.get(i).getId());
		}
		
	}

}
