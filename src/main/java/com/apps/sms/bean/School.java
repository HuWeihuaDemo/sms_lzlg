package com.apps.sms.bean;
/**
 * 
 * @author 陈雪峰
 */
public class School {
private Long id;
private String name;
private String description;
private String tel;
private String country_id;
private String address;
public Long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getCountry_id() {
	return country_id;
}
public void setCountry_id(String country_id) {
	this.country_id = country_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
