package kmk1230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NaverMambers {
	
	//static �޼ҵ�
	public static Connection makeConnection() {
		//DB �������� ������ ���� Connection ���� ����
		Connection con = null;
		
		//������ DB�� ��������
		String user = "kmk1230";
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


//	���̹� ȸ�������� ó���ϴ� DB�� �����ϰ��� �Ѵ�. �Ʒ� ������ �����Ͽ� �۾��� �����ϼ���. 
//	1. �ʿ� �����ʹ� ���̹� ȸ������ ������ ���� 
//	2. DB ������ �����̴ϼ�+���ó�¥�� ���� ����
//	3. ���̺� �̸��� MEMBER�� �� �� 
//	4. �ֿ� ��� 
//	 4.1 ȸ������ (ȸ�����Խ� ���� ��¥�� �Բ� �Էµǵ��� �� ��)
//	 4.2 ȸ������ ���� 
//	   - �������� �� ���̵� ����� ���� �¾ƾ� ������ ���� 
//	 4.3 ȸ��Ż�� 
//	   - ȸ��Ż�� �� ���̵� ����� ���� �¾ƾ� Ż�� ���� 
//	 4.4 ������(admin)��� 
//	   - �����ڸ� ��ü ȸ�� ����� �� �� ������ �Ϲ�ȸ���� �� �� ���� 


}
