package kmk12162;

public class calculator {
	
	//메소드 선언
	// 덧셈, 뺄셈, 나눗셈, 곱셈 메소드 각각 선언
	
	
	//첫 int값은 return되어 지는 값으로 선언할때 똑같은걸로 선언을 해줘야함
	int sum(int num1,int num2) {
		int result = num1 +num2;
		return result;
	}
	//return되어 지는 값이 없으므로 바로 사용이 가능하다.
	int sum1(int num1, int num2) {
		int result = num1 + num2;
		
	}
	
	void  subtract (int num1, int num2) {
		int result = num1 - num2; 
		System.out.println("Calculator 클래스"+ result);
	}
	void multiply(int num1, int num2) {
		int result = num1 * num2; 
		System.out.println("Calculator 클래스"+ result);
	}
	
	void divide(int num1, int num2) {
		int result = num1 / num2; 
		System.out.println("Calculator 클래스"+ result);
	}
	

}
