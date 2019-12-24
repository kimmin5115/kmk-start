package kmk1223;

public class kmk_people {

	/*
	 * 부모클래스 : people
	 * 자식클래스 : student
	 * people클래스
	 *  - 이름, 주민번호 필드
	 *  - 이름, 주민번호를 매개변수로 하는 생성자
	 * strdent 클래스
	 *  - people 상속
	 *  - 학번, 학과 필드
	 *  - 이름, 주민번호, 학번, 학과를 매개변수로 하는 생성자
	 * studentMain 클래스
	 *  - student 클래스 객체 생성하여 필드값 출력
	 */
	
	public String name;
	public String number;
	
	kmk_people(String name, String number){
		this.name = name;
		this.number = number;
	}
	
}
