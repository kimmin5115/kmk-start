package minkyu1220;

import java.util.*;

public class kmk2main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		kmk2 studentList = null;
		boolean run = true;
		int i = 0;
		String name=null;
		int max=0;
		String kname=null;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �л����  "+"|"+" 2. �������� "+"|"+" 3. ��������Ʈ "+"|"+" 4. ���� �ְ����� "+"|"+" 5. ���� ");
			System.out.println("------------------------------------------");
			System.out.print("��ȣ�� �����ϼ���>");
			int kmk = scan.nextInt();
			if(kmk == 1) {
				studentList = new kmk2();
				System.out.println("��� �� �л��� ������ �Է��ϼ���");
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = scan.next();
				System.out.print("��������� �Է��ϼ��� : ");
				String birth = scan.next();
				System.out.print("�ּ��� �Է��ϼ��� : ");
				String address = scan.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String phone = scan.next();
				studentList = new kmk2(name, birth, address, phone);
				studentList.student.add(studentList);
			}else if( kmk == 2) {
				studentList = new kmk2();
				System.out.println("�̸��� �Է��ϼ��� : ");
				name = scan.next();
				for(i=0; i<studentList.student.size(); i++) {
					if(name.equals(studentList.student.get(i).getName())) {
						System.out.println("java������ �Է��ϼ���");
						int javascore = scan.nextInt();
						System.out.println("servlet������ �Է��ϼ���");
						int servletscore = scan.nextInt();
						System.out.println("spring������ �Է��ϼ���");
						int springscore = scan.nextInt();
						studentList.student.get(i).setJavascore(javascore);
						studentList.student.get(i).setServletscore(servletscore);
						studentList.student.get(i).setSpringscore(springscore);
					}
					
				}
				//3. ��ϵ� �л��� ��������Ʈ
			}else if( kmk == 3) {
				for(i = 0; i<studentList.student.size(); i++) {
					System.out.println(studentList.student.get(i));
						
					}
					
				}
			//4. ���� �ְ�����
			else if( kmk == 4) {
				System.out.println("1.java "+"|"+" 2.servlet "+"|"+"3.spring" );
				int k = scan.nextInt();
				if( k == 1) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getJavascore()) {
							max = studentList.student.get(i).getJavascore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("java�� �ְ� ������"+max+"�Դϴ�.");
				}if( k == 2) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getServletscore()) {
							max = studentList.student.get(i).getServletscore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("servlet�� �ְ� ������"+max+"�Դϴ�.");
				}if( k == 3) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getSpringscore()) {
							max = studentList.student.get(i).getSpringscore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("Spring�� �ְ� ������"+max+"�Դϴ�.");
					
				}
				
			}else if(kmk == 5) {
				System.out.println("���� �մϴ�.");
				run = false;
			}
			
			scan.close();
	}
}
}
