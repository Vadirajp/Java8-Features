package StreamAPIDemo;

import java.util.Arrays;
import java.util.List;

/**
 * @author VADI
 *
 */
public class Demo04 {

	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result=0;
		for(int i=0;i<values.size();i++) {
			if(values.get(i)%5==0)
				result+=values.get(i);
		}
		System.out.println(result);
		
		System.out.println("---------------");
		values.stream().filter(i->i%5==0).forEach(System.out::println);
		System.out.println("---------------");
		System.out.println(values.stream()
								 .filter(i->i%5==0)
							     .reduce(0,(i,j)->i+j));
		
		System.out.println("---------------");
		values = Arrays.asList(6,21,47);
		System.out.println(values.stream()
				.filter(i->i%5==0)
				.map(i->i*2)
				.findFirst()
				.orElse(0));
				//.forEach(System.out::println);
		
	}
	
}
