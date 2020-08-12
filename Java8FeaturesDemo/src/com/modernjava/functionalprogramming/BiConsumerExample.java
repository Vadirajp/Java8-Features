package com.modernjava.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		//Printing out 2 numbers
		BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println("x : "+x+" & y : "+y);
		biConsumer.accept(10, 20);
		
		System.out.println("------------------------------------------");
		
		//sum of two integers
		BiConsumer<Integer, Integer> biConsumer1 = (x,y) -> System.out.println(x+y);
		biConsumer1.accept(10, 20);
		
		System.out.println("------------------------------------------");
		
		//Concatenate two String
		BiConsumer<String, String> biCsonumer3 = (str1,str2) -> System.out.println(str1.concat(str2));
		biCsonumer3.accept("vadi", "raj");
	}
}
