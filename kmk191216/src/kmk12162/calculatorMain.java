package kmk12162;

public class calculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calculator 클래스의 객체 생성
		calculator c = new calculator();
		int k = c.sum(5, 6);
		System.out.println(c.sum(6,8));
		System.out.println(k);
		
		
		//리턴값이 없을때는 출력하지 않아도 바로 나올수 있음
		calculator sum1 = new calculator();
		sum1.sum1(6, 8);
		
		
		
		
		
	}
	

}
