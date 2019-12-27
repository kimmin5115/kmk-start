package kmk1226_3;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
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
		student kmk = new student();
		List<student> stuList = new ArrayList<student>();
		DBsql sql = new DBsql();
		boolean run = true;
		/*
		 * 1�� �����ϸ� ��ü ��ȸ, 2�� �����ϸ� ������ ����
		 */
		int selectNum = 0;
		
		while(run) {
			System.out.println("1.��ü ��ȸ | 2.�������߰� | 3.������ �߰�(?���) | 4.�����͸� �޾Ƽ� �߰� | 5. �ټ��̿��ؼ� �߰��ϱ�");
			selectNum = scan.nextInt();
		
		switch(selectNum) {
		case 0 :
			sql.dbConnection();
			break;
		case 1:
			
			sql.selectDB();
			break;
			
		case 2 :
			sql.insertDB1();
			break;
			
		case 3 :
			sql.inserDB2();
			break;
			
		case 4 :
			sql.inserDB3();
			break;
		case 5 :
			kmk = new student();
			System.out.println("�л���ȣ�� �Է��ϼ���");
			int studentno = scan.nextInt();
			kmk.setStudentno(studentno);
			System.out.println("�л��̸��� �Է��ϼ���");
			String name = scan.next();
			kmk.setName(name);
			System.out.println("���̸� �Է��ϼ���");
			int age = scan.nextInt();
			kmk.setAge(age);
			System.out.println("�ּҸ� �Է��ϼ���");
			String address = scan.next();
			kmk.setAddress(address);
			System.out.println("������ �Է��ϼ���");
			String gender = scan.next();
			kmk.setGender(gender);
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String phone = scan.next();
			kmk.setPhone(phone);
			sql.inserDB4(kmk);
			break;
			
		case 6:
//			stuList =new ArrayList<student>();
			stuList = sql.selectDB6();
			break;
		case 7 :
			sql.selectDB7();
			break;
		case 8 :
			sql.selectDB8();
			break;
		case 10 : 
			sql.selectDB10();
			break;
			
		case 11 :
			sql.selectDB11();
			break;
			
		case 12 :
			sql.selectDB12();
			break;
			
		case 9 :
			run = false;
			}
		 
			
		}
		for(int i=0; i<stuList.size();i++) {
			System.out.println(stuList.get(i));
		}
	}
		
}


