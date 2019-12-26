package kmk1216_2;

public class kmk_Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 나눗셈 계산에서 분모가 0일 때 발생하는
		 * 예외확인 후 이 예외에 대한
		 * 예외처리를 할 수 있는 코드를 작성
		 */
		try {
		int num = 5/0;
		System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}
	
	
	
	
	
	
	}

}
