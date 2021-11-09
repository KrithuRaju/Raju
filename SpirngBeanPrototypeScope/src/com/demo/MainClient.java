package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {
	
public static void main (String arg[]) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //forA
		Message messagserivceA = (Message) context.getBean("messageservice");
		//for B
		Message messagserivceB = (Message) context.getBean("messageservice");
		
		//for C
		Message messagserivceC = (Message) context.getBean("messageservice");
		
		
		///setting some values
		messagserivceA.setMessage("Raju");
		
		System.out.println(" from A  -->        "+messagserivceA.getMessage());
		System.out.println(" from AAA  -->        "+messagserivceA);
		
		
		messagserivceB.setMessage("Ram");
		System.out.println(" from B -->    "+messagserivceB.getMessage());
		
		System.out.println(" from BBBB  -->        "+messagserivceB);
		
		
		messagserivceC.setMessage("tom");
		System.out.println(" from C -->    "+messagserivceC.getMessage());
		System.out.println(" from BBBB  -->        "+messagserivceC);
		
		
	}

}
