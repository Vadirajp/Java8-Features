package com.modernjava.functionalprogramming;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		//if number is >10 then true else false
		Predicate<Integer> p1 = (i) -> i>10;
		System.out.println(p1.test(100));
		
		System.out.println("------------------------------------------");
		
		//if number is >10 and number is even
		Predicate<Integer> p2 = (i) -> i%2==0;
		System.out.println(p1.and(p2).test(100));
		
		System.out.println("------------------------------------------");
		
		//if number is >10 or number is even
		System.out.println(p1.or(p2).test(4));
		
		System.out.println("------------------------------------------");
		
		//if number is >10 and number is odd
		System.out.println(p1.and(p2.negate()).test(33));

	}

}
