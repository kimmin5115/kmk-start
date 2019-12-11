package kmk1211;

import java.util.Scanner;

public class d11c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int k=0, m=0;
		int k1=0;
		m = (int) (Math.random() * 100) + 1;
		boolean run = true;
		
		System.out.println("up&down");
		do {
			k1++;
			System.out.println("1부터 100까지의 숫자를 입력하세요 : ");
			k = scan.nextInt();
			if(m > k ) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if( m  < k ) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는"+k1+"번 입니다.");
			run = false;
			}
		}while(run);
	}

}
