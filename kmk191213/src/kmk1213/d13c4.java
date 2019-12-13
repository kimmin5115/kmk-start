package kmk1213;

import java.util.Scanner;

public class d13c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 학점 계산하기
		 * 스캐너를 이용하여 4년간의 학기별 학점을 입력하고
		 * 총 평점을 출력하세요
		 */

		int  m=0;
		double count, sum=0, avg=0;;
		double grade[][] = new double[4][2];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<grade.length; i++) {		
			
			for(int j=0; j<grade[i].length; j++) {
				System.out.print((i+1)+"학년의"+(j+1)+"학기 학점을 입력 하세요 : ");
				count=scan.nextDouble();
				grade[i][j] = count;
				m++;
				sum+=count;
				avg=sum/m;
			}
		} System.out.println("총평점은"+sum);
		 System.out.println(avg);
		scan.close();
		 
				
		
		
		
		
	}

}
