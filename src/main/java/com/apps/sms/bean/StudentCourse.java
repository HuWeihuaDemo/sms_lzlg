package com.apps.sms.bean;

public class StudentCourse {
	private Long id;
	private Long user_id;
	private Long course_id;
	private Long xk_time;
	private int grade;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}
	public Long getXk_time() {
		return xk_time;
	}
	public void setXk_time(Long xk_time) {
		this.xk_time = xk_time;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}
