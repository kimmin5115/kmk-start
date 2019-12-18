package kmk1217;

public class test1 {
	
	
	int add (int x, int y) {
		int result = x + y;
		return (x + y);
		
	}
	double avg(int x, int y) {
		double sum = add(x,y);
		double result = sum/2;
		return result;
		
	}
	void execute() {
		double result = avg(10 , 7);
		System.out.println("실행결과:" + result);
}
}
