package test;

public class test {
	String id;
	String password;
	String name;
	String nickName;
	String birth;
	String gender;
	String Email;
	String phone;
	public test(String id, String password, String name, String nickName, String birth, String gender, String email,
			String phone) {
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
	@Override
	public String toString() {
		return "test [id=" + id + ", password=" + password + ", name=" + name + ", nickName=" + nickName + ", birth="
				+ birth + ", gender=" + gender + ", Email=" + Email + ", phone=" + phone + "]";
	}
	
	
}
