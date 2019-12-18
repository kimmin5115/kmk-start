package kmk1217;

public class calculator {
	
	
	
	int x = 10;
	int y = 7;
	
	int add (int x, int y) {
		return (x + y);
		
	}
	double avg(int x, int y) {
		return  ((double) (add(x,y))/2);
		
	}
	void execute() {
		double result = avg(x , y);
		System.out.println("실행결과:" + result);
		
	}
}
