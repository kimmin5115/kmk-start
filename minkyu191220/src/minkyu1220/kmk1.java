package minkyu1220;

public class kmk1 {

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
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	
	
	public kmk1() {
		
	}
	
	@Override
	public String toString() {
		return "kmk1 [clientNumber=" + clientNumber + ", name=" + name + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	public int getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
