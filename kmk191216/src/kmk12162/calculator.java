package kmk12162;

public class calculator {
	
	//�޼ҵ� ����
	// ����, ����, ������, ���� �޼ҵ� ���� ����
	
	
	//ù int���� return�Ǿ� ���� ������ �����Ҷ� �Ȱ����ɷ� ������ �������
	int sum(int num1,int num2) {
		int result = num1 +num2;
		return result;
	}
	//return�Ǿ� ���� ���� �����Ƿ� �ٷ� ����� �����ϴ�.
	int sum1(int num1, int num2) {
		int result = num1 + num2;
		
	}
	
	void  subtract (int num1, int num2) {
		int result = num1 - num2; 
		System.out.println("Calculator Ŭ����"+ result);
	}
	void multiply(int num1, int num2) {
		int result = num1 * num2; 
		System.out.println("Calculator Ŭ����"+ result);
	}
	
	void divide(int num1, int num2) {
		int result = num1 / num2; 
		System.out.println("Calculator Ŭ����"+ result);
	}
	

}
