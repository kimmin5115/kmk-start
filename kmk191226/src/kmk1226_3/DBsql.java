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
	public void dbConnection() {
		con = DBConnection.makeConnection();
	}
	student st = new student();
	student st1 = null;
	Scanner scan = new Scanner(System.in);
	// STUDENT ���̺� ��ü ��ȸ �޼ҵ�
	public void selectDB() {
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

	public void insertDB1() {
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
	
	public void inserDB2() {
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
			e.printStackTrace();
		}
		
		
	}
	public void inserDB3() {
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
			// �����ϰ��� �ϴ� �������� String ������ ����
			String sql = "SELECT * FROM STUDENT WHERE GENDER = ?";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "����");
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
			// �����ϰ��� �ϴ� �������� String ������ ����
			String sql = "SELECT * FROM STUDENT WHERE ADDRESS = '��õ'";
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
			// �����ϰ��� �ϴ� �������� String ������ ����
			System.out.println("�˻��� ������ ��������?");
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
			// �����ϰ��� �ϴ� �������� String ������ ����
			System.out.println("�ٲٽ� ��ȭ��ȣ�� ��������?");
			String ph= scan.next();
			System.out.println("�ٲٽ� �л���ȣ�� �Է��ϼ���");
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
			// �����ϰ��� �ϴ� �������� String ������ ����
			System.out.println("���� ��  �л���ȣ�� �Է��ϼ���");
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
		//���� �˻�
		//1.������ �л��� ����ϱ�.
		//2.�ּҰ� ��õ�� �л��� ����ϱ�
}



		