package kmk20191210;

import java.util.Scanner;

public class k12102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//������ �Է��ϰ� �������� 0�� �Է��ϼ���
		//�Է��� ���� 5��
		//����� 204�Դϴ�.
		Scanner scan = new Scanner(System.in);
		int k, i=0;
		boolean run = true;
		k = scan.nextInt();
		int sum=0;
		while(run) {
			sum += k;
			k = scan.nextInt();
			if(k == 0) {
				run=false;
			}else {
				i++;
			}
		}System.out.println(i);
		System.out.println("�����"+(sum/i)+"�Դϴ�.");
		
		
		
		
		
	}

}
