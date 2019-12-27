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
	public void dbConnection() {
		con = DBConnection.makeConnection();
	}
	student st = new student();
	student st1 = null;
	Scanner scan = new Scanner(System.in);
	// STUDENT 테이블 전체 조회 메소드
	public void selectDB() {
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

	public void insertDB1() {
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
	
	public void inserDB2() {
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
			e.printStackTrace();
		}
		
		
	}
	public void inserDB3() {
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
			
			e.printStackTrace();
		}
	}
		
		public void inserDB4(student kmk) {
			String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1 , kmk.getStudentno());
				pstmt.setString(2, kmk.getName());
				pstmt.setInt(3, kmk.getAge());
				pstmt.setString(4, kmk.getAddress());
				pstmt.setString(5, kmk.getGender());
				pstmt.setString(6, kmk.getPhone());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
		
		
		public List<student> selectDB6() {
			
			String sql = "SELECT * FROM STUDENT";
			List<student> Student = new ArrayList<student>();
			student stu = null;
			try {
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
						stu = new student(rs.getInt("studentno"), rs.getString("name"),rs.getInt("age")
						, rs.getString("address"), rs.getString("gender"),rs.getString("phone"));
						Student.add(stu);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return Student;
	}
		public void selectDB7() {
			// 실행하고자 하는 쿼리문을 String 변수로 지정
			String sql = "SELECT * FROM STUDENT WHERE GENDER = ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "여성");
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
		
		public void selectDB8() {
			// 실행하고자 하는 쿼리문을 String 변수로 지정
			String sql = "SELECT * FROM STUDENT WHERE ADDRESS = '인천'";
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
		public void selectDB10() {
			// 실행하고자 하는 쿼리문을 String 변수로 지정
			System.out.println("검색할 지역을 적으세요?");
			String l= scan.next();
			String sql = "SELECT * FROM STUDENT WHERE ADDRESS LIKE ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+l+"%");
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
		public void selectDB11() {
			// 실행하고자 하는 쿼리문을 String 변수로 지정
			System.out.println("바꾸실 전화번호를 적으세요?");
			String ph= scan.next();
			System.out.println("바꾸실 학생번호를 입력하세요");
			String stuno = scan.next();
			String sql = "UPDATE STUDENT SET PHONE = ? WHERE STUDENTNO =  ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ph);
				pstmt.setString(2, stuno);
				pstmt.executeUpdate();
//				while (rs.next()) {
//					System.out.print(rs.getInt("studentno"));
//					System.out.print(rs.getString("name"));
//					System.out.print(rs.getInt("age"));
//					System.out.print(rs.getString("address"));
//					System.out.print(rs.getString("gender"));
//					System.out.println(rs.getString("phone"));
//					}		
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void selectDB12() {
			// 실행하고자 하는 쿼리문을 String 변수로 지정
			System.out.println("삭제 할  학생번호를 입력하세요");
			String stuno = scan.next();
			String sql = "DELETE FROM STUDENT WHERE STUDENTNO = ? ";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, stuno);
				pstmt.executeUpdate();
//				while (rs.next()) {
//					System.out.print(rs.getInt("studentno"));
//					System.out.print(rs.getString("name"));
//					System.out.print(rs.getInt("age"));
//					System.out.print(rs.getString("address"));
//					System.out.print(rs.getString("gender"));
//					System.out.println(rs.getString("phone"));
//					}		
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		//조건 검색
		//1.여자인 학생만 출력하기.
		//2.주소가 인천인 학생만 출력하기
}



		