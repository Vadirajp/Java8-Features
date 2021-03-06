package com.modernjava.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	//Acts like database data
	public static List<Instructor> getAll(){
		Instructor instrucor1 = new Instructor("ABC", 3, "Software Developer", "Male"
				, true, Arrays.asList("Java Programming","C++","Python"));
		
		Instructor instrucor2 = new Instructor("DEF", 6, "Software Tester", "Female"
				, true, Arrays.asList("Java Programming","Selenium","JUnit"));
		
		Instructor instrucor3 = new Instructor("GHI", 8, "Software Engineer", "Male"
				, true, Arrays.asList("Go","Swift","Threading","React"));
		
		Instructor instrucor4 = new Instructor("JKL", 1, "Jr Developer", "Female"
				, true, Arrays.asList("Angular","SQL","Python"));
		
		Instructor instrucor5 = new Instructor("MNO", 10, "Manager", "Male"
				, false, Arrays.asList("Java Programming","Multi Threaded","Python","React"));
		
		List<Instructor> list = Arrays.asList(instrucor1,instrucor2,instrucor3,instrucor4,instrucor5);
		return list;
		
			
	}
	
}
