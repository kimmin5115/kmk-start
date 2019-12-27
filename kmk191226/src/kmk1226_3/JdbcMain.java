package kmk1226_3;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {
		/*
		 * 1. DBConnection 클래스의 makeConnection 메소드 호출하여
		 * 	  DB접속 정보(con)를 가져옴
		 * 2. con 객체를 가지고 DBsql 클래스의 메소드 호출하여 원하는
		 * 	    쿼리문 실행
		 */
		
		Connection con = null;
		con = DBConnection.makeConnection();
		Scanner scan = new Scanner(System.in);
		student kmk = new student();
		List<student> stuList = new ArrayList<student>();
		DBsql sql = new DBsql();
		boolean run = true;
		/*
		 * 1번 선택하면 전체 조회, 2번 선택하면 데이터 저장
		 */
		int selectNum = 0;
		
		while(run) {
			System.out.println("1.전체 조회 | 2.데이터추가 | 3.데이터 추가(?사용) | 4.데이터를 받아서 추가 | 5. 겟셋이용해서 추가하기");
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
			System.out.println("학생번호를 입력하세요");
			int studentno = scan.nextInt();
			kmk.setStudentno(studentno);
			System.out.println("학생이름을 입력하세요");
			String name = scan.next();
			kmk.setName(name);
			System.out.println("나이를 입력하세요");
			int age = scan.nextInt();
			kmk.setAge(age);
			System.out.println("주소를 입력하세요");
			String address = scan.next();
			kmk.setAddress(address);
			System.out.println("성별을 입력하세요");
			String gender = scan.next();
			kmk.setGender(gender);
			System.out.println("전화번호를 입력하세요");
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


