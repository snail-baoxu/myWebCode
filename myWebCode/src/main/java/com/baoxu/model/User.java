package com.baoxu.model;

/**
 * 
 * ClassName: User <br/> 
 * Function: 登录用户 <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2016年6月25日 下午3:36:17 <br/> 
 * 
 * @author Administrator 
 * @version  
 * @since JDK 1.7
 */
public class User {
	private String userName;
	private String password;
	private int sex;
	private int age;
	private String role;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
