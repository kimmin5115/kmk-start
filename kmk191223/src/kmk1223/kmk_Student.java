package kmk1223;

public class kmk_Student extends kmk_people{
	
	kmk_Student(String name, String number) {
		// super : 부모클래스의 생성자
		super(name, number);
		// TODO Auto-generated constructor stub
	}
	public String undergrad;
	public String department;
	
	kmk_Student(String name, String number, String undergrad,String department){
//		this.name = name;
//		this.number = number;
		super(name , number);
		this.undergrad = undergrad;
		this.department = department;
	}

	@Override
	public String toString() {
		return "kmk_Student [undergrad=" + undergrad + ", department=" + department + ", name=" + name + ", number="
				+ number + "]";
	}

}
