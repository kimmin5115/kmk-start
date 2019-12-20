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
	private String mk=null;
	private int total = 0;
	private int i = 0;
	
	ArrayList <minkyu> list = new ArrayList<minkyu>();
	minkyu(){
		
	}
	
	minkyu(int number, String name, String accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
		this.number = number; 
	}
	
	@Override
	public String toString() {
		return "minkyu [number=" + number + ", name=" + name + ", accountNumber=" + accountNumber
				+ "]";
	}
	void registration() {
		
	}
	void registration1() {
	
	}
	
	void min() {
		System.out.println("계좌번호를입력하세요");
	    mk = scan.next();
	    for( i=0 ; i<list.size() ; i++) {
	       if(mk.equals(list.get(i).accountNumber)) {
	    	System.out.println("입금할 금액을 입력하세요");
	   		money = scan. nextInt();
	   		list.get(i).number += money;
	   		System.out.println("잔액은"+list.get(i).number+"원 입니다.");
	        }
		
		}
	   }
	void min1() {
		System.out.println("계좌번호를 입력하세요");
		mk = scan.next();
		for(i=0 ; i<list.size() ; i++) {
		       if(mk.equals(list.get(i).accountNumber)) {
		    	   System.out.println("출금할 금액을 입력하세요");
		   		money = scan. nextInt();
		   		if(list.get(i).number > money) {
		   		list.get(i).number -= money;
		   		}else {
		   			System.out.println("잔고가 부족합니다.");
		       }
		       System.out.println("잔액은"+list.get(i).number+"원 입니다.");
		       }
		}
	}
		       
	void min2() {
		System.out.println("계좌번호를 입력하세요.");
		mk = scan.next();
		for( i=0; i < list.size(); i++) {
			if(mk.equals(list.get(i).accountNumber)){
				System.out.println("출금할 금액을 입력하세요.");
				money = scan.nextInt();
				if(list.get(i).number>money) {
					list.get(i).number -= money;
				}else {
				System.out.println("잔고가 부족합니다.");
				}
				System.out.println("잔액은 " + list.get(i).number+"원 입니다.");
			}
		}
	}
	void min3() {
		System.out.println("계좌번호를 입력하세요.");
		mk = scan.next();
		for(i=0; i<list.size();i++) {
			if(mk.equals(list.get(i).accountNumber)) {
				System.out.println("통장 잔액은"+list.get(i).number+"원");
			}
		}
		
	}
	void check() {
		System.out.println(name+number+accountNumber);
	}
	boolean min4() {
		 System.out.println("프로그램을 종료합니다.");
	      return false;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
