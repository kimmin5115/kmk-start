package kmk12162;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Car Ŭ������ ��ü�� ����
		//��ü ���� ����
		//Ŭ�����̸� ��ü�̸�  = new Ŭ�����̸�();
		//					   �������̸�();
		//��ȣ�� ���� �ݱ⸸ �ص� �⺻�����ڷ� �������.
		Car kmk = new Car();
		Car kmk1 = new Car();
		Car kmk2 = new Car();
		Car kmk3 = null; //Ŭ����Ÿ���� ���� ����
		kmk3 = new Car();//CarŬ������ �ִ� kmk2 ��ü ����
		
		
		//Car Ŭ������ �ִ� �ʵ� ���

		kmk.color = "����";
		kmk.company = "����";
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
		
		//�Ű������� �ִ� �����ڸ� ȣ���Ͽ� ��ü ����
		Car kmk4 = new Car("����",150);
		System.out.println(kmk4.speed);
		System.out.println(kmk4.color);
		System.out.println(kmk4.company);
		System.out.println(kmk4.type);
		System.out.println(kmk4.model);
		
		
		//Car Ŭ������ color�� company�� �Ű������� �ϴ�
		//�����ڸ� �����ϰ�
		//mainŬ�������� �� �����ڸ� �̿��Ͽ� ��ü�� ���� ��
		// ��ü �ʵ尪 ���
		Car kmk5 = new Car("����","������Ƽ");
		System.out.println(kmk5.color);
		System.out.println(kmk5.company);
		
		System.out.println(kmk5.toString());
		
		/*
		 * Car Ŭ������ ��� �ʵ带 �Ű������� �ϴ� �����ڸ� �����ϰ�
		 * �� ������ ȣ��� ��ü�� �����Ͽ� ��� �ʵ尪 ���
		 */
		
		Car kmk6 = new Car("���", 300, "����", "���", "������Ƽ");
		System.out.println(kmk6.toString());
		
		
		
	
	}

}
