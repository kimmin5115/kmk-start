package kmk1223;

public class kmk_EX1 extends kmk_Ex {


	public int bonus;
	public kmk_EX1(String name, String address, int salary, int bonus) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.bonus = bonus;
		

	}
	@Override
	public String toString() {
		return "kmk_EX1 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
	
