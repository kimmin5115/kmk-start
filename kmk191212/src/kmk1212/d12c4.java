package kmk1212;

import java.util.Scanner;

public class d12c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		
		int[] num = new int[5];
		int k,max=num[0];
		System.out.println("정수 5개를 입력하세요.");
		for(k=0; k<num.length;k++) {
			System.out.println((k+1)+"번째 숫자를 입력하세요");
			num[k] = scan.nextInt();
			if (num[k] > max) 
				  max = num[k];
			 
			}System.out.print("배열의 최대값은"+max+"입니다.");
			
		}
}
