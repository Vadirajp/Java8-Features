package com.modernjava.functionalprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryExample {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> binary = (a,b) -> a+b;
		System.out.println(binary.apply(10, 20));
		
		IntBinaryOperator intBinary = (a,b) -> a+b;
		System.out.println(intBinary.applyAsInt(10, 20));
		
		LongBinaryOperator longBinary = (a,b) -> a+b;
		System.out.println(longBinary.applyAsLong(10L, 20L));
		
		DoubleBinaryOperator doubleBinary = (a,b) -> a+b;
		System.out.println(doubleBinary.applyAsDouble(10d, 20d));
		
		Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
		BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
		System.out.println(maxBi.apply(10, 20));
		BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
		System.out.println(minBi.apply(10, 20));

	}

}
