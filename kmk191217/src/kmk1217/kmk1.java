package kmk1217;

public class kmk1 {

	int gas;
	void setGas(int gas) {
		this.gas=gas;
	}
	// gas�� ���� �ش�.
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return true;
		}else {
			System.out.println("gas�� �ֽ��ϴ�.");
		return true;}	}
		
	//gas ���� ���� ��ŸƮ
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : "+gas+")");
				gas-=1;
			}else {
				System.out.println("����ϴ�.(gas �ܷ�: "+gas+")");
				return;
			}
		}
	//gas���� 0�� �ɶ����� ��� while�� ����
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
