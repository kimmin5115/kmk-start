package kmk1211;

import java.util.Scanner;

public class d11c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int k=0, m=0, k1=0, m1=0;
		boolean run=true;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.println("����)");
				k= scan.nextInt();
			switch(k) {
			case 1:
				System.out.println("���ݾ�)");
				m = scan.nextInt();
				k1+=m;
				System.out.println("�����ܾ���"+k1+"�Դϴ�.");
				break;
			case 2:
				System.out.println("��ݾ�)");
				m1= scan.nextInt();
				k1-=m1;
				if(k1<0) {
					System.out.println("�ܰ� �����մϴ�.");
					
				}
			}
		}
		scan.close();
	}

}
