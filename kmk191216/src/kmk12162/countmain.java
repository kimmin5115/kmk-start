package kmk12162;

import java.util.Scanner;

public class countmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		int num=0;
		kmkcount kmk = new kmkcount();
		
		
		System.out.println("계산 하실 두개의 숫자를 입력하세요!");
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num2=scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int num3=scan.nextInt();
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.덧셈 | 2. 뺄셈 | 3. 곱하기 | 4. 종료 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("숫자를 입력하세요 : ");
			num=scan.nextInt();
			if(num == 1) {
				kmk.sum(num2, num3);
			}else if(num == 2) {
				kmk.subtract(num2, num3);
			}else if(num == 3) {
				kmk.multiply(num2, num3);
			}else if(num == 4) {
				kmk.divide(num2, num3);
			}else if(num == 5) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}

}
