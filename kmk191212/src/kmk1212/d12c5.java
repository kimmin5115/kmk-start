package kmk1212;

import java.util.Arrays;
import java.util.Scanner;

public class d12c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * �迭 ���� ����5���� ����
		 * �� ������ ������������ �迭�ϱ�
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] k= new int[5];
		int m, m1, save=0;
		System.out.println("���ڸ� 5�� �Է��ϼ���.");
		for(m=0; m<k.length; m++) {
			k[m]=scan.nextInt();
		}
		
//		for(m=0; m < k.length; m++) {
//			for(m1=m+1; m1<k.length; m1++) 
//				
//				//���� ���ٱ�(��������)
//				if(k[m]<k[m1]) {
//				save=k[m];
//				k[m]=k[m1];
//				k[m1]=save;
//				}			
//		}
		
//		Arrays.parallelSort(k);
		Arrays.sort(k);
		for(m=0; m<k.length; m++) {
			System.out.print(k[m]);
	}
		
		
	}

}
