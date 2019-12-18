package kmk1217;

import java.util.Scanner;

public class kmkmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		int num=0;
		kmk kmk = new kmk();
		
		
		System.out.println("계산 하실 두개의 숫자를 입력하세요!");
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num2=scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int num3=scan.nextInt();
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.덧셈 | 2. 뺄셈 | 3. 곱하기 | 4. 나눗셈 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("숫자를 입력하세요 : ");
			num=scan.nextInt();
			if(num == 1) {
				System.out.println(kmk.sum(num2, num3));
			}else if(num == 2) {
				System.out.println(kmk.subtract(num2, num3));
			}else if(num == 3) {
				System.out.println(kmk.multiply(num2, num3));
			}else if(num == 4) {
				System.out.println(kmk.divide(num2, num3));
			}else if(num == 5) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		scan.close();
	}

}
