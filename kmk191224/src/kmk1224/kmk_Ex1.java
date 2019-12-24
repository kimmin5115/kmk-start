package kmk1224;

public class kmk_Ex1 extends kmk_Ex{
	
	
	public double allowance;

	@Override
	public String toString() {
		return "kmk_Ex1 [name=" +name+ ", money=" + money +"allowance=" + "allowance]";
	}

	public kmk_Ex1(String name, double money, double allowance) {
		super(name, money);
		this.allowance = allowance;
	}
	
	double allowance() {
		double pay = money * 0.8;
		return pay;
	}
	

}
