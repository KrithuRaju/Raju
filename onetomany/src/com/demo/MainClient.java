package com.demo;

import java.util.ArrayList;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;
import com.demo.service.QuizDaoiml;

public class MainClient {

	public static void main(String[] args) {
		QuizDaoiml  quez = new QuizDaoiml();
	      
		 Answer ans1=new Answer();  
		    ans1.setAnswername("Java is a programming language");  
		    ans1.setPostedBy("Raju");  
		      
		  
		      
		    ArrayList<Answer> list1=new ArrayList<Answer>();  
		    list1.add(ans1);  
		    
		  
		      
	
		    Question question1=new Question();  
		    question1.setQname("What is Java?");  
		    question1.setAnswers(list1);
		    
		    quez.createQuestion(question1,ans1);
		    
		    Answer ans2=new Answer();  
		    ans2.setAnswername("Java is a object oriented(oops) programming language");  
		    ans2.setPostedBy("Raju");  
		      
		  
		      
		    ArrayList<Answer> list2=new ArrayList<Answer>();  
		    list2.add(ans2); 
		    
		    
		    Question question2=new Question();  
		    question2.setQname("What is Java?");  
		    question2.setAnswers(list2);
		    
		    quez.createQuestion(question2,ans2);
	
		      
	 
	
	}

}
