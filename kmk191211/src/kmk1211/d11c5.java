package kmk1211;

import java.util.Scanner;

public class d11c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int k=0, m=0, k1=0;
		int sum=0;
		boolean run = true;
		
		
		while(run){
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.println("����)");
				k= scan.nextInt();
				if(k == 1) {
					System.out.println("������ �ݾ��� �Է��ϼ���");
					m = scan.nextInt();
					System.out.println("�ܰ��"+(sum +=m)+"�Դϴ�.");
				}else if(k == 2) {
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					m= scan.nextInt();
					if(m > sum) {
						System.out.println("�ܰ� �����մϴ�.");
						System.out.println("���� �ܾ���"+sum+"�Դϴ�.");
					}else {
						sum-=m;
						System.out.println("��� �� �ܾ���"+sum+"�Դϴ�.");
					}
					
				}else if(k == 3) {
					System.out.println("�ܰ�ݾ���"+sum+"�Դϴ�");
				}else if(k==4) {
					run=false;
					System.out.println("�����մϴ�.");
				}
					
					
				} 
					
				}
				
			
		
		
	}


