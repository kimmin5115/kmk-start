package kmk1211;

import java.util.Scanner;

public class d11c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k, m;
		int k1=0;
		int sum;
		boolean run = true;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		k = scan.nextInt();
		m = (int) (Math.random() * 100) + 1;
		while(run) {
			k1++;
			if(k == m) {
			System.out.println("���߼̽��ϴ�.");
				break;
			}else if(k > m) {
				System.out.println("�� ���� �����Դϴ�.");
				System.out.print("���ڸ� �Է��ϼ��� : ");
				k = scan.nextInt();
			}else {
				System.out.println("�� ���� ���� �Դϴ�.");
				System.out.print("���ڸ� �Է��ϼ��� : ");
				k = scan.nextInt();
			}
		}System.out.println("Ƚ����"+k1+"�Դϴ�");
		
		
	}

}
