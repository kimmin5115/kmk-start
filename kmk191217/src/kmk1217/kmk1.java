package kmk1217;

public class kmk1 {

	int gas;
	void setGas(int gas) {
		this.gas=gas;
	}
	// gas의 값을 준다.
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return true;
		}else {
			System.out.println("gas가 있습니다.");
		return true;}	}
		
	//gas 값을 보고 스타트
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량 : "+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다.(gas 잔량: "+gas+")");
				return;
			}
		}
	//gas값이 0이 될때까지 계속 while문 실행
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
