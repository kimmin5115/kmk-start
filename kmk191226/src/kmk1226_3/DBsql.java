package kmk1226_3;
// 쿼리문을 모아놓은 클래스

import java.sql.*;
import java.util.*;

public class DBsql {

	// DB 접속을 위한 변수 선언
	Connection con = null;
	// 쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;
	// 조회(SELECT) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);
	// STUDENT 테이블 전체 조회 메소드
	public void selectDB(Connection con) {
		// 실행하고자 하는 쿼리문을 String 변수로 지정
		String sql = "SELECT * FROM STUDENT";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDB(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(8, '이용', 11, '인천시 용현동','남성','010561214646')";
		try {
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("insert 결과"+result);
			System.out.println("DB에 저장 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void inserDB2(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1 , 10);
			pstmt.setString(2, "유연수");
			pstmt.setInt(3, 18);
			pstmt.setString(4, "송도");
			pstmt.setString(5, "남자");
			pstmt.setString(6, "000-1111-1111");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void inserDB3(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("번호을 입력하세요");
			int k = scan.nextInt();
			pstmt.setInt(1 , k);
			System.out.println("이름을 입력하세요");
			String m = scan.next();
			pstmt.setString(2, m);
			System.out.println("나이을 입력하세요");
			k = scan.nextInt();
			pstmt.setInt(3, k);
			System.out.println("지역을 입력하세요");
			 m = scan.next();
			pstmt.setString(4, m);
			System.out.println("성별을 입력하세요");
			 m = scan.next();
			pstmt.setString(5, m);
			System.out.println("전화번호을 입력하세요");
			 m = scan.next();
			pstmt.setString(6, m);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
