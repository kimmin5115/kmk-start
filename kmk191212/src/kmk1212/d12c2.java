package kmk1212;

import java.util.Scanner;

public class d12c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ũ�Ⱑ 3�� ������ �迭�� ����
		 * ��ĳ�ʸ� �̿��Ͽ� ���� 3�� ���� ��
		 * �Էµ� ���� ����, ��� ���
		 */
		
		Scanner scan = new Scanner(System.in);
		int k;
		int sum=0;
		int avg;
		
		int[] number = new int[3];
		System.out.println("���ڸ� 3�� �Է��ϼ���");
		for(k=0; k <number.length;  k++) {
			number[k] = scan.nextInt();
			sum += number[k];
			
		}avg=sum/number.length;
		System.out.println("����3���� ����"+sum+"�Դϴ�.");
		System.out.println("����3���� �����"+avg+"�Դϴ�.");
		scan.close();
	}

}
