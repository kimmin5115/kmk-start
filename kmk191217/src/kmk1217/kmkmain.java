package kmk1217;

import java.util.Scanner;

public class kmkmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		int num=0;
		kmk kmk = new kmk();
		
		
		System.out.println("��� �Ͻ� �ΰ��� ���ڸ� �Է��ϼ���!");
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		int num2=scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num3=scan.nextInt();
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���� | 2. ���� | 3. ���ϱ� | 4. ������ | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("���ڸ� �Է��ϼ��� : ");
			num=scan.nextInt();
			if(num == 1) {
				System.out.println(kmk.sum(num2, num3));
			}else if(num == 2) {
				System.out.println(kmk.subtract(num2, num3));
			}else if(num == 3) {
				System.out.println(kmk.multiply(num2, num3));
			}else if(num == 4) {
				System.out.println(kmk.divide(num2, num3));
			}else if(num == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
		scan.close();
	}

}
