package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author VADI
 *
 */
public class Demo01 {

	public static void main(String[] args) {		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//iteration
		values.stream()
			.forEach(i->System.out.println(i));
	}
	
	
	
}
