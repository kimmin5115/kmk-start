package kmk1213;

public class d13c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 형변환 : 특정타입의 변수가 다른 타입의 변수로 변환되는 것
		 * 1. 자동형변환(Promotion)
		 * 		크기가 작은 타입이 큰 타입으로 변환
		 * 
		 * 2. 강제형변환(casting)
		 * 		크기가 큰타입을 작은 타입으로 변환
		 * 
		 */
		byte byteValue = 10;
		int intValue = 10;
		double doubleValue = 10;
		//byte 타입의 변수를 int 타입의 변수에 저장
		//intValue = byteValue;
		byteValue = (byte) intValue;
		intValue = (int) doubleValue;
		System.out.println("개졸리다");
		
		
	}

}
