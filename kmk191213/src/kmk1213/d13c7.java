package kmk1213;

import java.util.Scanner;

public class d13c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
				
		do{
			int[] coin = {500,100,50,10};
			System.out.println("�ݾ� �Է�:");
			int change = scan.nextInt();
			for(int i = 0; i<coin.length; i++) {
				int coinCount = change/coin[i];
				System.out.println(coin[i]+"�� ����:"
						+ coinCount+"��");
				change = change%coin[i];
				
			}
		}while(true);	
			
		
		
	}}


