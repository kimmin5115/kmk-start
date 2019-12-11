package kmk1211;

import java.util.Scanner;

public class d11c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int k=0, m=0, k1=0;
		int sum=0;
		boolean run = true;
		
		
		while(run){
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택)");
				k= scan.nextInt();
				if(k == 1) {
					System.out.println("예금할 금액을 입력하세요");
					m = scan.nextInt();
					System.out.println("잔고는"+(sum +=m)+"입니다.");
				}else if(k == 2) {
					System.out.println("출금할 금액을 입력하세요.");
					m= scan.nextInt();
					if(m > sum) {
						System.out.println("잔고가 부족합니다.");
						System.out.println("현재 잔액은"+sum+"입니다.");
					}else {
						sum-=m;
						System.out.println("출금 후 잔액은"+sum+"입니다.");
					}
					
				}else if(k == 3) {
					System.out.println("잔고금액은"+sum+"입니다");
				}else if(k==4) {
					run=false;
					System.out.println("종료합니다.");
				}
					
					
				} 
					
				}
				
			
		
		
	}


