package kmk1212;

import java.util.Scanner;

public class d12c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 배열에 정수 5개 입력 받아서
		 * 가장 큰 수 출력
		 */
		Scanner scan= new Scanner(System.in);
		int[] num = new int[5];
		int k,max=0;
		System.out.println("정수 5개를 입력하세요.");
		for(k=0; k<num.length;k++) {
			num[k] = scan.nextInt();
			max = num[0];
			if(max < num[1]) {
				max=num[1];
			}else if(num[1]<num[2]) {
				max=num[2];
			}else if(num[2]<num[3]) {
				max=num[3];
			}else if(num[3]<num[4]) {
				max=num[4];
			}else {
				max=num[0];
			}
		}
		System.out.println("배열 값중 최대값은"+max);
		scan.close();
		
		
	}

}
