package kmk1211;

public class d11c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭(array): ���� Ÿ���� �����͸� �ϳ��� ������ �����ϴ� ����
		//�迭 ����
		//Ÿ��[] �迭�̸� or Ÿ�� �迭�̸�[]
		//
		
		int[] number;
		int number1[];
		//�迭�� �����ϸ鼭 ���� �ֱ�
		int[] number2 = {1,2,3};
		//number2 �迭�� ù��° ĭ�� ����� �� ���
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		
		
		String[] name = {"��α�", "������", "�輺��","�̿�"};
		System.out.println(name[2]);
		
		//for���� �̿��ؼ� name �迭�� ����� ���� ��� ����غ�����.
		int k;
		for(k=0; k<name.length; k++) {
			System.out.println(name[k]);
			
		}
		
		
		//������ �迭 ������ �ϳ� �����ؼ� ���� 4�� �����ϰ�
		//�迭������ ����� ��� ���� ���հ� ����� ����ϼ���
		
		int[] kmk={4, 3, 6, 7, 5};
		int k2=0;
		int sum=0;
		int avg=0;
		for(k2=0;k2<kmk.length;k2++) {
			System.out.print(kmk[k2]);
			sum+=kmk[k2];
		}
		avg=sum/kmk.length;
		System.out.print(avg=sum/kmk[k2]);
		
		
	}

}
