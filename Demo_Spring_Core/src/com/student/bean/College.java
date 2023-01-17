package com.student.bean;

public class College {
	private int id;
	private String name;
	private Student student;

	public College() {
		super();
	}

	public College(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", student=" + student + "]";
	}

}
