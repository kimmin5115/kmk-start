package kmk1223;

public class kmk_computer extends kmk_Calculator {

	//����Ÿ���� int�� xalcilatoion �޼ҵ� ����
	//�Ű������� ����2�� ����2���� ��հ��� ����
	//Override : �޼ҵ�������
	//Annotation (������̼�, �ֳ����̼�)
	@Override
	int kmk(int k, int m) {
		System.out.println(super.kmk(k, m));
		System.out.println("Computer �� �޼ҵ� ȣ��");
		return (k+m)/2;
	}
	
	
	
	
	
}
