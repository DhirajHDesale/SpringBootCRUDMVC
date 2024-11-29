package com.data;

public class Student {
	private int sid;
	private String name;
	private String course;
	private String email;
	private String gender;

	public Student(int sid, String name, String course, String email, String gender) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
		this.email = email;
		this.gender = gender;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
