package kmk1226_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	//static �޼ҵ�
	public static Connection makeConnection() {
		//DB �������� ������ ���� Connection ���� ����
		Connection con = null;
		
		//������ DB�� ��������
		String user = "kmk0415";
		String password = "1234";
		
		//������ DB�� �ּ� ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//����Ŭ �������� �ּҰ�
		
		
		try {
			//ojdbc6 ������ ���� �ҽ��� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("���Ӽ���");
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB ����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		
		
		
		
		return con;
	}

}
