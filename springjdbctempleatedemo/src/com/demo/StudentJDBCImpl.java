package com.demo;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentJDBCImpl implements StudentDAO {

	private DataSource dataSourceprop;
	private JDBCType JdbcTemplateoobject;
	public void setDataSoruce(DataSource ds) {
		
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);


	}

      //api for create method
	//user deifined method and you have to write logic
	public void createStudent(String studname, String age) {

		String sql="insert  into student(studname,age) values(?,?)";
		
		JdbcTemplateoobject.update(sql,studname,age);
		
    	return;

	}

	@Override
	public void updateStudentRecord(String name, String age) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Student viewStudentRecodById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listAllStudents(Student student) {
		// TODO Auto-generated method stub
		return null;
	public List<Student> listAllStudents() {

		 List<Student> studentlist = new ArrayList<Student>();

		 String studentlistsql="select * from student";

		  // any of else can be used
	//	 studentlist = JdbcTemplateoobject.query(studentlistsql,new StudentJbdcRowMapper(Student.class));

		 studentlist = JdbcTemplateoobject.query(studentlistsql,new BeanPropertyRowMapper(Student.class));


		return studentlist;
	}

	   /// api for update

	@Override
	public void updateStudentRecord(Student student) {
	String udpdatestudedntrecord="UPDATE student SET studname = ?, age= ?  where id= ?"; 
		JdbcTemplateoobject.update(udpdatestudedntrecord, new Object[] {
			student.getStudname(),student.getAge() , Integer.valueOf(student.getId())
		});
	}

	@Override
	public void deleteStudentById1(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student viewStudentRecodById1(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}





}
