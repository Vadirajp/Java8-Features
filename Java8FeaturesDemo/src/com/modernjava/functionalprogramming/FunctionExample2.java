package com.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {

	public static void main(String[] args) {
		
		//Map of instructors with name and years of experience 
		//Function which will List<Instructor> and return a Map<String,Integer>
		
		Function<List<Instructor>,Map<String,Integer>> mapFunction = (instructors -> {
			Map<String,Integer> map = new HashMap<String,Integer>();
			instructors.forEach(i -> {
				map.put(i.getName(),i.getExperience());
			});
			return map;
		});
		System.out.println(mapFunction.apply(Instructors.getAll()));
		
		System.out.println("------------------------------------------");
		
		//create a map of instructors who has online courses;
		Predicate<Boolean> isOnline = p -> p==true;
		Function<List<Instructor>,Map<String,Integer>> mapFunction2 = (instructors ->{
			Map<String,Integer> map2 = new HashMap<String,Integer>();
			instructors.forEach(i -> {
				if(isOnline.test(i.isOnlineCourses()))
					map2.put(i.getName(), i.getExperience());
			});
			return map2;
		});
		System.out.println(mapFunction2.apply(Instructors.getAll()));

	}

}
