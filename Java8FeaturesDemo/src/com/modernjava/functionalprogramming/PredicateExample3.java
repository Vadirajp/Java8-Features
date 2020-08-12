package com.modernjava.functionalprogramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {

	public static void main(String[] args) {
		IntPredicate p1 = (i) -> i>100;
		System.out.println(p1.test(100));
		
		System.out.println("------------------------------------------");
		
		LongPredicate p2 = (i) -> i>100L;
		System.out.println(p2.test(101L));
		
		System.out.println("------------------------------------------");
		
		DoublePredicate p3 = (i) -> i>100d;
		System.out.println(p3.test(10d));

	}

}
