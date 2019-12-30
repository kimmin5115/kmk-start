package kmk1230;



import java.sql.*;
import java.util.*;

import kmk1230.NaverMambers;


public class Member {
	ResultSet ns = null;
	Connection con = null;
	PreparedStatement NMtmt = null;
	Scanner scan = new Scanner(System.in);
	public boolean run = true;
	public String oldid;
	
	public void NMConnection() {
		con = NaverMambers.makeConnection();

	}
	
	
	public void selectNM() {
		String sql = "SELECT * FROM NAVERMEMBER WHERE ID = ? AND PASSWORD = ?";
		
		try {
			NMtmt = con.prepareStatement(sql);
			System.out.println("관리자 ID를 입력하세요");
			String id = scan.next();
			NMtmt.setString(1, id);
			System.out.println("관리자 password를 입력하세요");
			String pw = scan.next();
			NMtmt.setString(2, pw);			
			ns = NMtmt.executeQuery();
			while(ns.next()) {				
			
				sql = "SELECT * FROM NAVERMEMBER";
				NMtmt = con.prepareStatement(sql);
				ns = NMtmt.executeQuery();
				while(ns.next()) {
					System.out.print(ns.getString("ID"));
					System.out.print("	"+ns.getString("PASSWORD"));
					System.out.print("	"+ns.getString("NAME"));
					System.out.print("	"+ns.getString("BIRTHDAY"));
					System.out.print("	"+ns.getString("GENDER"));
					System.out.print("	"+ns.getString("EMAIL"));
					System.out.print("	"+ns.getString("PHONE"));
					System.out.println("	"+ns.getDate("members"));
			}}
			
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void inserNM() {
		String sql = "INSERT INTO NAVERMEMBER VALUES(?,?,?,?,?,?,?,sysdate)";
		try {
			NMtmt = con.prepareStatement(sql);
			System.out.println("ID를 입력하세요");
			String ID = scan.next();
			NMtmt.setString(1, ID);
			System.out.println("PASSWORD를 입력하세요");
			String PASSWORD = scan.next();
			NMtmt.setString(2, PASSWORD);
			System.out.println("이름을 입력하세요");
			String NAME = scan.next();
			NMtmt.setString(3, NAME);
			System.out.println("생년월일를 입력하세요");
			String BIRTH = scan.next();
			NMtmt.setString(4, BIRTH);
			System.out.println("성별을 입력하세요");
			String gender = scan.next();
			NMtmt.setString(5, gender);
			System.out.println("E-MAIL을 입력하세요");
			String email = scan.next();
			NMtmt.setString(6, email);
			System.out.println("PHONE NUMBER를 입력하세요");
			String phone = scan.next();
			NMtmt.setString(7, phone);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void inserNM1() {
		String sql = "SELECT * FROM NAVERMEMBER WHERE ID = ? and PASSWORD = ?";
		
		try {
			NMtmt = con.prepareStatement(sql);
			System.out.println("id를 입력하세요");
			String ID = scan.next();
			System.out.println("비밀 번호를 입력하세요");
			String PASSWORD = scan.next();
			NMtmt.setString(1, ID);
			
			NMtmt.setString(2, PASSWORD);
			ns = NMtmt.executeQuery();
			if(ns.next()) {
				oldid = ns.getString(2);
					change();
				
			}else {
				System.out.println("다시 입력하세요");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void delete() {
		
		System.out.println("삭제 할 ID를 입력하세요");
		String ID = scan.next();
		System.out.println("삭제 할 PASSWORD를 입력하세요");
		String PASSWORD = scan.next();
		String sql = "DELETE FROM NAVERMEMBER WHERE ID = ? AND PASSWORD = ?";
		try {
			NMtmt = con.prepareStatement(sql);
			NMtmt.setString(1, ID);
			NMtmt.setString(2, PASSWORD);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		
	public void change() {
		while(run) {
			System.out.println("변경 하실 정보를 선택하세요");
			System.out.println("1. PASSWORD | 2. NAME | 3. E-Mail | 4. PhoneNumber | 5. 종료");
		  	int i = scan.nextInt();
		
			switch(i) {
			case 1 : 
				change1();
				break;
			case 2 :
				change2();
				break;
			case 3 :
				change3();
				break;
			case 4 :
				change4();
				break;
			case 5 :
				run = false;
		}
		}
	}
	
	public void change1() {
		String sql = "UPDATE NAVERMEMBER SET PASSWORD = ? where ID = ?";
		try {
			NMtmt = con.prepareStatement(sql);
			String PASSWORD = scan.next();
			NMtmt.setString(1, PASSWORD);
			NMtmt.setString(2, oldid);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void change2() {
		String sql = "UPDATE NAVERMEMBER SET NAME = ? where ID = ?";
		try {
			NMtmt = con.prepareStatement(sql);
			String NAME = scan.next();
			NMtmt.setString(1, NAME);
			NMtmt.setString(2, oldid);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void change3() {
		String sql = "UPDATE NAVERMEMBER SET EMAIL = ? where ID = ?";
		try {
			NMtmt = con.prepareStatement(sql);
			String em = scan.next();
			NMtmt.setString(1, em);
			NMtmt.setString(2, oldid);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void change4() {
		String sql = "UPDATE NAVERMEMBER SET PHONE = ? where ID = ?";
		try {
			NMtmt = con.prepareStatement(sql);
			String phone = scan.next();
			NMtmt.setString(1, phone);
			NMtmt.setString(2, oldid);
			NMtmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
	
