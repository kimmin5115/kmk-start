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
		System.out.println("���¹�ȣ���Է��ϼ���");
	    accountNumber = scan.next();
	    for(int i=0 ; i<list.size() ; i++) {
	       if(accountNumber.equals(list.get(i).accountNumber)) {
	    	   System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
	   		money = scan. nextInt();
	   		list.get(i).number += money;
	   		System.out.println("�ܾ���"+list.get(i).number+"�� �Դϴ�.");
	        }
		
		}
	   }
	void min1() {
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String accountNumber = scan.next();
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ���");
		money = scan.nextInt();
		for(int i=0 ; i<list.size() ; i++) {
		       if(accountNumber.equals(list.get(i).accountNumber)) {
		    	   System.out.println("����� �ݾ��� �Է��ϼ���");
		   		money = scan. nextInt();
		   		if(list.get(i).number > money) {
		   		list.get(i).number -= money;
		   		}else {System.out.println("�ܰ� �����մϴ�.");
		       }
		       System.out.println("�ܾ���"+list.get(i).number+"�� �Դϴ�.");
		       }
		}
		}
		       
	void min2() {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		money = scan.nextInt();
		for(int i=0; i < list.size(); i++) {
			if(money.equals(list.get(i).accountNumber){
				System.out.println("�ܾ��� " + list.get(i).number+"�� �Դϴ�.");
			}
		}
	}
	void min3() {
		 System.out.println(name+ number+ accountNumber);
		
	}
	void min4() {
		 System.out.println("���α׷��� �����մϴ�.");
	      
		
	}
	
}
