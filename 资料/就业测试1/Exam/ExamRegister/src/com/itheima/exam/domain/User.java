package com.itheima.exam.domain;

public class User {
	
	/*
	 *   uid int primary key auto_increment,
    uname varchar(20) not null unique,
    pwd varchar(6) not null,
    email varchar(40),
    name varchar(20),
    sex int,
    telephone varchar(11)
	 * */
	
	private String uid;
	private String uname;
	private String pwd;
	private String email;
	private String name;
	private int sex;
	private String telephone;
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	

}
