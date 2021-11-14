package com.demo.dao;

import com.demo.pojo.Student;
import com.demo.pojo.course;

public interface StdDao {
public void createcourse(course cours,Student std);
	
	public void  Studentcourse(Student std);

	void createAnswers(Student std);

}
