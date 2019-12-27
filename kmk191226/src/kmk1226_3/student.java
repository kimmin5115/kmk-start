package kmk1226_3;

import java.sql.*;
import java.util.Scanner;

public class student {

	public int studentno;
	public String name;
	public int age;
	public String address;
	public String gender;
	public String phone;
	student(){
		
	}
	@Override
	public String toString() {
		return "student [studentno=" + studentno + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", gender=" + gender + ", phone=" + phone + "]";
	}
	public student(int studentno, String name, int age, String address, String gender, String phone) {
		super();
		this.studentno = studentno;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
	}
	public int getStudentno() {
		return studentno;
	}
	public void setStudentno(int studentno) {
		this.studentno = studentno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	void student() {
		
	}
	
	
	
}