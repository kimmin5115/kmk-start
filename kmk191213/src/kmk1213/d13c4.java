package kmk1213;

import java.util.Scanner;

public class d13c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ���� ����ϱ�
		 * ��ĳ�ʸ� �̿��Ͽ� 4�Ⱓ�� �б⺰ ������ �Է��ϰ�
		 * �� ������ ����ϼ���
		 */

		int  m=0;
		double count, sum=0, avg=0;;
		double grade[][] = new double[4][2];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<grade.length; i++) {		
			
			for(int j=0; j<grade[i].length; j++) {
				System.out.print((i+1)+"�г���"+(j+1)+"�б� ������ �Է� �ϼ��� : ");
				count=scan.nextDouble();
				grade[i][j] = count;
				m++;
				sum+=count;
				avg=sum/m;
			}
		} System.out.println("��������"+sum);
		 System.out.println(avg);
		scan.close();
		 
				
		
		
		
		
	}

}
