package minkyu1219;

import java.util.*;

import kmk1217.naverMember;

public class minkyumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ���� ���α׷�
		 * 1. �� ����� �� �� �ִ�.
		 * 1.1�����ڸ� �̿��� ���
		 * 1.2getter,setter �̿��� ���
		 * 2. ���� ����� ������ �� �ִ�.
		 * 3. ��� ����� ������ �� �ִ�.
		 * 3.1�ܾ��� 0�� �̸��̸� ��� �Ұ��� �޽����� ����Ѵ�.
		 * 4.�ܾ� Ȯ���� �� �� �ִ�.
		 * 5.�� ����
		 *  - ����ȣ, �̸�, ���¹�ȣ, �ܾ�
		 * 6. �� ������ ArrayList�� �����Ѵ�.
		 */
		
		minkyu kim = new minkyu();
		Scanner scan = new Scanner(System.in);
		List<minkyu> list = new ArrayList<minkyu>();
		
		boolean run =true;
		int m=1, m1=1;
		int total=0;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. ����� "+"|"+" 2. �Ա� "+"|"+" 3. ��� "+"|"+" 4. �۱� "+"|"+" 5. �ܾ� "+"|"+" 6. ����");
			System.out.println("------------------------------------------");
			int kmk = scan.nextInt();
			if(0 == 0) {
				System.out.println("�� ������ �Է��ϼ���");
				System.out.println("�̸��� �Է��ϼ���");
				String name = scan.next();
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				String accountNumber = scan.next();
				System.out.println("�ܾ��� �Է��ϼ���");
				String money = scan.next();
				kim.list.add(name,accountNumber,money);
				
			if(1 == 1) {
				System.out.println("�� ������ �Է��ϼ���");
				System.out.println("�̸��� �Է��ϼ���");
				String name = scan.next();
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				String accountNumber = scan.next();
				System.out.println("�ܾ��� �Է��ϼ���");
				String money = scan.next();
				minkyu
				list.add();
			}else if(2 == 2) {
					kim.min();
			}else if (3==3) {
				kim.min1();
			}else if (4==4) {
				kim.min2();
			}else if (5==5) {
				kim.min3();
			}else if (6==6) {
				kim.min4();
				    }
			
		}
	
		
		
		
		
		
		
		
		
	}

}
