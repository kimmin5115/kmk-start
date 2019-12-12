package kmk1212;

public class d12c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//향상된 for문(advanced for)(foreach문)
		int[] num = {3,4,1,2,5};
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		
		for(int a:num) {
			System.out.print(a);
		}
		
		//값이 5개 있는 string 배열을 선언하고 foreach를 이용하여
		//배열에 담긴 모든 데이터 출력
		
		String num1[]= {"김","이","흠","박","최"};
		for(String a:num1) {
			System.out.print(a);
		}
		
	}

}
