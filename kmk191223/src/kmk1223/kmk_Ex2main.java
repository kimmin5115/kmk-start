package kmk1223;

import java.util.Scanner;

public class kmk_Ex2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kmk_Ex2 kmk = new kmk_Ex2();
		kmk_Ex3 mk = new kmk_Ex3();
		kmk_Ex4 m = new kmk_Ex4();
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		
		while(run) {
			System.out.println("�����Ͻ� ����� �Է��ϼ���");
			System.out.println("1. �������� | 2. �Ϲݿ���");
			int i = scan.nextInt();
			if(i == 1) {
				System.out.println("Ƽ���� �����ϼ���");
				i = scan.nextInt(); 
				int j=kmk.ticketprice(i);
				m.ticketprice(j);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
