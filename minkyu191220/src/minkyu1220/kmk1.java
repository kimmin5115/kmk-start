package minkyu1220;

public class kmk1 {

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
