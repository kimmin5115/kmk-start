package test;

public class b {

	public static void main(String[ ] args) {
		a A = new a();
		//field 4개 호출하기
		A.field1=1;
		A.field2=1;
		A.field3=1;
//		A.field4=1;
		
		A.multiply(5, 5);
		A.sum(5, 5);
		A.avg(5, 5);
//		A.divide(5,5);
	}
}
