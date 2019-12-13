package kmk1213;

import java.util.Scanner;

public class d13c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int[] num=null;
		int j, i=0, k, m, n=0, sum=0, avg=0, c=0;
		boolean run=true;

		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("숫자를 입력하세요 : ");
			k=scan.nextInt();
			if(k == 1) {
				System.out.println("학생수를 입력 : ");
				m=scan.nextInt();
				num=new int[m];}
			if(k == 2) {
				for(m=0; m<num.length; m++) {
				System.out.println((m+1)+"번째 학생의 점수를 입력하세요");
				j=scan.nextInt();
				num[m]= j;
				sum+=j;
				n++;
			}}
			if(k == 3) {
				for(m=0; m<num.length; m++) {
					System.out.println((m+1)+"번째 학생은"+num[m]+"점입니다.");
				}
			}
			if(k==4) {
				
			System.out.println("모든 점수 합 : "+sum);	
			avg = sum / n;
			System.out.println("모든 학생의 평균은 : "+avg);
			
			//최고값
			for(m=0; m<num.length; m++) {
				for(i=1; i<num.length; i++) {
					if(num[m]<num[i]) {
						c = num[i];
						num[i] = num[m];
						num[m] = c;
					}
				}
				
			}
			for(m=0; m<num.length;m++) {
				System.out.println(num[m]);
			}}
			if(k==5) { 
				System.out.println("종료합니다.");
				break;
			}
				
	
	
			}
			}
				
				
				
			
			
		
		
		
	}


