package com.demo;

public class College {
	private String collegename;
	private String collegecode;
	Department department;
	
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(String collegecode) {
		this.collegecode = collegecode;
	}
	@Override
	public String toString() {
		return "College [collegename=" + collegename + ", collegecode=" + collegecode + ", department=" + department
				+ "]";
	}

}
