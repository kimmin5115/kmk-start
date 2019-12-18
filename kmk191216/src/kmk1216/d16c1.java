package kmk1216;

public class d16c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(k == 3) {
			for(m=0; m<num.length; m++) {
				System.out.println((m+1)+"번째 학생은"+num[m]+"점입니다.");
			}
		}
		if(k==4) {
			
		System.out.println("모든 점수 합 : "+sum);	
		avg = sum / n;
		System.out.println("모든 학생의 평균은 : "+avg);
		for(m=0; m<num.length; m++) {
			for(i=1; i<num.length; i++) {
				if(num[m]<num[i]) {
					c = num[i];
					num[i] = num[m];
					num[m] = c;
				}
			}
		}

}
