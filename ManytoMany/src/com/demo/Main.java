package com.demo;

import java.util.ArrayList;

import com.demo.pojo.Student;
import com.demo.pojo.course;
import com.demo.service.stddaoiml;



public class Main {

	
	public static void main(String[] args) {
		stddaoiml stdd = new stddaoiml();
	      
		 Student ans1=new Student();  
		    ans1.setStdname("Student courses are ");  
		    ans1.setPostedBy("Raju");  
		      
		  
		      
		    ArrayList<Student> list1=new ArrayList<Student>();  
		    list1.add(ans1);  
		    
		  
		      
	
		    course question1=new course();  
		    question1.setCname(" Java full stack");  
		    question1.setAnswers(list1);
		    
		    stdd.createQuestion(question1,ans1);
		    
		   
	
		      
	 
	
	}

}
