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
			System.out.println("0. 접속 | 1. 회원 가입 | 2. 정보변경 | 3. 회원탈퇴 | 4. 관리자에게 회원 공개" );
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
