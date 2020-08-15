package com.modernjava.functionalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		//BiFunction 2 inputs List<Instructor>, Predicate which will filter online course and return map of name and experience
		Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		
		BiFunction<List<Instructor>,Predicate<Instructor>,Map<String,Integer>> mapFunc = (instructors,instructorsPredicate) -> {
			Map<String,Integer> map = new HashMap<String,Integer>();
			instructors.forEach(i -> {
				if(instructorsPredicate.test(i))
					map.put(i.getName(), i.getExperience());
			});
			return map;
		};
		
		System.out.println(mapFunc.apply(Instructors.getAll(),p1));

	}

}
