package com.demo;

public class Department {

	private String deptname;
	private String deptcode;
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", deptcode=" + deptcode + "]";
	}
}
