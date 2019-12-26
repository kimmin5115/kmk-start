package kmk1226_3;
// �������� ��Ƴ��� Ŭ����

import java.sql.*;
import java.util.*;

public class DBsql {

	// DB ������ ���� ���� ����
	Connection con = null;
	// ������ ������ ���� ���� ����
	PreparedStatement pstmt = null;
	// ��ȸ(SELECT) ����� �����ϱ� ���� ���� ����
	ResultSet rs = null;
	Scanner scan = new Scanner(System.in);
	// STUDENT ���̺� ��ü ��ȸ �޼ҵ�
	public void selectDB(Connection con) {
		// �����ϰ��� �ϴ� �������� String ������ ����
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
		String sql = "INSERT INTO STUDENT VALUES(8, '�̿�', 11, '��õ�� ������','����','010561214646')";
		try {
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("insert ���"+result);
			System.out.println("DB�� ���� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void inserDB2(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1 , 10);
			pstmt.setString(2, "������");
			pstmt.setInt(3, 18);
			pstmt.setString(4, "�۵�");
			pstmt.setString(5, "����");
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
			System.out.println("��ȣ�� �Է��ϼ���");
			int k = scan.nextInt();
			pstmt.setInt(1 , k);
			System.out.println("�̸��� �Է��ϼ���");
			String m = scan.next();
			pstmt.setString(2, m);
			System.out.println("������ �Է��ϼ���");
			k = scan.nextInt();
			pstmt.setInt(3, k);
			System.out.println("������ �Է��ϼ���");
			 m = scan.next();
			pstmt.setString(4, m);
			System.out.println("������ �Է��ϼ���");
			 m = scan.next();
			pstmt.setString(5, m);
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			 m = scan.next();
			pstmt.setString(6, m);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
