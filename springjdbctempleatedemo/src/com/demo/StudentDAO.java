package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	// looking for data soruce like mysql db
		public void setDataSoruce(DataSource ds);
		
		// insert records for student
		public void createStudent(String name,String age);

		// update records for student
		public void updateStudentRecord(String name,String age);
		public void updateStudentRecord(Student student); // this method implemented

		// delete records for student
		public void deleteStudentById1(Integer id);
		public void deleteStudentById(Integer id);   ///pending

		// view records for pertucular student
		public Student viewStudentRecodById1(Integer id);
		public Student viewStudentRecodById(Integer id);  //pending

		// view all records for students
		public List<Student> listAllStudents(Student student);
		public List<Student> listAllStudents(); //done

}
