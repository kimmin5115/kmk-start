package kmk1223;

public class kmk_computer extends kmk_Calculator {

	//리턴타입이 int인 xalcilatoion 메소드 정의
	//매개변수는 정수2개 정수2개의 평균값을 리턴
	//Override : 메소드재정의
	//Annotation (어노테이션, 애노테이션)
	@Override
	int kmk(int k, int m) {
		System.out.println(super.kmk(k, m));
		System.out.println("Computer 의 메소드 호출");
		return (k+m)/2;
	}
	
	
	
	
	
}
