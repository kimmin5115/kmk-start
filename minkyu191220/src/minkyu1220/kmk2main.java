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
			System.out.println("1. 학생등록  "+"|"+" 2. 과목별점수 "+"|"+" 3. 점수리스트 "+"|"+" 4. 과목별 최고점수 "+"|"+" 5. 종료 ");
			System.out.println("------------------------------------------");
			System.out.print("번호는 선택하세요>");
			int kmk = scan.nextInt();
			if(kmk == 1) {
				studentList = new kmk2();
				System.out.println("등록 할 학생의 정보를 입력하세요");
				System.out.print("이름을 입력하세요 : ");
				name = scan.next();
				System.out.print("생년월일을 입력하세요 : ");
				String birth = scan.next();
				System.out.print("주소을 입력하세요 : ");
				String address = scan.next();
				System.out.print("전화번호를 입력하세요 : ");
				String phone = scan.next();
				studentList = new kmk2(name, birth, address, phone);
				studentList.student.add(studentList);
			}else if( kmk == 2) {
				studentList = new kmk2();
				System.out.println("이름을 입력하세요 : ");
				name = scan.next();
				for(i=0; i<studentList.student.size(); i++) {
					if(name.equals(studentList.student.get(i).getName())) {
						System.out.println("java점수를 입력하세요");
						int javascore = scan.nextInt();
						System.out.println("servlet점수를 입력하세요");
						int servletscore = scan.nextInt();
						System.out.println("spring점수를 입력하세요");
						int springscore = scan.nextInt();
						studentList.student.get(i).setJavascore(javascore);
						studentList.student.get(i).setServletscore(servletscore);
						studentList.student.get(i).setSpringscore(springscore);
					}
					
				}
				//3. 등록된 학생의 점수리스트
			}else if( kmk == 3) {
				for(i = 0; i<studentList.student.size(); i++) {
					System.out.println(studentList.student.get(i));
						
					}
					
				}
			//4. 과목별 최고점수
			else if( kmk == 4) {
				System.out.println("1.java "+"|"+" 2.servlet "+"|"+"3.spring" );
				int k = scan.nextInt();
				if( k == 1) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getJavascore()) {
							max = studentList.student.get(i).getJavascore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("java의 최고 점수는"+max+"입니다.");
				}if( k == 2) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getServletscore()) {
							max = studentList.student.get(i).getServletscore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("servlet의 최고 점수는"+max+"입니다.");
				}if( k == 3) {
					for(i=0; i<studentList.student.size(); i++) {
						if(max<studentList.student.get(i).getSpringscore()) {
							max = studentList.student.get(i).getSpringscore();
							 kname = studentList.student.get(i).getName();
						}
						
					}System.out.println("Spring의 최고 점수는"+max+"입니다.");
					
				}
				
			}else if(kmk == 5) {
				System.out.println("종료 합니다.");
				run = false;
			}
			
			scan.close();
	}
}
}
