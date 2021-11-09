package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {
	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		College col = (College) con.getBean("colname");
		College coll = (College) con.getBean("collname");
		Department de =(Department)con.getBean("dname");
		Department dc =(Department)con.getBean("dcode");
		System.out.println(col);
		System.out.println(coll);
		System.out.println(de);
		System.out.println(dc);
	}
	

}
