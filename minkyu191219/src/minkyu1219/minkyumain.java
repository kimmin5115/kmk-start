package minkyu1219;

import java.util.*;


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
		
		boolean run =true;
		int i=0;
		int kmk=0;
		String name=null;
		String accountNumber=null ;
		int number=0, money=0;
		ArrayList<minkyu> list = new ArrayList<minkyu>();
		Scanner scan = new Scanner(System.in);
		minkyu min = new minkyu();
		minkyu kim = new minkyu(number, name, accountNumber);

		
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("0. ����� "+"|"+"1. ����� "+"|"+" 2. �Ա� "+"|"+" 3. ��� "+"|"+" 4. �ܾ� "+"|"+" 5. ������ "+"|"+" 6. ����");
			System.out.println("------------------------------------------");
			kmk = scan.nextInt();
			
			if(kmk == 0) {
				System.out.println("�� ������ �Է��ϼ���");
				System.out.println("�̸��� �Է��ϼ���");
				name = scan.next();
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				accountNumber = scan.next();
				System.out.println("�ܾ��� �Է��ϼ���");
				number = scan.nextInt();
				minkyu kim1 = new minkyu(number, name, accountNumber);
				min.list.add(kim1);
			}
			if(kmk == 1) {
				System.out.println("�� ������ �Է��ϼ���");
				System.out.println("�̸��� �Է��ϼ���");
				name = scan.next();
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				accountNumber = scan.next();
				System.out.println("�ܾ��� �Է��ϼ���");
				number = scan.nextInt();
				min.setNumber(number);
				min.list.add(min);
			}else if(kmk == 2) {
					min.min();
			}else if (kmk == 3) {
				min.min1();
			}else if (kmk == 4) {
				min.min2();
			}else if (kmk == 5) {
				if(kmk == 5) {
					for(i=0; i<min.list.size(); i++) {
						System.out.println(i+1+"."+
					"�̸� : " +min.list.get(i).getName()+
					"���¹�ȣ : "+min.list.get(i).getNumber()+
					"�ܾ� : "+min.list.get(i).getNumber());
					}
				min.min3();
			}else if (kmk == 6) {
				min.min4();
				    }

		}





		}
		}



	}

