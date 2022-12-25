package com.encapsulation.examples;

public class Exam {

	public static void main(String[] args) {
		
		Student s = new Student ();    // here we are creating the instance of encapsulated class.
		
		s.setId(101);  // here setting the id value.
		
        System.out.println(s.getId());  // here we are getting the id value.
	}

}
