package kmk1213;

import java.util.Scanner;

public class d13c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		String[][] num = {
				{"chair", "����"},
				{"desk", "å��"},
				{"water", "��"},
				{"pencil", "����"},
				{"watch", "�ð�"},
		};
		
		int i, sum=0;
		double avg=0;
		String k;
		for( i=0; i<num.length;i++) {
			System.out.println(num[i][0]+"�� ���� �����Դϱ�?");
			k=scan.next();
			for(int j=1; j<num[i].length; j++) {
				if(k.equals(num[i][j])) {
					System.out.println("�����Դϴ�.");
					sum++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					System.out.println("������ "+num[i][j]+"�Դϴ�.");
				}
				
			}
			
		}System.out.println("���� ������"+sum+"�� �Դϴ�.");
		System.out.print("���� Ȯ����"+(100/i*sum)+"% �Դϴ�");
		scan.close();
		
		
		
		
	}

}
