package MethodReferenceDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author VADI
 *
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		List<String> movies = Arrays.asList(
					"KGF",
					"Jogi",
					"Kirik Party",
					"Sarathi",
					"Rajakumara",
					"Mungaru Male",
					"Shivaji Surathkal"
		);
		
		movies.forEach(System.out::println); //printing all using method reference (call by method)
		
		movies.forEach(MethodReferenceDemo::displaySpecificMovies);//One more example
		
	}
	public static void displaySpecificMovies(String s) {
		if(s.startsWith("S"))
			System.out.println(s);
	}
}
