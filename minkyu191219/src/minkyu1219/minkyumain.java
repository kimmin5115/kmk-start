package minkyu1219;

import java.util.*;

import kmk1217.naverMember;

public class minkyumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 은행 프로그램
		 * 1. 고객 등록을 할 수 있다.
		 * 1.1생성자를 이용한 방법
		 * 1.2getter,setter 이용한 방법
		 * 2. 예금 기능을 수행할 수 있다.
		 * 3. 출금 기능을 수행할 수 있다.
		 * 3.1잔액이 0원 미만이면 출금 불가능 메시지를 출력한다.
		 * 4.잔액 확인을 할 수 있다.
		 * 5.고객 정보
		 *  - 고객번호, 이름, 계좌번호, 잔액
		 * 6. 고객 정보는 ArrayList에 저장한다.
		 */
		
		minkyu kim = new minkyu();
		Scanner scan = new Scanner(System.in);
		List<minkyu> list = new ArrayList<minkyu>();
		
		boolean run =true;
		int m=1, m1=1;
		int total=0;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 고객등록 "+"|"+" 2. 입금 "+"|"+" 3. 출금 "+"|"+" 4. 송금 "+"|"+" 5. 잔액 "+"|"+" 6. 종료");
			System.out.println("------------------------------------------");
			int kmk = scan.nextInt();
			if(0 == 0) {
				System.out.println("고객 정보를 입력하세요");
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				System.out.println("계좌번호를 입력하세요");
				String accountNumber = scan.next();
				System.out.println("잔액을 입력하세요");
				String money = scan.next();
				kim.list.add(name,accountNumber,money);
				
			if(1 == 1) {
				System.out.println("고객 정보를 입력하세요");
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				System.out.println("계좌번호를 입력하세요");
				String accountNumber = scan.next();
				System.out.println("잔액을 입력하세요");
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
