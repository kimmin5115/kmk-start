package minkyu1219;

import java.util.ArrayList;
import java.util.Scanner;

public class minkyu {
	Scanner scan = new Scanner(System.in);
	private int number;
	private String name;
	private String accountNumber;
	private String balance;
	private int money;
	ArrayList <minkyu> list = new ArrayList<minkyu>();
	minkyu(){
		
	}
	public minkyu(Scanner scan, int number, String name, String accountNumber, String balance, int money, int total,
			int m) {
		super();
		this.scan = scan;
		this.number = number;
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.money = money;
		
	}

	
	@Override
	public String toString() {
		return "minkyu [scan=" + scan + ", number=" + number + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + ", money=" + money + "]";
	}


	int total = 0, m = 0;
	void min() {
		System.out.println("계좌번호를입력하세요");
	    accountNumber = scan.next();
	    for(int i=0 ; i<list.size() ; i++) {
	       if(accountNumber.equals(list.get(i).accountNumber)) {
	    	   System.out.println("입금할 금액을 입력하세요");
	   		money = scan. nextInt();
	   		list.get(i).number += money;
	   		System.out.println("잔액은"+list.get(i).number+"원 입니다.");
	        }
		
		}
	   }
	void min1() {
		System.out.println("계좌번호를 입력하세요");
		String accountNumber = scan.next();
		System.out.println("출금하실 금액을 입력하세요");
		money = scan.nextInt();
		for(int i=0 ; i<list.size() ; i++) {
		       if(accountNumber.equals(list.get(i).accountNumber)) {
		    	   System.out.println("출금할 금액을 입력하세요");
		   		money = scan. nextInt();
		   		if(list.get(i).number > money) {
		   		list.get(i).number -= money;
		   		}else {System.out.println("잔고가 부족합니다.");
		       }
		       System.out.println("잔액은"+list.get(i).number+"원 입니다.");
		       }
		}
		}
		       
	void min2() {
		System.out.println("계좌번호를 입력하세요.");
		money = scan.nextInt();
		for(int i=0; i < list.size(); i++) {
			if(money.equals(list.get(i).accountNumber){
				System.out.println("잔액은 " + list.get(i).number+"원 입니다.");
			}
		}
	}
	void min3() {
		 System.out.println(name+ number+ accountNumber);
		
	}
	void min4() {
		 System.out.println("프로그램을 종료합니다.");
	      
		
	}
	
}
