package minkyu1220;

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
