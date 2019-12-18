package kmk12162;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Car 클래스를 객체로 선언
		//객체 선언 문법
		//클래스이름 객체이름  = new 클래스이름();
		//					   생성자이름();
		//괄호를 열고 닫기만 해도 기본생성자로 만들어짐.
		Car kmk = new Car();
		Car kmk1 = new Car();
		Car kmk2 = new Car();
		Car kmk3 = null; //클래스타입의 변수 선언
		kmk3 = new Car();//Car클래스에 있는 kmk2 객체 선언
		
		
		//Car 클래스에 있는 필드 사용

		kmk.color = "검정";
		kmk.company = "벤츠";
		System.out.println(kmk.color);
		System.out.println(kmk.speed);
		System.out.println(kmk1.color);
		System.out.println(kmk2.color);
		System.out.println(kmk3.color);
		System.out.println(kmk.company);
		System.out.println(kmk1.company);
		System.out.println(kmk2.company);
		System.out.println(kmk3.company);
		kmk.speed = 100;
		int speedUp = kmk.speed + 50;
		System.out.println(speedUp);
		System.out.println(kmk.type);
		
		//매개변수가 있는 생성자를 호출하여 객체 선언
		Car kmk4 = new Car("빨강",150);
		System.out.println(kmk4.speed);
		System.out.println(kmk4.color);
		System.out.println(kmk4.company);
		System.out.println(kmk4.type);
		System.out.println(kmk4.model);
		
		
		//Car 클래스에 color와 company를 매개변수로 하는
		//생성자를 선언하고
		//main클래스에서 이 생성자를 이용하여 객체를 선언 후
		// 전체 필드값 출력
		Car kmk5 = new Car("빨강","마세라티");
		System.out.println(kmk5.color);
		System.out.println(kmk5.company);
		
		System.out.println(kmk5.toString());
		
		/*
		 * Car 클래스의 모든 필드를 매개값으로 하는 생성자를 선언하고
		 * 이 생성자 호출로 객체를 선언하여 모든 필드값 출력
		 */
		
		Car kmk6 = new Car("흰색", 300, "디젤", "기블리", "마세라티");
		System.out.println(kmk6.toString());
		
		
		
	
	}

}
