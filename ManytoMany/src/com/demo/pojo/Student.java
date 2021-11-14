package com.demo.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;



@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String stdname;
	private String postedBy;
	
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cid")
	@OrderColumn(name = "type")
	private List<course> course;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public List<course> getCourse() {
		return course;
	}
	public void setCourse(List<course> course) {
		this.course = course;
	}
	

}
