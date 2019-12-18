package kmk12162;

public class d16c1 {
	
	//교육원에 다니는 훈련생에 대한 클래스를 만들고
	//메인 클래스에서 각자 같은 줄에 앉은 사람들에 대한 객체를 각각 선언해서 필드값 출력

	String name;
	String add;
	int age;
	
	
	@Override
	public String toString() {
		return "d16c1 [name=" + name + ", add=" + add + ", age=" + age + "]";
	}


	d16c1(String name, String add, int age){
		this.name = name;
		this.add = add;
		this.age = age;
			}

	d16c1(){
		
	}
	
}
