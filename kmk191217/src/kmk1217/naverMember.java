package kmk1217;

public class naverMember {
	private String id;
	private String password;
	private String name;
	private String nickName;
	private String birth;
	private String gender;
	private String Email;
	private String phone;
	
	
	naverMember(){
		
	}
	//��� �ʵ带 �Ű��������ϴ� ������ ���� ��
	//main Ŭ�������� �ű�ȸ���� �ϳ� ����غ�����
	
	
	
	//id �ʵ尪�� �����ϰ� �������� ���� ��
	//getter(��������),setter �޼ҵ�
	public String getId() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "naverMember [id=" + id + ", password=" + password + ", name=" + name + ", nickName=" + nickName
				+ ", birth=" + birth + ", gender=" + gender + ", Email=" + Email + ", phone=" + phone + "]";
	}
	
	public naverMember(String id, String password, String name, String nickName, String birth, String gender,
			String email, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickName = nickName;
		this.birth = birth;
		this.gender = gender;
		Email = email;
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
