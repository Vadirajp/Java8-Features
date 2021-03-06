package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author VADI
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(46,55,12,20,35,75,68,01);
		
		values.stream().sorted().forEach(System.out::println); //Sorting
		System.out.println(values.stream().anyMatch(i->i==55));

	}

}
