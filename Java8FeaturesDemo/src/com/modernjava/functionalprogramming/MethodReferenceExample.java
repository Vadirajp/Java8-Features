package com.modernjava.functionalprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Predicate<Instructor> p1 = i -> i.isOnlineCourses();
		Predicate<Instructor> p2 = Instructor::isOnlineCourses;
		
		Function<Integer, Double> sqrt1 = m -> Math.sqrt(m);
		Function<Integer, Double> sqrt2 = Math::sqrt;
		
		Function<String,String> lowercase1 = str -> str.toLowerCase();
		Function<String,String> lowercase2 = String::toLowerCase;

	}

}
