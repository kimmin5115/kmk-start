package minkyu1219;

import java.util.*;

public class Exmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		//�������� ������ ArratList ����
		List<Ex> clientList = new ArrayList<Ex>();
		Ex bank = null;
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("0. ����� "+"|"+"1. ����� "+"|"+" 2. �Ա� "+"|"+" 3. ��� "+"|"+" 4. �ܾ� "+"|"+" 5. ������ "+"|"+" 6. ����");
			System.out.println("------------------------------------------");
			int kmk = scan.nextInt();
			switch(kmk) {
			case 0 : 
				bank = new Ex();
				int clientNumber = clientList.size()+1;
				System.out.println("�̸�: ");
				String name = scan.next();
				System.out.println("����: ");
				String balance = scan.nextInt();
				System.out.println("�Աݾ�: ");
				int balance = scan.nextInt();
				bank.setName(name);
				bank.setAccountNumber(accountNumber);
				bank.setBalance(balance);
				clientList.add(bank);
				break;
			case 1 :
				clientList = clientList.size()+1;
				System.out.println("�̸�: ");
				name = scan.next();
				System.out.println("����: ");
				String accountNumber = scan.next();
				System.out.println("�Աݾ�: ");
				balance = scan.nextInt();
				bank = new Ex(clientNumber, name,)
			case2 :
				System.out.println("����");
				accountNumber = scan.next();
				System.out.println("�Աݾ�");
				balance = scan.nextInt();
			
			
			
			
			
			
			
			}
		}
	}

}
