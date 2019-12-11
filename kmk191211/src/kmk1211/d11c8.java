package kmk1211;

public class d11c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문을 이용해서 name 배열에 저장된 값을 모두 출력해보세요.
		
		int[] kmk={4, 3, 6, 7};
		int k2=0;
		int sum=0;
		int avg;
		
		for(k2=0; k2<kmk.length; k2++) {
			sum+=kmk[k2];
		}avg= sum / kmk.length;
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
		
	}

}
