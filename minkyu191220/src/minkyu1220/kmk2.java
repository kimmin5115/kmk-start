package minkyu1220;

import java.util.ArrayList;

public class kmk2 {
	/*
	 * �л����, ���� �����Է�, ��������Ʈ, ���� �ְ�����, ����
	 * �л����� �̸�,�������,�ּ�,��ȭ
	 * ������ 3��
	 * ���� �ְ���
	 */
	private String name;
	private String birth;
	private String address;
	private String phone;
	private int javascore;
	private int servletscore;
	private int springscore;
	private int i = 0;
	private int max = 0;
	
	
	
	
	
	
	ArrayList<kmk2> student = new ArrayList<kmk2>(); 
	
	
	@Override
	public String toString() {
		return "kmk2 [name=" + name + ", birth=" + birth + ", address=" + address + ", phone=" + phone + ", javascore="
				+ javascore + ", servletscore=" + servletscore + ", springscore=" + springscore + "]";
	}

	


	public kmk2(String name, String birth, String address, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phone = phone;
	}

	public kmk2() {
		
	}
	
	//4�� �޼ҵ� ����
	public void score() { for(i=0; i<student.size(); i++) {
		if(max<student.get(i).getJavascore()) {
			max = student.get(i).getJavascore();
		}
	}
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getJavascore() {
		return javascore;
	}

	public void setJavascore(int javascore) {
		this.javascore = javascore;
	}

	public int getServletscore() {
		return servletscore;
	}

	public void setServletscore(int servletscore) {
		this.servletscore = servletscore;
	}

	public int getSpringscore() {
		return springscore;
	}

	public void setSpringscore(int springscore) {
		this.springscore = springscore;
	}
	
	

}
