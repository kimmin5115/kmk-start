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
		System.out.println("���¹�ȣ���Է��ϼ���");
	    mk = scan.next();
	    for( i=0 ; i<list.size() ; i++) {
	       if(mk.equals(list.get(i).accountNumber)) {
	    	System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
	   		money = scan. nextInt();
	   		list.get(i).number += money;
	   		System.out.println("�ܾ���"+list.get(i).number+"�� �Դϴ�.");
	        }
		
		}
	   }
	void min1() {
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		mk = scan.next();
		for(i=0 ; i<list.size() ; i++) {
		       if(mk.equals(list.get(i).accountNumber)) {
		    	   System.out.println("����� �ݾ��� �Է��ϼ���");
		   		money = scan. nextInt();
		   		if(list.get(i).number > money) {
		   		list.get(i).number -= money;
		   		}else {
		   			System.out.println("�ܰ� �����մϴ�.");
		       }
		       System.out.println("�ܾ���"+list.get(i).number+"�� �Դϴ�.");
		       }
		}
	}
		       
	void min2() {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		mk = scan.next();
		for( i=0; i < list.size(); i++) {
			if(mk.equals(list.get(i).accountNumber)){
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				money = scan.nextInt();
				if(list.get(i).number>money) {
					list.get(i).number -= money;
				}else {
				System.out.println("�ܰ� �����մϴ�.");
				}
				System.out.println("�ܾ��� " + list.get(i).number+"�� �Դϴ�.");
			}
		}
	}
	void min3() {
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		mk = scan.next();
		for(i=0; i<list.size();i++) {
			if(mk.equals(list.get(i).accountNumber)) {
				System.out.println("���� �ܾ���"+list.get(i).number+"��");
			}
		}
		
	}
	void check() {
		System.out.println(name+number+accountNumber);
	}
	boolean min4() {
		 System.out.println("���α׷��� �����մϴ�.");
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
