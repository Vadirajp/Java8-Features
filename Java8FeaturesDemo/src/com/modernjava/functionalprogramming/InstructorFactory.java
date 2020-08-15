package com.modernjava.functionalprogramming;

import java.util.List;

public interface InstructorFactory {

	public abstract Instructor getInstructor(String name,int experience,String title,String gender,
											 boolean course,List<String> courses);
	
}
