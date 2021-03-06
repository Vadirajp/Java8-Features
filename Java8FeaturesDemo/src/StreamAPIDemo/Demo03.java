package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author VADI
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.stream().mapToInt(i->i*2).forEach(i->System.out.println(i));//doubling value and looping
		
		System.out.println(values.stream().map(i->i*2).reduce(0,(i,j)->i+j)); //doubling and summing

		System.out.println(values.stream().map(i->i*2).reduce(0,(i,j)->Integer.sum(i, j))); //another way of doing
		
		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));//using method reference
		
		
	}

}
