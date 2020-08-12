package com.modernjava.functionalprogramming;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		//Consumer without block
		Consumer<String> c = (x) -> {
			System.out.println(x.length() + " the value of x : " + x);
		};
		c.accept("Up in the air"); //To call
		
		
		//Consumer with block of statement
		Consumer<Integer> c1 = (x) -> {
			System.out.println("x*x = "+x*x);
			System.out.println("x/x = "+x/x );
		};
		c1.accept(10);
		
	}
}
