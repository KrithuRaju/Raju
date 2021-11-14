package com.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class course {
	@Id
	@GeneratedValue
	private int id;
	private String cname;
	private String courseBy;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "sid")
	@OrderColumn(name = "type")
	private List<Student> Student;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCourseBy() {
		return courseBy;
	}
	public void setCourseBy(String courseBy) {
		this.courseBy = courseBy;
	}
	public List<Student> getStudent() {
		return Student;
	}
	public void setStudent(List<Student> student) {
		Student = student;
	}
	public void setAnswers1(ArrayList<com.demo.pojo.Student> list1) {
		// TODO Auto-generated method stub
		
	}
	public void setAnswers(ArrayList<com.demo.pojo.Student> list1) {
		// TODO Auto-generated method stub
		
	}
	
}
