package kmk1213;

public class d13c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ����ȯ : Ư��Ÿ���� ������ �ٸ� Ÿ���� ������ ��ȯ�Ǵ� ��
		 * 1. �ڵ�����ȯ(Promotion)
		 * 		ũ�Ⱑ ���� Ÿ���� ū Ÿ������ ��ȯ
		 * 
		 * 2. ��������ȯ(casting)
		 * 		ũ�Ⱑ ūŸ���� ���� Ÿ������ ��ȯ
		 * 
		 */
		byte byteValue = 10;
		int intValue = 10;
		double doubleValue = 10;
		//byte Ÿ���� ������ int Ÿ���� ������ ����
		//intValue = byteValue;
		byteValue = (byte) intValue;
		intValue = (int) doubleValue;
		System.out.println("��������");
		
		
	}

}
