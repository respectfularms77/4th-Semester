package com.ex.di;

public class Student {
	private int id;
	private StudentClass cls;
	public void setId(int id) {
		this.id = id;
	}
	public void setCls(StudentClass cls) {
		this.cls = cls;
	}
	public void read() {
		cls.classes();
	}

}