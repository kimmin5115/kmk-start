package kmk1224;

public class kmk_Ex {
//
//	1. Employee Ŭ���� 
//    A.	�̸�, �޿� ������ ������ ����. 
//    B.	�޿� �λ��� 10% 
//2. Manager Ŭ���� (Employee ���)
//    A.	������ ���� ����. 
//    B.	�޿� �λ��� 20%
//3. Executive Ŭ���� (Manager ���)
//    A.	���ʽ� ����. 
//    B.	�޿� �λ����� 30%
//4. EmployeeMain Ŭ���� 
//    A.	�� ���޺� ������ ���� ��ü�� ���� 
//    B.	�޿��� �λ����ְ� 
//    C.	�� ������ ��� ���� ���  

	public String name;
	public double money;
	public double payup;
	kmk_Ex(String name, double money){
		this.name=name;
		this.money = money;
	}
	@Override
	public String toString() {
		return "kmk_Ex [name=" + name + ", money=" + money +", payup="+ payup+"]";
	}
	
	void getpayup() {
		double pay = money * 0.09;
			payup = pay;
	}
}
