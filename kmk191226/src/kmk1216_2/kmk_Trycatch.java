package kmk1216_2;

public class kmk_Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ������ ��꿡�� �и� 0�� �� �߻��ϴ�
		 * ����Ȯ�� �� �� ���ܿ� ����
		 * ����ó���� �� �� �ִ� �ڵ带 �ۼ�
		 */
		try {
		int num = 5/0;
		System.out.println(num);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����.");
		}
	
	
	
	
	
	
	}

}
