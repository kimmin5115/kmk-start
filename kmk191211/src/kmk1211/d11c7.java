package kmk1211;

public class d11c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열(array): 같은 타입의 데이터를 하나의 변수에 저장하는 구조
		//배열 선언
		//타입[] 배열이름 or 타입 배열이름[]
		//
		
		int[] number;
		int number1[];
		//배열을 선언하면서 값을 주기
		int[] number2 = {1,2,3};
		//number2 배열의 첫번째 칸에 저장된 값 출력
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		
		
		String[] name = {"김민규", "김진우", "김성우","이용"};
		System.out.println(name[2]);
		
		//for문을 이용해서 name 배열에 저장된 값을 모두 출력해보세요.
		int k;
		for(k=0; k<name.length; k++) {
			System.out.println(name[k]);
			
		}
		
		
		//정수형 배열 변수를 하나 선언해서 값을 4개 저장하고
		//배열변수에 저장된 모든 값의 총합과 평균을 출력하세요
		
		int[] kmk={4, 3, 6, 7, 5};
		int k2=0;
		int sum=0;
		int avg=0;
		for(k2=0;k2<kmk.length;k2++) {
			System.out.print(kmk[k2]);
			sum+=kmk[k2];
		}
		avg=sum/kmk.length;
		System.out.print(avg=sum/kmk[k2]);
		
		
	}

}
