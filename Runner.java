package com.java.linkedlist;

public class Runner {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		//insert method
		list.insert(5);
		list.insert(6);
		
		//insertAtStart
		
		list.insertAtStart(4);
		
		//insertAt
		
		list.insertAt(2, 6);
		
		list.deleteAt(2);
		
		//show method
		list.show();
		
		
	}

}
