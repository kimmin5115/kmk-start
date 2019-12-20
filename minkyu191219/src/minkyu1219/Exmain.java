package minkyu1219;

import java.util.*;

public class Exmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		//고객정보를 저장할 ArratList 선언
		List<Ex> clientList = new ArrayList<Ex>();
		Ex bank = null;
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("0. 고객등록 "+"|"+"1. 고객등록 "+"|"+" 2. 입금 "+"|"+" 3. 출금 "+"|"+" 4. 잔액 "+"|"+" 5. 고객정보 "+"|"+" 6. 종료");
			System.out.println("------------------------------------------");
			int kmk = scan.nextInt();
			switch(kmk) {
			case 0 : 
				bank = new Ex();
				int clientNumber = clientList.size()+1;
				System.out.println("이름: ");
				String name = scan.next();
				System.out.println("계좌: ");
				String balance = scan.nextInt();
				System.out.println("입금액: ");
				int balance = scan.nextInt();
				bank.setName(name);
				bank.setAccountNumber(accountNumber);
				bank.setBalance(balance);
				clientList.add(bank);
				break;
			case 1 :
				clientList = clientList.size()+1;
				System.out.println("이름: ");
				name = scan.next();
				System.out.println("계좌: ");
				String accountNumber = scan.next();
				System.out.println("입금액: ");
				balance = scan.nextInt();
				bank = new Ex(clientNumber, name,)
			case2 :
				System.out.println("계좌");
				accountNumber = scan.next();
				System.out.println("입금액");
				balance = scan.nextInt();
			
			
			
			
			
			
			
			}
		}
	}

}
