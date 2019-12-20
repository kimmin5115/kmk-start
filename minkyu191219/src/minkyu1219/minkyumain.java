package minkyu1219;

import java.util.*;


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
			System.out.println("0. 고객등록 "+"|"+"1. 고객등록 "+"|"+" 2. 입금 "+"|"+" 3. 출금 "+"|"+" 4. 잔액 "+"|"+" 5. 고객정보 "+"|"+" 6. 종료");
			System.out.println("------------------------------------------");
			kmk = scan.nextInt();
			
			if(kmk == 0) {
				System.out.println("고객 정보를 입력하세요");
				System.out.println("이름을 입력하세요");
				name = scan.next();
				System.out.println("계좌번호를 입력하세요");
				accountNumber = scan.next();
				System.out.println("잔액을 입력하세요");
				number = scan.nextInt();
				minkyu kim1 = new minkyu(number, name, accountNumber);
				min.list.add(kim1);
			}
			if(kmk == 1) {
				System.out.println("고객 정보를 입력하세요");
				System.out.println("이름을 입력하세요");
				name = scan.next();
				System.out.println("계좌번호를 입력하세요");
				accountNumber = scan.next();
				System.out.println("잔액을 입력하세요");
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
					"이름 : " +min.list.get(i).getName()+
					"계좌번호 : "+min.list.get(i).getNumber()+
					"잔액 : "+min.list.get(i).getNumber());
					}
				min.min3();
			}else if (kmk == 6) {
				min.min4();
				    }

		}





		}
		}



	}

