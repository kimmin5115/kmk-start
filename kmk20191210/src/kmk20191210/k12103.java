package kmk20191210;

import java.util.Scanner;

public class k12103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int num=0, num1=0;
		System.out.println("����5���� �Է� �� 0�� �Է��ϼ���");
		num = scan.nextInt();
		int sum=0;
		while(num!=0) {
			sum += num;
			num1++;
			num = scan.nextInt();
			if(num == 0) {break;
			}else {			
			}
			
			
		}System.out.println(num1+"�� �Է�");
		System.out.println("����� "+sum/num1);
	}

}
