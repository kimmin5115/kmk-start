package kmk12162;

import java.util.Scanner;

public class countmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		int num=0;
		kmkcount kmk = new kmkcount();
		
		
		System.out.println("��� �Ͻ� �ΰ��� ���ڸ� �Է��ϼ���!");
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		int num2=scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num3=scan.nextInt();
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���� | 2. ���� | 3. ���ϱ� | 4. ���� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("���ڸ� �Է��ϼ��� : ");
			num=scan.nextInt();
			if(num == 1) {
				kmk.sum(num2, num3);
			}else if(num == 2) {
				kmk.subtract(num2, num3);
			}else if(num == 3) {
				kmk.multiply(num2, num3);
			}else if(num == 4) {
				kmk.divide(num2, num3);
			}else if(num == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
		
	}

}
