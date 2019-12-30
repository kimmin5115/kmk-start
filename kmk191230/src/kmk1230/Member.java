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
			System.out.println("������ ID�� �Է��ϼ���");
			String id = scan.next();
			NMtmt.setString(1, id);
			System.out.println("������ password�� �Է��ϼ���");
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
			System.out.println("ID�� �Է��ϼ���");
			String ID = scan.next();
			NMtmt.setString(1, ID);
			System.out.println("PASSWORD�� �Է��ϼ���");
			String PASSWORD = scan.next();
			NMtmt.setString(2, PASSWORD);
			System.out.println("�̸��� �Է��ϼ���");
			String NAME = scan.next();
			NMtmt.setString(3, NAME);
			System.out.println("������ϸ� �Է��ϼ���");
			String BIRTH = scan.next();
			NMtmt.setString(4, BIRTH);
			System.out.println("������ �Է��ϼ���");
			String gender = scan.next();
			NMtmt.setString(5, gender);
			System.out.println("E-MAIL�� �Է��ϼ���");
			String email = scan.next();
			NMtmt.setString(6, email);
			System.out.println("PHONE NUMBER�� �Է��ϼ���");
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
			System.out.println("id�� �Է��ϼ���");
			String ID = scan.next();
			System.out.println("��� ��ȣ�� �Է��ϼ���");
			String PASSWORD = scan.next();
			NMtmt.setString(1, ID);
			
			NMtmt.setString(2, PASSWORD);
			ns = NMtmt.executeQuery();
			if(ns.next()) {
				oldid = ns.getString(2);
					change();
				
			}else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void delete() {
		
		System.out.println("���� �� ID�� �Է��ϼ���");
		String ID = scan.next();
		System.out.println("���� �� PASSWORD�� �Է��ϼ���");
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
			System.out.println("���� �Ͻ� ������ �����ϼ���");
			System.out.println("1. PASSWORD | 2. NAME | 3. E-Mail | 4. PhoneNumber | 5. ����");
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
	
