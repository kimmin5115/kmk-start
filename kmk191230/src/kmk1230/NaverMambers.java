package kmk1230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NaverMambers {
	
	//static 메소드
	public static Connection makeConnection() {
		//DB 접속정보 저장을 위한 Connection 변수 선언
		Connection con = null;
		
		//접속할 DB의 계정정보
		String user = "kmk1230";
		String password = "1234";
		
		//접속할 DB의 주소 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//오라클 데이터의 주소값
		
		
		try {
			//ojdbc6 파일을 현재 소스에 적용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("접속성공");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
		
		
		
		
		return con;
	}


//	네이버 회원정보를 처리하는 DB를 구축하고자 한다. 아래 내용을 참고하여 작업을 수행하세요. 
//	1. 필요 데이터는 네이버 회원가입 페이지 참조 
//	2. DB 계정은 본인이니셜+오늘날짜로 새로 생성
//	3. 테이블 이름은 MEMBER로 할 것 
//	4. 주요 기능 
//	 4.1 회원가입 (회원가입시 현재 날짜도 함께 입력되도록 할 것)
//	 4.2 회원정보 수정 
//	   - 정보수정 시 아이디 비번을 묻고 맞아야 수정이 가능 
//	 4.3 회원탈퇴 
//	   - 회원탈퇴 시 아이디 비번을 묻고 맞아야 탈퇴 가능 
//	 4.4 관리자(admin)기능 
//	   - 관리자만 전체 회원 목록을 볼 수 있으며 일반회원은 볼 수 없음 


}
