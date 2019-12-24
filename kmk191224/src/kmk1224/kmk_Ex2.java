package kmk1224;

public class kmk_Ex2 extends kmk_Ex1{

	
	public double bonus;

	@Override
	public String toString() {
		return "kmk_Ex2 [name=" + name + ", money=" + money +", allowance=" + allowance+", bonus=" + bonus +"]";
	}

	public kmk_Ex2(String name, double money, double allowance, double bonus) {
		super(name, money, allowance);
		this.bonus = bonus;
	}
	
	
	double bonus() {
		
		double pay = money * 0.7;
		return pay;
	}
	
	
}
