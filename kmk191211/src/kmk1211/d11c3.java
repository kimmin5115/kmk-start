package kmk1211;

import java.util.Scanner;

public class d11c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k, m;
		int k1=0;
		int sum;
		boolean run = true;
		System.out.print("숫자를 입력하세요 : ");
		k = scan.nextInt();
		m = (int) (Math.random() * 100) + 1;
		while(run) {
			k1++;
			if(k == m) {
			System.out.println("맞추셨습니다.");
				break;
			}else if(k > m) {
				System.out.println("더 낮은 숫자입니다.");
				System.out.print("숫자를 입력하세요 : ");
				k = scan.nextInt();
			}else {
				System.out.println("더 높은 숫자 입니다.");
				System.out.print("숫자를 입력하세요 : ");
				k = scan.nextInt();
			}
		}System.out.println("횟수는"+k1+"입니다");
		
		
	}

}
