package kmk1212;

import java.util.Scanner;

public class d12c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		
		int[] num = new int[5];
		int k,max=num[0];
		System.out.println("���� 5���� �Է��ϼ���.");
		for(k=0; k<num.length;k++) {
			System.out.println((k+1)+"��° ���ڸ� �Է��ϼ���");
			num[k] = scan.nextInt();
			if (num[k] > max) 
				  max = num[k];
			 
			}System.out.print("�迭�� �ִ밪��"+max+"�Դϴ�.");
			
		}
}
