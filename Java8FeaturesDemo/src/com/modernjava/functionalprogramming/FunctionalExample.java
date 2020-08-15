package com.modernjava.functionalprogramming;

import java.util.function.Function;

public class FunctionalExample {

	public static void main(String[] args) {
		
		//Square root
		Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
		System.out.println(sqrt.apply(64));
		
		System.out.println("----------------------------------------");
		
		//String to lowercase
		Function<String,String> toLower = (str) -> str.toLowerCase();
		System.out.println(toLower.apply("PROGRAMMING"));
		
		System.out.println("----------------------------------------");
		
		//Concatinate function
		Function<String,String> concatFunc = (str) -> str.concat(" In Java");
		System.out.println(toLower.andThen(concatFunc).apply("PROGRAMMING"));
		
		System.out.println("----------------------------------------");
		
		System.out.println(toLower.compose(concatFunc).apply("PROGRAMMING"));
	}
}
