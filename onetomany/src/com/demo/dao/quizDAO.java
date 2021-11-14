package com.demo.dao;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;

public interface quizDAO {
	
	
	public void createQuestion(Question question,Answer ans);
	
	public void  createAnswers(Answer answers);

}