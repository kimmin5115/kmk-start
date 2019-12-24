package kmk1224;

public class kmk_Ex {
//
//	1. Employee 클래스 
//    A.	이름, 급여 정보를 가지고 있음. 
//    B.	급여 인상율 10% 
//2. Manager 클래스 (Employee 상속)
//    A.	관리자 수당 있음. 
//    B.	급여 인상율 20%
//3. Executive 클래스 (Manager 상속)
//    A.	보너스 있음. 
//    B.	급여 인상율은 30%
//4. EmployeeMain 클래스 
//    A.	각 직급별 직원에 대한 객체를 만들어서 
//    B.	급여를 인상해주고 
//    C.	각 직원의 모든 정보 출력  

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
