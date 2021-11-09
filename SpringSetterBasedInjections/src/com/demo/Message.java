package com.demo;

public class Message {
WriteMessage writeMessage;
	
	public WriteMessage getWriteMessage() {
		return writeMessage;
	}

	public void setWriteMessage(WriteMessage writeMessage) {
		this.writeMessage = writeMessage;
	}

	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String message;
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	//calling another class mehtod from here
	public void show() {
		writeMessage.WriteMessage();
		
	}

}
