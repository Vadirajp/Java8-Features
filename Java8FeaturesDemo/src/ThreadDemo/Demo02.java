package ThreadDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo02  {

	public static void main(String[] args) {
		int a[] = {1,2,3,};
		System.out.println(a.length);
	}
}


class Hello {
	public static void m1() {
		System.out.println("hello");
	}
}

class hi extends Hello{
	public static void m1() throws ClassCastException {
		System.out.println("hi");
	}
}