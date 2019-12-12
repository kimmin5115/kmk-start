package kmk1212;

import java.util.Scanner;

public class d12c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 크기가 3인 정수형 배열을 선언
		 * 스캐너를 이용하여 값을 3개 저장 후
		 * 입력된 값의 총합, 평균 계산
		 */
		
		Scanner scan = new Scanner(System.in);
		int k;
		int sum=0;
		int avg;
		
		int[] number = new int[3];
		System.out.println("숫자를 3개 입력하세요");
		for(k=0; k <number.length;  k++) {
			number[k] = scan.nextInt();
			sum += number[k];
			
		}avg=sum/number.length;
		System.out.println("숫자3개의 합은"+sum+"입니다.");
		System.out.println("숫자3개의 평균은"+avg+"입니다.");
		scan.close();
	}

}
