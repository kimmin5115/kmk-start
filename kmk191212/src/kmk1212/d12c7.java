package kmk1212;

import java.util.Scanner;

public class d12c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int kmk, i;
		int num[] = {1,2,5,3,4,7,6,9,10,8};
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		kmk = scan.nextInt();
		
		for(i=0; i<num.length; i++) {
			if(kmk == num[i]) {
				System.out.println(kmk+"��"+(i)+"��° �ֽ��ϴ�.");
			}
		}
	}

}
