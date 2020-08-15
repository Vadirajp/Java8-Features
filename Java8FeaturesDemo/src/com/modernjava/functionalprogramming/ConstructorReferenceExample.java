package com.modernjava.functionalprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		InstructorFactory instructorFactory = Instructor::new;
		Instructor instructor = instructorFactory.getInstructor("DEF", 6, "Software Tester", "Female", true, Arrays.asList("Java Programming", "Selenium", "JUnit"));
		System.out.println(instructor);
	}
}
