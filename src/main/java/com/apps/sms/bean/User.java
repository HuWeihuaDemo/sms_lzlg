package com.apps.sms.bean;
/**
 * 
 * @author 胡伟华
 *
 */
public class User { 
	private Long id;
	private String realname;
	private String telephone;
	private String password;
	private String student_no;
	private String gender;
	private String clazz_id;
	
	public String getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(String clazz_id) {
		this.clazz_id = clazz_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
