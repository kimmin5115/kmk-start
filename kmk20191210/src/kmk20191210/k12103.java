package kmk20191210;

import java.util.Scanner;

public class k12103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int num=0, num1=0;
		System.out.println("숫자5개를 입력 후 0을 입력하세요");
		num = scan.nextInt();
		int sum=0;
		while(num!=0) {
			sum += num;
			num1++;
			num = scan.nextInt();
			if(num == 0) {break;
			}else {			
			}
			
			
		}System.out.println(num1+"개 입력");
		System.out.println("평균은 "+sum/num1);
	}

}
