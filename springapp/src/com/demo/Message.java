package com.demo;

public class Message {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void show() {

		System.out.println(" from message " + message);
	}

}
