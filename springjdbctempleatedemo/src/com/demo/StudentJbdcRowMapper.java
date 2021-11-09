package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public class StudentJbdcRowMapper implements RowMapper<Student> {

	 // this is for create method

     // this resultSEt is coming from db row mapping alread given in jdbc topics in core java	
     // this resultSEt is coming from db row mapping alread given in jdbc topics in core java	  
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {


		Student stud= new Student();
		// mapping results in colums
		stud.setId(rs.getInt("id"));
		stud.setStudname(rs.getString("studname"));
		stud.setAge(rs.getString("age"));



		return null;
		return stud;
	}


}
