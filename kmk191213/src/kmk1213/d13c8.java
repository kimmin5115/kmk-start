package kmk1213;

import java.util.Scanner;

public class d13c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int[] num=null;
		int j, i=0, k, m, n=0, sum=0, avg=0, c=0, max=0;
		boolean run=true;

		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("���ڸ� �Է��ϼ��� : ");
			k=scan.nextInt();
			if(k == 1) {
				System.out.println("�л����� �Է� : ");
				m=scan.nextInt();
				num=new int[m];}
			else if(k == 2) {
				for(m=0; m<num.length; m++) {
				System.out.println((m+1)+"��° �л��� ������ �Է��ϼ���");
				j=scan.nextInt();
				num[m]= j;
				sum+=j;
				n++;
			}}
			else if(k == 3) {
				for(m=0; m<num.length; m++) {
					System.out.println((m+1)+"��° �л���"+num[m]+"���Դϴ�.");
				}
			}
			else if(k==4) {
				
			System.out.println("��� ���� �� : "+sum);	
			avg = sum / n;
			System.out.println("��� �л��� ����� : "+avg);
			
			for(k=0; k<num.length; k++) {
				if(max<num[k]) {
					max = num[k];
				}
			}
			System.out.println("�ְ�����" + max);
			
			for(m=0; m<num.length; m++) {
				for(i=1; i<num.length; i++) {
					if(num[m]<num[i]) {
						c = num[i];
						num[i] = num[m];
						num[m] = c;
					}			
			for(m=0; m<num.length;m++) {
				System.out.println(num[m]);
			}}}
			}
			else if(k==5) { 
				System.out.println("�����մϴ�.");
				break;
				
			}
				
	
	
			}
			}
				
				
				
			
			
		
		
		
	}


