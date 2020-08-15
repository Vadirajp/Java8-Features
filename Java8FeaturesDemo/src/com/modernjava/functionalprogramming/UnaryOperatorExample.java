package com.modernjava.functionalprogramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = i -> i*10;
		System.out.println(unary.apply(10));
		
		Function<Integer, Integer> func = i -> i*10;
		System.out.println(func.apply(10));
		
		IntUnaryOperator intUnary = i -> i*10;
		System.out.println(intUnary.applyAsInt(10));
		
		LongUnaryOperator longUnary = i -> i*10;
		System.out.println(longUnary.applyAsLong(10L));
		
		DoubleUnaryOperator doubleUnary = i -> i*10;
		System.out.println(doubleUnary.applyAsDouble(10d));
	}
	
	
}
