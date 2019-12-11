package kmk1211;

import java.util.Scanner;

public class d11c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int k=0, m=0, k1=0, m1=0;
		boolean run=true;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택)");
				k= scan.nextInt();
			switch(k) {
			case 1:
				System.out.println("예금액)");
				m = scan.nextInt();
				k1+=m;
				System.out.println("현재잔액은"+k1+"입니다.");
				break;
			case 2:
				System.out.println("출금액)");
				m1= scan.nextInt();
				k1-=m1;
				if(k1<0) {
					System.out.println("잔고가 부족합니다.");
					
				}
			}
		}
		scan.close();
	}

}
