package kmk1211;

import java.util.Scanner;

public class d11c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k=0, m=0;
		int k1=0;
		m = (int) (Math.random() * 100) + 1;
		boolean run = true;
		
		System.out.println("up&down");
		do {
			k1++;
			System.out.println("1���� 100������ ���ڸ� �Է��ϼ��� : ");
			k = scan.nextInt();
			if(m > k ) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if( m  < k ) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ����"+k1+"�� �Դϴ�.");
			run = false;
			}
		}while(run);
	}

}
