package kmk1213;

import java.util.Scanner;

public class d13c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		String[][] num = {
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"pencil", "연필"},
				{"watch", "시계"},
		};
		
		int i, sum=0;
		double avg=0;
		String k;
		for( i=0; i<num.length;i++) {
			System.out.println(num[i][0]+"의 뜻이 무엇입니까?");
			k=scan.next();
			for(int j=1; j<num[i].length; j++) {
				if(k.equals(num[i][j])) {
					System.out.println("정답입니다.");
					sum++;
				}else {
					System.out.println("틀렸습니다.");
					System.out.println("정답은 "+num[i][j]+"입니다.");
				}
				
			}
			
		}System.out.println("맞은 갯수는"+sum+"개 입니다.");
		System.out.print("정답 확률은"+(100/i*sum)+"% 입니다");
		scan.close();
		
		
		
		
	}

}
