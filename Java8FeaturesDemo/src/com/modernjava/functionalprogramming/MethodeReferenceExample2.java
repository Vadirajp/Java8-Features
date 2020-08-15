package com.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class MethodeReferenceExample2 {

	public static void main(String[] args) {

		Predicate<Instructor> p2 = MethodeReferenceExample2::greaterThanFiveYears;
		Instructors.getAll().forEach(i ->{			
			if(p2.test(i))
				System.out.println(i);
		});

	}
	
	public static boolean greaterThanFiveYears(Instructor i) {
		if(i.getExperience()>5)
			return true;
		else 
			return false;
	}

}
