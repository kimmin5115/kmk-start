package kmk1230;

import java.sql.Connection;
import java.util.Scanner;

public class MembersMain {

	public static void main(String[] args) {


		
		Connection con = null;
		con = NaverMambers.makeConnection();
		Scanner scan = new Scanner(System.in);
		MemberSave saver = new MemberSave();
		Member sql = new Member();
		boolean run = true;
		int selectNum = 0;
		
		while(run) {
			System.out.println("0. ���� | 1. ȸ�� ���� | 2. �������� | 3. ȸ��Ż�� | 4. �����ڿ��� ȸ�� ����" );
			selectNum = scan.nextInt();
			switch(selectNum) {
			case 0 : 
				sql.NMConnection();
				break;
			case 1 :
				sql.inserNM();
				break;
			case 2 :
				sql.inserNM1();
				break;
			case 3 :
				sql.delete();
				break;
			case 4 :
				sql.selectNM();
				break;
			case 6 :
				run = false;
			}
		
		
		}
	}

}
