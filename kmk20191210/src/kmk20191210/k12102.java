package kmk20191210;

import java.util.Scanner;

public class k12102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//정수를 입력하고 마지막에 0을 입력하세요
		//입력한 수는 5개
		//평균은 204입니다.
		Scanner scan = new Scanner(System.in);
		int k, i=0;
		boolean run = true;
		k = scan.nextInt();
		int sum=0;
		while(run) {
			sum += k;
			k = scan.nextInt();
			if(k == 0) {
				run=false;
			}else {
				i++;
			}
		}System.out.println(i);
		System.out.println("평균은"+(sum/i)+"입니다.");
		
		
		
		
		
	}

}
