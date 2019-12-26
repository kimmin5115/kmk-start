package kmk1226_3;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		/*
		 * 1. DBConnection Ŭ������ makeConnection �޼ҵ� ȣ���Ͽ�
		 * 	  DB���� ����(con)�� ������
		 * 2. con ��ü�� ������ DBsql Ŭ������ �޼ҵ� ȣ���Ͽ� ���ϴ�
		 * 	    ������ ����
		 */
		
		Connection con = null;
		con = DBConnection.makeConnection();
		Scanner scan = new Scanner(System.in);
		
		
		DBsql sql = new DBsql();
		/*
		 * 1�� �����ϸ� ��ü ��ȸ, 2�� �����ϸ� ������ ����
		 */
		int selectNum = 0;
		
		while(true) {
			System.out.println("1.��ü ��ȸ | 2.�������߰� | 3.������ �߰�(?���)");
			selectNum = scan.nextInt();
		
		switch(selectNum) {
		case 1:
			
			sql.selectDB(con);
			break;
			
		case 2 :
			sql.insertDB(con);
			break;
			
		case 3 :
			sql.inserDB2(con);
			
		case 4 :
			sql.inserDB3(con);
		}
		}
		

	}

}
