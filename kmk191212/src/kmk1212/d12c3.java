package kmk1212;

import java.util.Scanner;

public class d12c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �迭�� ���� 5�� �Է� �޾Ƽ�
		 * ���� ū �� ���
		 */
		Scanner scan= new Scanner(System.in);
		int[] num = new int[5];
		int k,max=0;
		System.out.println("���� 5���� �Է��ϼ���.");
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
		System.out.println("�迭 ���� �ִ밪��"+max);
		scan.close();
		
		
	}

}
